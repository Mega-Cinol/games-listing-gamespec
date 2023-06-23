package pl.zbijowski.games.gamespec.entity.dto;

import java.util.Set;
import java.util.UUID;

public record Entity(UUID id,
                     String name,
                     String description,
                     Set<Attribute> attributes,
                     Set<Entity> entities)
{

}
