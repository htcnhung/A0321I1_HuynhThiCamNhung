package service;

import bean.CustomerType;
import repository.CustomerTypeRepository;
import service.impl.CustomerTypeService;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {

    private CustomerTypeRepository customerTypeRepository = new CustomerTypeRepository();

    @Override
    public List<CustomerType> getAll() {
        return customerTypeRepository.selectAllCustomerType();
    }

    @Override
    public CustomerType getCusTypeById(String id) {
        return customerTypeRepository.selectTypeNote(id);
    }
}
