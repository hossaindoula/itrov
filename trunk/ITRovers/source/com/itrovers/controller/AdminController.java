package com.itrovers.controller;

import com.itrovers.service.AuthenticationAndAuthorizationService;
import com.itrovers.util.ITRConstants;
import com.itrovers.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        return new ModelAndView("admin_panel/login", loginModel); //folder path

    }

    @RequestMapping(method=RequestMethod.GET, value="/logout.itr")
    public ModelAndView logout(){
        userSession = SessionUtil.getSession();
        userSession.removeAttribute(ITRConstants.SESSION_USER);
        userSession.removeAttribute(ITRConstants.SESSION_USER_FEATURES);
        userSession.invalidate();

        return new ModelAndView("redirect:/");
    }

    @RequestMapping(method=RequestMethod.GET, value="dashboard.itr")
    public ModelAndView dashboard(){
        Map<String,Object> dashboardModel = new HashMap<String, Object>();
        dashboardModel.put("PageTitle","Dashboard");
        return new ModelAndView("admin_panel/dashboard", dashboardModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="user.itr")
    public ModelAndView user(){
        Map<String,Object> userModel = new HashMap<String, Object>();
        userModel.put("PageTitle", "User");
        return new ModelAndView("admin_panel/user", userModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authorizedGroups.itr")
    public ModelAndView authorizedGroups(){
        Map<String,Object> authorizedGroupsModel = new HashMap<String, Object>();
        authorizedGroupsModel.put("PageTitle", "AuthorizedGroups");
        return new ModelAndView("admin_panel/authorized_groups", authorizedGroupsModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authority.itr")
    public ModelAndView authority(){
        Map<String,Object> authorityModel = new HashMap<String, Object>();
        authorityModel.put("PageTitle", "Authority");
        return new ModelAndView("admin_panel/authority", authorityModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="feature.itr")
    public ModelAndView feature(){
        Map<String,Object> featureModel = new HashMap<String, Object>();
        featureModel.put("PageTitle", "Feature");
        return new ModelAndView("admin_panel/feature", featureModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="component.itr")
    public ModelAndView component(){
        Map<String,Object> componentModel = new HashMap<String, Object>();
        componentModel.put("PageTitle", "Component");
        return new ModelAndView("admin_panel/component", componentModel);
    }





}
