package service.impl;

import bean.Division;

import java.util.List;

public interface DivisionService {
    public Division selectDivisionById(String id);
    public List<Division> getAllDivision();
}
