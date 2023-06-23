package pl.zbijowski.games.gamespec.entity.dto;

import java.util.UUID;

public record NumericAttribute(UUID id,
                               String name,
                               String description,
                               boolean shared,
                               Integer minValue,
                               Integer maxValue,
                               String displayPattern)
        implements Attribute
{

}
