package com.example.docLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.docLogin.model.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine,Long>{

}
