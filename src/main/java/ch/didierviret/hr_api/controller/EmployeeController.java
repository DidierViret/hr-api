package ch.didierviret.hr_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.didierviret.hr_api.model.Employee;
import ch.didierviret.hr_api.service.EmployeeService;

/* @RestController Indique que la classe est un bean.
 *                 Indique à Spring d'insérer le retour de la méthode au format JSON dans
 *                 le corps de la réponse HTTP.
 */
@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private Environment environment;

    /**
     * Read - Get all employees
     * @return - An Iterable object of Employees full filled
     */
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    /**
     * Return some text informations to show that the application is running
     * and to see the value of some environment variables.
     * 
     * @return - A String
     */
    @GetMapping("/")
    public String getHello() {
        return "Hello World >> " + environment.getProperty("name") + " >> " + environment.getProperty("JAVA_HOME") + 
            " >> " + environment.getProperty("spring.profiles.active") + "<br>" + environment.getProperty("spring.datasource.url");
    }
}
