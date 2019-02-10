package com.oldguy.example.dao.mongodb.entities;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Date: 2019/2/10 0010
 * @Author: ren
 * @Description:
 */
@Document
public class Entity1 {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
