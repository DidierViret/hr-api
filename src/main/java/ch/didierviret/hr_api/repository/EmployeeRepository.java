package ch.didierviret.hr_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ch.didierviret.hr_api.model.Employee;

/* @Repository Indique que la classe est un bean qui sert à communiquer avec une source de données.
 *             Cette annotation est en fait une spécialisation de l'annotation @Component.
 * CrudRepository est une interface fournie par Spring.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
