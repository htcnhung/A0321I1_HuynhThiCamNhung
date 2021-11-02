package service;

import bean.CustomerUseService;
import repository.CustomerUseServiceRepository;
import service.impl.CustomerUseServiceService;

import java.util.List;

public class CustomerUseServiceServiceImpl implements CustomerUseServiceService {

    CustomerUseServiceRepository customerUseServiceRepository = new CustomerUseServiceRepository();

    @Override
    public List<CustomerUseService> getAllCustomerUseService() {
        return customerUseServiceRepository.selectAllCustomerUseService();
    }
}
