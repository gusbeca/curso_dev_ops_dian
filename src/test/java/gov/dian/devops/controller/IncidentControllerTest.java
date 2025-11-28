package gov.dian.devops.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test unitario para /api/incident/ping
 */
@WebMvcTest(controllers = IncidentController.class)
public class IncidentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void pingReturnsPong() throws Exception {
        mockMvc.perform(get("/api/incident/ping"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.message", is("pong")));
    }
}
