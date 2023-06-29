package pl.zbijowski.games.gamespec.entity.dto;

import java.util.List;
import java.util.UUID;

public record Entity(UUID id,
                     String name,
                     String description,
                     List<Attribute> attributes,
                     List<Entity> entities)
{

}
