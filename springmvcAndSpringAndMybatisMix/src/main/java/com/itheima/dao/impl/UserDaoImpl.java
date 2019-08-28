//package com.itheima.dao.impl;
//
//import com.itheima.dao.UserDao;
//import com.itheima.domain.User;
//import com.itheima.utils.JDBCUtil;
//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.handlers.BeanHandler;
//import org.apache.commons.dbutils.handlers.BeanListHandler;
//
//import java.sql.SQLException;
//import java.util.List;
//
///**
// * @program: myStudy
// * @description:
// * @author:
// * @create: 2019-08-02 19:32
// **/
//public class UserDaoImpl implements UserDao {
//    private QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());
//
//    @Override
//    public int addUser(User user) {
//        try {
//            return queryRunner.update("insert into user values (null,?,?,?,?)",
//                    user.getUsername(),user.getBirthday(),user.getSex(),user.getAddress());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//
//    @Override
//    public int deleteUserById(int id) {
//        try {
//            return queryRunner.update("delete from user where id=?",id);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//       return 0;
//    }
//
//    @Override
//    public int updateUser(User user) {
//        try {
//            return queryRunner.update("update user set username=?,birthday=?,sex=?,address=? where id=?",
//                    user.getUsername(),user.getBirthday(),user.getSex(),user.getAddress(),user.getId());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//
//    @Override
//    public User findUserById(int id) {
//        try {
//            return queryRunner.query("select * from user where id=?",new BeanHandler<>(User.class),id);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public List<User> findAll() {
//        try {
//            return queryRunner.query("select * from user",new BeanListHandler<>(User.class));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
