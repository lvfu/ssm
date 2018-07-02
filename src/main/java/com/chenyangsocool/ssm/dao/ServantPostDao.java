package com.chenyangsocool.ssm.dao;

import com.chenyangsocool.ssm.model.PostBean;
import com.chenyangsocool.ssm.model.ServantItem;

import java.util.List;

public interface ServantPostDao {

    List<ServantItem> getPostServants(PostBean postBean);
}
