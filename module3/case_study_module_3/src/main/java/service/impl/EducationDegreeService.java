package service.impl;

import bean.EducationDegree;

import java.util.List;

public interface EducationDegreeService {
    public EducationDegree selectEducationDegreeById(String id);
    public List<EducationDegree> getAllEducationDegree();
}
