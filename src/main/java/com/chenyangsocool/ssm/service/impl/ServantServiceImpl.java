package com.chenyangsocool.ssm.service.impl;

import com.chenyangsocool.ssm.dao.ServantDao;
import com.chenyangsocool.ssm.dao.TestDao;
import com.chenyangsocool.ssm.model.ServantItem;
import com.chenyangsocool.ssm.model.Test;
import com.chenyangsocool.ssm.service.IServantService;
import com.chenyangsocool.ssm.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServantServiceImpl implements IServantService {

    @Resource
    private ServantDao servantDao;


    @Override
    public List<ServantItem> getServants(int id) {
        return servantDao.getServants(id);
    }
}
