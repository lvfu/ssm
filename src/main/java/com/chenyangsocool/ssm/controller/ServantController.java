package com.chenyangsocool.ssm.controller;

import com.chenyangsocool.ssm.model.ServantItem;
import com.chenyangsocool.ssm.model.Test;
import com.chenyangsocool.ssm.service.IServantService;
import com.chenyangsocool.ssm.service.ITestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/servant")
public class ServantController {


    @Resource
    private IServantService servantService;


    @RequestMapping("/index_servant")
    @ResponseBody
    public List<ServantItem> servantIndex(HttpServletRequest request, Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        return this.servantService.getServants(id);
    }
}
