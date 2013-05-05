package com.itrovers.controller;

import com.itrovers.service.AuthenticationAndAuthorizationService;
import com.itrovers.util.ITRConstants;
import com.itrovers.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2013-05-05
 * Time: 21:28
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/admin/")
public class AdminController {

    private HttpSession userSession;

    @Autowired
    private AuthenticationAndAuthorizationService authService;

    @RequestMapping(method = RequestMethod.GET, value = "login.itr")
    public ModelAndView login(){
        Map<String,Object> loginModel = new HashMap<String, Object>();
        return new ModelAndView("admin_panel/login", loginModel); //name of the folder path

    }


    @RequestMapping(method=RequestMethod.GET, value="/logout.itr")
    public ModelAndView logout(){
        userSession = SessionUtil.getSession();
        userSession.removeAttribute(ITRConstants.SESSION_USER);
        userSession.removeAttribute(ITRConstants.SESSION_USER_FEATURES);
        userSession.invalidate();

        return new ModelAndView("redirect:/");
    }


    @RequestMapping(method=RequestMethod.POST, value="/authenticate.itr")
    public ModelAndView authenticate(@RequestParam("username") String username,@RequestParam("password") String password){
        boolean isAuthenticated = authService.authenticate(username,password);

        if(isAuthenticated){
            return new ModelAndView("redirect:/dashboard.itr");
        } else {
            return new ModelAndView("redirect:/login.itr");
        }
    }



}
