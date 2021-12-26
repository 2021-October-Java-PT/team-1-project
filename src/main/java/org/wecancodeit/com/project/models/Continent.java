package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Continent {

@Id
@GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;

    public Continent(long id, String name, String imgUrl) {
    }

    public static Continent get(Long id) {
        return null;
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




    public Continent(Long id, String name, String imageUrl, String country) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;

    }


}


