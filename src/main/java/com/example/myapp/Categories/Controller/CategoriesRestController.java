package com.example.myapp.Categories.Controller;

import com.example.myapp.AvailableProducts.Repository.Entity.AvailableProductEntity;
import com.example.myapp.Groups.Repository.Entity.CategoryEntity;
import com.example.myapp.Groups.Repository.Entity.GroupEntity;
import com.example.myapp.ShoppingLists.Repository.Entity.ProductEntity;
import com.example.myapp.ShoppingLists.Repository.Entity.ShoppingListEntity;
import com.example.myapp.Users.Repository.Entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;


@RestController
@RequestMapping("/categories")
public class CategoriesRestController {

    @GetMapping("/{id}")
    public CategoryEntity categoryEntity(@PathVariable long id) {
        return new CategoryEntity(1,id,"colorkey_3","Nabial",false,new Date());
    }


}



