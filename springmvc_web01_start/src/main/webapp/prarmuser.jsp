<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/5/13
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="param/saveUser" method="post">
       用户姓名：<input type="text" name="uname"><br/>
        用户年龄：<input type="text" name="age"><br/>
        用户生日：<input type="text" name="data"><br/>
        <input type="submit" value="提交"/>
    </form>
</center>
</body>
</html>
