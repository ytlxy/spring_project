<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/5/13
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<form action="param/saveParamtest" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"><br/>
    金额：<input type="text" name="money"><br/>
    用户姓名：<input type="text" name="list[0].uname"><br/>
    用户年龄：<input type="text" name="list[0].age"><br/>
    用户姓名：<input type="text" name="map['one'].uname"><br/>
    用户年龄：<input type="text" name="map['one'].age"><br/>
    <input type="submit" value="提交"/>
</form>
</center>
</body>
</html>