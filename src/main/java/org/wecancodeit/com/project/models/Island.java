package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Island {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    private String continent;
    private String country;
    private String waterway;
    public String description;

}
    public Island() {
    }

    public Island(long id, String imgUrl, String continent, String country, String waterway, String description_goes_here) {

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

    public String getContinent() {
        return continent;
    }

    public String getCountry() {
        return country;
    }

    public String getWaterway() {
        return waterway;
    }

    public String getDescription() {
        return description;
    }

    public Island(Long id, String name, String imageUrl, String continent, String country, String waterway, String description) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.continent = continent;
        this.country = country;
        this.waterway = waterway;
        this.description = description;
    }

}
