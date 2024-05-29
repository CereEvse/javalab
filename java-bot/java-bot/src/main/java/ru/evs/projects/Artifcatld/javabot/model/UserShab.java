package ru.evs.projects.Artifcatld.javabot.model;

import ru.evs.projects.Artifcatld.javabot.model.UserRole;
import lombok.Value;

import java.io.Serializable;
import java.util.Set;

@Value
public class UserShab implements Serializable {

    Long id;
    String username;
    boolean enabled;
    Set<UserRole> roles;

}
