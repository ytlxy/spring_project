<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/5/13
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<a href="anno/testRequestParam?name=哈哈">RequestParam</a>
    <form action="anno/testRequestBody" method="post">
        用户姓名：<input type="text" name="username"><br/>
        用户年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交"/>
    </form>
</center>
</body>
</html>
