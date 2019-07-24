import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import p1.*;


public class DisplayProducts extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        HttpSession hs=req.getSession(true);
        
        
      String n=req.getParameter("n");
      String filter=req.getParameter("f");
      hs.setAttribute("search", n);

        try
        {
         
       
            Connection con=DB_Connection.get_DBConnection();
            ResultSet rs1=null;
            if(filter==null)
            {
                PreparedStatement pst2=con.prepareStatement("select * from products where type like ?");
                pst2.setString(1,"%"+n+"%");
                rs1=pst2.executeQuery();
            }
            else
            {
                 String c1=req.getParameter("c1");
                 String c2=req.getParameter("c2");
                 String c3=req.getParameter("c3");
                 String c4=req.getParameter("c4");
                 String c5=req.getParameter("c5");
                 String c6=req.getParameter("c6");
                 String c7=req.getParameter("c7");
                 String c8=req.getParameter("c8");
                 
                 String c66[]={null,null};
                 if(c6!=null)
                 {
                     c66=c6.split("-");
                 }
                 
                  String c77[]={null,null};
                 if(c7!=null)
                 {
                     c77=c7.split("-");
                 }
                 
                 PreparedStatement pst2=con.prepareStatement("select * from products where type like ? or type like ? or company like ? or company like ? or price < ? or (price > ? and price < ?)or (price > ? and price < ?) or price > ? ");
                 pst2.setString(1,"%"+c1+"%");
                 pst2.setString(2,"%"+c2+"%");
                 pst2.setString(3,"%"+c3+"%");
                 pst2.setString(4,"%"+c4+"%");
                 pst2.setString(5,c5);
                 pst2.setString(6,c66[0]);
                 pst2.setString(7,c66[1]);
                 pst2.setString(8,c77[0]);
                 pst2.setString(9,c77[1]);
                 pst2.setString(10,c8);
                 rs1=pst2.executeQuery();
            }
                      
            String t="";
            int i=1;
            if(rs1.next())
            {
                
                do
                {                  

                t=t+"<div class='col-md-3'  > <div class='panel panel-danger'>  <div class='panel-body'>";
                t=t+"<img src='GetProductImage?pcode="+rs1.getString("pcode")+"'style='width:100%;height:200px' alt='Offer 1' class='img-responsive'></div>";
                t=t+"<div class='panel-footer'>"+rs1.getString("pname");                
                t=t+"<p>Type:"+rs1.getString("type");
                t=t+"<br/>Company:"+rs1.getString("company");
                t=t+"<p><b>Price: <i class='fa fa-rupee'></i>"+rs1.getInt("price")+"/-</b> <a href='selectproduct.jsp?pcode="+rs1.getString("pcode")+"' style='padding-left: 40px;cursor: pointer'>Add to Cart</a>";
                t=t+"</div></div></div>";
               
                
                i++;
                }
                while(rs1.next());
                 pw.println(t);
            }
            else
            {
                
           pw.println("<p style='font-weight:bolder;color:red;font-size:20px'><i style='font-weight:bolder;color:red;font-size:25px' class='fa fa-frown-o'></i> Oopsss....No Products to Display </style> ");

            }
                

        
       
       
      
        
       }    
         
        catch(Exception e)
        {
            pw.println(e);
        }

              
        
    }
}