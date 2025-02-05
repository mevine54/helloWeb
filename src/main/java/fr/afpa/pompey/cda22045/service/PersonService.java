package fr.afpa.pompey.cda22045.service;


import fr.afpa.pompey.cda22045.model.Person;
import fr.afpa.pompey.cda22045.repository.PersonRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Data
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person getPerson(Integer id) {
        return personRepository.getPerson(id);
    }

    public Iterable<Person> getPersons() {
        return personRepository.getPersons();
    }

    public void deletePerson(final Integer id) {
        personRepository.deletePerson(id);
    }

    public Person savePerson( Person person) {
        Person saved;
        person.setLastname(person.getLastname().toUpperCase());

        if(person.getId() == null) {
            saved = personRepository.createPerson(person);
        } else {
            saved = personRepository.updatePerson(person);
        }
        return saved;
    }


}
