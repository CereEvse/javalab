package ru.evs.projects.Artifcatld.javabot.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.evs.projects.Artifcatld.javabot.model.Joke;
import ru.evs.projects.Artifcatld.javabot.service.JokeService;

import java.util.List;

@RestController
@RequestMapping("/api/jokes")
@RequiredArgsConstructor
public class top5 {

    private final JokeService jokeService;

    @GetMapping("/top5")
    public List<Joke> getTop5Jokes() {
        return jokeService.getTop5Jokes();
    }
}
