package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    private String description;

    public Country(){

    }

    public Country(Long id, String name, String imageUrl, String description){
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }
}
