<%-- 
    Document   : signup
    Created on : Jan 9, 2017, 4:32:19 PM
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
    $('#frmguest').formValidation({
       
        framework: 'bootstrap',
        
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        
        live:'disabled',
        fields: {
             txtfname: {
                validators: {
                    notEmpty: {
                        message: 'The first name is required'
                        
                    },
                    
                    
                    regexp: {
                        regexp: /^[a-zA-Z]+$/,
                        message: 'The first name can only consist of alphabetical, number and underscore'
                    }
                }
            },
           
           
            txtemailid: {
                validators: {
                    notEmpty:{
                         message: 'The emailid is required'
                    },
                    emailAddress: {message: 'Invalid emailid format'}
                }
            },
             txtmobile: {
                validators: {
                    notEmpty: {},
                    digits: {},
                    phone: {
                        country: 'IN'
                    }
                }
            }
            
        }
          
    });
});

$(document).ready(function() {
    $('#frmlogin').formValidation({
       
        framework: 'bootstrap',
         container: 'popover',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        
        live:'disabled',
        fields: {
             
            txtuserid: {
                validators: {
                    notEmpty:{
                         message: 'The emailid is required'
                    },
                    emailAddress: {message: 'Invalid emailid format'}
                }
            },
            txtpassword: {
                validators: {
                    notEmpty: {
                        message: 'The password value is required'
                        
                    },
                    identical: {
                        field: 'txtconfirmpassword',
                        message: 'The password and confirm password do not match'

                    }
                 }
            }
            
        }
          
    });
});
        
    </script>
    </head>
    <body>
      <%
        
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        if((String)session.getAttribute("A1")==null)
               {
           if((String)session.getAttribute("guest")==null)
               {
               
               response.sendRedirect("home.jsp");
                return;
               }
       }
       
        %>
        <div class="container-fluid" style="padding-top: 20px">
        <div class="row"  >
         <div class="col-md-6 col-md-offset-1" >
           ${errormsg}
             <div class="panel panel-danger" >
                     <div class="panel-heading" style="font-weight: bolder;background-color:#269abc;color:white  "><i class="fa fa-user-plus" ></i> Continue as Guest user</div>
                     <div class="panel-body">

                  <form role="form" name="frmguest" id="frmguest" action=Cart_Login method="post">
                    <div class="form-group">
                        <input type="text" class="form-control" name="txtfname" placeholder="Enter first name" value="${fname}">
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" name="txtemailid"  placeholder="Enter emailid" ${autofocus} >
                    </div>
                    <div class="form-group">
                        <input type="tel" class="form-control" name="txtmobile" placeholder="Enter mobile no" maxlength="10"  value="${mobile}">
                    </div>
                    <input type="hidden" name="btn_cart" value="guest">
                    <div class="form-group text-center">
                        <button type="submit"  class="btn btn-primary" id="register" style="width:25%;font-weight: bolder;">Continue</button>
                    </div>
              </form>                            
            </div>
             </div>
                  
         </div>
                      <div class="col-md-1" style="padding-top: 100px;padding-left: 50px;font-weight: bold" >
                      OR
                      </div>
                    
                    <div class="col-md-3 " >
                        
           ${msg}
             <div class="panel panel-danger"  >
                     <div class="panel-heading" style="font-weight: bolder;background-color:#269abc;color:white  "><i class="fa fa-sign-in"></i> Login</div>
                     <div class="panel-body">

                  <form role="form" name="frmlogin" id="frmlogin" action="Cart_Login" method="post">
                    <div class="form-group">
                        <input type="text" class="form-control" name="txtuserid" placeholder="Enter UserID" value="${fname}">
                    </div>
                   
                    <div class="form-group">
                        <input type="password" class="form-control" name="txtpassword" placeholder="Enter password" onCopy="return false" onPaste="return false">
                    </div>
                   <input type="hidden" name="btn_cart" value="login">
                    <div class="form-group text-center">
                        <button type="submit"  class="btn btn-primary" id="register" style="width:50%;font-weight: bolder;">Login</button>
                    </div>
              </form>                            
            </div>
    </div>
                    </div>
        </div>
                      
        </div>  
       <div style="position:fixed;bottom:0px;width:100%;">
            <jsp:include page="footer.jsp" />    
    </div>                   
    </body>
</html>
