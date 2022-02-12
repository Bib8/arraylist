package ashdihomwork252arraylist;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DepartmentAndSalaryService implements DeparmentAndSalaryInterface {

    private final EmployeeServiceMap employeeServiceMap;
    private Object NotFoundAnyMatchException;

    public DepartmentAndSalaryService(EmployeeServiceMap employeeServiceMap) {
        this.employeeServiceMap = employeeServiceMap;
    }

    @Override
    public Employee maxSalaryInDeparmentId(int deparmentId) throws NotFoundAnyMatchException {
        return employeeServiceMap.getAllEmployees().stream().
                filter(e-> e.getDepartmentId() == deparmentId).
                max(Comparator.comparingInt(e-> e.getSalary())).
                orElseThrow(NotFoundAnyMatchException::new);
    }

    @Override
    public Employee minSalaryInDeparmentId(int deparmentId) throws NotFoundAnyMatchException {
        return employeeServiceMap.getAllEmployees().stream().
                filter(e-> e.getDepartmentId() == deparmentId).
                min(Comparator.comparingInt(e-> e.getSalary())).
                orElseThrow(NotFoundAnyMatchException::new);
    }

    @Override
    public Collection<Employee> findEmployeeInDeparmentId(int deparmentId) {
        return null;
    }

    @Override
    public Map<Integer, List<Employee>> allEmployeeInDeparmentId() {
        return null;
    }
}
