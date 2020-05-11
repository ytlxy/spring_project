<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/5/11
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<head>
    <jsp:include page="/pages/plugins/include_basepath.jsp"/>
    <title>Title</title>
</head>
<body>
<%!
    public static final String INPUT_URL="/pages/message/echo";
%>
<form action="<%=INPUT_URL%>" method="get">
    请输入信息:<input type="text" name="msg" id="msg">
    <button type="submit">发送</button>
</form>
</body>
</html>
