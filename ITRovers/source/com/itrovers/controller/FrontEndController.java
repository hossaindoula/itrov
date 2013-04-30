package com.itrovers.controller;

import com.itrovers.util.SessionUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Ninad
 * Date: 2013-04-29
 * Time: 21:36
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/")
public class FrontEndController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView ourStory(){
        Map<String,Object> ourStoryModel = new HashMap<String, Object>();

        return new ModelAndView("/our_story", ourStoryModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView history(){
        Map<String,Object> historyModel = new HashMap<String, Object>();

        return new ModelAndView("/history", historyModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView contactUs(){
        Map<String,Object> contactUsModel = new HashMap<String, Object>();

        return new ModelAndView("/contact_us", contactUsModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView clients(){
        Map<String,Object> clientsModel = new HashMap<String, Object>();

        return new ModelAndView("/clients", clientsModel);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView locations(){
        Map<String,Object> locationsModel = new HashMap<String, Object>();

        return new ModelAndView("/locations", locationsModel);
    }
}
