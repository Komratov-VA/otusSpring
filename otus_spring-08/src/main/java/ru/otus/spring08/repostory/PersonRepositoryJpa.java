package ru.otus.spring08.repostory;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.otus.spring08.domain.Person;

@SuppressWarnings("JpaQlInspection")
@Repository
public class PersonRepositoryJpa implements PersonRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Person p) {
        em.persist(p);
    }

    @Override
    public Person getById(int id) {
        return em.find(Person.class, id);
    }

    @Override
    public Person getFirst() {
        TypedQuery<Person> query = em.createQuery(
            "select e from Person e where e.id =1", Person.class);
        return query.getSingleResult();
    }

    @Override
    public List<Person> getAll() {
        TypedQuery<Person> query = em.createQuery(
            "select e from Person e", Person.class);
        return query.getResultList();
    }

    @Override
    public Person getByName(String name) {
        TypedQuery<Person> query = em.createQuery(
            "select e from Person e where e.name =:name", Person.class);
        query.setParameter("name", name);
        return query.getSingleResult();
    }
}
//curl -u 'Komratov-VA' https://api.github.com/user/repos -d'{"name":"spring-framework-08"}'
//wget.exe -O NUL --auth-no-challenge --user=Komratov-VA --password=Seva2245296 "https://api.github.com/user/repos" --post-data='{"name":"spring-framework-08"}'