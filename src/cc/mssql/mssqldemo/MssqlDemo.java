/*
 * mssql连接程序
 * */

package cc.mssql.mssqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MssqlDemo {
	
	public static void main(String[] arsg){
		
		//windows集成模式连接,注意要先配置sql,复制jar\auth文件夹下与系统对应位数的.dll文件到system32下
		String connectionUrl = "jdbc:sqlserver://localhost:1433;"+"databaseName=shifenzheng;"+"integratedSecurity=true;";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl,"winter_wind","Cddd");
			
			String SQL = "select top (10) * from dbo.cdsgus";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			
			while(rs.next()){
				System.out.println(rs.getString(1)+" : "+rs.getString(7));
											//1是第一列
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(con != null){
				try{
				con.close();
				}catch(Exception e){e.printStackTrace();}
			}
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){e.printStackTrace();}
			}
			if(rs != null){
				try{
					rs.close();
				}catch(Exception e){e.printStackTrace();}
			}
		}
	}
}
