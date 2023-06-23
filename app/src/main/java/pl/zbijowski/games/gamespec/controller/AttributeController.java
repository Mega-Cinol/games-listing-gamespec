package pl.zbijowski.games.gamespec.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("games/gamespec/games/{gameId}/attributes")
public class AttributeController
{
    @GetMapping
    void listAttributes()
    {

    }

    @GetMapping ("{id}")
    void getAttribute()
    {

    }

    @PostMapping ("text")
    void createTextAttribute()
    {

    }

    @PostMapping ("numeric")
    void createNumericAttribute()
    {

    }

    @PostMapping ("enum")
    void createSpecificValuesAttribute()
    {

    }

    @PostMapping ("composed")
    void createComposedAttribute()
    {

    }

    @PutMapping ("text")
    void updateTextAttribute()
    {

    }

    @PutMapping ("numeric")
    void updateNumericAttribute()
    {

    }

    @PutMapping ("enum")
    void updateSpecificValuesAttribute()
    {

    }

    @PutMapping ("composed")
    void updateComposedAttribute()
    {

    }

    @DeleteMapping
    void deleteAttribute()
    {

    }
}
