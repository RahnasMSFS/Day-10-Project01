package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer>{

}
