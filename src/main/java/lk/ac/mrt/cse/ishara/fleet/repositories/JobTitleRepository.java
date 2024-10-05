package lk.ac.mrt.cse.ishara.fleet.repositories;

import lk.ac.mrt.cse.ishara.fleet.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
