package pl.zbijowski.games.gamespec.entity.dto;

import java.util.Set;
import java.util.UUID;

public record SpecificValuesAttribute(UUID id,
                                      String name,
                                      String description,
                                      boolean shared,
                                      Set<String> allowedValues)
        implements Attribute
{

}
