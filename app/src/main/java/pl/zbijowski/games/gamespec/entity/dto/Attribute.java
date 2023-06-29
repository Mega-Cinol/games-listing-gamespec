package pl.zbijowski.games.gamespec.entity.dto;

import java.util.UUID;

public interface Attribute
{
    UUID id();

    String name();

    String description();

    boolean shared();

    String displayPattern();

    String nullPattern();
}
