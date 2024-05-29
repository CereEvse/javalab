package ru.evs.projects.Artifcatld.javabot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.evs.projects.Artifcatld.javabot.model.Joke;

import java.util.List;
import java.util.Optional;

public interface JokeService {
    void registerJoke(Joke joke);
    List<Joke> getAllJokes();
    Optional<Joke> getJokeById(Long id);
    boolean deleteJokeById(Long id);
    void updateJoke(Joke joke);
    Joke getRandomJoke();

    // Методы, принимающие Pageable
    Page<Joke> getJokes(Pageable pageable);
    Page<Joke> getTopJokes(Pageable pageable);
}
