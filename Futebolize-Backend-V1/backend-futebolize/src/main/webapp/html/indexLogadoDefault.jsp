<%@ page import="br.com.futebolize.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // Verifica se o atributo na sessão é null
    if(request.getSession().getAttribute("usuarioLogado") == null)
        response.sendRedirect("../index.jsp");
%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <!-- @Desenvolvido por: Rafael Abrantes -->

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1">
    <title>Futebolize</title>
    <link rel="icon" href="../assets/images/ball.ico">
    <link href="../css/styleLogadoDefault.css" rel="stylesheet" type="text/css" />
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
            <li><a href="quadras.jsp">QUADRAS</a></li>
            <li><a href="sobre.jsp">SOBRE</a></li>
            <li><a href="perfil.jsp">MEU PERFIL</a></li>
            <li><a href="sair.jsp">SAIR</a></li>
        </ul>
    </nav>

</header>

<h1>
    <BR><BR><BR>
    Ola! Bem vindo a area de usuário Futebolize!
</h1>
<script src="../javascript/script.js"></script>
</body>

</html>