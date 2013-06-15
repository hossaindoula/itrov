package com.itrovers.controller;

import com.itrovers.domain.ContentTexts;
import com.itrovers.domain.User;
import com.itrovers.service.AuthenticationAndAuthorizationService;
import com.itrovers.service.ContentHeaderDetailsService;
import com.itrovers.util.ITRConstants;
import com.itrovers.util.JSONView;
import com.itrovers.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.itrovers.service.UserDetailsService;
import com.itrovers.domain.Content;


import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

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
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationAndAuthorizationService authService;

    @Autowired
    private ContentHeaderDetailsService contentHeaderDetailsService;

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

        return new ModelAndView("redirect:/adminLogin.itr");
    }

    @RequestMapping(method=RequestMethod.GET, value="dashboard.itr")
    public ModelAndView dashboard(){
        Map<String,Object> dashboardModel = new HashMap<String, Object>();
        dashboardModel.put("PageTitle","Dashboard");
        dashboardModel.put("Title", "ITRovers - Dashboard");
        return new ModelAndView("admin_panel/dashboard", dashboardModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authorizedGroups.itr")
    public ModelAndView authorizedGroups(){
        Map<String,Object> authorizedGroupsModel = new HashMap<String, Object>();
        authorizedGroupsModel.put("PageTitle", "AuthorizedGroups");
        authorizedGroupsModel.put("Title", "ITRovers - Authorized Groups");
        return new ModelAndView("admin_panel/authorized_groups", authorizedGroupsModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authority.itr")
    public ModelAndView authority(){
        Map<String,Object> authorityModel = new HashMap<String, Object>();
        authorityModel.put("PageTitle", "Authority");
        authorityModel.put("Title", "ITRovers - Authority Model");
        return new ModelAndView("admin_panel/authority", authorityModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="feature.itr")
    public ModelAndView feature(){
        Map<String,Object> featureModel = new HashMap<String, Object>();
        featureModel.put("PageTitle", "Feature");
        featureModel.put("Title", "ITRovers - Feature");
        return new ModelAndView("admin_panel/feature", featureModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="component.itr")
    public ModelAndView component(){
        Map<String,Object> componentModel = new HashMap<String, Object>();
        componentModel.put("PageTitle", "Component");
        componentModel.put("Title", "ITRovers - Component");
        return new ModelAndView("admin_panel/component", componentModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="userList.itr")
    public ModelAndView userList(){
        Map<String,Object> userListModel = new HashMap<String, Object>();
        userListModel.put("PageTitle", "User List");
        userListModel.put("Title", "ITRovers - User List");
        return new ModelAndView("admin_panel/user_list", userListModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="createUser.itr")
    public ModelAndView createUser(){
        Map<String,Object> createUserModel = new HashMap<String, Object>();
        createUserModel.put("PageTitle", "Create User");
        createUserModel.put("Title", "ITRovers - Create User");
        return new ModelAndView("admin_panel/create_user", createUserModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authorizedGroupList.itr")
    public ModelAndView authorizedGroupList(){
        Map<String,Object> authorizedGroupListModel = new HashMap<String, Object>();
        authorizedGroupListModel.put("PageTitle", "Authorized Group List");
        authorizedGroupListModel.put("Title", "ITRovers - Authorized Group List");
        return new ModelAndView("admin_panel/authorized_group_List", authorizedGroupListModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="createAuthorizedGroup.itr")
    public ModelAndView createAuthorizedGroup(){
        Map<String,Object> createAuthorizedGroupModel = new HashMap<String, Object>();
        createAuthorizedGroupModel.put("PageTitle", "Create Authorized Group");
        createAuthorizedGroupModel.put("Title", "ITRovers - Create Authorized Group");
        return new ModelAndView("admin_panel/create_AuthorizedGroup", createAuthorizedGroupModel);

    }

    @RequestMapping(method=RequestMethod.GET, value="contentHeader.itr")
    public ModelAndView contentHeader(){
        Map<String,Object> contentHeaderModel = new HashMap<String, Object>();
        contentHeaderModel.put("PageTitle", "Content Header");
        contentHeaderModel.put("Title", "ITRovers - Content Header");
        return new ModelAndView("admin_panel/content_header", contentHeaderModel);

    }

    @RequestMapping(method=RequestMethod.GET, value="contentHeaderList.itr")
    public ModelAndView contentHeaderList(){
        Map<String,Object> contentHeaderListModel = new HashMap<String, Object>();
        contentHeaderListModel.put("PageTitle", "Content Header List");
        contentHeaderListModel.put("Title", "ITRovers - Content Header List");
        return new ModelAndView("admin_panel/content_header_list", contentHeaderListModel);

    }

    @RequestMapping(method=RequestMethod.GET, value="createContentHeader.itr")
    public ModelAndView createContentHeader(){
        Map<String,Object> createContentHeaderModel = new HashMap<String, Object>();
        createContentHeaderModel.put("PageTitle", "Create Content Header");
        createContentHeaderModel.put("Title", "ITRovers - Create Content Header");
        return new ModelAndView("admin_panel/content_header_list", createContentHeaderModel);

    }

    @RequestMapping(method=RequestMethod.GET, value="contentDetails.itr")
    public ModelAndView contentDetails(){
        Map<String,Object> contentDetailsModel = new HashMap<String, Object>();
        contentDetailsModel.put("PageTitle", "Content Details");
        contentDetailsModel.put("Title", "ITRovers - Content Details");
        return new ModelAndView("admin_panel/content_details", contentDetailsModel);

    }

    @RequestMapping(method=RequestMethod.GET, value="editProfile.itr")
    public ModelAndView editProfile(){
        Map<String,Object> editProfileModel = new HashMap<String, Object>();
        editProfileModel.put("PageTitle", "Edit Profile");
        editProfileModel.put("Title", "ITRovers - Edit Profile");
        return new ModelAndView("admin_panel/edit_profile", editProfileModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="accountSettings.itr")
    public ModelAndView accountSettings(){
        Map<String,Object> accountSettingsModel = new HashMap<String, Object>();
        accountSettingsModel.put("PageTitle", "Account Settings");
        accountSettingsModel.put("Title", "ITRovers - Account Settings");
        return new ModelAndView("admin_panel/account_settings", accountSettingsModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="unauthorized.itr")
    public ModelAndView unauthorized(){
        Map<String,Object> unauthorizedModel = new HashMap<String, Object>();
        unauthorizedModel.put("PageTitle", "Unauthorized");
        unauthorizedModel.put("Title", "ITRovers - Unauthorized");
        return new ModelAndView("admin_panel/unauthorized", unauthorizedModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="userListDiv.itr")
    public ModelAndView userListDiv(){
        Map<String,Object> userListDivModel = new HashMap<String, Object>();
        return new ModelAndView("admin_panel/user_list_div", userListDivModel);
    }



    @RequestMapping(method=RequestMethod.GET, value="contentHeaderListDiv.itr")
    public ModelAndView contentHeaderListDiv(){
        Map<String,Object> contentHeaderListDivModel = new HashMap<String, Object>();
        return new ModelAndView("admin_panel/content_header_list_div", contentHeaderListDivModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="contentHeaderJsonData.itr")
    public ModelAndView contentHeaderJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> contentHeaderListMap = null;
        Map<String,Object> contentHeaderMap = new HashMap<String, Object>();

        List<Content> contents = contentHeaderDetailsService.getAllContents();
        List<Map<String,Object>> contentMapList = new ArrayList<Map<String, Object>>();

        for (Content content: contents) {
            contentHeaderListMap = new HashMap<String, Object>();
            contentHeaderListMap.put("id", content.getId());
            contentHeaderListMap.put("title", content.getTitle());

            contentMapList.add(contentHeaderListMap);
        }

        contentHeaderMap.put( "contentHeaderList",  contentMapList.subList(start, start + limit > contentMapList.size() ?
                contentMapList.size() : start + limit));
        contentHeaderMap.put("totalCount", contentMapList.size());

        return new ModelAndView(new JSONView(), contentHeaderMap);
    }

    @RequestMapping(method=RequestMethod.GET, value="contentTextsJsonData.itr")
    public ModelAndView contentTextsJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> contentHeaderListMap = null;
        Map<String,Object> contentHeaderMap = new HashMap<String, Object>();

        List<Content> contentsTexts = contentHeaderDetailsService.getAllContents();
        List<Map<String,Object>> contentTextsMapList = new ArrayList<Map<String, Object>>();

        for (Content contentTexts: contentsTexts) {
            contentHeaderListMap = new HashMap<String, Object>();
            contentHeaderListMap.put("id", contentTexts.getId());
            contentHeaderListMap.put("title", contentTexts.getTitle());

            contentTextsMapList.add(contentHeaderListMap);
        }

        contentHeaderMap.put( "contentHeaderList",  contentTextsMapList.subList(start, start + limit > contentTextsMapList.size() ?
                contentTextsMapList.size() : start + limit));
        contentHeaderMap.put("totalCount", contentTextsMapList.size());

        return new ModelAndView(new JSONView(), contentHeaderMap);
    }



    @RequestMapping(method=RequestMethod.GET, value="user.itr")
    public ModelAndView user(){
        Map<String,Object> userModel = new HashMap<String, Object>();
        userModel.put("PageTitle", "User");
        userModel.put("Title", "ITRovers - User");
        return new ModelAndView("admin_panel/user", userModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="userJsonData.itr")
    public ModelAndView userJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> userListMap = null;
        Map<String,Object> userMap = new HashMap<String, Object>();
        List<User> users = userDetailsService.getAllUsers();
        List<Map<String,Object>> userMapList = new ArrayList<Map<String, Object>>();
        for (User user : users) {
            userListMap = new HashMap<String, Object>();
            userListMap.put("id", user.getId());
            userListMap.put("username", user.getToken().getUsername());
            userListMap.put("password", user.getToken().getPassword());
            userListMap.put("active", true);

            userMapList.add(userListMap);
        }

        userMap.put( "userList",  userMapList.subList(start, start + limit > userMapList.size() ?
                userMapList.size() : start + limit));
        userMap.put( "totalCount",  userMapList.size());

        return new ModelAndView(new JSONView(), userMap);       // returning JSON data
    }
}
