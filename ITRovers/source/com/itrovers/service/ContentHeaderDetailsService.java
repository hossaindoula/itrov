package com.itrovers.service;
import java.util.List;

import com.itrovers.domain.Content;
import com.itrovers.domain.ContentDetails;

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

    public boolean saveContent(ContentDetails contentDetails);

    public List<Content> getAllContents();

    public List<ContentDetails> getAllContentTexts();

    public  int count();

    public Content findContentByContentId(String contentId);

    public ContentDetails findContentTextsByContentTextsId(String contentTextsID);

    public Content findByContentName(String contentName);



}
