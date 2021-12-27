package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

=======import java.util.Collection;

public interface CountryRepository {
    Collection<IslandInfo> getIslands();

}
