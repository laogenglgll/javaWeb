package JDBC_Sy;

import java.sql.*;

//实现sql的查询
//date 2022/06/07
public class jdbc_sy3 {
    public static void main(String[] args) throws SQLException {
        //1. 引入驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2. 获取链接
        String url = "jdbc:mysql://127.0.0.1:3308/music";
        String use = "root";
        String password = "27395426A";
        Connection conn = DriverManager.getConnection(url,use,password);

        //3. 定义sql语句

        String sql = "select * from song";

        //4. statement对象
        Statement stat = conn.createStatement();

        //5. ResultSet 对象

        ResultSet res = stat.executeQuery(sql);
        /*
        //6. 查询结课并打印  列好 1 2 3 4
        while (res.next()) {
            // 6.1 查询各列
            String name = res.getString(1);
            int number = res.getInt(2);
            int id = res.getInt(3);

            //6.2 打印
            System.out.print(name);
            System.out.print(number + "  ");
            System.out.println(id);
        }

        res.close();
        stat.close();
        conn.close();*/

        //6. 查询结课并打印
        while (res.next()) {
            // 6.1 查询各列  列的名字
            String name = res.getString("name");
            int number = res.getInt("serial_number");
            int id = res.getInt("id");

            //6.2 打印
            System.out.print(name);
            System.out.print(number + "  ");
            System.out.println(id);
        }

        res.close();
        stat.close();
        conn.close();
    }
}
