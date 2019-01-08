package ru.questc.events.api.image;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import ru.progrm_jarvis.minecraft.commons.mapimage.MapImage;

/**
 * Called when the attempt is made to show the image to the player on his login.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PROTECTED)
public class PlayerLoginImageShowEvent extends PlayerEvent implements Cancellable {

    /**
     * Handler list of the event
     */
    @Getter private static HandlerList handlerList;

    /**
     * Image to be shown to the player
     */
    MapImage image;

    /**
     * Flag indicating whether the event is cancelled or not
     */
    boolean cancelled;

    /**
     * Constructs new event based on player specified.
     *
     * @param player player to whom the event is related
     * @param image image to be shown to the player
     */
    public PlayerLoginImageShowEvent(@NonNull final Player player, @NonNull final MapImage image) {
        super(player);

        this.image = image;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
