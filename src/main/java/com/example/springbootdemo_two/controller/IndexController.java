package com.example.springbootdemo_two.controller;


import com.example.springbootdemo_two.database.dao.UserDAO;
import com.example.springbootdemo_two.database.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class IndexController {


    @Autowired
    private UserDAO userDao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() throws Exception {
        ModelAndView response = new ModelAndView();


        List<User> users = userDao.findByFirstName("Eric");

        for (User user : users ) {
            log.info(user.toString());
        }


        System.out.println(users.get(0).toString());
        response.setViewName("index");

        return response;
    }
}
