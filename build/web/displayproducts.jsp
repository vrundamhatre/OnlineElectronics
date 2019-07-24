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
                var n=$('#n').val();
               
             if(n!='null')
             {
                  
                 $("#dp").load("DisplayProducts?n="+n);
             }
             else
             {
                 
                 var n1=$('#n1').val();
                
                  $("#dp").load("DisplayProducts?n="+n1);
             }
    });
         $(document).ready(function(){
               
                $("#close").click(function(){
                  $("#w1").animate({width: "0px"},{easing:'linear'});
                
                  setTimeout(
  function() 
  {
     $("#w1").css("display","none");
      $("#w2").css('width','50px');
      $("#w2").css("display","");
  }, 300);
                    
                    
                     
                });
                
                 $("#open").click(function(){
                  $("#w2").animate({width: "200px"},{easing:'linear'});
                 // alert('o');
                  setTimeout(
  function() 
  {
     $("#w2").css("display","none");
     $("#w1").css('width','200px');
      $("#w1").css('display','');
  }, 300);
                    
                });
                
            });

$(document).ready(function() {
 $('input[type=checkbox]').change(function() {
       
       var cr="";
       for(i=1;i<=8;i++)
       {
             
          if($('#c'+i).is(':checked')==true)
          {
              var v=$('#c'+i).val();
           
              cr=cr+"&c"+i+"="+v;   
             
              
          }
         
          
       }
         
       $("#dp").load("DisplayProducts?f=filter"+cr);
              
      
    });
    
   
});

      
        </script>
    </head>
    <body>
        <%
       
       
         session.setAttribute("guest", "guest");
               
       
        %>
        <input type="hidden" id="n" value="<%=request.getParameter("txtsearch")%>"></input>
        <input type="hidden" id="n1" value="<%= session.getAttribute("search")%>"></input>
        

        <div class="container" style="margin-left: 0px" >
            <div class="row">
                
                <div class="col-md-2 well" id="w2" style="height:1000px;background-color: white;display:none">
                    <i id="open" class="fa fa-bars pull-right" style="font-size: 20px;cursor:pointer"></i>
                </div>
               
                <div  id="dp" >         
                        
              
            </div>
        </div>
        </div>
        
     <div style="position:fixed;bottom:0px;width:100%;">
            <jsp:include page="footer.jsp" />    
    </div> 
    </body>
</html>
