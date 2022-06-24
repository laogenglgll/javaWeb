package Mybatis;

import Mybatis.Mapper.studentMapper;
import Mybatis.pojo.stuUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.List;

public class myBatisDemo {
    /*
    * 查询全部数据
    * */
    @Test
    public void testSelect() throws IOException {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();



        //3. 执行sql
        studentMapper mapper  =  sqlSession.getMapper(studentMapper.class);
        List<stuUser> users = mapper.selectAll();
        System.out.println(users);

        sqlSession.close();
    }


    /*
     * 查询某id的数据
     * */
    @Test
    public void testSelectId() throws IOException {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 设置网页传递的数据
        int id = 1;
        //3. 执行sql
        studentMapper mapper  =  sqlSession.getMapper(studentMapper.class);
        stuUser user = mapper.selectId(id);
        System.out.println(user);

        sqlSession.close();
    }



    /*
     * 查询某些id的数据
     * */
    @Test
    public void testSelectIdList() throws IOException {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 设置网页传递的数据
        int[] ids = new int[]{1, 2};
        //3. 执行sql
        studentMapper mapper  =  sqlSession.getMapper(studentMapper.class);
        List<stuUser> users = mapper.selectIdList(ids);
        System.out.println(users);

        sqlSession.close();
    }




    /*
     *插入数据
     * */
    @Test
    public void testInsertData() throws IOException {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 设置网页传递的数据
        /*
        * "id="
        ", studentId="
        ", sname='"
        ", sgrade="
        ", gradeRanking
        ", studentClass
        * */
        // 设置网页传递的数据;
//        int id = 6;
        int studentId = 4;
        String sname = "狗der";
        int sgrade = 1;
        int gradeRanking = 4;
        int studentClass = 1;

        stuUser stuuser = new stuUser();
//        stuuser.setId(id);
        stuuser.setStudentId(studentId);
        stuuser.setSname(sname);
        stuuser.setSgrade(sgrade);
        stuuser.setGradeRanking(gradeRanking);
        stuuser.setStudentClass(studentClass);

        //3. 执行sql
        studentMapper mapper  =  sqlSession.getMapper(studentMapper.class);
        int users = mapper.insertData(stuuser);
        System.out.println(users);
        sqlSession.commit();
        sqlSession.close();
    }



    /*
     *修改数据
     * */
    @Test
    public void testUpData() throws IOException {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 设置网页传递的数据
        /*
        * "id="
        ", studentId="
        ", sname='"
        ", sgrade="
        ", gradeRanking
        ", studentClass
        * */
        // 设置网页传递的数据;
        int id = 4;

        String sname = "狗derDouble";


        stuUser stuuser = new stuUser();
        stuuser.setId(id);
        stuuser.setSname(sname);

        //3. 执行sql
        studentMapper mapper  =  sqlSession.getMapper(studentMapper.class);
        int users = mapper.upData(stuuser);
        System.out.println(users);
        sqlSession.commit();
        sqlSession.close();
    }



    /*
     * 删除某个id
     * */
    @Test
    public void testDeleteData() throws IOException {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 设置网页传递的数据
        /*
        * "id="
        ", studentId="
        ", sname='"
        ", sgrade="
        ", gradeRanking
        ", studentClass
        * */
        // 设置网页传递的数据;
        int id = 4;

        //3. 执行sql
        studentMapper mapper  =  sqlSession.getMapper(studentMapper.class);
        int users = mapper.deleteData(id);
        System.out.println(users);
        sqlSession.commit();
        sqlSession.close();
    }
}
