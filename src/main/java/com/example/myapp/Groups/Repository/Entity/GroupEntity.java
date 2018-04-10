package com.example.myapp.Groups.Repository.Entity;

import java.util.Date;

public class GroupEntity {

    private final long id;
    private final long creatorId;
    private final String name;
    private final Boolean isDeleted;
    private final Date lastModified;

    public GroupEntity(long id, long creatorId, String name, Boolean isDeleted, Date lastModified) {
        this.id = id;
        this.creatorId = creatorId;
        this.name = name;
        this.isDeleted = isDeleted;
        this.lastModified = lastModified;
    }

    public long getId() {
        return id;
    }

    public long getCreatorId() {
        return creatorId;
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
