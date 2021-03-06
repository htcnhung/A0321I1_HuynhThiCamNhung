package service;

import bean.RentType;
import repository.RentTypeRepository;
import service.impl.RentTypeService;

import java.util.List;

public class RentTypeServiceImpl implements RentTypeService {
    @Override
    public List<RentType> getAllRentType() {
        return new RentTypeRepository().selectAllRentType();
    }

    @Override
    public RentType selectRentTypeById(String id) {
        return new RentTypeRepository().selectRentTypeById(id);
    }
}
