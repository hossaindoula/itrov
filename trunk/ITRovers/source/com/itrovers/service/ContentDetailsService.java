package com.itrovers.service;

import com.itrovers.domain.Content;
import com.itrovers.domain.ContentDetails;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2013-06-24
 * Time: 13:28
 * To change this template use File | Settings | File Templates.
 */
public class ContentDetailsService {
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
}
