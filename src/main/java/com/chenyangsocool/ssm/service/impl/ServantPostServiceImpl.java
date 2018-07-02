package com.chenyangsocool.ssm.service.impl;

import com.chenyangsocool.ssm.dao.ServantDao;
import com.chenyangsocool.ssm.dao.ServantPostDao;
import com.chenyangsocool.ssm.model.PostBean;
import com.chenyangsocool.ssm.model.ServantItem;
import com.chenyangsocool.ssm.service.IServantPostService;
import com.chenyangsocool.ssm.service.IServantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServantPostServiceImpl implements IServantPostService {

    @Resource
    private ServantPostDao servantPostDao;


    @Override
    public List<ServantItem> getPostServants(PostBean postBean) {
        return servantPostDao.getPostServants(postBean);
    }
}
