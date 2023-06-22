package pl.zbijowski.games.gamespec.entity.dto;

import java.util.UUID;

public record TextAttribute(UUID id, String name, String description) implements Attribute
{

}
