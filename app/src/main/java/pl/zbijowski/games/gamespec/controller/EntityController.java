package pl.zbijowski.games.gamespec.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("games/gamespec/games/{gameId}/entities")
public class EntityController
{
    @GetMapping
    void listEntities()
    {

    }

    @GetMapping ("{id}")
    void getEntity()
    {

    }

    @PostMapping
    void createEntity()
    {

    }

    @PutMapping
    void updateEntity()
    {

    }

    @PutMapping ("linkAttr/{id}")
    void linkAttribute()
    {

    }

    @PutMapping ("unlinkAttr/{id}")
    void unlinkAttribute()
    {

    }

    @PutMapping ("linkEntity/{id}")
    void linkEntity()
    {

    }

    @PutMapping ("unlinkEntity/{id}")
    void unlinkEntity()
    {

    }

    @DeleteMapping
    void deleteEntity()
    {

    }
}
