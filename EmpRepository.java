package com.practice.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.crud.entity.Emp;
@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
