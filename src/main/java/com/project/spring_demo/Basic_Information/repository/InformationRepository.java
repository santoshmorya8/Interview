package com.project.spring_demo.Basic_Information.repository;


import com.project.spring_demo.Basic_Information.model.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information,String> {
}
