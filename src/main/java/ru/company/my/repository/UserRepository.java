package ru.company.my.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.company.my.model.User;

/**
 * Created by igor on 14.12.16.
 */
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {
}
