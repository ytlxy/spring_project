<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/5/11
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<a href="param/testParam?username=hello&passwd=123">请求参数绑定</a>--%>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="passwd"><br/>
    金额：<input type="text" name="money"><br/>
    用户姓名：<input type="text" name="user.uname"><br/>
    用户年龄：<input type="text" name="user.age">
    <input type="submit" value="提交"/>
</form>
</body>
</html>
