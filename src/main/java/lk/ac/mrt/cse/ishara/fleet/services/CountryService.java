package lk.ac.mrt.cse.ishara.fleet.services;

import lk.ac.mrt.cse.ishara.fleet.models.Country;
import lk.ac.mrt.cse.ishara.fleet.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //Get All Countrys
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    //Get Country By Id
    public Optional<Country> findById(int id) {
        return countryRepository.findById(id);
    }

    //Delete Country
    public void delete(int id) {
        countryRepository.deleteById(id);
    }

    //Update Country
    public void save(Country country) {
        countryRepository.save(country);
    }

}
