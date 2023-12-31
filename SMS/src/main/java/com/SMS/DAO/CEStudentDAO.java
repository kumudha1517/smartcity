
package com.SMS.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SMS.Model.CEStudentModel;

public interface CEStudentDAO extends JpaRepository<CEStudentModel,Integer>{

//	public StudentModel findByEmail(String email);
//
//	public StudentModel findByEmailAndPassword(String email, String password);

	Optional<CEStudentModel> findById(String email);

	CEStudentModel findByEmail(String email);

	
}
