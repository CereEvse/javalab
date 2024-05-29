package ru.evs.projects.Artifcatld.javabot.model;

import lombok.Value;

import java.io.Serializable;

@Value
public class UserRegistrationShab implements Serializable {

    Long id;
    String username;
    String password;

}
