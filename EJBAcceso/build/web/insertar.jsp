<%-- 
    Document   : insertar
    Created on : Nov 22, 2017, 10:33:30 AM
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
 <h1>Inserta jugador: </h1>
 <form action="InsertarData" method="POST">
  Nombre: <br>
  <input type="text" name="nombre"><br>
  Apellido: <br>
  <input type="text" name="apellido">
  Posicion: <br>
  <input type="text" name="posicion">
  Equipo: <br>
  <input type="text" name="equipo">
  <input type="submit" name="enviar" value="Enviar">
  </form>
 </body>
</html>