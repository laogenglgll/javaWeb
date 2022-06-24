package JDBC_Sy;

import java.sql.*;

//实现sql注入
//date 2022/06/07
public class jdbc_sy5 {
    public static void main(String[] args) throws SQLException {
        //1. 引入驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2. 获取链接
        String url = "jdbc:mysql://127.0.0.1:3308/music";
        String use = "root";
        String password = "27395426A";
        Connection conn = DriverManager.getConnection(url,use,password);

        //3. 测试用的数据
//        String name = "脑残";
//        int id = 1;

        //sql注入的
        String name = "脑残";
        String id = "' or '1' = '1";

        //4. 定义sql语句

        String sql = "select * from song where name = '"+name+"' and id = '"+id+"'";

        //5. statement对象
        Statement stat = conn.createStatement();

        //6.查询
        ResultSet res = stat.executeQuery(sql);

        if(res.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }


        stat.close();
        conn.close();
    }
}
