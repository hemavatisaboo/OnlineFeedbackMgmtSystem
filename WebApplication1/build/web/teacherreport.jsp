<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TEACHER REPORT</title>
<script language="javascript" >
function fun1()
{
	var sub=document.addteacher.sub.value;
	if(sub=="")
	{
		alert("First Details must be filled");
		return false;
	}
}
</script>
</head>
<body style="background-color:cyan">
<center>
<h1>K.C.E.S.'s C.O.E.I.T.</h1>
<h2>JALGAON  425001</h2>
<br>
<br>
<h2>TEACHER REPORT GENERATION</h2>

<br>
<br>
<br>
<form name="teacherreport" action="teacherreportrough" onSubmit="return fun1()" method="post">
<table border="0" cellspacing="0" cellpadding=10 >
<tr>
	<th colspan=2 align=left>Subject :</th>
        <td align=left><select name="sub" size="1">
		<option value="DC">DC</option>
                <option value="DS">DS</option>
                <option value="CO">CO</option>
                <option value="CG">CG</option>
                <option value="MPMCI">MPMCI</option>
                <option value="ADA">ADA</option>
                <option value="OS">OS</option>
                <option value="DBMS">DBMS</option>
                <option value="OOMD">OOMD</option>
                <option value="MIS">MIS</option>
                <option value="DWM">DWM</option>
                <option value="CD">CD</option>
                <option value="iP">iP</option>
                <option value="CNS">CNS</option>
		</select></td>
</tr>
<tr>
	<th colspan=2 align=center><input type="RESET" value=RESET></th>
	<th colspan=2 align=center><input type="SUBMIT" value=SUBMIT></th>
</tr>
</table>
</form>
</center>
</body>
</html>