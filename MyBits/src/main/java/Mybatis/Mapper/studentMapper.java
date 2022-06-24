package Mybatis.Mapper;

import Mybatis.pojo.stuUser;

import java.lang.reflect.Array;
import java.util.List;

public interface studentMapper {

    List<stuUser> selectAll();

    /*
    *根据ID进行查询
    */

    stuUser selectId(int id);

    List<stuUser> selectIdList(int [] ids);

    int insertData(stuUser a);

    int upData(stuUser a);

    int deleteData(int id);
}
