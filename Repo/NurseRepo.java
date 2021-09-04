package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Nurse;

@Repository
public interface NurseRepo extends JpaRepository<Nurse, Integer>{

}
