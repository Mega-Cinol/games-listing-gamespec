package pl.zbijowski.games.gamespec.entity.dto;

import java.util.List;
import java.util.UUID;

public record ComposedAttribute(UUID id,
                                String name,
                                String description,
                                boolean shared,
                                List<Attribute> attributes)
        implements Attribute
{

}
