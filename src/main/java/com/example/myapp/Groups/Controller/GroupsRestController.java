package com.example.myapp.Groups.Controller;

import com.example.myapp.AvailableProducts.Repository.Entity.AvailableProductEntity;
import com.example.myapp.Groups.Repository.Entity.GroupEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;


@RestController
@RequestMapping("/groups")
public class GroupsRestController {

    @GetMapping("/{id}")
    public GroupEntity groupEntity(@PathVariable long id) {
        return new GroupEntity(id,1,"name",false, new Date());
    }
//
//    @GetMapping("/{id}/available-products")
//    public ArrayList<AvailableProductEntity> groupProducts(@PathVariable long id) {
//        ArrayList<AvailableProductEntity> arrayList = new ArrayList<>();
//        arrayList.add(new AvailableProductEntity(1,id,1,"name","kg",2,false,new Date()));
//        arrayList.add(new AvailableProductEntity(2,id,2,"name2","kg",2.5,false,new Date()));
//        arrayList.add(new AvailableProductEntity(3,id,3,"name23","kg",2,false,new Date()));
//
//        return arrayList;
//    }

}



