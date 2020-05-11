<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/5/11
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":8080"+request.getServletPath()+path+"/";
  System.out.println(basePath);
%>
<base href="<%=basePath%>">