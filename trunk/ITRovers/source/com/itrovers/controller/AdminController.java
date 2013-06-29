package com.itrovers.controller;

import com.itrovers.domain.*;
import com.itrovers.service.AuthenticationAndAuthorizationService;
import com.itrovers.service.ContentHeaderDetailsService;
import com.itrovers.service.SecurityService;
import com.itrovers.util.ITRConstants;
import com.itrovers.util.JSONView;
import com.itrovers.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.itrovers.service.UserDetailsService;


import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Ninad
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

    @Autowired
    private SecurityService securityService;

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

    @RequestMapping(method=RequestMethod.GET, value="authorizedGroupsList.itr")
    public ModelAndView authorizedGroupsList(){
        Map<String,Object> authorizedGroupsModel = new HashMap<String, Object>();
        authorizedGroupsModel.put("PageTitle", "AuthorizedGroups");
        authorizedGroupsModel.put("Title", "ITRovers - Authorized Groups");
        return new ModelAndView("admin_panel/authorized_groups_list", authorizedGroupsModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authorizedGroupsListDiv.itr")
    public ModelAndView authorizedGroupsListDiv(){
        Map<String,Object> authorizedGroupsModel = new HashMap<String, Object>();
        authorizedGroupsModel.put("PageTitle", "AuthorizedGroups");
        authorizedGroupsModel.put("Title", "ITRovers - Authorized Groups");
        return new ModelAndView("admin_panel/authorized_groups_list_div", authorizedGroupsModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authority.itr")
    public ModelAndView authority(){
        Map<String,Object> authorityModel = new HashMap<String, Object>();
        authorityModel.put("PageTitle", "Authority");
        authorityModel.put("Title", "ITRovers - Authority Model");
        return new ModelAndView("admin_panel/authority", authorityModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authorityList.itr")
    public ModelAndView authorityList(){
        Map<String,Object> authorityListModel = new HashMap<String, Object>();
        authorityListModel.put("PageTitle", "Authority List");
        authorityListModel.put("Title", "ITRovers - Authority List");
        return new ModelAndView("admin_panel/authority_list", authorityListModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authorityListDiv.itr")
    public ModelAndView authorityListDiv(){
        Map<String,Object> authorityListDivModel = new HashMap<String, Object>();
        authorityListDivModel.put("PageTitle", "Authority List");
        authorityListDivModel.put("Title", "ITRovers - Authority List");
        return new ModelAndView("admin_panel/authority_list_div", authorityListDivModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="createAuthority.itr")
    public ModelAndView createAuthority(){
        Map<String,Object> createAuthorityModel = new HashMap<String, Object>();
        createAuthorityModel.put("PageTitle", "Create Authority");
        createAuthorityModel.put("Title", "ITRovers - Create Authority");
        return new ModelAndView("admin_panel/create_authority", createAuthorityModel);
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView saveAuthorityData(@RequestParam("authorityname") String authorityname,
                                     @RequestParam("authoritydescription") String authoritydescription){
        Map<String,String> saveAuthority = new HashMap<String,String>();

        Authority authority = new Authority();
        authority.setAuthorityName(authorityname);
        authority.setAuthorityDescription(authoritydescription);

        return new ModelAndView("admin_panel/create_authority",saveAuthority);
    }

    @RequestMapping(method=RequestMethod.POST, value="authorityJsonData.itr")
    public ModelAndView authorityJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> authorityListMap = null;
        Map<String,Object> authorityMap = new HashMap<String, Object>();
        List<Authority> authorities = securityService.findAllAuthorities();
        List<Map<String,Object>> authorityMapList = new ArrayList<Map<String, Object>>();
        for (Authority authority : authorities) {
            authorityListMap = new HashMap<String, Object>();
            authorityListMap.put("id", authority.getAuthorityId());
            authorityListMap.put("description", authority.getAuthorityDescription());
            authorityListMap.put("name", authority.getAuthorityName());

            authorityMapList.add(authorityListMap);
        }

        authorityMap.put("authorityList", authorityMapList.subList(start, start + limit > authorityMapList.size() ?
                authorityMapList.size() : start + limit));
        authorityMap.put("totalCount", authorityMapList.size());

        return new ModelAndView(new JSONView(), authorityMap);
    }



    @RequestMapping(method=RequestMethod.GET, value="feature.itr")
    public ModelAndView feature(){
        Map<String,Object> featureModel = new HashMap<String, Object>();
        featureModel.put("PageTitle", "Feature");
        featureModel.put("Title", "ITRovers - Feature");
        return new ModelAndView("admin_panel/feature", featureModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="featureList.itr")
    public ModelAndView featureList(){
        Map<String,Object> featureListModel = new HashMap<String, Object>();
        featureListModel.put("PageTitle", "Feature List");
        featureListModel.put("Title", "ITRovers - Feature List");
        return new ModelAndView("admin_panel/feature_list", featureListModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="featureListDiv.itr")
    public ModelAndView featureListDiv(){
        Map<String,Object> featureListDivModel = new HashMap<String, Object>();
        featureListDivModel.put("PageTitle", "Feature List");
        featureListDivModel.put("Title", "ITRovers - Feature List");
        return new ModelAndView("admin_panel/feature_list_div", featureListDivModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="featureJsonData.itr")
    public ModelAndView featureJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> featureListMap = null;
        Map<String,Object> featureMap = new HashMap<String, Object>();
        List<Feature> features = securityService.findAllFeatures();
        List<Map<String,Object>> featureMapList = new ArrayList<Map<String, Object>>();
        for (Feature feature : features) {
            featureListMap = new HashMap<String, Object>();
            featureListMap.put("id", feature.getFeatureId());
            featureListMap.put("component", feature.getComponent().getComponentName());
            featureListMap.put("description", feature.getDescription());
            featureListMap.put("operation", feature.getOperation());

            featureMapList.add(featureListMap);
        }

        featureMap.put("featureList", featureMapList.subList(start, start + limit > featureMapList.size() ?
                featureMapList.size() : start + limit));
        featureMap.put("totalCount", featureMapList.size());

        return new ModelAndView(new JSONView(), featureMap);
    }

    @RequestMapping(method=RequestMethod.GET, value="createFeature.itr")
    public ModelAndView createFeature(){
        Map<String,Object> createFeatureModel = new HashMap<String, Object>();
        createFeatureModel.put("PageTitle", "Create Feature");
        createFeatureModel.put("Title", "ITRovers - Create Feature");
        return new ModelAndView("admin_panel/create_feature", createFeatureModel);
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView saveFeatureData(@RequestParam("component") Component component,
                                          @RequestParam("operation") String operation,
                                          @RequestParam("description") String description){

        Map<String,String> saveFeature = new HashMap<String,String>();

        Feature feature = new Feature();
        feature.setComponent(component);
        feature.setOperation(operation);
        feature.setDescription(description);


        return new ModelAndView("admin_panel/create_feature",saveFeature);
    }

    @RequestMapping(method=RequestMethod.GET, value="component.itr")
    public ModelAndView component(){
        Map<String,Object> componentModel = new HashMap<String, Object>();
        componentModel.put("PageTitle", "Component");
        componentModel.put("Title", "ITRovers - Component");
        return new ModelAndView("admin_panel/component", componentModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="componentList.itr")
    public ModelAndView componentList(){
        Map<String,Object> componentListModel = new HashMap<String, Object>();
        componentListModel.put("PageTitle", "Component List");
        componentListModel.put("Title", "ITRovers - Component List");
        return new ModelAndView("admin_panel/component_list", componentListModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="componentListDiv.itr")
    public ModelAndView componentListDiv(){
        Map<String,Object> componentListDivModel = new HashMap<String, Object>();
        componentListDivModel.put("PageTitle", "Component List");
        componentListDivModel.put("Title", "ITRovers - Component List");
        return new ModelAndView("admin_panel/component_list_div", componentListDivModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="componentJsonData.itr")
    public ModelAndView componentJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> componentListMap = null;
        Map<String,Object> componentMap = new HashMap<String, Object>();
        List<Component> components = securityService.findAllComponents();
        List<Map<String,Object>> componentMapList = new ArrayList<Map<String, Object>>();
        for (Component component : components) {
            componentListMap = new HashMap<String, Object>();
            componentListMap.put("id", component.getComponentId());
            componentListMap.put("description", component.getDescription());
            componentListMap.put("name", component.getComponentName());

            componentMapList.add(componentListMap);
        }

        componentMap.put("componentList", componentMapList.subList(start, start + limit > componentMapList.size() ?
                componentMapList.size() : start + limit));
        componentMap.put("totalCount", componentMapList.size());

        return new ModelAndView(new JSONView(), componentMap);
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

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView saveUserData(@RequestParam("username") String username,
                                     @RequestParam("password") String password){
        Map<String,String> saveUser = new HashMap<String,String>();

        Token token = new Token();
        token.setUsername(username);
        token.setPassword(password);

        User user = new User();
        user.setToken(token);
        user.setActive(true);

        userDetailsService.saveUser(user);

        return new ModelAndView("admin_panel/create_user", saveUser);
    }

    @RequestMapping(method=RequestMethod.GET, value="authorizedGroupList.itr")
    public ModelAndView authorizedGroupList(){
        Map<String,Object> authorizedGroupListModel = new HashMap<String, Object>();
        authorizedGroupListModel.put("PageTitle", "Authorized Group List");
        authorizedGroupListModel.put("Title", "ITRovers - Authorized Group List");
        return new ModelAndView("admin_panel/authorized_group_List", authorizedGroupListModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="authorizedGroupListDiv.itr")
    public ModelAndView authorizedGroupListDiv(){
        Map<String,Object> authorizedGroupsModel = new HashMap<String, Object>();
        authorizedGroupsModel.put("PageTitle", "AuthorizedGroups");
        authorizedGroupsModel.put("Title", "ITRovers - Authorized Groups");
        return new ModelAndView("admin_panel/authorized_group_list_div", authorizedGroupsModel);
    }

    @RequestMapping(method=RequestMethod.GET, value="createAuthorizedGroup.itr")
    public ModelAndView createAuthorizedGroup(){
        Map<String,Object> createAuthorizedGroupModel = new HashMap<String, Object>();
        createAuthorizedGroupModel.put("PageTitle", "Create Authorized Group");
        createAuthorizedGroupModel.put("Title", "ITRovers - Create Authorized Group");
        return new ModelAndView("admin_panel/create_authorized_group", createAuthorizedGroupModel);

    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView saveAuthorizedGroupData(@RequestParam("authorizedgroupname") String authorizedgroupname,
                                          @RequestParam("authorizedgroupdescription") String authorizedgroupdescription){
        Map<String,String> saveAuthorizedGroup = new HashMap<String,String>();

        AuthorizedGroups authorizedGroups = new AuthorizedGroups();
        authorizedGroups.setAuthorizationName(authorizedgroupname);
        authorizedGroups.setAuthorizationDescription(authorizedgroupdescription);

        return new ModelAndView("admin_panel/create_authorized_group",saveAuthorizedGroup);
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

    @RequestMapping(method=RequestMethod.GET, value="contentDetailsList.itr")
    public ModelAndView contentDetailsList(){
        Map<String,Object> contentDetailsListModel = new HashMap<String, Object>();
        contentDetailsListModel.put("PageTitle", "Content Details List");
        contentDetailsListModel.put("Title", "ITRovers - Content Details List");
        return new ModelAndView("admin_panel/content_details_list", contentDetailsListModel);

    }

    @RequestMapping(method=RequestMethod.GET, value="createContentHeader.itr")
    public ModelAndView createContentHeader(){
        Map<String,Object> createContentHeaderModel = new HashMap<String, Object>();
        createContentHeaderModel.put("PageTitle", "Create Content Header");
        createContentHeaderModel.put("Title", "ITRovers - Create Content Header");
        return new ModelAndView("admin_panel/create_content_header", createContentHeaderModel);

    }

    @RequestMapping(method=RequestMethod.GET, value="createContentDetails.itr")
    public ModelAndView createContentDetails(){
        Map<String,Object> createContentDetailsModel = new HashMap<String, Object>();
        createContentDetailsModel.put("PageTitle", "Create Content Details");
        createContentDetailsModel.put("Title", "ITRovers - Create Content Details");
        return new ModelAndView("admin_panel/create_content_details", createContentDetailsModel);

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

    @RequestMapping(method=RequestMethod.POST, value="saveContent.itr")
    public ModelAndView saveContent(@RequestParam("contentTitle") String contentTitle, @RequestParam("contentUrl") String contentUrl){
        Map<String,Object> saveContentModel = new HashMap<String, Object>();
        saveContentModel.put("PageTitle", "Save Content");
        saveContentModel.put("Title", "ITRovers - Save Content" );
        Content content = new Content();
        content.setTitle(contentTitle);
        content.setUrl(contentUrl);
        contentHeaderDetailsService.saveContent(content);
        return new ModelAndView("redirect:/admin/createContentHeader.itr", saveContentModel);
    }

    @RequestMapping(method=RequestMethod.POST, value="saveContentDetails.itr")
    public ModelAndView saveContentDetails(@RequestParam("contentTitle") String contentTitle, @RequestParam("contentDescription") String contentDescription){
        Map<String,Object> saveContentDetailsModel = new HashMap<String, Object>();
        saveContentDetailsModel.put("PageTitle", "Save Content");
        saveContentDetailsModel.put("Title", "ITRovers - Save Content");
        Content content = new Content();
        content.setTitle(contentTitle);
        content.setUrl(contentDescription);
        contentHeaderDetailsService.saveContent(content);
        return new ModelAndView("redirect:/admin/createContentDetails.itr", saveContentDetailsModel);
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

    @RequestMapping(method=RequestMethod.GET, value="contentDetailsListDiv.itr")
    public ModelAndView contentDetailsListDiv(){
        Map<String,Object> contentDetailsListDivModel = new HashMap<String, Object>();
        return new ModelAndView("admin_panel/content_details_list_div", contentDetailsListDivModel);
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

    @RequestMapping(method=RequestMethod.GET, value="contentDetailsJsonData.itr")
    public ModelAndView contentDetailsJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> contentDetailsListMap = null;
        Map<String,Object> contentDetailsMap = new HashMap<String, Object>();

        List<Content> contentDetails = contentHeaderDetailsService.getAllContents();
        List<Map<String,Object>> contentDetailsMapList = new ArrayList<Map<String, Object>>();

        for (Content contentsDetails: contentDetails) {
            contentDetailsListMap = new HashMap<String, Object>();
            contentDetailsListMap.put("id", contentsDetails.getId());
            contentDetailsListMap.put("title", contentsDetails.getTitle());

            contentDetailsMapList.add(contentDetailsListMap);
        }

        contentDetailsMap.put("contentDetailList", contentDetailsMapList.subList(start, start + limit > contentDetailsMapList.size() ?
                contentDetailsMapList.size() : start + limit));
        contentDetailsMap.put("totalCount", contentDetailsMapList.size());

        return new ModelAndView(new JSONView(), contentDetailsMap);
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

    @RequestMapping(method=RequestMethod.POST, value="authorizedGroupsJsonData.itr")
    public ModelAndView authorizedGroupsJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> authorizedGroupsListMap = null;
        Map<String,Object> authorizedGroupsMap = new HashMap<String, Object>();
        List<AuthorizedGroups> authorizedGroups = securityService.findAllAuthorizedGroup();
        List<Map<String,Object>> authorizedGroupMapList = new ArrayList<Map<String, Object>>();
        for (AuthorizedGroups authorizedGroup : authorizedGroups) {
            authorizedGroupsListMap = new HashMap<String, Object>();
            authorizedGroupsListMap.put("id", authorizedGroup.getId());
            authorizedGroupsListMap.put("description", authorizedGroup.getAuthorizationName());
            authorizedGroupsListMap.put("name", authorizedGroup.getAuthorizationDescription());

            authorizedGroupMapList.add(authorizedGroupsListMap);
        }

        authorizedGroupsMap.put("authorizedGroupList", authorizedGroupMapList.subList(start, start + limit > authorizedGroupMapList.size() ?
                authorizedGroupMapList.size() : start + limit));
        authorizedGroupsMap.put("totalCount", authorizedGroupMapList.size());

        return new ModelAndView(new JSONView(), authorizedGroupsMap);
    }

}
