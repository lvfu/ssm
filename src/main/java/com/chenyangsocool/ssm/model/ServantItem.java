package com.chenyangsocool.ssm.model;


import java.io.Serializable;
import java.util.List;

/**
 * Created by PY on 2016/12/1.
 */
public class ServantItem implements Serializable {

    private int id;
    private String name;
    private String nickname;
    private String classType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

}


