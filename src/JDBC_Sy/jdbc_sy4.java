package JDBC_Sy;

import pojo.account;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//实现创建account类，把查询到的数据放到该类的集合里。
//date 2022/06/07
public class jdbc_sy4 {
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

        //创建类的集合
        List<account> accountList = new ArrayList<>();
        //6. 查询结课并打印
        while (res.next()) {
            //创建一个实体
            account acc = new account();

            // 6.1 查询各列  列的名字
            String name = res.getString("name");
            int number = res.getInt("serial_number");
            int id = res.getInt("id");

            //6.2 输入到类里
            acc.setName(name);
            acc.setId(id);
            acc.setSerial_number(number);
            //添加到集合
            accountList.add(acc);

        }

        System.out.println(accountList);

        res.close();
        stat.close();
        conn.close();
    }
}
