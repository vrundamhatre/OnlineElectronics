<%-- 
    Document   : contactus
    Created on : Mar 19, 2016, 7:49:49 PM
    Author     : shruti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>E-Electronics</title>
         <%@include file="head.jsp" %>           
    </head>
    <body >
        
    <div class="container-fluid">
    <div class="row" >
        <div class="col-md-4 col-md-offset-3" style="margin-top: -40px">
        <div class="page-header"><h1>Customer support</h1></div>
        
        <div class="well">
           <i class="fa fa-envelope"></i> <b>Email</b><br/><br/>
           Please feel free to write to us on <a href="">eelectronics@gmail.com</a>
       </div>
        
        <div class="well">
           <i class="fa fa-phone"></i> <b>Phone</b><br/><br/>
           Talk to us on our 24hrs help line <b> 1800-1234-123 </b><br/>
           For complains call <b> 1800-1234-122 </b><br/>
        </div>
        </div>
    </div>
       
    </div>   
    <div style="position:fixed;bottom:0px;width:100%;">
            <jsp:include page="footer.jsp" />    
    </div>      
    </body>
</html>
