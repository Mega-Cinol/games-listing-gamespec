package pl.zbijowski.games.gamespec.entity.db;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("text")
public class TextAttribute extends Attribute
{

}
