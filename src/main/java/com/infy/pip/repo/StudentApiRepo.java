package com.infy.pip.repo;

import com.infy.pip.model.StudentApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentApiRepo extends JpaRepository<StudentApi,Integer> {
}
