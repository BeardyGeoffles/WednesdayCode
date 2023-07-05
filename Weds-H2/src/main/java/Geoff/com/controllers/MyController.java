package Geoff.com.controllers;

import Geoff.com.models.Employee;
import Geoff.com.services.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    EmployeeService empservice;

    @DeleteMapping("/delete/{empno}")
    public String deleteRecord(@PathVariable("empno")int num){
        return empservice.deleteRecord(num);
    }

    @GetMapping("/show/{num}")
    public Employee showRecord(@PathVariable("num")int empno){
        return empservice.showOneRecord(empno);
    }
    @PostMapping("/add")
    public String saveRecord(@RequestBody Employee emp){
        return empservice.saveRecord(emp);
    }

    @GetMapping("/showAll")
    public List<Employee> showAll(){
        List<Employee> ref=empservice.allRecords();
        return ref;
    }

    @GetMapping("employeeWithName/{name}")
    public List<Employee> getEmployeeByName(@PathVariable("name")String na){
        return empservice.getEmployeeByName(na);
    }

    @GetMapping("dsearch/{dept}")
    public List<Employee> getEmployeesByDept(@PathVariable("dept")String de){
        return empservice.getEmployeesByDept(de);
    }
    @DeleteMapping("del/{name}")
    public String deleteEmployeeByName(@PathVariable("name") String nam){
        return empservice.deleteEmployeeByName(nam);
    }
}
