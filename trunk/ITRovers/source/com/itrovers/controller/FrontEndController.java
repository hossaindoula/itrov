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
        Map<String,Object> our_storyModel = new HashMap<String, Object>();

        return new ModelAndView("/our_story", our_storyModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView our_work(){
        Map<String,Object> our_workModel = new HashMap<String, Object>();

        return new ModelAndView("/our_work", our_workModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView history(){
        Map<String,Object> historyModel = new HashMap<String, Object>();

        return new ModelAndView("/history", historyModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView contact_us(){
        Map<String,Object> contact_usModel = new HashMap<String, Object>();

        return new ModelAndView("/contact_us", contact_usModel);
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

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView approach(){
        Map<String,Object> approachModel = new HashMap<String, Object>();

        return new ModelAndView("/approach", approachModel);
    }
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView awards(){
        Map<String,Object> awardsModel = new HashMap<String, Object>();

        return new ModelAndView("/awards", awardsModel);
    }
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView careers(){
        Map<String,Object> careersModel = new HashMap<String, Object>();

        return new ModelAndView("/careers", careersModel);
    }
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView executive_team(){
        Map<String,Object> executive_teamModel = new HashMap<String, Object>();

        return new ModelAndView("/executive_team", executive_teamModel);
    }
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView industry_solutions(){
        Map<String,Object> industry_solutionsModel = new HashMap<String, Object>();

        return new ModelAndView("/industry_solutions", industry_solutionsModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView integrated_marketing(){
        Map<String,Object> integrated_marketingModel = new HashMap<String, Object>();

        return new ModelAndView("/integrated_marketing", integrated_marketingModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView interactive_services(){
        Map<String,Object> interactive_servicesModel = new HashMap<String, Object>();

        return new ModelAndView("/interactive_services", interactive_servicesModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView management_team(){
        Map<String,Object> management_teamModel = new HashMap<String, Object>();

        return new ModelAndView("/management_team", management_teamModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView marketing_innovation(){
        Map<String,Object> marketing_innovationModel = new HashMap<String, Object>();

        return new ModelAndView("/marketing_innovation", marketing_innovationModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView news(){
        Map<String,Object> newsModel = new HashMap<String, Object>();

        return new ModelAndView("/news", newsModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView people(){
        Map<String,Object> peopleModel = new HashMap<String, Object>();

        return new ModelAndView("/people", peopleModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView product_solutions(){
        Map<String,Object> product_solutionsModel = new HashMap<String, Object>();

        return new ModelAndView("/product_solutions", product_solutionsModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView web_hosting(){
        Map<String,Object> web_hostingModel = new HashMap<String, Object>();

        return new ModelAndView("/web_hosting", web_hostingModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcome(){
        Map<String,Object> welcomeModel = new HashMap<String, Object>();

        return new ModelAndView("/welcome", welcomeModel);
    }

}
