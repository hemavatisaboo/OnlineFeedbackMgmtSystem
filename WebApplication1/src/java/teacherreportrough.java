
import java.lang.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: teacherreportrough
 *
 */
 public class teacherreportrough extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public teacherreportrough() {
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
                String sql=null,tname=null, sub=null;
                String sql1=null, sql2=null;
                float i=0,num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0;
                float[] avg=new float[10];
                float grade=0;
                sub=request.getParameter("sub");
                try{
		
                       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                       Connection c1=DriverManager.getConnection("jdbc:odbc:abc","root","root");
                       Statement s =c1.createStatement();
                       ResultSet rs=null;
                        try
                       {
                            sql="select * from teacher where subject='"+sub+"'";
                            rs=s.executeQuery(sql);
                            rs.next();
                            tname=rs.getString("tname").toUpperCase();
                       }
                       catch(SQLException e1)
                       {
                        sql1="insert into average values('"+sub+"',0,0,0,0,0,0,0,0)";
                       }          
			try
                        {
                            sql="select * from teacherreport where sub='"+sub+"'";
                            rs=s.executeQuery(sql);
                            rs.next();
                            i=rs.getInt("form");
                            num1=rs.getInt("marksA");
                            num2=rs.getInt("marksB");
                            num3=rs.getInt("marksC");
                            num4=rs.getInt("marksD");
                            num5=rs.getInt("marksE");
                            num6=rs.getInt("marksF");
                            num7=rs.getInt("marksG");
                            num8=rs.getInt("marksH");
                            avg[0]=((num1/i)/4)*100;
                            avg[1]=((num2/i)/4)*100;
                            avg[2]=((num3/i)/4)*100;
                            avg[3]=((num4/i)/4)*100;
                            avg[4]=((num5/i)/4)*100;
                            avg[5]=((num6/i)/4)*100;
                            avg[6]=((num7/i)/4)*100;
                            avg[7]=((num8/i)/4)*100;
                            grade=(avg[0]+avg[1]+avg[2]+avg[3]+avg[4]+avg[5]+avg[6]+avg[7])/8;
                            sql1="update teacherreport set avg1="+avg[0]+",avg2="+avg[1]+",avg3="+avg[2]+",avg4="+avg[3]+",avg5="+avg[4]+",avg6="+avg[5]+",avg7="+avg[6]+",avg8="+avg[7]+" where sub='"+sub+"'";                        
                        }
                        catch(SQLException e1)
                        {
                        sql1="insert into average values('"+sub+"',0,0,0,0,0,0,0,0)";
                        }
                        
                        s.execute(sql1);
                }catch(Exception e){out.println(e);}
                
		out.println("<html><body bgcolor=cyan><h1>Feedback Report</h1>");
                out.println("<center><table cellspacing=10 cellpadding=10 >" +
					"<tr>" +
                                        "<th align=left>TEACHER :</th>" +
					"<th align=left>"+tname+"</th>" +
                                        "</tr><tr>"+
                                        "<th align=left>SUBJECT :</th>" +
					"<th align=left>"+sub+"</th>" +
                                        "</tr><tr>"+
					"<th align=left>NO OF FORMS :</th>" +
					"<th align=left>"+i+"</th>" +
					"</tr>" +
					"</table>"+
                        "<table  cellspacing=10 cellpadding=10 > <th>Q1(%)</th><th>Q2(%)</th><th>Q3(%)</th><th>Q4(%)</th><th>Q5(%)</th><th>Q6(%)</th><th>Q7(%)</th><th>Q8(%)</th>"+
                        "<tr><td>"+avg[0]+"</td><td>"+avg[1]+"</td><td>"+avg[2]+"</td><td>"+avg[3]+"</td><td>"+avg[4]+"</td><td>"+avg[5]+"</td>"+
                        "<td>"+avg[6]+"</td><td>"+avg[7]+"</td><tr></table>");
                out.println("<h1>Performance:");
                if(grade>75)
                {
                    out.println("Excellent");
                }
                else if(grade>50)
                {
                    out.println("Very Good");
                }
                else if(grade>25)
                {
                    out.println("Good");
                }
                else if(grade>0)
                {
                    out.println("Fair");
                }
                out.println("</h1></center></body></html>");
	}   	  	    
}