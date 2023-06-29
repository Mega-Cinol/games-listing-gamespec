package pl.zbijowski.games.gamespec.entity.dto;

import java.util.UUID;

public record TextAttribute(UUID id,
                            String name,
                            String description,
                            boolean shared,
                            String displayPattern,
                            String nullPattern)
        implements Attribute
{

}
