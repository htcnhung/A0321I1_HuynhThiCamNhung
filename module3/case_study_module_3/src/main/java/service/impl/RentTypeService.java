package service.impl;

import bean.RentType;

import java.util.List;

public interface RentTypeService {
    public List<RentType> getAllRentType();
    public RentType selectRentTypeById(String id);
}
