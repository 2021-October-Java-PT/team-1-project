package org.wecancodeit.com.project.repositories;
public interface ContinentRepository {


import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.Continent;

public interface ContinentRepository extends CrudRepository<Continent, Long> {

}



