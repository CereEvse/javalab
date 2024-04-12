package ru.evs.projects.Artifcatld.javabot.service;

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
}