package com.project.spring_demo.Documents.service;

import com.project.spring_demo.Documents.model.Document;


public interface DocumentService {
    public String createDocument(Document document);
    public String updateDocument(Document document);
    public String deleteDocument(String informationId);
    public Document getDocument(String informationId);
}
