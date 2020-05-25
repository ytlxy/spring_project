<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<body>
<h3>文件上传</h3>
<form action="fileupload/fileupload1" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="upload"/><br/>
    <input type="submit" value="上传"/>
</form><br/>
<h3>springMvc上传文件</h3>
<form action="fileupload/fileupload2" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="upload"/><br/>
    <input type="submit" value="上传"/>
</form><br/>
<h3>跨服务器上传</h3>
<form action="fileupload/fileupload3" method="post" enctype="multipart/form-data">
选择文件:<input type="file" name="upload"/><br/>
<input type="submit" value="上传"/>
</form>
</body>
</html>
