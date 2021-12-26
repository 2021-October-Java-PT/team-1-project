package org.wecancodeit.com.project.repositories;

import java.util.Collection;

public interface Country {
    Collection<IslandInfo> getIslands();

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
