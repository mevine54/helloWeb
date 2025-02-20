//package fr.afpa.pompey.cda22045.controller;
//
//import fr.afpa.pompey.cda22045.controller.PersonController;
//import fr.afpa.pompey.cda22045.model.Person;
//import fr.afpa.pompey.cda22045.service.PersonService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
////import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.util.Arrays;
//import java.util.Optional;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class PersonControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//
//    @Test
//    public void getPersonsTest() throws Exception {
//
//        mockMvc.perform(get("/"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(view().name("home"))
//                .andExpect(MockMvcResultMatchers.content().string(containsString("Pennington")));
//        }
//    }
//
//
//
