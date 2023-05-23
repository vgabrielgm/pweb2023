<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	  <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>


<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">id:</th>
      <th scope="col">Nome:</th>
      <th scope="col">Email:</th>
     
    </tr>
  </thead>
  <tbody>
 <c:forEach var="usuarios" items="${ListaUsu}">
 <tr>
 <td>${usuarios.id} </td>
 <td>${usuarios.nome}  </td>
 <td> ${usuarios.email} </td>
  </tr>
  
  </c:forEach>
     
  </tbody>
  
</table>
<a class="btn btn-primary" href="usuarioCadastro.jsp" role="button">Voltar</a>









</body>
</html>