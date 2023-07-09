package pl.zbijowski.games.gamespec.entity.db;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class BaseEntity
{
    @Id
    @GeneratedValue
    private long id;

    private UUID identifier;

    @Column(name = "date_created")
    private OffsetDateTime dateCreated;

    @Column(name = "date_updated")
    private OffsetDateTime dateUpdated;

    private String name;

    private String description;
}
