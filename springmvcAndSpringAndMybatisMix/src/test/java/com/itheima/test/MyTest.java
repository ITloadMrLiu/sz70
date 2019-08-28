package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Account;
import com.itheima.domain.User;
import com.itheima.web.AccountServlet;
import com.itheima.web.UserServlet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @program: myStudy
 * @description:
 * @author:
 * @create: 2019-08-02 20:30
 **/
public class MyTest {
    private UserServlet userServlet;
    private AccountServlet accountServlet;

 /*   private UserDao userDao;
    private InputStream is;
    private SqlSession sqlSession;
    private AccountDao accountDao;*/

    @Before
    public void init() throws IOException {
      /* //使用mybatis调用UserDao接口中的那个findUserById()方法
       //1.加载主配置文件
       //1.1 将主配置文件转换成流
        is = Resources.getResourceAsStream("spring.xml");
       //1.2 创建一个SqlSessionFactoryBuilder对象
       SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
       //1.3 使用builder对象构建SqlSessionFactory,并且加载流
       SqlSessionFactory build = builder.build(is);
       //2. 创建SqlSession对象
       //使用了工厂模式:使用一次建立一个对象
        sqlSession = build.openSession();
       //3. 获取UserDao接口的代理对象
        userDao = sqlSession.getMapper(UserDao.class);
        accountDao = sqlSession.getMapper(AccountDao.class);*/

        //创建spring的核心容器
        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("spring.xml");
        if ("userServlet"!=null){
            userServlet = (UserServlet) act.getBean("userServlet");
        }
        if ("accountServlet"!=null) {
            accountServlet = (AccountServlet) act.getBean("accountServlet");
        }
    }

/*    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        is.close();
    }*/

    /**
     *添加用户
     */
    @Test
    public void testAddUser(){
//        User user = new User(null,"李花花",new Date(),"女","中国海南省海口市");
//        int i = userServlet.addUser(user);
//        System.out.println("影响行数:" + i);
    }

    /**
     * 删除用户
     */
    @Test
    public void testDeleteUserById(){
//        int i = userServlet.deleteUserById(80);
//        System.out.println("影响行数:" + i);
    }

    /**
     * 修改用户
     */
    @Test
    public void testUpdateUser(){
//        User user = userServlet.findUserById(79);
//        user.setUsername("肖洪波");
//        int i = userServlet.updateUser(user);
//        System.out.println("影响行数:" + i);
    }

    /**
     * 根据id查询用户
     */
    @Test
    public void testFindUserById(){
        User user = userServlet.findUserById(64);
        System.out.println("userById = " + user);
    }

    /**
     * 查询所有用户
     */
    @Test
    public void testFindAll(){
//        List<User> userList = userServlet.fingAll();
//        for (User user : userList) {
//            System.out.println("user = " + user);
//        }
    }

    /**
     * 根据user的id查询user表和account表的信息
     */
    @Test
    public void testFindAccountByUserId(){
        User user = userServlet.findAccountByUserId(63);
        System.out.println("user = " + user);
    }

    // 根据account的uid查询user表和account表的信息
    @Test
    public void testFindUserByAccountId(){
        Account account = accountServlet.findUserByAccountId(5);
        System.out.println("account = " + account);
    }
}
