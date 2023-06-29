package pl.zbijowski.games.gamespec.entity.dto;

import java.util.List;
import java.util.UUID;

public record Game(UUID id,
                   String name,
                   String description,
                   List<Entity> entities)
{

}
