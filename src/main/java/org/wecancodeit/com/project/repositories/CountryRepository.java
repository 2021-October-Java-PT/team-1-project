package org.wecancodeit.com.project.repositories;

import java.util.Collection;

public interface CountryRepository {
    Collection<IslandInfo> getIslands();

    Object findAll();

    interface IslandInfo {
        Long getId();

        String getName();

        String getImageUrl();

        String getContinent();

        String getCountry();

        String getWaterway();

        String getDescription();
    }
}
