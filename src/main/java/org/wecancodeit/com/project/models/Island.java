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

    private String continent;

    //why field on line 16 and then collection on line 26
    private String country;

   
    private String waterway;
    public String description;
    @ManyToMany
    private Set<HashTag> hashTags;


    @ManyToMany

    private List<Country> countries = new ArrayList<>();

//    @JoinTable(name = "island_countries",
//            joinColumns = @JoinColumn(name = "island_id", referencedColumnName = "countries_id"))


// private List<Country> countries = new ArrayList<>();
 
public List<Country> getCountries() {
        return countries;
  }

    public Collection<HashTag> getHashTags(){
        return hashTags;
    }
   public void setCountries(List<Country> countries) {
       this.countries = countries;
   }

    public Island() {
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
        this.hashTags = new HashSet<>();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Island island = (Island) o;
        return Objects.equals(id, island.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void addHashTag(HashTag hashTagToAdd) {
        hashTags.add(hashTagToAdd);
    }

    public void deleteHashTag(HashTag hashTagToRemove) {
        hashTags.remove(hashTagToRemove);
    }
}

