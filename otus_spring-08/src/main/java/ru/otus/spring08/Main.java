package ru.otus.spring08;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.otus.spring08.repostory.PersonRepository;
import ru.otus.spring08.domain.Person;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = SpringApplication.run(Main.class);
        PersonRepository repository = context.getBean(PersonRepository.class);
        Person person = new Person("sevok");
        Person person2 = new Person("sevok2");
        repository.insert(person);
        repository.insert(person2);
        Person nullPerson = repository.getById(1);

        System.out.println(nullPerson.getName());
        System.out.println(repository.getAll().size());
        System.out.println(repository.getByName("sevok2"));
        Console.main(args);
    }
}
