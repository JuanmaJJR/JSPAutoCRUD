<%-- 
    Document   : index
    Created on : Nov 22, 2017, 9:56:26 AM
    Author     : juan.jusue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html;
charset=UTF-8">
 <title>Inicio</title>
 </head>
 <body>
 <h1>Albumes. Obtiene todos los Albumes con EJB </h1>
 <form action="NewServlet" method="POST">Presiona el
botón para obtener los datos.<br>
 <input type="submit" name="enviar" value="Enviar"
/></form>
 <a href="GetData" class="button">Añadir datos</a>
 <a href="DeleteData" class="button">Añadir datos</a>

 </body>
</html>