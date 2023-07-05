package Geoff.com.repositories;

import Geoff.com.models.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public List<Employee> findByName(String x);
    public List<Employee> findByDept(String x);
    @Transactional
    public List<Employee> deleteByName(String x);

}

