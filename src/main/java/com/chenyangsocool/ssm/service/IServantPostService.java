package com.chenyangsocool.ssm.service;

import com.chenyangsocool.ssm.model.PostBean;
import com.chenyangsocool.ssm.model.ServantItem;

import java.util.List;

public interface IServantPostService {

    public List<ServantItem> getPostServants(PostBean postBean);
}
