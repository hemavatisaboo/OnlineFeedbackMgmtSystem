<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Teacher</title>
<script language="javascript" >
function fun()
{
	var name=document.addteacher.tename.value;
	var uname=document.addteacher.usname.value;
	var pass=document.addteacher.passd.value;
        var y1=document.addteacher.year.value;
        var sub=document.addteacher.sname.value;
        if(name=="" || uname=="" || sub=="" || pass=="")
	{
		alert("First Details must be filled");
		return false;
	}
}
</script>
</head>
<body>
<body bgcolor="cyan">
<form name="addteacher" onsubmit="return fun()" >
<center>
<img src="logo.png" width="270" height="161" alt="logo"></img><br><br>
<font color=BLUE><MARQUEE WIDTH=100% BEHAVIOR=ALTERNATE BGColor=yellow><u><b>ADD NEW TEACHER</b></u></MARQUEE></font><br><br>
<br><br>
<table width="50%" border="0" align="center" cellpadding="5" cellspacing="5"> 
<tr>
<th align=left>Enter Name :</th><td align=left><input type=text value="" name="tename" size="30" ></td>
</tr>
<tr>
<th align=left>Enter UserName :</th><td align=left><input type=text value="" name="usname" size="20" ></td>
</tr>
<tr>
	<th align=left>Password :</th>
	<td align=left><input name="passd" type=password size="20" ></td>
</tr>
<tr>
<th align=left>Enter year :</th><td align=left><select name="year" size="1">
		<option value="SE">SE</option>
                <option value="TE">TE</option>
                <option value="BE">BE</option>
		</select></td>
</tr>
<tr>
<th align=left>Enter Subject :</th><td align=left><input type=text value="" name="sname" size="30" ></td>
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
	int x, t=0, flag=0;
	String sql;
	String str1, str2, str3, str4, str5, str6, str7;
	str1=request.getParameter("tename");
	str2=request.getParameter("usname");
	str3=request.getParameter("passd");
        str4=request.getParameter("year");
        str5=request.getParameter("sname");
	if( str1 != null || str2 != null || str3 != null || str4 != null ||str5!=null)
	{	
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 		Connection c=DriverManager.getConnection("jdbc:odbc:abc","root","root");
		Statement s =c.createStatement();
		sql = "select * from teacher";
		ResultSet rs=s.executeQuery(sql);
		while(rs.next())
		{
			str6=rs.getString("tname");
			str7=rs.getString("subject");	
			if(str1.compareToIgnoreCase(str6)==0 && str5.compareToIgnoreCase(str7)==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
                        out.println("<center><h3>Teacher is registered<br><br></h3><h4>");
                        out.println("<a href=addnewteacher.jsp>ADD</a>");
                        out.println("<a href=adminhome.html>BACK</a></h4></center>");	
                        sql = "insert into teacher values ('"+str2+"','"+str3+"','"+str1+"','"+str4+"','"+str5+"')";
			s.executeQuery(sql);
                }
                else if(flag==1)
                {
                    out.println("<center><h4>Teacher name you entered is already present<br>");
                    out.println("<a href=adminhome.html>BACK</a></h4></center>");
                }
	}	
}catch(Exception e){}
%>
</body>
</html>