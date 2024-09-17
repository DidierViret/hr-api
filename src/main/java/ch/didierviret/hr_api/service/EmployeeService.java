package ch.didierviret.hr_api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.didierviret.hr_api.model.Employee;
import ch.didierviret.hr_api.repository.EmployeeRepository;
import lombok.Data;

/* @Data de la librairie Lombok fourni automatiquement les getters et setters */
@Data

/* @Service Indique que la classe est un bean qui sert au traitement métier et qui fait
 *          un pont entre le controller et le repository.
 *          Cette annotation est en fait une spécialisation de l'annotation @Component.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }
}
