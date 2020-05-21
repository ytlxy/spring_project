<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/5/20
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>testAjax</title>
    <script src="js/jquery.js"></script>
</head>
<body>
<button id="btn">传参</button>
<script>
    $(function(){
        $("#btn").click(function(){
            $.ajax({
                url:"user/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:'{"username":"list","password":"1234","age":16}',
                dataType:"json",
                type:"post",
                success:function(data){
                    alert(data);
                    alert(data.username);
                    alert(data.password);
                    alert(data.age);
                }
            })
        });
    });
</script>
</body>
</html>
