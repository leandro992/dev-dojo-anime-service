package academy.devdojo.anime_service.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/animes")
public class Exercicio01 {
        private static final List<String> HEROES = List.of("Guts", "Zoro", "Goku");

    @GetMapping("/v1/animes")
    List<String> listAnime(){
        return List.of("Dragon Ball", "Naruto", "Attack on titan");
    }


    @GetMapping("/v1/heroes/filter")
    List<String> listHeroes(@RequestParam String name){
        return HEROES;
    }



}
