<%-- 
    Document   : displaytrucks
    Created on : Mar 11, 2017, 6:15:17 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Electronics</title>
        <%@include file="head.jsp" %>
        <script>
            $(document).ready(function() {
           $("#products_table").load("ViewOrder");
        });
         
         $(document).ready(function(){
  $("#txtsearch").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("tbody tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});

      
        </script>
    </head>
    <body>
      

        <div class="container">
            <div class="row">
                <div class="col-md-offset-2 col-md-8">
                     <div class="input-group">
    
          <input type="text" class="form-control" placeholder="Search" id="txtsearch">
          <span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
                     </div>
                    
                    <table  class='table table-striped'><thead><tr><th>Order no</th><th>Order date</th><th>Delivery address</th><th>Email ID</th><th>Grand total</th><th>Payment mode</th><th>Details</th></tr></thead>
                        <tbody id='products_table'>
                            
                        </tbody>
                    </table>
                    
                   
                        <div id="d1">
                
            </div>
        </div>
            </div>
        </div>
       
       <%
        
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        if((String)session.getAttribute("A1")==null)
               {
            response.sendRedirect("home.jsp");
            return;
               }
       
        %>

    </body>
</html>
