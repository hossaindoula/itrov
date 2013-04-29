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
    private String title;
    private String url;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
