package com.example.myapp.AvailableProducts.Controller;

import com.example.myapp.AvailableProducts.Repository.Entity.AvailableProductEntity;
import com.example.myapp.Groups.Repository.Entity.GroupEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/available-products")
public class AvailableProductsRestController {

    @GetMapping("/{id}")
    public AvailableProductEntity availableProductEntity(@PathVariable long id) {
        return new AvailableProductEntity(id,1,1,"Kefir","l",0.5,false,new Date());
    }

}

