<%@ page import="com.example.demo.entity.Links" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>link</td>
        </tr>
        <%
            for(Links tl:{$list})
            {%>
        <tr>
            <td><%=tl.getId() %></td>
            <td><%=tl.getName() %></td>
            <td><%=tl.getLink() %>></td>
        </tr>
            <%}
        %>
    </table>
</body>
</html>