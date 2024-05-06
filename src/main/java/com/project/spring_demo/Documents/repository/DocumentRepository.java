package com.project.spring_demo.Documents.repository;


import com.project.spring_demo.Documents.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,String> {
}
