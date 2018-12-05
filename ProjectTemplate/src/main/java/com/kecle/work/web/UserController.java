package com.kecle.work.web;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "user")
public class UserController {

    private static Logger logger = Logger.getLogger(String.valueOf(UserController.class));

    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Map<String, Object>login(HttpServletResponse response, HttpServletRequest request){
        Map<String, Object> returnMsg = new HashMap<>();

        return returnMsg;
    }
}
