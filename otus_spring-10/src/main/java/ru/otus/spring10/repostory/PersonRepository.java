package ru.otus.spring10.repostory;

import org.springframework.data.repository.CrudRepository;
import ru.otus.spring10.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findPersonByName(String name);

}
