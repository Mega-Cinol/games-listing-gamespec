package pl.zbijowski.games.gamespec.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("games/gamespec/games")
public class GameController
{
    @GetMapping ("{id}")
    void getGame(@PathVariable UUID id)
    {
    }

    @GetMapping
    void listGames()
    {
    }

    @PostMapping
    void crateGame()
    {

    }

    @PutMapping
    void updateGame()
    {

    }

    @PutMapping ("publish")
    void publishGame()
    {

    }

    @DeleteMapping
    void deleteGame()
    {

    }
}
