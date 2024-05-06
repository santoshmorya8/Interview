package com.project.spring_demo.Basic_Information.service;

import com.project.spring_demo.Basic_Information.model.Information;

import java.util.List;


public interface InformationService {
    public String createInformation(Information information);
    public String updateInformation(Information information);
    public String deleteInformation(String informationId);
    public Information getInformation(String informationId);
}
