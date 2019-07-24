import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;
import p1.*;


public class AddProduct extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        InputStream is[];
        is=new InputStream[]{null};
        String values[]=new String[8];
        int j=0;
        try
        {
            Collection<Part> p= req.getParts();
            Iterator i=p.iterator();
            while(i.hasNext())
            {
                 Part p1=(Part)i.next();
                
                 if(p1.getName().equalsIgnoreCase("txtpic"))
                 {
                    is[0]= p1.getInputStream();
                   
                 }
                 else
                 {
                    InputStream i1= p1.getInputStream();
                    int ch;
                    StringBuilder sb = new StringBuilder();
                    while((ch = i1.read()) != -1)
                    {
                        sb.append((char)ch);
                    }
                    values[j]=sb.toString();
                    j++;
                 }
            }
            String type="",company="";
        if(values[3].equalsIgnoreCase("others"))
        {
            type=values[4];
        }
        else
        {
            type=values[3];
        }
        
        if(values[5].equalsIgnoreCase("others"))
        {
            company=values[6];
        }
        else
        {
            company=values[5];
        }
       
        Connection con=DB_Connection.get_DBConnection();
        PreparedStatement pst1=con.prepareStatement("insert into products values(?,?,?,?,?,?,?)");
        pst1.setString(1, values[0]);
        pst1.setString(2, values[1]);
        pst1.setString(3, values[2]);
        pst1.setString(4, type);
        pst1.setString(5,company);
        pst1.setInt(6, Integer.parseInt(values[7]));
        pst1.setBlob(7, is[0]);
       
        pst1.executeUpdate();
        req.setAttribute("msg", "$('#modal-msg').modal('show');");
        RequestDispatcher rd=req.getRequestDispatcher("addproduct.jsp");
        rd.forward(req, res);
            for(int k=0;k<6;k++)
            {
                pw.println(values[k]);
            }
        }
        catch(Exception e)
        {
            pw.println(e);
        }
    }
        
}