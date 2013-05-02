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
    public ModelAndView ourWork(){
        Map<String,Object> ourWorkModel = new HashMap<String, Object>();

        return new ModelAndView("/our_work", ourWorkModel);
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
    public ModelAndView executiveTeam(){
        Map<String,Object> executiveTeamModel = new HashMap<String, Object>();

        return new ModelAndView("/executive_team", executiveTeamModel);
    }
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView industrySolutions(){
        Map<String,Object> industrySolutionsModel = new HashMap<String, Object>();

        return new ModelAndView("/industry_solutions", industrySolutionsModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView integratedMarketing(){
        Map<String,Object> integratedMarketingModel = new HashMap<String, Object>();

        return new ModelAndView("/integrated_marketing", integratedMarketingModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView interactiveServices(){
        Map<String,Object> interactiveServicesModel = new HashMap<String, Object>();

        return new ModelAndView("/interactive_services", interactiveServicesModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView managementTeam(){
        Map<String,Object> managementTeamModel = new HashMap<String, Object>();

        return new ModelAndView("/management_team", managementTeamModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView marketingInnovation(){
        Map<String,Object> marketingInnovationModel = new HashMap<String, Object>();

        return new ModelAndView("/marketing_innovation", marketingInnovationModel);
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
    public ModelAndView productSolutions(){
        Map<String,Object> productSolutionsModel = new HashMap<String, Object>();

        return new ModelAndView("/product_solutions", productSolutionsModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView webHosting(){
        Map<String,Object> webHostingModel = new HashMap<String, Object>();

        return new ModelAndView("/web_hosting", webHostingModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcome(){
        Map<String,Object> welcomeModel = new HashMap<String, Object>();

        return new ModelAndView("/welcome", welcomeModel);
    }

}
