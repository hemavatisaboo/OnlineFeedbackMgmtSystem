<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remove A Teacher</title>
<script language="javascript" >
function fun()
{
	var name=document.removeteacher.tname.value;
	var sub=document.removeteacher.sname.value;
	if(name=="" || sub=="")
	{
		alert("First Details must be filled");
		return false;
	}
}
</script>
</head>
<body>
<body bgcolor="cyan">
<form name="removeteacher" onsubmit="return fun()" >
<center>
<img src="logo.png" width="270" height="161" alt="logo"></img><br><br>
<font color=BLUE><MARQUEE WIDTH=100% BEHAVIOR=ALTERNATE BGColor=yellow><u><b>Remove a Teacher</b></u></MARQUEE></font><br><br>
</center>
    <h4><a href="home.html">HOME</a>
        <a href="adminhome.html">ADMINHOME</a></h4>
    <center>
<table width="50%" border="0" align="center" cellpadding="5" cellspacing="5"> 
<tr>
<th align=left>Enter Teacher Name :</th>
<td align=left><input type=text name=tname size="20" ></td>
</tr>
<tr>
    <th align=left>Enter Subject :</th>
    <td align=left><input type=text name=sname size="20" ></td>
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
	String str1, str2, sql, str3, str4;
	str1=request.getParameter("tname");
	str2=request.getParameter("sname");
	if( str1 != null || str2 != null)
	{	
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 		Connection c=DriverManager.getConnection("jdbc:odbc:abc","root","root");
		Statement s =c.createStatement();
                sql = "select * from teacher";
		ResultSet rs=s.executeQuery(sql);
		while(rs.next())
		{
			str3=rs.getString("tname");
			str4=rs.getString("subject");	
			if(str1.compareToIgnoreCase(str3)==0 && str2.compareToIgnoreCase(str4)==0)
			{
				flag=1;
				break;
			}
		}
                if(flag==1)
                {
                out.println("<center><h4>Record is deleted<br>");
                out.println("<a href=removeteacher.jsp>REMOVE</a>&nbsp&nbsp&nbsp");
                out.println("<a href=adminhome.html>ADMINHOME</a></h4></center>");
		sql = "delete from teacher where tname='"+str1+"' and subject='"+str2+"'";
		s.execute(sql);
                }
                 else if(flag==0){
                    out.println("<h4><center>Data you entered is not correct<br><br>");
                    out.println("<a href=adminhome.html>ADMINHOME</a></h4></center>");
                               }
	}
	
}catch(Exception e ){}
%>
</body>
</html>