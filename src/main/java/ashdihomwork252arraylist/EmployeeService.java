package ashdihomwork252arraylist;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface{

    List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }

    @Override
    public String addToRepositoryEmployee(Employee employee) {
        employees.add(employee);
        return "added";
    }

    @Override
    public String removeFromRepositoryEmployee(Employee employee) {
        employees.remove(employee);
        return "removed";
    }

    @Override
    public String findEmployeeInRepository(Employee employee) {
        int id = employees.indexOf(employee);
        return String.join(" ", "Founded - " + id);
    }

    public String printRepository() {
         return String.join(" ", String.valueOf(employees)) ;
    }


}
