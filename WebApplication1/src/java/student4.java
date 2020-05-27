

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: student4
 *
 */
 public class student4 extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public student4() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
			
			//String tname=request.getParameter("tname");
			String sub=request.getParameter("sub");
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c1=DriverManager.getConnection("jdbc:odbc:abc","root","root");
			Statement s =c1.createStatement();
                        ResultSet rs=null;
                       // rs=s.executeQuery("select * from teacher where sub='"+sub+"'");
                       // String tname=rs.getString("tname");
			String a=request.getParameter("A");
			int a1=Integer.parseInt(a);
			String b=request.getParameter("B");
			int b1=Integer.parseInt(b);
			String c=request.getParameter("C");
			int c2=Integer.parseInt(c);
			String d=request.getParameter("D");
			int d2=Integer.parseInt(d);
			String e=request.getParameter("E");
			int e2=Integer.parseInt(e);
			String f=request.getParameter("F");
			int f1=Integer.parseInt(f);
			String g=request.getParameter("G");
			int g1=Integer.parseInt(g);
			String h=request.getParameter("H");
			int h1=Integer.parseInt(h);
			
			String sql=null;
			String sql2=null;
			
			int num=0;
                        int no=0;
                        switch(a1)
			{
			case 1:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksA")+4;
                                        no=rs.getInt("form")+1;
                                        sql="update teacherreport set marksA="+num+",form="+no+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=4;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',"+num+",0,0,0,0,0,0,0,"+no+",0)";
				}
				break;
			case 2:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksA")+3;
                                        no=rs.getInt("form")+1;
					 sql="update teacherreport set marksA="+num+",form="+no+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=3;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',"+num+",0,0,0,0,0,0,0,"+no+",0)";
				}
				break;
			case 3:
				sql2="select * from teacherreportA where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksA")+2;
                                        no=rs.getInt("form")+1;
					 sql="update teacherreport set marksA="+num+",form="+no+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=2;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',"+num+",0,0,0,0,0,0,0,"+no+",0)";
				}
				break;
			case 4:
				sql2="select * from teacherreportA where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksA")+1;
                                        no=rs.getInt("form")+1;
					 sql="update teacherreport set marksA="+num+",form="+no+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=1;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',"+num+",0,0,0,0,0,0,0,"+no+",0)";
				}
				break;
			}
			s.execute(sql);
			switch(b1)
			{
			case 1:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksB")+4;
                                       // no=rs.getInt("form")+1;
					 sql="update teacherreport set marksB="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=4;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0"+num+",0,0,0,0,0,0,"+no+",0)";
				}
				break;
			case 2:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksB")+3;
                                     //   no=rs.getInt("form")+1;
					 sql="update teacherreport set marksB="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=3;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,"+num+",0,0,0,0,0,0,"+no+",0)";
				}
				break;
			case 3:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksB")+2;
                                  //      no=rs.getInt("form")+1;
					 sql="update teacherreport set marksB="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=2;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,"+num+",0,0,0,0,0,0,"+no+",0)";
				}
				break;
			case 4:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksB")+1;
                                 //       no=rs.getInt("form")+1;
					 sql="update teacherreport set marksB="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=1;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,"+num+",0,0,0,0,0,0,"+no+",0)";
				}
				break;
			}
			s.execute(sql);
			switch(c2)
			{
			case 1:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksC")+4;
                                //        no=rs.getInt("form")+1;
					 sql="update teacherreport set marksC="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=4;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,"+num+",0,0,0,0,0,"+no+",0)";
				}
				break;
			case 2:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksC")+3;
                              //          no=rs.getInt("form")+1;
					 sql="update teacherreport set marksC="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=3;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,"+num+",0,0,0,0,0,"+no+",0)";
				}
				break;
			case 3:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksC")+2;
                              //          no=rs.getInt("form")+1;
					 sql="update teacherreport set marksC="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=2;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,"+num+",0,0,0,0,0,"+no+",0)";
				}
				break;
			case 4:
				sql2="select * from teacherreport where sub='"+sub+"'" ;
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksC")+1;
                             //           no=rs.getInt("form")+1;
					 sql="update teacherreport set marksC="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=1;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,"+num+",0,0,0,0,0,"+no+",0)";
				}
				break;
			}
			s.execute(sql);
			switch(d2)
			{
			case 1:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksD")+4;
                              //          no=rs.getInt("form")+1;
					 sql="update teacherreport set marksD="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=4;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,"+num+",0,0,0,0,"+no+",0)";
				}
				break;
			case 2:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksD")+3;
                              //          no=rs.getInt("form")+1;
					 sql="update teacherreport set marksD="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=3;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,"+num+",0,0,0,0,"+no+",0)";
				}
				break;
			case 3:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksD")+2;
                              //          no=rs.getInt("form")+1;
					 sql="update teacherreport set marksD="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=2;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,"+num+",0,0,0,0,"+no+",0)";
				}
				break;
			case 4:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksD")+1;
                               //         no=rs.getInt("form")+1;
					 sql="update teacherreport set marksD="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=1;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,"+num+",0,0,0,0,"+no+",0)";
				}
				break;
			}
			s.execute(sql);
			switch(e2)
			{
			case 1:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksE")+4;
                              //          no=rs.getInt("form")+1;
					 sql="update teacherreport set marksE="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=4;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,"+num+",0,0,0,"+no+",0)";
				}
				break;
			case 2:
				sql2="select * from teacherreport where  sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksE")+3;
                                //        no=rs.getInt("form")+1;
					 sql="update teacherreport set marksE="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=3;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,"+num+",0,0,0,"+no+",0)";
				}
				break;
			case 3:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksE")+2;
                                //        no=rs.getInt("form")+1;
					 sql="update teacherreport set marksE="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=2;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,"+num+",0,0,0,"+no+",0)";
				}
				break;
			case 4:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksE")+1;
                              //          no=rs.getInt("form")+1;
					 sql="update teacherreport set marksE="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=1;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,"+num+",0,0,0,"+no+",0)";
				}
				break;
			}
			s.executeUpdate(sql);
			switch(f1)
			{
			case 1:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksF")+4;
                                 //       no=rs.getInt("form")+1;
					 sql="update teacherreport set marksF="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=4;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,"+num+",0,0,"+no+",0)";
				}
				break;
			case 2:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksF")+3;
                                  //      no=rs.getInt("form")+1;
					 sql="update teacherreport set marksF="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=3;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,"+num+",0,0,"+no+",0)";
				}
				break;
			case 3:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksF")+2;
                                    //    no=rs.getInt("form")+1;
					 sql="update teacherreport set marksF="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=2;
                                        no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,"+num+",0,0,"+no+",0)";
				}
				break;
			case 4:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksF")+1;
                                     //   no=rs.getInt("form")+1;
					 sql="update teacherreport set marksF="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=1;
					no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,"+num+",0,0,"+no+",0)";
				}
				break;
			}
			s.execute(sql);
			switch(g1)
			{
			case 1:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksG")+4;
                                    //    no=rs.getInt("form")+1;
					 sql="update teacherreport set marksG="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=1;
					no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,0,"+num+",0,"+no+",0)";
				}
				break;
			case 2:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksG")+3;
                                     //   no=rs.getInt("form")+1;
					 sql="update teacherreport set marksG="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=3;
					no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,0,"+num+",0,"+no+",0)";
				}
				break;
			case 3:
				sql2="select * from teacherreportG where  sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksG")+2;
                                     //   no=rs.getInt("form")+1;
					 sql="update teacherreport set marksG="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=2;
					no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,0,"+num+",0,"+no+",0)";
				}
				break;
			case 4:
				sql2="select * from teacherreportG where  sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksG")+1;
                                     //   no=rs.getInt("form")+1;
					 sql="update teacherreport set marksG="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=1;
					no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,0,"+num+",0,"+no+",0)";
				}
				break;
			}
			s.execute(sql);
			switch(h1)
			{
			case 1:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksH")+4;
                                       // no=rs.getInt("form")+1;
					 sql="update teacherreport set marksH="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=4;
					no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,0,0,"+num+","+no+",0)";
				}
				break;
			case 2:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksH")+3;
                                       // no=rs.getInt("form")+1;
					 sql="update teacherreport set marksH="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=3;
					no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,0,0,"+num+","+no+",0)";
				}
				break;
			case 3:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksH")+2;
                                       // no=rs.getInt("form")+1;
					 sql="update teacherreport set marksH="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=2;
					no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,0,0,"+num+","+no+",0)";
				}
				break;
			case 4:
				sql2="select * from teacherreport where sub='"+sub+"'";
				try
				{
					rs=s.executeQuery(sql2);
					rs.next();
					num=rs.getInt("marksH")+1;
                                       // no=rs.getInt("form")+1;
					 sql="update teacherreport set marksH="+num+" where sub='"+sub+"'";
				}catch(SQLException e1)
				{
					num=1;
					no=1;
					sql="insert into teacherreport values('"+sub+"',0,0,0,0,0,0,0,"+num+","+no+",0)";
				}
				break;
			}
                       
                        s.execute(sql);
                        			
		}catch(Exception e){out.println(e);}
		response.sendRedirect("sub5.jsp");
	}   	  	    
}