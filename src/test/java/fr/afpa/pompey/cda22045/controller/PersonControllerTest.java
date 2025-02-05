package fr.afpa.pompey.cda22045.controller;

import fr.afpa.pompey.cda22045.controller.PersonController;
import fr.afpa.pompey.cda22045.model.Person;
import fr.afpa.pompey.cda22045.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.Optional;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

//    @MockBean
//    private PersonService personService;


    @Test
    public void getPersonsTest() throws Exception {
//        Person person1 = new Person();
//        person1.setId(1);
//        person1.setFirstname("John");
//        person1.setLastname("Doe");
//
//        Person person2 = new Person();
//        person2.setId(2);
//        person2.setFirstname("Jane");
//        person2.setLastname("Doe");
//
//        when(personService.getPersons()).thenReturn(Arrays.asList(person1, person2));
//
//        mockMvc.perform(get("/api/persons"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(content().json("[{\"id\":1,\"firstname\":\"John\",\"lastname\":\"Doe\"},{\"id\":2,\"firstname\":\"Jane\",\"lastname\":\"Doe\"}]"));
        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(MockMvcResultMatchers.content().string(containsString("john")));
        }
    }

//    @Test
//    public void testCreatePerson() throws Exception {
//        Person person = new Person();
//        person.setId(1);
//        person.setFirstname("John");
//        person.setLastname("Doe");
//
//        when(personService.savePerson(any(Person.class))).thenReturn(person);
//
//        mockMvc.perform(post("/api/person")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"firstname\":\"John\",\"lastname\":\"Doe\"}"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(content().json("{\"id\":1,\"firstname\":\"John\",\"lastname\":\"Doe\"}"));
//    }
//
//    @Test
//    public void testGetPersonById() throws Exception {
//        Person person = new Person();
//        person.setId(1);
//        person.setFirstname("John");
//        person.setLastname("Doe");
//
//        when(personService.getPerson(1)).thenReturn(Optional.of(person));
//
//        mockMvc.perform(get("/api/person/1"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(content().json("{\"id\":1,\"firstname\":\"John\",\"lastname\":\"Doe\"}"));
//    }
//
//    @Test
//    public void testUpdatePerson() throws Exception {
//        Person person = new Person();
//        person.setId(1);
//        person.setFirstname("Jane");
//        person.setLastname("Doe");
//
//        when(personService.getPerson(1)).thenReturn(Optional.of(person));
//        when(personService.savePerson(any(Person.class))).thenReturn(person);
//
//        mockMvc.perform(put("/api/person/1")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"firstname\":\"Jane\",\"lastname\":\"Doe\"}"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(content().json("{\"id\":1,\"firstname\":\"Jane\",\"lastname\":\"Doe\"}"));
//    }
//
//    @Test
//    public void testDeletePerson() throws Exception {
//        mockMvc.perform(delete("/api/person/1"))
//                .andExpect(status().isOk());
//    }

