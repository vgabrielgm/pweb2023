<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  
<body>


<%

String nome= request.getParameter("name");
if(nome== null)
 nome="";

String email= request.getParameter("email");
if(email== null)
email="";
%>



		<div class="container-fluid">
		
		
		 <h1>Cadastro de Usuario</h1>
				
				<form  method="post" action="cadastrarUsuario">
				
		        <label for="name" class"" >Nome:</label> 
		        
		        <input type="text" name="name" id="name" value="<%out.print (nome); %>"  >
		
		
		       <label for="email">email:</label> 
		       
		        <input type="text" name="email" id="email" value="<%out.print (email); %>">
		        
		        
		        <br> <br>
		        <label for="senha">Senha:</label>
		        <input type="password" name="senha" id="senha"> 
		        
		         <label for="senha2"> senha2:</label>
		        <input type="password" name="senha2" id="senha2"> 
		        <label for="data">Data de aniversario:</label>
		        <input type="Date" name="date" id="date"> <br><br>
		           <input type="submit" value="Salvar">
		        <a class="btn btn-primary" href="cadastrarUsuario" role="button">listar Usuarios</a>
		        <a class="btn btn-primary" href="usuarioCadastro.jsp" role="button">Voltar</a>
		      
		        
		        
		    </form>
		 
 
 
 
		</div>
		
		
	

</body>
</html>