package ch.didierviret.hr_api.accessingdatamysql;


import org.springframework.data.repository.CrudRepository;
import ch.didierviret.hr_api.accessingdatamysql.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@SuppressWarnings("unused")
public interface UserRepository extends CrudRepository<User, Integer> {

}
