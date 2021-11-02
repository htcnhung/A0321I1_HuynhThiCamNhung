package service;

import bean.Division;
import repository.DivisionRepository;
import service.impl.DivisionService;

import java.util.List;

public class DivisionServiceImpl implements DivisionService {
    @Override
    public Division selectDivisionById(String id) {
        return new DivisionRepository().selectDivisionById(id);
    }

    @Override
    public List<Division> getAllDivision() {
        return new DivisionRepository().getAllDivision();
    }
}