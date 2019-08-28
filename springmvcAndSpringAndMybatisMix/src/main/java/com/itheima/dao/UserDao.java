package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;



public interface UserDao {
    //增
    @Insert("insert into user values (null,#{username},#{birthday},#{sex},#{address})")
    int addUser(User user);
    //删
    @Delete("delete from user where id=#{id}")
    int deleteUserById(int id);
    //改
    @Update("update user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
    int updateUser(User user);
    //根据id查
    @Select("select * from user where id=#{id}")
    User findUserById(int id);
    //查询所有
    @Select("select * from user")
    List<User> findAll();
    //根据user的id查询user表和account表的信息
    User findAccountByUserId(int id);

}
