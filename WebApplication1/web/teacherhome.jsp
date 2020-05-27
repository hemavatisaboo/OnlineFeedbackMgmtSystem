<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<%
String name;
name=request.getParameter("username");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Home</title>
</head>
<body bgcolor="Green Bay">
<form name="teacherhome">
<center>
<img src="logo.png" width="270" height="161" alt="logo" align=left><br><br>
<font size=30><b>K.C.E.S.'s C.O.E.I.T.<br><br></font><br>
<br><br><br>
<h2>
<marquee bgcolor="Yellow" behavior=alternate width="100%">TEACHER HOMEPAGE</marquee>
</h2>
<br>
<br><br><br>
<h3>
<a href="teacherreport2.jsp?name='"+name+"'" >GENERATE REPORT</a><br><br>
<a href="changeteacherpass.jsp" >CHANGE PASSWORD</a><br><br>
</h3>
</center>
</form>
</body>
</html>