package com.example.springbootdemo_two.controller;

import com.example.springbootdemo_two.database.dao.UserDAO;
import com.example.springbootdemo_two.database.entity.User;
import com.example.springbootdemo_two.formbean.RegisterFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserDAO userDao;

    @RequestMapping(value = "/user/register", method = RequestMethod.GET)
    public ModelAndView register() throws Exception {
        ModelAndView response = new ModelAndView();
        response.setViewName("user/register");

        return response;
    }

    @RequestMapping(value = "/user/registerSubmit", method = RequestMethod.POST)
    public ModelAndView registerSubmit(RegisterFormBean form) throws Exception {
        ModelAndView response = new ModelAndView();
        response.setViewName("user/register");

        User user = new User();

        user.setEmail(form.getEmail());
        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());
        user.setPassword(form.getPassword());

        userDao.save(user);


        log.info(form.toString());

        return response;
    }
}
