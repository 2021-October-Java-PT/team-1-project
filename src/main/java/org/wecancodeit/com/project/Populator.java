package org.wecancodeit.com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.com.project.models.Continent;
import org.wecancodeit.com.project.models.Country;
import org.wecancodeit.com.project.models.Island;
import org.wecancodeit.com.project.repositories.ContinentRepository;
import org.wecancodeit.com.project.repositories.CountryRepository;
import org.wecancodeit.com.project.repositories.HashTagRepository;
import org.wecancodeit.com.project.repositories.IslandRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private HashTagRepository hashTagRepo;
    @Resource
    private IslandRepository islandRepo;

    @Override
    public void run(String... args) throws Exception {

        Continent northAmerica = new Continent("North America", "image Url here");
        Continent SouthAmerica = new Continent("Southth America", "image Url here");
        Continent Africa = new Continent("Africa", "image Url here");
        Continent Asia = new Continent("Asia", "image Url here");
        Continent Europe = new Continent("Europe", "image Url here");
        Continent Australia = new Continent("Australia", "image Url here");
        continentRepo.save(northAmerica);
        continentRepo.save(SouthAmerica);
        continentRepo.save(Africa);
        continentRepo.save(Asia);
        continentRepo.save(Europe);
        continentRepo.save(Australia);

        Country republicFiji = new Country( "Republic of Fiji", "image url here");
        Country italy = new Country("italy", "image url here");
        Country usa = new Country("United States of America", "image Url here");
        Country venezuela = new Country("Venezuela", "image Url here");
        Country capoVerde = new Country("Capo Verde", "image url here");
        Country thailand = new Country("Thailand", "image url here");
        countryRepo.save(republicFiji);
        countryRepo.save(italy);
        countryRepo.save(usa);
        countryRepo.save(venezuela);
        countryRepo.save(capoVerde);
        countryRepo.save(thailand);

        Island fiji = new Island("Fiji", "image url here", "continent here", "country here", "waterway here", "decript here");
        Island levanzo = new Island("Levanzo", "image url here", "continent here", "country here", "waterway here", "decript here");
        Island maui = new Island("Maui", "image url here", "continent here", "country here", "waterway here", "decript here");
        Island laTortuga = new Island("LaTortuga", "image url here", "continent here", "country here", "waterway here", "decript here");
        Island santiagoIsland = new Island("Santiago Island", "image url here", "continent here", "country here", "waterway here", "decript here");
        Island similanIslands = new Island("Similan Islands ", "image url here", "continent here", "country here", "waterway here", "decript here");
        islandRepo.save(fiji);
        islandRepo.save(levanzo);
        islandRepo.save(maui);
        islandRepo.save(laTortuga);
        islandRepo.save(santiagoIsland);
        islandRepo.save(similanIslands);
    }
}
