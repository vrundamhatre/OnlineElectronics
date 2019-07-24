import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import p1.*;

public class Login extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
                
        try
        {           
        String u=req.getParameter("txtuserid");
        System.out.println(u);
        String p=req.getParameter("txtpassword");
        Connection con=DB_Connection.get_DBConnection();
        PreparedStatement pst=con.prepareStatement("select * from login,customers where login.userid=? and login.password=? and login.userid=customers.emailid");
        pst.setString(1,u);
        pst.setString(2,p);
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
            
                HttpSession hs=req.getSession(true);
                hs.setAttribute("A1", u);
                hs.setAttribute("A2", rs.getString("fname"));
                if(hs.getAttribute("guest")!=null)
                {
                    hs.removeAttribute("guest");
                }
                res.sendRedirect("home.jsp");     
        }
        else
        {
           
            req.setAttribute("msg", "<div class='alert alert-danger' style='height:50px;background-color:white;font-weight:bolder;border:none'>Invalid Credentials</div>");
            RequestDispatcher rd=req.getRequestDispatcher("newuser.jsp");
            rd.forward(req, res);
                         
        }
         
        }
        catch(Exception e)
        {
            pw.println(e);
        }
        
    }
}