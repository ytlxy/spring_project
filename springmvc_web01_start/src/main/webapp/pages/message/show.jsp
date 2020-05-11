<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/5/11
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" isELIgnored="false"%>
<html>
<head>
    <jsp:include page="/pages/plugins/include_basepath.jsp"/>
    <title>接收</title>
</head>
<body>
<%!
    public static final String INPUT_URL="/pages/message/input";
%>
<h1>${echoMessage}</h1>
<h2><a href="<%=INPUT_URL%>">页面输入</a></h2>
</body>
</html>