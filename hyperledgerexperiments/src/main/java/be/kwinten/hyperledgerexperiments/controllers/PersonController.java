package be.kwinten.hyperledgerexperiments.controllers;

import be.kwinten.hyperledgerexperiments.entities.Person;
import be.kwinten.hyperledgerexperiments.repositories.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/person")
    public List<Person> getEveryone(){
        return personRepository.findAll();
    }

    @PostMapping("/person")
    public void safeNewPerson (@RequestBody Person person){
        System.out.println("posting new person "  +  person);
        personRepository.save(person);
    }
}