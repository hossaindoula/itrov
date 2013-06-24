package com.itrovers.service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2013-06-12
 * Time: 20:28
 * To change this template use File | Settings | File Templates.
 */
import com.itrovers.dao.ContentDao;
import com.itrovers.domain.Content;
import com.itrovers.domain.ContentDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Service
public class ContentHeaderDetailsServiceImpl implements ContentHeaderDetailsService{

    @Autowired
    private ContentDao contentDao;

    @Override
    public Content getContent(int contentID){
        return contentDao.get(contentID);
    }



    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
    public boolean saveContent(Content content){
        return contentDao.save(content);
    }

    @Override
    public boolean saveContent(ContentDetails contentDetails) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Content> getAllContents() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<ContentDetails> getAllContentTexts() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int count(){
        return contentDao.count();
    }

    @Override
    public Content findContentByContentId(String contentId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Content findByContentName(String contentName){
        return contentDao.get(contentName);
    }

    @Override
    public ContentDetails findContentTextsByContentTextsId(String contentTextsID) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


}
