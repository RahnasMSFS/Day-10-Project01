package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Hospital;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Integer>{

}
