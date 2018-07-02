package com.chenyangsocool.ssm.service;

import com.chenyangsocool.ssm.model.ServantItem;
import com.chenyangsocool.ssm.model.Test;

import java.util.List;

public interface IServantService {

    public List<ServantItem> getServants(int id);
}
