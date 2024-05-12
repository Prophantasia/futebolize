<%@ page import="br.com.futebolize.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getSession().getAttribute("usuarioEmail") == null)
        response.sendRedirect("../index.jsp");
%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <!-- @Desenvolvido por: Matheus Campos & Rafael Abrantes -->

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1">
    <title>Futebolize</title>
    <link rel="icon" href="../assets/images/ball.ico">
    <link href="../css/perfilDono.css" rel="stylesheet" type="text/css" />
</head>

<body>

<header>
    <nav>
        <a href="../index.jsp">
            <img class="logo" src="/assets/images/logo.png"> </a>
        <div class="mobile-menu">
            <div class="line1"></div>
            <div class="line2"></div>
            <div class="line3"></div>
        </div>
        <ul class="nav-list">
            <li><a href="quadras.html">QUADRAS</a></li>
            <li><a href="sobre.html">SOBRE</a></li>
            <li><a href="cadastrarQuadras.jsp">CADASTRAR QUADRA</a></li>
            <li><a href="indexLogado.jsp">MEU PERFIL</a></li>
            <li><a href="sair.jsp">SAIR</a></li>
        </ul>
    </nav>

</header>

    <h1>
        Ola! Bem vindo a area do dono Futebolize!
    </h1>

</body>

</html>