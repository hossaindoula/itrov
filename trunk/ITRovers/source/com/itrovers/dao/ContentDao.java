package com.itrovers.dao;

import java.util.List;
import com.itrovers.domain.Content;
import com.itrovers.domain.ContentDetails;


/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2013-06-12
 * Time: 21:14
 * To change this template use File | Settings | File Templates.
 */
public interface ContentDao {

    public  boolean save(Content content);

    public  boolean save(ContentDetails contentDetails);

    public boolean update(Content content);

    public boolean update(ContentDetails contentDetails);

    public boolean delete(Content content);

    public boolean delete(ContentDetails contentDetails);

    public Content get(int contentId);

    public Content get(String contentName);

    public List<Content> getAllContents();

    public int count();

}
