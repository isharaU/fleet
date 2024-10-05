package lk.ac.mrt.cse.ishara.fleet.repositories;

import lk.ac.mrt.cse.ishara.fleet.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
