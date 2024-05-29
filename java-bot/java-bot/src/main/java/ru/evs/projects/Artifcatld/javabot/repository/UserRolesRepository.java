package ru.evs.projects.Artifcatld.javabot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.evs.projects.Artifcatld.javabot.model.UserRole;

import java.util.Optional;

public interface UserRolesRepository extends JpaRepository<UserRole, Long> {
    Optional<UserRole> findByAuthority(String role);
}
