package com.example.myapp.Groups.Controller;

import com.example.myapp.AvailableProducts.Repository.Entity.AvailableProductEntity;
import com.example.myapp.AvailableProducts.Repository.Entity.ProductTemplateEntity;
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
@RequestMapping("/groups")
public class GroupsRestController {

    @GetMapping("")
    public ArrayList<GroupEntity> groupEntities() {
        ArrayList<GroupEntity> arrayList = new ArrayList<>();
        arrayList.add(new GroupEntity(1,1,"Dom",false, new Date()));
        arrayList.add(new GroupEntity(2,1,"Biuro",false, new Date()));
        arrayList.add(new GroupEntity(3,1,"Akademik",false, new Date()));

        return arrayList;
    }

    @GetMapping("/{id}")
    public GroupEntity groupEntity(@PathVariable long id) {
        return new GroupEntity(id,1,"Dom",false, new Date());
    }

    @GetMapping("/{id}/users")
    public ArrayList<UserEntity> groupEntityUsers(@PathVariable long id) {
        ArrayList<UserEntity> arrayList = new ArrayList<>();
        arrayList.add(new UserEntity(1,"mihu","m@m.c","admin1"));
        arrayList.add(new UserEntity(2,"mihu2","m2@m.c","admin12"));
        arrayList.add(new UserEntity(3,"mihu3","m3@m.c","admin13"));

        return arrayList;
    }

    @GetMapping("/{id}/shopping-lists")
    public ArrayList<ShoppingListEntity> groupEntityShoppingLists(@PathVariable long id) {
        ArrayList<ShoppingListEntity> arrayList = new ArrayList<>();
        ArrayList<ProductEntity> productList = new ArrayList<>();
        productList.add(new ProductEntity(1,id,1,4,"Ziemniaki","kg",1.5,true,false, new Date()));
        productList.add(new ProductEntity(2,id,1,3,"Ketchup","szt.",1,true,false,new Date(300)));

        ArrayList<ProductEntity> productList2 = new ArrayList<>();
        productList2.add(new ProductEntity(3,id,2,1,"Ser Gouda","kg",0.2,false,false,new Date(2001,10,10)));
        productList2.add(new ProductEntity(4,id,2,1,"Mleko","l",1,true,false,new Date()));
        productList2.add(new ProductEntity(5,id,2,2,"Cisowianka Niegazowana","l",1.5,false,false,new Date(0)));


        ShoppingListEntity shoppingListEntity = new ShoppingListEntity(1,id,"Moja Lista Zakupow",false,new Date(), productList);
        ShoppingListEntity shoppingListEntity2 = new ShoppingListEntity(2,id,"Moja Lista Zakupow2",false,new Date(), productList2);
        
        arrayList.add(shoppingListEntity);
        arrayList.add(shoppingListEntity2);

        return arrayList;
    }



    @GetMapping("/{id}/available-products")
    public ArrayList<AvailableProductEntity> groupProducts(@PathVariable long id) {
        ArrayList<AvailableProductEntity> arrayList = new ArrayList<>();
        arrayList.add(new AvailableProductEntity(1,id,4,"Ziemniaki","kg",1.5,false,new Date()));
        arrayList.add(new AvailableProductEntity(3,id,1,"Ser Gouda","kg",0.2,false,new Date()));
        arrayList.add(new AvailableProductEntity(5,id,2,"Cisowianka Niegazowana","l",1.5,false,new Date()));

        return arrayList;
    }

	@GetMapping("/{id}/product-templates")
	public ArrayList<ProductTemplateEntity> groupTemplates(@PathVariable long id){
		ArrayList<ProductTemplateEntity> arrayList = new ArrayList<>();
		arrayList.add(new ProductTemplateEntity(1,id,4,"Ziemniaki","kg",1.5,false,new Date()));
		arrayList.add(new ProductTemplateEntity(3,id,1,"Ser Gouda","kg",0.2,false,new Date()));
		arrayList.add(new ProductTemplateEntity(5,id,2,"Cisowianka Niegazowana","l",1.5,false,new Date()));
		
		return arrayList;
	}
	
	@GetMapping("/{id}/categories")
	public ArrayList<CategoryEntity> groupCategories(@PathVariable long id){
		ArrayList<CategoryEntity> arrayList = new ArrayList<>();
		arrayList.add(new CategoryEntity(1,id,"colorkey_3","Nabial",false,new Date()));
		arrayList.add(new CategoryEntity(2,id,"colorkey_4","Woda i napoje",false,new Date()));
		arrayList.add(new CategoryEntity(3,id,"colorkey_2","Sosy",false,new Date()));
		arrayList.add(new CategoryEntity(4,id,"colorkey_1","Warzywa",false,new Date()));

		return arrayList;
	}
	
	
}



