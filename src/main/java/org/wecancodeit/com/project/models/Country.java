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


    public Country(){

    }

    public Country(String name, String imageUrl){
        this.name = name;
        this.imageUrl = imageUrl;

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

}
