package JDBC_Sy;

import java.sql.*;

//实现预防sql注入
//date 2022/06/07
public class jdbc_sy6 {
    public static void main(String[] args) throws SQLException {
        //1. 引入驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2. 获取链接
        String url = "jdbc:mysql://127.0.0.1:3308/music";
        String use = "root";
        String password = "27395426A";
        Connection conn = DriverManager.getConnection(url,use,password);

        //3. 测试用的数据
        String name = "脑残";
        int id = 1;

//        //sql注入
//        String name = "脑残";
//        String id = "' or '1' = '1";

        //4. 定义sql语句

        String sql = "select * from song where name = ? and id = ?";

        //5. preparedStatement对象
        PreparedStatement Pstmt = conn.prepareStatement(sql);
        Pstmt.setString(1,name);
        Pstmt.setInt(2,id); //使用正差的sql时是int的，因为原先就有的数据库省事，所以用了id（int）


        //6.查询
        ResultSet res = Pstmt.executeQuery();

        if(res.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }


        Pstmt.close();
        conn.close();
    }
}
