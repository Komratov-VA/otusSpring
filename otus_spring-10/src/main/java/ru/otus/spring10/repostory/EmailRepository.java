package ru.otus.spring10.repostory;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.otus.spring10.domain.Email;

public interface EmailRepository extends PagingAndSortingRepository<Email, Integer> {

}
