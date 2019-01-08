package ru.questc.events.api.mob;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.bukkit.entity.Entity;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;

/**
 * Called when an entity spawned in the world is being replaced using the replacer.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PROTECTED)
public class CustomEntityReplacementEvent extends EntityEvent {

    /**
     * Handler list of the event
     */
    @Getter private static HandlerList handlerList;

    /**
     * Replacer being used on the entity
     */
    SpawnedMobEquivalentReplacer<?> replacer;

    /**
     * Constructs new event based on entity specified.
     *
     * @param entity entity to whom the event is related
     * @param replacer replacer being used on the entity
     */
    public CustomEntityReplacementEvent(@NonNull final Entity entity,
                                        @NonNull final SpawnedMobEquivalentReplacer<?> replacer) {
        super(entity);

        this.replacer = replacer;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
