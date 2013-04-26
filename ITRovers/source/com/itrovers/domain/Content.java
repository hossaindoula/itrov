package com.itrovers.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ninad
 * Date: 2013-04-26
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Content {
   @Id              // about us
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String contentName;
    private String contentHeader;

    @Lob
    private String contentDescription;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getContentHeader() {
        return contentHeader;
    }

    public void setContentHeader(String contentHeader) {
        this.contentHeader = contentHeader;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }
}
