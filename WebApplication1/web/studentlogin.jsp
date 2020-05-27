<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<%
String str, str1, str2, name, password,year;
String t2=new String();
String sql=null;
String t=request.getParameter("t");
if(t.equals("1"))
{
	name=request.getParameter("ROLLNO");
	password=request.getParameter("PASSWORD");
        year=request.getParameter("year");
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	Connection c=DriverManager.getConnection("jdbc:odbc:abc","root","root");
	Statement s =c.createStatement();
        if(year.equals("SE")){
	sql = "select * from student";}
               else if(year.equals("TE")){
	sql = "select * from student1";}
              else if(year.equals("BE")){
	sql= "select * from student2";}
        ResultSet rs=s.executeQuery(sql);
	while(rs.next())
	{
		str=rs.getString("roll");	
		str1=rs.getString("passwd");
                str2=rs.getString("class");
		if(name.compareTo(str)==0 && password.compareTo(str1)==0 && year.compareTo(str2)==0)
		{
			if(year.equals("TE"))
                        {
                                %><jsp:forward page="sub1.jsp"/> <%
                        }
                        else if(year.equals("SE"))
                        {
                                %><jsp:forward page="se1.jsp"/> <%
                        }
                        else if(year.equals("BE"))
                        {
                                %><jsp:forward page="be1.jsp"/> <%
                        }
                        else
                        {
                            t2="Sorry";
                        }
                            
		}
		else
		{
			t2="User Name or password incorrect";
		}
	}
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>STUDENT LOGIN FORM</title>
<script language="javascript" >
function fun3()
{
	var roll=document.studentlogin.ROLLNO.value;
	var pass=document.studentlogin.PASSWORD.value;
        var year1=document.studentlogin.year.value;
	if(roll=="")
	{
		alert("First Roll No must be filled");
		return false;
	}
	else if(roll.charAt(0) < "1" )
	{
			alert("Roll No is wrong");
			document.studentlogin.ROLLNO.value="";
			document.studentlogin.ROLLNO.focus();
			return false;
	}
	else if(pass=="")
	{
		alert("First Password must be filled");
		return false;
	}
        else if(year1=="")
	{
		alert("First Year must be filled");
		return false;
	}
}
</script>
</head>
<body>
<body style="background-color:cyan" >
<form name="studentlogin" action="studentlogin.jsp?t=1" onsubmit="return fun3()" method="post">
<center>
<img src="logo.png" width="270" height="161" alt="logo" align=left><br><br>
<font size=30><b>K.C.E.S.'s C.O.E.I.T.<br><br></font><br>
<br><br><br>
<h2>
<marquee bgcolor="Yellow" behavior=alternate width="100%">STUDENT LOGIN</marquee>
</h2>
<table border="0" cellspacing=0 cellpadding=5 >
<caption align=bottom>
<input type="submit" value=SUBMIT>
</caption>
<tr>
	<td>ROLL NO :</td>
	<th><input name="ROLLNO" value="" type=text size="20"></th>
</tr>
<tr>
	<td>PASSWORD :</td>
	<th><input name="PASSWORD" value="" type=password size="20"></th>
</tr>
<tr>
	<td>YEAR(SE/TE/BE) :</td>
	<td align=left><select name="year" size="1">
		<option value="SE">SE</option>
                <option value="TE">TE</option>
                <option value="BE">BE</option>
		</select></td><%=t2 %>
</tr>
</table>
<br><br><br>
<a href="home.html" >Back To Home Page</a><br><br>
</center>
</form>
</body>
</html>