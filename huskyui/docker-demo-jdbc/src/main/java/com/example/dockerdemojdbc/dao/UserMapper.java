package com.example.dockerdemojdbc.dao;

import com.example.dockerdemojdbc.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 22070
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> list();

}
