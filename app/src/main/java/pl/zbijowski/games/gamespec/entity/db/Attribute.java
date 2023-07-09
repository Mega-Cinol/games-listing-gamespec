package pl.zbijowski.games.gamespec.entity.db;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity (name = "attributes")
@Inheritance
@Data
@EqualsAndHashCode (callSuper = true)
@DiscriminatorColumn (discriminatorType = DiscriminatorType.STRING, name = "type")
public class Attribute extends BaseEntity
{
    private boolean shared;

    @Column (name = "display_pattern")
    private String displayPattern;

    @Column (name = "null_pattern")
    private String nullPattern;
}
