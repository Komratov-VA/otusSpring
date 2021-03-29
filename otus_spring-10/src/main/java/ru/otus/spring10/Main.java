package ru.otus.spring10;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import ru.otus.spring10.domain.Email;
import ru.otus.spring10.domain.Person;
import ru.otus.spring10.repostory.EmailRepository;
import ru.otus.spring10.repostory.PersonRepository;

@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Autowired
    private PersonRepository repository;

    @Autowired
    private EmailRepository emailRepository;

    @PostConstruct
    public void init() {
        repository.save(new Person("Pushkin"));
        System.out.println(repository.findPersonByName("Pushkin"));
        emailRepository.save(new Email("sevka"));
        System.out.println(emailRepository.findAll(PageRequest.of(1,1)));
//        emailRepository.
    }
}
