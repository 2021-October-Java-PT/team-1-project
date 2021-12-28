package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.Country;
import org.wecancodeit.com.project.models.Island;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {
    List<Country> findByIslands(Island islands);

    Country findCountryByContinent(String continent);

}
