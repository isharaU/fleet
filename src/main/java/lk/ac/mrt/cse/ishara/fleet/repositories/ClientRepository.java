package lk.ac.mrt.cse.ishara.fleet.repositories;

import lk.ac.mrt.cse.ishara.fleet.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
