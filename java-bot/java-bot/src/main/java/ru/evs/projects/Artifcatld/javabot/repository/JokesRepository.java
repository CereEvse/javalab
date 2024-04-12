package ru.evs.projects.Artifcatld.javabot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.evs.projects.Artifcatld.javabot.model.Joke;

public interface JokesRepository extends JpaRepository<Joke, Long> {
}
