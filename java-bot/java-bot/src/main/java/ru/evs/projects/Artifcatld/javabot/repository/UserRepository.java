package ru.evs.projects.Artifcatld.javabot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.evs.projects.Artifcatld.javabot.model.User;

import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository<User, Long>, JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
