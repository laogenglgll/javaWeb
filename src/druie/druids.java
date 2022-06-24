package druie;



import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class druids {

    /*
    查询方法
     */


    /*@Test
    public void queryData() throws Exception {
        //1. 导入java包

        //2. 定义配置文件

        //3. 加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/druie/druid.properties"));

        //4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //5. 连接数据库
        Connection conn = dataSource.getConnection();
        //6.sql 语句
        String sql = "SELECT * FROM student;";
        //7.stat对象
        Statement stmt = conn.createStatement();
        //8.ResultSet对象，执行sql
        ResultSet rest = stmt.executeQuery(sql);

        //9.对象集合
        List<Student> student = new ArrayList<>();

        //10.放到集合里
        while (rest.next()) {
            Student stu = new Student();

            int id = rest.getInt("id");
            int studentId = rest.getInt("studentId");
            String name = rest.getString("name");
            int grade = rest.getInt("grade");
            int gradeRanking = rest.getInt("gradeRanking");
            int studentClass = rest.getInt("studentClass");


            stu.setId(id);
            stu.setName(name);
            stu.setGrade(grade);
            stu.getGradeRanking(gradeRanking);
            stu.setStudentClass(studentClass);
            stu.setStudentId(studentId);

            student.add(stu);
        }
        rest.close();
        stmt.close();
        conn.close();
    }*/

    /*
    改方法
    id
    studentId
    sname
    sgrade
    gradeRanking
    studentClass

    UPDATE student
    set studentid = 4,
    sNAME = '你妹',
    sgrade = 2,
    gradeRanking = 10,
    studentClass = 2
WHERE id = 3;
     */
    /*@Test
    public   void modifyData() throws Exception {
        //1. 导入java包

        //2. 定义配置文件

        //3. 加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/druie/druid.properties"));

        //4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //5. 连接数据库
        Connection conn = dataSource.getConnection();
        //6.sql 语句
        String sql = "UPDATE student\n" +
                "set studentid = ?,\n" +
                "sname = ?,\n" +
                "sgrade = ?,\n" +
                "gradeRanking = ?,\n" +
                "studentClass = ?\n" +
                "WHERE id = ?;";


        //前端得到的值
        int studentid = 4;
        String sname = "你妹";
        int sgrade = 2;
        int gradeRanking = 10;
        int studentClass = 2;
        int id = 3;

        //7.pstmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(6,id);
        pstmt.setInt(1,studentid);
        pstmt.setString(2,sname);
        pstmt.setInt(3,sgrade);
        pstmt.setInt(4,gradeRanking);
        pstmt.setInt(5,studentClass);

        int count = pstmt.executeUpdate();

        System.out.println(count);

        pstmt.close();
        conn.close();
    }*/

    /*
    删除某行
     *//*
    @Test
    public   void DeleteData() throws Exception {
        //1. 导入java包

        //2. 定义配置文件

        //3. 加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/druie/druid.properties"));

        //4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //5. 连接数据库
        Connection conn = dataSource.getConnection();
        //6.sql 语句
        String sql = "delete from student where id = ?";


        //前端得到的值
        int id = 3;

        //7.pstmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1,id);

        int count = pstmt.executeUpdate();

        System.out.println(count);

        pstmt.close();
        conn.close();
    }
}*/


    /*
        添加数据
         */
    @Test
    public   void DeleteData() throws Exception {
        //1. 导入java包

        //2. 定义配置文件

        //3. 加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/druie/druid.properties"));

        //4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //5. 连接数据库
        Connection conn = dataSource.getConnection();
        //6.sql 语句
        String sql = "INSERT INTO student \n" +
                     "VALUES (?,?,?,?,?,?);";


        //前端得到的值
        int id = 3;
        int studentId = 3;
        String sname = "老四";
        int sgrade = 3;
        int gradeRanking = 3;
        int studentClass = 1;

        //7.pstmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1,id);
        pstmt.setInt(2,studentId);
        pstmt.setString(3,sname);
        pstmt.setInt(4,sgrade);
        pstmt.setInt(5,gradeRanking);
        pstmt.setInt(6,studentClass);

        int count = pstmt.executeUpdate();

        System.out.println(count);

        pstmt.close();
        conn.close();
    }
}
