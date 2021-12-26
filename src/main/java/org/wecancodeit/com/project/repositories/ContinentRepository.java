package org.wecancodeit.com.project.repositories;


import org.springframework.stereotype.Repository;
import org.wecancodeit.com.project.models.Continent;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository

public class ContinentRepository {

    Map<Long, Continent> Continents = new HashMap<>();

    Continent northAmerica = new Continent(11L,"North America", "imgUrl");
    Continent southAmerica = new Continent(22L,"South America", "imgUrl");
    Continent asia = new Continent(33L,"Asia", "imgUrl");
    Continent europe = new Continent(44L,"Europe", "imgUrl");
    Continent africa = new Continent(55L,"Africa", "imgUrl");
    Continent australia = new Continent(66L,"Australia", "imgUrl");




    public ContinentRepository(){

        Continents.put(northAmerica.getId(), northAmerica);
        Continents.put(southAmerica.getId(), southAmerica);
        Continents.put(asia.getId(), asia);
        Continents.put(europe.getId(), europe);
        Continents.put(africa.getId(), africa);
        Continents.put(australia.getId(), australia);
    }

    public Continent findOne(Long id)
    {return Continents.get(id);}

    public Collection<Continent> findAll()
    {return Continents.values();}

}