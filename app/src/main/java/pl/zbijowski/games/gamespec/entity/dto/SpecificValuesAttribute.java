package pl.zbijowski.games.gamespec.entity.dto;

import java.util.List;
import java.util.UUID;

public record SpecificValuesAttribute(UUID id,
                                      String name,
                                      String description,
                                      boolean shared,
                                      List<String> allowedValues)
        implements Attribute
{

}
