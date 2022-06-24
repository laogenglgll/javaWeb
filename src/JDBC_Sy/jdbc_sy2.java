package JDBC_Sy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//实现sql事务
//date 2022/06/06
public class jdbc_sy2 {
    public static void main(String[] args) throws SQLException {
        //1. 引入驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2. 获取链接
        String url = "jdbc:mysql://127.0.0.1:3308/music";
        String use = "root";
        String password = "27395426A";
        Connection conn = DriverManager.getConnection(url,use,password);

        //3. 定义sql语句

        String sql = "INSERT INTO song VALUES (\"脑残\",2,7);";

        // 4. 创建对象
        Statement stat =  conn.createStatement();

        try {
            //5. 执行
            //设置手动提交
            conn.setAutoCommit(false);
            int count = stat.executeUpdate(sql);
            int i = 3/0;
            System.out.println(count);
            //提交
            conn.commit();
        } catch (SQLException e) {
            //回滚
            conn.rollback();
            throw new RuntimeException(e);
        }

        stat.close();
        conn.close();
    }
}
