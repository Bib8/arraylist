package ashdihomwork252arraylist;

import java.util.*;

public interface DeparmentAndSalaryInterface {
    Employee maxSalaryInDeparmentId(int deparmentId) throws NotFoundAnyMatchException;
    Employee minSalaryInDeparmentId(int deparmentId) throws NotFoundAnyMatchException;
    Collection<Employee> findEmployeeInDeparmentId(int deparmentId);
    Map<Integer, List<Employee>> allEmployeeInDeparmentId();
}
