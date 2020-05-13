<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/5/13
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="account/updataAccount" method="post">
        用户姓名：<input type="text" name="username"/><br/>
        用户密码：<input type="password" name="password"><br/>
        用户年龄：<input type="text" name="age"><br/>

        账户1姓名：<input type="text" name="accounts[0].username"><br/>
        账户1金额：<input type="text" name="accounts[0].money"><br/>
        账户2姓名：<input type="text" name="accounts[1].username"><br/>
        账户2金额：<input type="text" name="accounts[1].money"><br/>
        账户3姓名：<input type="text" name="accountsMap['one'].username"><br/>
        账户3金额：<input type="text" name="accountsMap['one'].money"><br/>
        账户4姓名：<input type="text" name="accountsMap['two'].username"><br/>
        账户4金额：<input type="text" name="accountsMap['two'].money"><br/>
        <input type="submit" value="提交"/>
    </form>
</center>

</body>
</html>
