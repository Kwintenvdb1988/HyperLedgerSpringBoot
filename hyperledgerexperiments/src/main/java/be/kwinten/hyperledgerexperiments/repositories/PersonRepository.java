package be.kwinten.hyperledgerexperiments.repositories;

import be.kwinten.hyperledgerexperiments.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
