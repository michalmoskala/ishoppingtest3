package com.example.myapp.Categories.Repository.Entity;

import java.util.Date;

public class CategoryEntity {

    private final long id;
    private final long groupId;
	private final String colorKey;
    private final String name;
    private final Boolean isDeleted;
    private final Date lastModified;

    public CategoryEntity(long id, long groupId, String colorKey, String name, Boolean isDeleted, Date lastModified) {
        this.id = id;
        this.groupId = groupId;
		this.colorKey = colorKey;
        this.name = name;
        this.isDeleted = isDeleted;
        this.lastModified = lastModified;
    }

    public long getId() {
        return id;
    }

    public long getCreatorId() {
        return groupId;
    }
	
	public String getColorKey() {
		return colorKey;
	}

    public String getName() {
        return name;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public Date getLastModified() {
        return lastModified;
    }


}
