package ashdihomwork252arraylist;

import java.util.Collection;
import java.util.Set;

public interface EmployeeMapInterface {
    Employee addToRepositoryEmployee(String firstname, String lastname) throws NotFoundAnyMatchException;
    Employee removeFromRepositoryEmployee(String firstname, String lastname) throws NotFoundAnyMatchException;
    Employee findEmployeeInRepository(String firstname, String lastname) throws NotFoundAnyMatchException;

    Collection<Employee> getAllEmployees();
}
