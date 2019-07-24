package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/head.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <title>E-Electronics</title>\n");
      out.write("        \n");
      out.write("\n");
      out.write("          ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <title>E-Electronics</title>\n");
      out.write("       \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-3.3.7-dist/css/bootstrap.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-3.3.7-dist/css/formValidation.css\"/> ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"font-awesome-4.7.0/css/font-awesome.css\"/> \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-3.3.7-dist/css/breadcrumbs.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-3.3.7-dist/css/bootstrap-datetimepicker.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-3.3.7-dist/css/bootstrap-magnify.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-3.3.7-dist/css/magnify.css\">\n");
      out.write("        \n");
      out.write("         <script src=\"bootstrap-3.3.7-dist/js/jquery-3.1.1.js\"></script>\n");
      out.write("         <script src=\"bootstrap-3.3.7-dist/js/jquery-1.12.0.js\"></script>\n");
      out.write("         <script src=\"bootstrap-3.3.7-dist/js/bootstrap.js\"></script>\n");
      out.write("         <script src=\"bootstrap-3.3.7-dist/js/moment.js\"></script>\n");
      out.write("         <script src=\"bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.js\"></script>\n");
      out.write("         <script src=\"bootstrap-3.3.7-dist/js/formValidation.js\"></script> ");
      out.write("\n");
      out.write("         <script src=\"bootstrap-3.3.7-dist/js/bootstrap_1.js\"></script>  ");
      out.write("\n");
      out.write("         <script src=\"bootstrap-3.3.7-dist/js/bootstrap-magnify.js\"></script>\n");
      out.write("\n");
      out.write("         \n");
      out.write("         \n");
      out.write("        \n");
      out.write("       <script>\n");
      out.write("                  \n");
      out.write("                  $(document).ready(function(){\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                  var m=window.location.pathname.substring(window.location.pathname.lastIndexOf(\"/\")+1);\n");
      out.write("                 \n");
      out.write("                  if(m=='newuser.jsp' || m=='Login' || m=='Signup')\n");
      out.write("                  {\n");
      out.write("                         \n");
      out.write("                      $(\"#d1\").hide();\n");
      out.write("                   \n");
      out.write("                  }\n");
      out.write("                  \n");
      out.write("           });\n");
      out.write("         \n");
      out.write("       \n");
      out.write("$(document).ready(function(){\n");
      out.write("   \n");
      out.write("        $.get(\"GetProductType\",function(data, status){\n");
      out.write("       \n");
      out.write("        var res = data.split(\"-\");\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        for (var i in res) \n");
      out.write("        {\n");
      out.write("                if(res[i]!='')\n");
      out.write("                {\n");
      out.write("                 \n");
      out.write("                    $(\"#u1\").append(\"<li><a href='displayproducts.jsp?txtsearch=\"+res[i]+\"'>\"+res[i]+\"</a></li>\");\n");
      out.write("                   \n");
      out.write("                }\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    });\n");
      out.write("        \n");
      out.write("   \n");
      out.write("});\n");
      out.write("\n");
      out.write("           $(document).ready(function() {\n");
      out.write("    $('#frmsearch').formValidation({\n");
      out.write("       \n");
      out.write("        framework: 'bootstrap',\n");
      out.write("         container: 'popover',\n");
      out.write("        icon: {\n");
      out.write("            valid: 'glyphicon glyphicon-ok',\n");
      out.write("            invalid: 'glyphicon glyphicon-remove',\n");
      out.write("            validating: 'glyphicon glyphicon-refresh'\n");
      out.write("        },\n");
      out.write("        \n");
      out.write("        live:'disabled',\n");
      out.write("        container:'popover',\n");
      out.write("        fields: {\n");
      out.write("             \n");
      out.write("            txtsearch: {\n");
      out.write("                validators: {\n");
      out.write("                    notEmpty:{\n");
      out.write("                         message: 'Enter some value'\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("          \n");
      out.write("    });\n");
      out.write("});\n");
      out.write("           $(document).ready(function(){\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                  var m=window.location.pathname.substring(window.location.pathname.lastIndexOf(\"/\")+1);\n");
      out.write("                 \n");
      out.write("                  if(m=='signup.jsp' || m=='Login' || m=='Signup')\n");
      out.write("                  {\n");
      out.write("                         \n");
      out.write("                      $(\"#d1\").hide();\n");
      out.write("                   \n");
      out.write("                  }\n");
      out.write("                  \n");
      out.write("           });\n");
      out.write("         \n");
      out.write("                        \n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\"#login\").click(function(){\n");
      out.write("        $(\"#modal_login\").modal();\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("    .row {\n");
      out.write("        height: 100px;\n");
      out.write("       \n");
      out.write("      }\n");
      out.write("    @media screen and (max-width: 1200px) {\n");
      out.write("      .row {\n");
      out.write("        height: auto;\n");
      out.write("     \n");
      out.write("      }\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

        int count=0;
            session=request.getSession(false);
            java.util.Enumeration e=session.getAttributeNames();
            while(e.hasMoreElements())
            {
                String n=(String)e.nextElement();
                if(n.charAt(0)=='E')
                {
                    count++;
                }
            }    
        
      out.write("\n");
      out.write("       \n");
      out.write("             <div class=\"container-fluid\">\n");
      out.write("                 <div class=\"row\" style=\"background-color:#269abc;color :white;padding-top: 20px;height: 100%\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("            <p style=\"font-size: 40px;font-weight: bolder;font-style: oblique;font-family:cursive;padding-left: 1%\"><a href=\"home.jsp\" style=\"text-decoration: none;color:white\">E-Electronics</a></p>\n");
      out.write("            <p style=\"font-size: 15px;font-family:monospace;margin-top: -10px;margin-left: 10px\">the electronic way to shop </p>\n");
      out.write("           </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-md-offset-2\">\n");
      out.write("             <p style=\"font-size: 20px;font-weight: normal\"><i class=\"fa fa-phone-square\"></i> 1800-156-624</p>\n");
      out.write("            <p style=\";font-size: 20px;font-weight: normal\"><i class=\"fa fa-envelope-square\"></i> feedback@eelectronics.com</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                     \n");
      out.write("             \n");
      out.write("              ");

                if(session.getAttribute("A1")!=null && ((String)session.getAttribute("A1")).equalsIgnoreCase("admin@eelectronics.com"))
                {
              
      out.write("\n");
      out.write("              \n");
      out.write("              <div class=\"col-md-2 col-md-offset-2\" id=\"d2\">\n");
      out.write("                  \n");
      out.write("            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><p style=\"text-align: center;cursor: pointer;color:white\"><i class=\"fa fa-2x fa-user-secret \"></i></p>\n");
      out.write("                <p style=\"text-align: center;font-size: 15px;font-weight: bolder;cursor: pointer;color:white\">Hello,");
      out.print(session.getAttribute("A2") );
      out.write(" <i class=\"fa fa-angle-down\" ></i></p></a>\n");
      out.write("              <ul class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                  <li><a href=\"addproduct.jsp\">Add Product</a></li>\n");
      out.write("                  <li><a href=\"viewproduct.jsp\">View/Remove Product</a></li>\n");
      out.write("                  <li><a href=\"editproduct.jsp\">Edit Product</a></li>\n");
      out.write("                  <li><a href=\"vieworders.jsp\">View Orders</a></li>\n");
      out.write("                  <li><a href=\"viewcustomer.jsp\">View Customers</a></li>\n");
      out.write("                  <li><a href=\"viewfeedback.jsp\">View Feedback</a></li>\n");
      out.write("                 \n");
      out.write("                   <li><hr></hr></li>\n");
      out.write("                   <li><a href=\"changepassword.jsp\" style=\"margin-top:-10px\">Change Password</a></li>\n");
      out.write("                   <li><a href=\"editprofile.jsp\">Edit Profile</a></li>\n");
      out.write("                   <li ><a href=\"signout.jsp\" >Sign out</a></li>\n");
      out.write("            </ul>  \n");
      out.write("              </div> \n");
      out.write("              ");

                }
                else if(session.getAttribute("A1")!=null)
                {
                    
              
      out.write("\n");
      out.write("               <div class=\"col-md-2 col-md-offset-2\" id=\"d2\">\n");
      out.write("                  <form method=\"post\" action=\"Cart\" style=\"display:inline-block;padding-right: 30px\">\n");
      out.write("                       <input type=\"hidden\" name=\"cartval\" value=\"cart\"></input>\n");
      out.write("                <button type=\"submit\" class=\"glyphicon glyphicon-shopping-cart\" style=\"border:none;font-size:50px;cursor: pointer;background-color: #269abc\"><span class=\"badge\" style=\"margin-left:-30px;margin-top: -35px;background-color:whitesmoke;color:black ;font-size: 12px\">");
      out.print( count );
      out.write("</span></button>\n");
      out.write("                   </form>\n");
      out.write("                   \n");
      out.write("            <a class=\"dropdown-toggle\" style=\"display: inline-block;color:white\" data-toggle=\"dropdown\" href=\"#\"><p style=\"text-align: center;cursor: pointer;\"><i  class=\"fa fa-2x fa-user-circle-o\"></i></p>\n");
      out.write("                <p style=\"text-align: center;font-size: 15px;font-weight: bolder;cursor: pointer\">Hello,");
      out.print(session.getAttribute("A2") );
      out.write(" <i class=\"fa fa-angle-down\"></i></p></a>\n");
      out.write("              <ul class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                  <li><a href=\"vieworders.jsp\">View Orders</a></li>\n");
      out.write("                  <li><a href=\"viewfeedback.jsp\">View Feedback</a></li>\n");
      out.write("                   <li><hr></hr></li>\n");
      out.write("                   <li><a href=\"changepassword.jsp\" style=\"margin-top:-10px\">Change Password</a></li>\n");
      out.write("                   <li><a href=\"editprofile.jsp\">Edit Profile</a></li>\n");
      out.write("                   <li ><a href=\"signout.jsp\" >Sign out</a></li>\n");
      out.write("            </ul>  \n");
      out.write("              </div> \n");
      out.write("             ");
 
                }
                else
                {    
               
      out.write("\n");
      out.write("               <div class=\"col-md-3 col-md-offset-1\" id=\"d1\">\n");
      out.write("                   <form method=\"post\" action=\"Cart\" style=\"display:inline-block;padding-right: 30px\">\n");
      out.write("                       <input type=\"hidden\" name=\"cartval\" value=\"cart\"></input>\n");
      out.write("                <button type=\"submit\" class=\"glyphicon glyphicon-shopping-cart\" style=\"border:none;font-size:50px;cursor: pointer;background-color: #269abc\"><span class=\"badge\" style=\"margin-left:-30px;margin-top: -35px;background-color:black;color:white ;font-size: 12px\">");
      out.print( count );
      out.write("</span></button>\n");
      out.write("                   </form>\n");
      out.write("                <a href=\"newuser.jsp\" style=\"display:inline-block\"><p style=\"text-align: center;cursor: pointer;\"><i class=\"fa fa-2x fa-user\" style=\"color:white;background-color: #269abc\"></i></p>\n");
      out.write("            <p style=\"text-align: center;font-size: 15px;font-weight: bolder;cursor: pointer;color:white\">Login/Sign up</p></a>\n");
      out.write("                </div>\n");
      out.write("               ");

                             }
                
      out.write("\n");
      out.write("             </div>\n");
      out.write("                     \n");
      out.write("            </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-default\" style=\"background-color:#269abc;\" >\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    \n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li><a class=\"glyphicon glyphicon-home\" href=\"home.jsp\" style=\"color:black;font-weight: bold;font-size: 18px\">    </a></li>\n");
      out.write("      <li><a href=\"aboutus.jsp\" style=\"color:black\">Company profile</a></li>\n");
      out.write("      <li><a href=\"contactus.jsp\" style=\"color:black\">Contact us</a></li>\n");
      out.write("      <li><a href=\"feedback.jsp\" style=\"color:black\">Suggestions/Feedback</a></li>  \n");
      out.write("      <li><a href=\"workwithus.jsp\" style=\"color:black\">Careers</a></li>\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" style=\"color:black\">All Products\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\" id=\"u1\">\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("       <form class=\"navbar-form navbar-right\" action=\"displayproducts.jsp\" style=\"padding-right:40px\" id=\"frmsearch\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"txtsearch\">\n");
      out.write("      </div>\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("          \n");
      out.write("         \n");
      out.write("              \n");
      out.write("        <script>\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \n");
      out.write("             \n");
      out.write(" \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("   $('#frmlogin').formValidation({\n");
      out.write("       \n");
      out.write("       framework: 'bootstrap',\n");
      out.write("       container:'tooltip',\n");
      out.write("       icon: {\n");
      out.write("            valid: 'glyphicon glyphicon-ok',\n");
      out.write("            invalid: 'glyphicon glyphicon-remove',\n");
      out.write("            validating: 'glyphicon glyphicon-refresh'\n");
      out.write("        },\n");
      out.write("        \n");
      out.write("        live:'disabled',\n");
      out.write("        fields: {\n");
      out.write("            \n");
      out.write("            txt_username: {\n");
      out.write("                validators: {\n");
      out.write("                    notEmpty:{\n");
      out.write("                         message: 'Userid is required'\n");
      out.write("                    },\n");
      out.write("                    emailAddress: {\n");
      out.write("                        message:'Invalid format'\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            txt_password: {\n");
      out.write("                validators: {\n");
      out.write("                    notEmpty:{\n");
      out.write("                         message: 'Password is required'\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("     ");

        
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        
       
        
      out.write("\n");
      out.write("\n");
      out.write("      ");

           session=request.getSession(true);
          
         
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\" >\n");
      out.write("             <div class=\"col-md-9\">\n");
      out.write("                 \n");
      out.write("                 <h2>For your style </h2>\n");
      out.write("                 <hr style=\"height:3px;background-color:grey \" >\n");
      out.write("                 <div class=\"col-md-3 \">\n");
      out.write("                  <div class=\"panel panel-danger\" >\n");
      out.write("        \n");
      out.write("        <div class=\"panel-body\"><img  src=\"images/f5.jpg\" class=\"img-responsive\" style=\"width:100%;\" alt=\"Offer 1\"></div>\n");
      out.write("        <div class=\"panel-footer\">Bluetooth Speakers<br/>Price: <i class=\"fa fa-rupee\"> 500/-</i> <a href='selectproduct.jsp?pcode=E201900001' style=\"padding-left: 10px;cursor: pointer\"> Add to cart</a></div>\n");
      out.write("      </div>\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"col-md-3 col-md-offset-1\">\n");
      out.write("                  <div class=\"panel panel-danger\" >\n");
      out.write("        \n");
      out.write("        <div class=\"panel-body\"><img src=\"images/f6.jpg\" class=\"img-responsive\" style=\"width:100%;\" alt=\"Offer 1\"></div>\n");
      out.write("        <div class=\"panel-footer\">JBL Speakers<br/>Price: <i class=\"fa fa-rupee\"> 18000/-</i> <a href='selectproduct.jsp?pcode=E201900001' style=\"padding-left: 10px;cursor: pointer\"> Add to cart</a></div>\n");
      out.write("      </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-md-3 col-md-offset-1\">\n");
      out.write("                  <div class=\"panel panel-danger\" >\n");
      out.write("        \n");
      out.write("        <div class=\"panel-body\"><img src=\"images/f7.jpg\" class=\"img-responsive\" style=\"width:100%;\" alt=\"Offer 1\"></div>\n");
      out.write("        <div class=\"panel-footer\">Smart watches<br/>Price: <i class=\"fa fa-rupee\"> 1600/-</i> <a href='selectproduct.jsp?pcode=E201900001' style=\"padding-left: 10px;cursor: pointer\"> Add to cart</a></div>\n");
      out.write("      </div>\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"col-md-3 \">\n");
      out.write("                  <div class=\"panel panel-danger\" >\n");
      out.write("        \n");
      out.write("        <div class=\"panel-body\"><img src=\"images/f8.jpg\" class=\"img-responsive\" style=\"width:100%;\" alt=\"Offer 1\"></div>\n");
      out.write("        <div class=\"panel-footer\">VM Washing Machine<br/>Price: <i class=\"fa fa-rupee\"> 20000/-</i> <a href='selectproduct.jsp?pcode=E201900001' style=\"padding-left: 10px;cursor: pointer\"> Add to cart</a></div>\n");
      out.write("      </div>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-md-3 col-md-offset-1 \">\n");
      out.write("                  <div class=\"panel panel-danger\" >\n");
      out.write("        \n");
      out.write("        <div class=\"panel-body\"><img src=\"images/f4.jpg\" class=\"img-responsive\" style=\"width:100%;\" alt=\"Offer 1\"></div>\n");
      out.write("        <div class=\"panel-footer\">Samsung Mobile<br/>Price: <i class=\"fa fa-rupee\"> 48000/-</i> <a href='selectproduct.jsp?pcode=E201900001' style=\"padding-left: 10px;cursor: pointer\"> Add to cart</a></div>\n");
      out.write("      </div>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-md-3 col-md-offset-1 \">\n");
      out.write("                  <div class=\"panel panel-danger\" >\n");
      out.write("        \n");
      out.write("        <div class=\"panel-body\"><img src=\"images/e4.jpg\" class=\"img-responsive\" style=\"width:100%;\" alt=\"Offer 1\"></div>\n");
      out.write("        <div class=\"panel-footer\">Apple Mobile<br/>Price: <i class=\"fa fa-rupee\"> 60000/-</i> <a href='selectproduct.jsp?pcode=E201900001' style=\"padding-left: 10px;cursor: pointer\"> Add to cart</a></div>\n");
      out.write("      </div>\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("           \n");
      out.write("             </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                 \n");
      out.write("      <div class=\"panel panel-info\" >\n");
      out.write("        <div class=\"panel-heading\" style=\";font-family: cursive;font-weight: bold\">SWEET SATURDAY DEAL</div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"images/f9.jpg\" class=\"img-responsive\" style=\"width:100%;\" alt=\"Offer 1\"></div>\n");
      out.write("        <div class=\"panel-footer\">Get 10% off on purchase of 5000 and more <a style=\"text-align: right\"> Details</a></div>\n");
      out.write("      </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"panel panel-info\">\n");
      out.write("        <div class=\"panel-heading\" style=\";font-family: cursive;font-weight: bold\">THRILLING TUESDAY DEAL</div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"images/f10.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\">Get <i class=\"fa fa-rupee\"></i>   300 gift vouchers on purchase of 10,000/- or more<a style=\"padding-left: 50px\"> Details</a></div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        </div>   \n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
