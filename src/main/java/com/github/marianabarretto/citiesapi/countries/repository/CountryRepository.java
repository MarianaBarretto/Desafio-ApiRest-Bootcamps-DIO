package com.github.marianabarretto.citiesapi.countries.repository;

import com.github.marianabarretto.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
