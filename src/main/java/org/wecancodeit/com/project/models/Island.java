package org.wecancodeit.com.project.models;

import javax.persistence.*;
import java.util.*;

@Entity
public class Island {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    @ManyToOne
    private String continent;
    @ManyToMany
    private String country;
    @ManyToMany
    private String waterway;
    public String description;
    @ManyToMany
    private Set<HashTag> hashTags;

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

    public Island(String name, String imageUrl, String continent, String country, String waterway, String description) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.continent = continent;
        this.country = country;
        this.waterway = waterway;
        this.description = description;
    }

}
