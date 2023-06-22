package pl.zbijowski.games.gamespec.entity.dto;

import java.util.Set;
import java.util.UUID;

public record ComposedAttribute(UUID id, String name, String description, Set<Attribute> attributes) implements Attribute
{

}
