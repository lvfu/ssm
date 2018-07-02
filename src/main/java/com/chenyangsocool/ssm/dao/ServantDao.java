package com.chenyangsocool.ssm.dao;

import com.chenyangsocool.ssm.model.ServantItem;

import java.util.List;

public interface ServantDao {
    List<ServantItem> getServants(int id);
}
