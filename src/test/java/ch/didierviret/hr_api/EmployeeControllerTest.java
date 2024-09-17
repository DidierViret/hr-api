package ch.didierviret.hr_api;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import ch.didierviret.hr_api.controller.EmployeeController;
import ch.didierviret.hr_api.service.EmployeeService;

/* @WebMvcTest déclenche le mécanisme permettant de tester les controllers */
@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    /* MockMvc permet de simuler des requêtes HTTP avec la méthode "perform" */
    private MockMvc mockMvc;

    /* @MockBean permet de charger un bean qui est nécessaire pour l'exécution de la méthode
     *           qui sera appelée.
     */
    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
            .andExpect(status().isOk());
    }

}
