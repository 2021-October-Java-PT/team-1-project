package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

    private Long id;
    private String name;
    private String imageUrl;


    public Continent(){

    }

    public Continent(Long id, String name, String imageUrl){
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getImageUrl(){
        return imageUrl;
    }
}
