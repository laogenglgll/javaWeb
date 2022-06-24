package JDBC_Sy;
// 正常的，第一次尝试
//date 2022/06/06
import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_sy1 {
    public static void main(String[] args) throws Exception {
        //1. 引入驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2. 获取链接
        String url = "jdbc:mysql://127.0.0.1:3308/music";
        String use = "root";
        String password = "27395426A";
        Connection conn = DriverManager.getConnection(url,use,password);

        //3. 定义sql语句

        String sql = "INSERT INTO song VALUES (\"脑残\",2,9);";

        // 4. 创建对象
        Statement stat =  conn.createStatement();

        //5. 执行
        int count = stat.executeUpdate(sql);

        System.out.println(count);

        stat.close();
        conn.close();

    }
}
