<%-- 
    Document   : head
    Created on : Jan 9, 2017, 4:35:41 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>E-Electronics</title>
       
    
        
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/formValidation.css"/> <%--used for validation--%>
        <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.css"/> 
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/breadcrumbs.css"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-datetimepicker.css"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-magnify.css">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/magnify.css">
        
         <script src="bootstrap-3.3.7-dist/js/jquery-3.1.1.js"></script>
         <script src="bootstrap-3.3.7-dist/js/jquery-1.12.0.js"></script>
         <script src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
         <script src="bootstrap-3.3.7-dist/js/moment.js"></script>
         <script src="bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.js"></script>
         <script src="bootstrap-3.3.7-dist/js/formValidation.js"></script> <%--used for validation--%>
         <script src="bootstrap-3.3.7-dist/js/bootstrap_1.js"></script>  <%--used for validation--%>
         <script src="bootstrap-3.3.7-dist/js/bootstrap-magnify.js"></script>

 <script>
$(document).ready(function(){
    var m=window.location.pathname.substring(window.location.pathname.lastIndexOf("/")+1);
    if(m=='newuser.jsp' || m=='Login' || m=='Signup')
    {
        $("#d1").hide();
    }
    });         
       
$(document).ready(function(){
   
        $.get("GetProductType",function(data, status){       
        var res = data.split("-");      
        for (var i in res) 
        {
            if(res[i]!='')
            {
                $("#u1").append("<li><a href='displayproducts.jsp?txtsearch="+res[i]+"'>"+res[i]+"</a></li>");
            }
        }
    });
});

$(document).ready(function() {
    $('#frmsearch').formValidation({       
        framework: 'bootstrap',
         container: 'popover',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        
        live:'disabled',
        container:'popover',
        fields: {
             
            txtsearch: {
                validators: {
                    notEmpty:{
                         message: 'Enter some value'
                    }
                }
            }
            
        }
          
    });
});
           $(document).ready(function(){
                
                 
                  var m=window.location.pathname.substring(window.location.pathname.lastIndexOf("/")+1);
                 
                  if(m=='signup.jsp' || m=='Login' || m=='Signup')
                  {
                         
                      $("#d1").hide();
                   
                  }
                  
           });
         
                        
$(document).ready(function(){
    $("#login").click(function(){
        $("#modal_login").modal();
    });
});
</script>
<style>
    .row {
        height: 100px;
       
      }
    @media screen and (max-width: 1200px) {
      .row {
        height: auto;
     
      }
      
    }
</style>


    </head>
    
    <body>
        <%
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
        %>
       
    <div class="container-fluid">
        <div class="row" style="background-color:#4E5885;color :white;padding-top: 20px;height: 100%">
            <div class="col-md-8">
            <p style="font-size: 40px;font-family:Broadway;padding-left: 1%"><a href="home.jsp" style="text-decoration: none;color:white">Vrunda's Mobile</a></p>
            </div>
              
            <%
                if(session.getAttribute("A1")!=null && ((String)session.getAttribute("A1")).equalsIgnoreCase("admin@eelectronics.com"))
                {
            %>
              
            <div class="col-md-2 col-md-offset-2" id="d2">                  
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
            <p style="text-align: center;cursor: pointer;color:white"><i class="fa fa-2x fa-user-secret "></i></p>
            <p style="text-align: center;font-size: 15px;font-weight: bolder;cursor: pointer;color:white">Hello,<%=session.getAttribute("A2") %> <i class="fa fa-angle-down" ></i></p></a>
            <ul class="dropdown-menu dropdown-menu-right">
                <li><a href="addproduct.jsp">Add Product</a></li>
                <li><a href="viewproduct.jsp">View/Remove Product</a></li>
                <li><a href="vieworders.jsp">View Orders</a></li>
                <li><hr></hr></li>
                <li><a href="changepassword.jsp" style="margin-top:-10px">Change Password</a></li>
                <li><a href="signout.jsp" >Sign out</a></li>
            </ul>  
            </div> 
            
            <%
                }
                else if(session.getAttribute("A1")!=null)
                {
            %>
               
            <div class="col-md-2 col-md-offset-2" id="d2">
                <form method="post" action="Cart" style="display:inline-block;padding-right: 30px">
                    <input type="hidden" name="cartval" value="cart"></input>
                    <button type="submit" class="glyphicon glyphicon-shopping-cart" style="border:none;font-size:50px;cursor: pointer;background-color: #E74A0F"><span class="badge" style="margin-left:-30px;margin-top: -35px;background-color:#E74A0F;color:black ;font-size: 12px"><%= count %></span></button>
                </form>
                   
            <a class="dropdown-toggle" style="display: inline-block;color:white" data-toggle="dropdown" href="#"><p style="text-align: center;cursor: pointer;"><i  class="fa fa-2x fa-user-circle-o"></i></p>
                <p style="text-align: center;font-size: 15px;font-weight: bolder;cursor: pointer">Hello,<%=session.getAttribute("A2") %> <i class="fa fa-angle-down"></i></p></a>
              <ul class="dropdown-menu dropdown-menu-right">
                  <li><a href="vieworders.jsp">View Orders</a></li>
                   <li><hr></hr></li>
                   <li><a href="changepassword.jsp" style="margin-top:-10px">Change Password</a></li>
                   <li ><a href="signout.jsp" >Sign out</a></li>
            </ul>  
            </div> 
              
             <% 
                }
                else
                {    
               %>
               <div class="col-md-3 col-md-offset-1" id="d1">
                   <form method="post" action="Cart" style="display:inline-block;padding-right: 30px">
                       <input type="hidden" name="cartval" value="cart"></input>
                <button type="submit" class="glyphicon glyphicon-shopping-cart" style="border:none;font-size:50px;cursor: pointer;background-color: #4E5885"><span class="badge" style="margin-left:-30px;margin-top: -35px;background-color:black;color:white ;font-size: 12px"><%= count %></span></button>
                   </form>
                <a href="newuser.jsp" style="display:inline-block"><p style="text-align: center;cursor: pointer;"><i class="fa fa-2x fa-user" style="color:white;background-color: #4E5885"></i></p>
            <p style="text-align: center;font-size: 15px;font-weight: bolder;cursor: pointer;color:white">Login/Sign up</p></a>
                </div>
               <%
                             }
                %>
             </div>
                     
            </div>
</div>
        
        <nav class="navbar navbar-default" style="background-color:#4E5885;" >
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li><a class="glyphicon glyphicon-home" href="home.jsp" style="color:white;font-weight: bold;font-size: 18px"></a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color:white">All Products
        <span class="caret"></span></a>
        <ul class="dropdown-menu" id="u1">
         
        </ul>
      </li>
      <li><a href="contactus.jsp" style="color:white">Contact us</a></li> 
      
      
    </ul>
       <form class="navbar-form navbar-right" action="displayproducts.jsp" style="padding-right:40px" id="frmsearch">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search" name="txtsearch">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
  </div>
</nav>

</body>
         
</html>
