<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>STUDENT FEEDBACK</title>
<script language="javascript" >

</script>
</head>
<body bgcolor="cyan">
<form name="students3" action ="st3" onsubmit="return fun3()" method="post">
<center><h1>K.C.E.S.'s C.O.E.I.T.</h1>
<h2>JALGAON-425001</h2>
<h3>Department:Computer</h3>
<br>
<br>
<h3><u>STUDENT FEEDBACK</u></h3></center>
<br>
<table border="0" cellspacing="0" cellpadding=10 >
<tr>
	<th colspan=2 align=left>1. Subject :</th>
	<td><select name="sub" size="1"><option value="CNS">CNS</option></select></td>
		
</tr>

</table>
<%@include file="feedbackform.jsp" %>
</form>
    
</body>
</html>