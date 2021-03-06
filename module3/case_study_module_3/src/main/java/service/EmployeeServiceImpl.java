package service;

import bean.Employee;
import repository.EmployeeRepository;
import service.impl.EmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public Employee selectEmployee(String id) {
        return employeeRepository.selectEmployee(id);
    }

    @Override
    public Employee selectEmployee1(String id) {
        return employeeRepository.selectEmployee1(id);
    }

    @Override
    public List<Employee> selectAllEmployee() {
        return employeeRepository.selectAllEmployee();
    }

    @Override
    public boolean deleteEmployee(String id) throws SQLException {
        return employeeRepository.deleteEmployee(id);
    }

    @Override
    public boolean updateEmployee(Employee employee) throws SQLException {
        return employeeRepository.updateEmployee(employee);
    }

    @Override
    public List<Employee> selectEmployeeByName(String name) {
        return employeeRepository.selectEmployeeByName(name);
    }
}
