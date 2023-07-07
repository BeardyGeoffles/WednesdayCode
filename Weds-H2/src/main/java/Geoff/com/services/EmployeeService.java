package Geoff.com.services;

import Geoff.com.models.Employee;
import Geoff.com.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repo;

        public List<Employee> allRecords(){
        return repo.findAll();
    }

        public String deleteRecord(int empno){
        repo.deleteById(empno);
        return "Record Deleted Successfully";
        }

        public String saveRecord(Employee emprec){
        repo.save(emprec);
        return "New Record Saved";
        }

        public Employee showOneRecord(int empno){
            Optional<Employee>  emp = repo.findById(empno);
            return emp.orElse(null);
        }

        public List<Employee> getEmployeeByName(String na){
        return repo.findByName(na);
        }

        public List<Employee> getEmployeesByDept(String de){
        return repo.findByDept(de);
        }

        public String deleteEmployeeByName(String nam){
        repo.deleteByName(nam);
        return "Record Deleted Successfully";
        }
        public List<Employee> showRecords(){
        return repo.findAll();
    }

}
