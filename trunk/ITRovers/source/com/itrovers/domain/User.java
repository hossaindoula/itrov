package com.itrovers.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ninad
 * Date: 2013-04-26
 * Time: 18:25
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User implements Serializable {

    //fields of table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Token token;

    @ManyToMany
    private List<AuthorizedGroups> authorizedGroups;
    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<AuthorizedGroups> getAuthorizedGroups() {
        return authorizedGroups;
    }

    public void setAuthorizedGroups(List<AuthorizedGroups> authorizedGroups) {
        this.authorizedGroups = authorizedGroups;
    }
}
