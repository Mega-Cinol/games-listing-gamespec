package pl.zbijowski.games.gamespec.entity.dto;

import java.util.Set;
import java.util.UUID;

public record Game(UUID id, String name, String description, Set<Entity> entities)
{

}
