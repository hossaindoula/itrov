package com.itrovers.dao;

import java.util.List;
import com.itrovers.domain.Content;
import com.itrovers.domain.ContentTexts;


/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2013-06-12
 * Time: 21:14
 * To change this template use File | Settings | File Templates.
 */
public interface ContentDao {

    public  boolean save(Content content);

    public  boolean save(ContentTexts contentTexts);

    public boolean update(Content content);

    public boolean update(ContentTexts contentTexts);

    public boolean delete(Content content);

    public boolean delete(ContentTexts contentTexts);

    public Content get(int contentId);

    public Content get(String contentName);

    public List<Content> getAllContents();

    public int count();

}
