package com.itrovers.controller;

import com.itrovers.service.AuthenticationAndAuthorizationService;
import com.itrovers.service.BootStrap;
import com.itrovers.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
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

    @Autowired
    private BootStrap bootStrap;

    @Autowired
    private AuthenticationAndAuthorizationService authService;

    @RequestMapping(method = RequestMethod.GET, value="home.itr")
    public ModelAndView home(){              // this method will tell about data that will be shown..
        bootStrap.createDefaultAdmin();
        Map<String,Object> homeModel = new HashMap<String, Object>();
        homeModel.put("PageTitle", "home");
        homeModel.put("SubTitle", "Action");
        homeModel.put("ActiveLink", "home");

        return new ModelAndView("front_panel/home", homeModel);
    }

    @RequestMapping(method = RequestMethod.GET, value="ourStory.itr")
    public ModelAndView ourStory(){
        Map<String,Object> ourStoryModel = new HashMap<String, Object>();
        ourStoryModel.put("PageTitle", "Our Story");
        ourStoryModel.put("SubTitle", "Action");
        ourStoryModel.put("ActiveLink", "About us");

        return new ModelAndView("front_panel/our_story", ourStoryModel);
    }

    @RequestMapping(method = RequestMethod.GET, value = "ourWork.itr")
    public ModelAndView ourWork(){
        Map<String,Object> ourWorkModel = new HashMap<String, Object>();
        ourWorkModel.put("PageTitle", "Our Work");
        ourWorkModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/our_work", ourWorkModel);
    }

    @RequestMapping(method = RequestMethod.GET, value = "history.itr")
    public ModelAndView history(){
        Map<String,Object> historyModel = new HashMap<String, Object>();
        historyModel.put("PageTitle", "History");
        historyModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/history", historyModel);
    }

    @RequestMapping(method = RequestMethod.GET,value= "contactUs.itr")
    public ModelAndView contactUs(){
        Map<String,Object> contactUsModel = new HashMap<String, Object>();
        contactUsModel.put("PageTitle", "Contact us");
        contactUsModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/contact_us", contactUsModel);
    }

    @RequestMapping(method = RequestMethod.GET, value="clients.itr")
    public ModelAndView clients(){
        Map<String,Object> clientsModel = new HashMap<String, Object>();
        clientsModel.put("PageTitle", "Clients");
        clientsModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/clients", clientsModel);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "locations.itr")
    public ModelAndView locations(){
        Map<String,Object> locationsModel = new HashMap<String, Object>();
        locationsModel.put("PageTitle", "Locations");
        locationsModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/locations", locationsModel);
    }

    @RequestMapping(method = RequestMethod.GET,value ="approach.itr")
    public ModelAndView approach(){
        Map<String,Object> approachModel = new HashMap<String, Object>();
        approachModel.put("PageTitle", "Approach");
        approachModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/approach", approachModel);
    }
    @RequestMapping(method = RequestMethod.GET,value = "awards.itr")
    public ModelAndView awards(){
        Map<String,Object> awardsModel = new HashMap<String, Object>();
        awardsModel.put("PageTitle", "Awards");
        awardsModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/awards", awardsModel);
    }
    @RequestMapping(method = RequestMethod.GET,value = "careers.itr")
    public ModelAndView careers(){
        Map<String,Object> careersModel = new HashMap<String, Object>();
        careersModel.put("PageTitle", "Careers");
        careersModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/careers", careersModel);
    }
    @RequestMapping(method = RequestMethod.GET,value = "executiveTeam.itr")
    public ModelAndView executiveTeam(){
        Map<String,Object> executiveTeamModel = new HashMap<String, Object>();
        executiveTeamModel.put("PageTitle", "Executive team");
        executiveTeamModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/executive_team", executiveTeamModel);
    }
    @RequestMapping(method = RequestMethod.GET,value = "industrySolutions.itr")
    public ModelAndView industrySolutions(){
        Map<String,Object> industrySolutionsModel = new HashMap<String, Object>();
        industrySolutionsModel.put("PageTitle", "Industry solutions");
        industrySolutionsModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/industry_solutions", industrySolutionsModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "integratedMarketing.itr")
    public ModelAndView integratedMarketing(){
        Map<String,Object> integratedMarketingModel = new HashMap<String, Object>();
        integratedMarketingModel.put("PageTitle", "Clients");
        integratedMarketingModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/integrated_marketing", integratedMarketingModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "interactiveServices.itr")
    public ModelAndView interactiveServices(){
        Map<String,Object> interactiveServicesModel = new HashMap<String, Object>();
        interactiveServicesModel.put("PageTitle", "Interactive services");
        interactiveServicesModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/interactive_services", interactiveServicesModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "managementTeam.itr")
    public ModelAndView managementTeam(){
        Map<String,Object> managementTeamModel = new HashMap<String, Object>();
        managementTeamModel.put("PageTitle", "Management team");
        managementTeamModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/management_team", managementTeamModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "marketingInnovation.itr")
    public ModelAndView marketingInnovation(){
        Map<String,Object> marketingInnovationModel = new HashMap<String, Object>();
        marketingInnovationModel.put("PageTitle", "Marketing innovation");
        marketingInnovationModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/marketing_innovation", marketingInnovationModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "news.itr")
    public ModelAndView news(){
        Map<String,Object> newsModel = new HashMap<String, Object>();
        newsModel.put("PageTitle", "News");
        newsModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/news", newsModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "people.itr")
    public ModelAndView people(){
        Map<String,Object> peopleModel = new HashMap<String, Object>();
        peopleModel.put("PageTitle", "People");
        peopleModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/people", peopleModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "productSolutions.itr")
    public ModelAndView productSolutions(){
        Map<String,Object> productSolutionsModel = new HashMap<String, Object>();
        productSolutionsModel.put("PageTitle", "Product solutions");
        productSolutionsModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/product_solutions", productSolutionsModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "webHosting.itr")
    public ModelAndView webHosting(){
        Map<String,Object> webHostingModel = new HashMap<String, Object>();
        webHostingModel.put("PageTitle", "Web hosting");
        webHostingModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/web_hosting", webHostingModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "welcome.itr")
    public ModelAndView welcome(){
        Map<String,Object> welcomeModel = new HashMap<String, Object>();
        welcomeModel.put("PageTitle", "Welcome");
        welcomeModel.put("SubTitle", "Action");

        return new ModelAndView("front_panel/welcome", welcomeModel);
    }

    @RequestMapping(method = RequestMethod.GET,value = "adminLogin.itr")
    public ModelAndView adminLogin(){
        Map<String,Object> adminLoginModel = new HashMap<String, Object>();
        adminLoginModel.put("PageTitle", "Admin Login");
        adminLoginModel.put("SubTitle", "Action");

        return new ModelAndView("admin_panel/login", adminLoginModel);
    }


    @RequestMapping(method=RequestMethod.POST, value="/authenticate.itr")
    public ModelAndView authenticate(@RequestParam("username") String username,@RequestParam("password") String password){
        boolean isAuthenticated = authService.authenticate(username,password);

        if(isAuthenticated){
            Map<String,Object> dashboardModel = new HashMap<String, Object>();
            dashboardModel.put("PageTitle","Dashboard");
            return new ModelAndView("redirect:admin/dashboard.itr", dashboardModel);
        } else {
            return new ModelAndView("redirect:/adminLogin.itr");
        }
    }

}
