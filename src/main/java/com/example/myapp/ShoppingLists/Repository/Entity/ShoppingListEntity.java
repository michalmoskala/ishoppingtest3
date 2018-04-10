package com.example.myapp.ShoppingLists.Repository.Entity;

import java.util.ArrayList;
import java.util.Date;

public class ShoppingListEntity {

    private final long id;
    private final long groupId;
    private final String name;
    private final boolean isDeleted;
    private final Date lastModified;
    private final ArrayList<ProductEntity> products;

    public ShoppingListEntity(long id, long groupId, String name, boolean isDeleted, Date lastModified, ArrayList<ProductEntity> products) {
        this.id = id;
        this.groupId = groupId;
        this.name = name;
        this.isDeleted = isDeleted;
        this.lastModified = lastModified;
        this.products = products;
    }


    public long getId() {
        return id;
    }

    public long getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public ArrayList<ProductEntity> getProducts() {
        return products;
    }
}

