package com.chenyangsocool.ssm.controller;

import com.chenyangsocool.ssm.model.PostBean;
import com.chenyangsocool.ssm.model.ServantItem;
import com.chenyangsocool.ssm.service.IServantPostService;
import com.chenyangsocool.ssm.service.IServantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/servantPost")
public class ServantPostController {


    @Resource
    private IServantPostService servantService;


    @RequestMapping("/servants")
    @ResponseBody
    public List<ServantItem> add(@RequestBody PostBean postBean) {
        return this.servantService.getPostServants(postBean);
    }

}
