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
   $('body').on('submit','#frmcart',function(e){

    
    var q=$('#quantity').val();
    
   
     if(q=='')
     {
         
         
             $('#dp').find('#m1').text("Value is required")

         
         e.preventDefault();
     }
     else  if(q<=0 || $.isNumeric(q)==false)
     {
        
         
             $('#dp').find('#m1').text("Invalid Qty value")
                    
         e.preventDefault();
     }
          
    });
});
  
  


$(document).ready(function(){


$('body').on('click','#plus',function(){
  
    // Stop acting like a button
        //e.preventDefault();
        // Get the field name
        var quantity = parseInt($('#quantity').val());
      
        // If is not undefined
            
            $('#quantity').val(quantity + 1);

          
            // Increment
        
    });

   $('body').on('click','#minus',function(){
        // Stop acting like a button
       // e.preventDefault();
        // Get the field name
        var quantity = parseInt($('#quantity').val());
        
        // If is not undefined
      
            // Increment
            if(quantity>1){
            $('#quantity').val(quantity - 1);
            }
    });
    
});

            $(document).ready(function() {
          
           var p=window.location.search.substring(7);
               $("#dp").load("SelectProduct?pcode="+p);
               
					
          
         });
         
         

       
        </script>
    </head>
    <body>
      


        <div class="container" id="dp">
           
           
                
           
        </div>
        
        
       <div style="position:fixed;bottom:0px;width:100%;">
            <jsp:include page="footer.jsp" />    
    </div> 
        
    </body>
</html>
