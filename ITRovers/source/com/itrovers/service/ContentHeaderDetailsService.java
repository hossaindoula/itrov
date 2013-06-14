package com.itrovers.service;
import java.util.List;

import com.itrovers.domain.Content;
import com.itrovers.domain.ContentTexts;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2013-06-12
 * Time: 20:27
 * To change this template use File | Settings | File Templates.
 */
public interface ContentHeaderDetailsService {

    public Content getContent(int contentID);



    public boolean saveContent(Content content);

    public boolean saveContentText(ContentTexts contentTexts);

    public List<Content> getAllContents();

    public List<ContentTexts> getAllContentTexts();

    public  int count();

    public Content findContentByContentId(String contentId);

    public ContentTexts findContentTextsByContentTextsId(String contentTextsID);

    public Content findByContentName(String contentName);



}
