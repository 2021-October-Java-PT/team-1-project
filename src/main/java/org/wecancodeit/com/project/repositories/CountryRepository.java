package org.wecancodeit.com.project.repositories;

import java.util.Collection;

public interface CountryRepository {
    Collection<IslandInfo> getIslands();

    Object findAll();
}
