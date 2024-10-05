package lk.ac.mrt.cse.ishara.fleet.repositories;

import lk.ac.mrt.cse.ishara.fleet.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
