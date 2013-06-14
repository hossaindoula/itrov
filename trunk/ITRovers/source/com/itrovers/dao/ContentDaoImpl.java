package com.itrovers.dao;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2013-06-12
 * Time: 21:21
 * To change this template use File | Settings | File Templates.
 */
import com.itrovers.domain.ContentTexts;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.itrovers.util.DESEDE;
import com.itrovers.domain.Content;

import java.util.List;


@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Repository
public class ContentDaoImpl implements ContentDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public  boolean save (Content content){
        hibernateTemplate.persist(content);

        return true;
    }

    @Override
    public boolean save(ContentTexts contentTexts) {
        hibernateTemplate.persist(contentTexts);
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean update(Content content){
        hibernateTemplate.merge(content);

        return true;
    }

    @Override
    public boolean update(ContentTexts contentTexts) {
        hibernateTemplate.merge(contentTexts);
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(ContentTexts contentTexts) {
        hibernateTemplate.delete(contentTexts);
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(Content content){
        hibernateTemplate.delete(content);

        return true;

    }

    @Override
    public Content get(int contentID){
        return (Content) hibernateTemplate.get(Content.class,contentID);

    }

    @Override
    public Content get(String contentName){
        Object[] paramArr = new Object[1];
        Content content = null;
        paramArr[0] = new String(contentName);

        return content;
    }

    @Override
    public List<Content> getAllContents() {
        return  hibernateTemplate.find("from Content");
    }

    @Override
    public int count() {
        Session hibernateSession = hibernateTemplate.getSessionFactory().getCurrentSession();
        int count;
        try{
            count = Integer.parseInt(hibernateSession.
                    createCriteria(Content.class).
                    setProjection(Projections.rowCount()).
                    uniqueResult().toString());
        }   catch (Exception ex){
            count = 0;
        }

        //return hibernateTemplate.find("from User").size();
        return count;
    }


}
