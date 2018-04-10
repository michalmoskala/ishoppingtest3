package com.example.myapp.ShoppingLists.Controller;


import com.example.myapp.ShoppingLists.Repository.Entity.ProductEntity;
import com.example.myapp.ShoppingLists.Repository.Entity.ShoppingListEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/shopping-lists")
public class ShoppingListsRestController {


    @GetMapping("/{id}")
    public ShoppingListEntity ShoppingListEntity(@PathVariable long id) {

        ArrayList<ProductEntity> productList = new ArrayList<>();
        productList.add(new ProductEntity(1,1,id,4,"Ziemniaki","kg",1.5,true,false, new Date()));
        productList.add(new ProductEntity(2,1,id,3,"Ketchup","szt.",1,true,false,new Date(300)));
        productList.add(new ProductEntity(3,1,id,1,"Ser Gouda","kg",0.2,false,false,new Date(2001,10,10)));
        productList.add(new ProductEntity(4,1,id,1,"Mleko","l",1,true,false,new Date()));
        productList.add(new ProductEntity(5,1,id,2,"Cisowianka Niegazowana","l",1.5,false,false,new Date(0)));


        return new ShoppingListEntity(id,1,"Moja Lista Zakupow",false,new Date(), productList);
    }

}


