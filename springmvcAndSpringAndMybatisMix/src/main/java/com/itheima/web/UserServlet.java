package com.itheima.web;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: myStudy
 * @description:
 * @author:
 * @create: 2019-08-02 19:33
 **/
@Controller("userServlet")
@RequestMapping("/user")
public class UserServlet {
    @Autowired
    private UserService userService;

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping("/add")
    public String addUser(User user){
        try {
           int i = userService.addUser(user);
            System.out.println("i = " + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/user/all";

    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String deleteUserById(@RequestParam Integer id){
        userService.deleteUserById(id);

        return "redirect:/user/all";
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/user/all";
    }

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @RequestMapping("/find")
    public User findUserById(int id){
        return userService.findUserById(id);
    }

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/all")
    public String fingAll(Model model){
        List<User> all = userService.findAll();
        model.addAttribute("list",all);
        return "list";
    }

    /**
     * 根据user的id查询user表和account表的信息
     * @param id
     * @return
     */
    public User findAccountByUserId(int id){
        return userService.findAccountByUserId(id);
    }

}
