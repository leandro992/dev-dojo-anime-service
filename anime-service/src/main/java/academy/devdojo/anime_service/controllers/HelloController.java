package academy.devdojo.anime_service.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RequestMapping("v1/animes")
@RestController
@Slf4j
public class HelloController {

    @GetMapping
    public String hi() {
        return "OMAE WA MOU SHINDE IRU";
    }

    @PostMapping
    public Long save(@RequestBody String name) {
        log.info("save '{}'", name);
        return ThreadLocalRandom.current().nextLong(1,1000);
    }

}
