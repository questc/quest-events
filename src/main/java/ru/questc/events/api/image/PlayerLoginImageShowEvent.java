package ru.questc.events.api.image;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import ru.progrm_jarvis.minecraft.commons.mapimage.MapImage;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PROTECTED)
public class PlayerLoginImageShowEvent extends PlayerEvent {

    /**
     * Handler list of the event
     */
    @Getter private static HandlerList handlerList;

    /**
     * Image shown to player
     */
    MapImage image;

    /**
     * Constructs new event based on player specified.
     *
     * @param who player to whom the event is related
     */
    public PlayerLoginImageShowEvent(final Player who) {
        super(who);
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
