package service.impl;

import bean.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    public List<CustomerType> getAll();

    public CustomerType getCusTypeById(String id);
}
