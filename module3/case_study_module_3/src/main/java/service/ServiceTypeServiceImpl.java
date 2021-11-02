package service;

import bean.ServiceType;
import repository.ServiceTypeRepository;
import service.impl.ServiceTypeService;

import java.util.List;

public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Override
    public List<ServiceType> getAllServiceType() {
        return new ServiceTypeRepository().selectAllServiceType();
    }

    @Override
    public ServiceType selectServiceTypeById(String id) {
        return new ServiceTypeRepository().selectServiceTypeById(id);
    }
}
