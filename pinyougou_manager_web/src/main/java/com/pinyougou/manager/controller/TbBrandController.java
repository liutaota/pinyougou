package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class TbBrandController {
    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
   public  List<TbBrand> findAll(){
        return brandService.findAll();
    }

}
