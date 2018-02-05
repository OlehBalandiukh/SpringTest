package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.User;

@Controller
public class MainController {
    @Autowired
    @Qualifier("i2")
    private UserDAO userDAO;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/x")
    public String x(@RequestParam("username") String name){
//        User build = User.builder().name(name).build();
//        userDAO.save(build);
        return "index";
    }
}
