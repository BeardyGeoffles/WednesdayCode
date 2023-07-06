package Geoff.com.repositories;

import Geoff.com.models.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public List<Employee> findByName(String x);
    public List<Employee> findByDept(String x);
    @Transactional
    public List<Employee> deleteByName(String x);

//    @Query(value="select * from employee where salary>=?1",nativeQuery=true)
//    List<Employee> findEmployees1(int sal);

//    @Modifying
//    @Transactional
//    @Query(value="insert into employee(name,dept,salary,city value(?1,?2,?3,?4)",nativeQuery = true)
//    void saveRecord(String name,String dept, int salary, String city);
}

