package com.example.myapp.ProductTemplates.Controller;

import com.example.myapp.AvailableProducts.Repository.Entity.AvailableProductEntity;
import com.example.myapp.AvailableProducts.Repository.Entity.ProductTemplateEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;


@RestController
@RequestMapping("/product-templates")
public class ProductTemplatesRestController {

    @GetMapping("/{id}")
    public ProductTemplateEntity productTemplate(@PathVariable long id) {
        return new ProductTemplateEntity(1,id,1,"Kefir","l",0.5,false,new Date());
    }


}



