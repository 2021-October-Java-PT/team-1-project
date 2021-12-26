package org.wecancodeit.com.project.repositories;
import org.springframework.stereotype.Repository;
import org.wecancodeit.com.project.models.Island;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class IslandRepository {

    Map<Long, Island> islandsList = new HashMap<>();

    Island fiji = new Island(1L, "imgUrl", "Oceania", "Republic of Fiji", "South Pacific Ocean", "description goes here");
    Island levanzo = new Island(2L, "imgUrl", "Europe", "Italy", "Mediterranean", "description goes here");
    Island maui = new Island(3L, "imgUrl", "North America", "United States", "Central Pacific Ocean", "Hawaii", "description goes here");
    Island laTortuga = new Island(4L, "imgUrl", "South America", "Venezuela", "Caribbean", "description goes here");
    Island santiagoIsland = new Island(5L, "imgUrl", "Africa", "Cabo Verde", "Central Atlantic", "description goes here");
    Island similanIslands = new Island(6L, "imgUrl", "Asia", "Thailand", "Indian Ocean", "description goes here");

    public IslandRepository() {

        islandsList.put(fiji.getId(), fiji);
        islandsList.put(levanzo.getId(), levanzo);
        islandsList.put(maui.getId(), maui);
        islandsList.put(laTortuga.getId(), laTortuga);
        islandsList.put(santiagoIsland.getId(), santiagoIsland);
        islandsList.put(similanIslands.getId(), similanIslands);

    }


    public IslandRepository(Island... islandsToAdd) {
        for (Island island : islandsToAdd) {
            islandsList.put(island.getId(), island);
        }
    }
    public Island findOne(Long id) {
        return islandsList.get(id);
    }

    public Collection<Island> findAll() {
        return islandsList.values();
    }

}