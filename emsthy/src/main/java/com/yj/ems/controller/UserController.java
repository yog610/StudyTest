package com.yj.ems.controller;

import com.yj.ems.entity.User;
import com.yj.ems.service.UserService;
import com.yj.ems.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //注册方法
    @PostMapping("/register")
    public String register(User user,String code,HttpSession session){
        String sessioncode =(String) session.getAttribute("code");
        if (sessioncode.equalsIgnoreCase(code)){
            userService.register(user);
            return  "redirect:/index";
            //跳转到登录界面
        }else {
           return   "redirect:/toRegister";
        }
    }
    //登录方法：
    @PostMapping("/login")
    public String login(String username,String password){
        User user = userService.login(username, password);
        if (user!=null){
            return "redirect:/emp/findall";//跳转到查询所有的页面
        }else{
            return "redirect:/index";//返回到首页

        }
    }




    //生成验证码
    @GetMapping("/code")
public void getImage(HttpSession session, HttpServletResponse response)throws Exception {

        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        session.setAttribute("code",securityCode);//存入session中
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image,"png",os);

    }
}
