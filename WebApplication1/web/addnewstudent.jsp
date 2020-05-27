<%-- 
    Document   : addnewstudent
    Created on : Feb 27, 2016, 9:33:32 PM
    Author     : KRISHNA
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Student</title>
<script language="javascript" >
function fun()
{
	var rollno=document.addstudent.rno.value;
	var password=document.addstudent.passwd.value;
        var years=document.addstudent.year.value;
	if(rollno=="" || password==""||years=="")
	{
		alert("First Details must be filled");
		return false;
	}
}
</script>
</head>
<body>
<body bgcolor="cyan">
<form name="addstudent" onsubmit="return fun()" >
<center>
<img src="logo.png" width="270" height="161" alt="logo"></img><br><br>
<font color=BLUE><MARQUEE WIDTH=100% BEHAVIOR=ALTERNATE BGColor=yellow><u><b>ADD NEW Student</b></u></MARQUEE></font><br><br>
<br><br>
<table width="50%" border="0" align="center" cellpadding="5" cellspacing="5"> 
<tr>
<th align=left>Enter Roll No. :</th><td align=left><input type=text value="" name="rno" size="20" ></td>
</tr>
<tr>
	<th align=left>Password :</th>
	<td align=left><input name="passwd" type=password size="20" ></td>
</tr>
<tr>
<th align=left>Enter YEAR :</th>
<td align=left><select name="year" size="1">
		<option value="SE">SE</option>
                <option value="TE">TE</option>
                <option value="BE">BE</option>
		</select></td>
</tr>
<tr>
	<th colspan=0 align=right><input type="RESET" value=RESET></th>
	<th colspan=0 align=left><input type="SUBMIT" value=SUBMIT></th>
</tr>
</table>
</center>
</form>
<%
try
{
	int flag=0;
	String sql=null;
	String str1, str2, str3, str4, str5;
	str1=request.getParameter("rno");
	str2=request.getParameter("passwd");
        str3=request.getParameter("year");
       	if( str1 != null || str2 != null || str3 != null)
	{	
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 		Connection c=DriverManager.getConnection("jdbc:odbc:abc","root","root");
		Statement s =c.createStatement();
                if (str3.equals("SE")){
		sql = "select * from student";}
                else if (str3.equals("TE")){
		sql = "select * from student1";}
                	else if (str3.equals("BE")){
		sql = "select * from student2";}
		
		ResultSet rs=s.executeQuery(sql);
		while(rs.next())
		{
			str4=rs.getString("roll");	
			str5=rs.getString("class");
			if(str1.compareToIgnoreCase(str4)==0 && str3.compareToIgnoreCase(str3)==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			out.println("<center><h3>Student is registered<br><br></h3><h4>");
                        out.println("<a href=addnewstudent.jsp>ADD</a>");
                        out.println("<a href=adminhome.html>BACK</a></h4></center>");
                        if (str3.equals("SE")){
		                    sql = "insert into student values ('"+str1+"','"+str2+"','"+str3+"')";}
                                               else if (str3.equals("TE")){
		                    sql = "insert into student1 values ('"+str1+"','"+str2+"','"+str3+"')";}
                                               else if (str3.equals("BE")){
		                    sql = "insert into student2 values ('"+str1+"','"+str2+"','"+str3+"')";}
                        s.executeQuery(sql);
               	}
                else if(flag==1){
                    out.println("<h4><center>Student you entered is already present<br>");
                    out.println("<a href=adminhome.html>BACK</a></h4></center>");
                               }
	}	
}catch(Exception e){}
%>

</body>
</html>