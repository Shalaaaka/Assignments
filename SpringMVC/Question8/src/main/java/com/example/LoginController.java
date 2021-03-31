package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.User;

@Controller
public class LoginController 
{
   
    @Autowired
    MessageSource messageSource;
 
    @RequestMapping(value="/displayLoginPage",method=RequestMethod.GET)
    public String displayLoginPage(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "/login";
    }
   
    @RequestMapping(value="/doLogin",method=RequestMethod.POST)
    public String doLogin(@ModelAttribute User user,Model model){
       
        String userName=user.getUserName();
        String password = user.getPassword();
        if("shalaka".equals(userName) && "123".equals(password)){
            model.addAttribute("user", user);
            return "/home";
        }
        String loginSuccessWelcome = messageSource.getMessage("login.success.welcome", new Object[]{user.getUserName()}, LocaleContextHolder.getLocale());
        System.out.println(loginSuccessWelcome);
        return "/login";
       
    }
}