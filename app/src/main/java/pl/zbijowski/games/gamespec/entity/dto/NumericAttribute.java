package pl.zbijowski.games.gamespec.entity.dto;

import java.util.UUID;

public record NumericAttribute(UUID id,
                               String name,
                               String description,
                               boolean shared,
                               String displayPattern,
                               String nullPattern,
                               Integer minValue,
                               Integer maxValue)
        implements Attribute
{

}
