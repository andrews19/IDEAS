<%-- 
    Document   : ErrorServer
    Created on : 15-ene-2016, 12:29:02
    Author     : ACAMPOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <script src="sweetalert-master/dist/sweetalert.min.js"></script> 
       <link rel="stylesheet" type="text/css" href="sweetalert-master/dist/sweetalert.css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<script language="JavaScript" type="text/javascript">
         
           
        
 swal({   title: "Error",   text: "Problemas Al conectarse, intente mas tarde.", 
          type: "error",    confirmButtonColor: "#DD6B55",   
          confirmButtonText: "Aceptar!",   closeOnConfirm: false }, function(){ 
       self.location = "index.html"; });
     
</script>
  
        
    </body>
</html>
