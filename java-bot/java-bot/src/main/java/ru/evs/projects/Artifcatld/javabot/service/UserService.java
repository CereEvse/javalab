package ru.evs.projects.Artifcatld.javabot.service;

import org.springframework.data.domain.Page;
import ru.evs.projects.Artifcatld.javabot.model.User;
import ru.evs.projects.Artifcatld.javabot.model.UserRegistrationShab;
import ru.evs.projects.Artifcatld.javabot.model.UserRole;
import ru.evs.projects.Artifcatld.javabot.model.UserShab;

import java.util.List;

public interface UserService {

    Page<User> getAllUsers(int page);
    List<UserRole> getAllRoles();
    UserShab registerUser(UserRegistrationShab shab);
    UserShab grantRole(Long userId, Long roleId);
    UserShab revokeRole(Long userId, Long roleId);
    void deleteUser(Long userId);

}
