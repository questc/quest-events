package ru.questc.events.api.mob;

import org.bukkit.entity.EntityType;

import java.util.function.Consumer;

/**
 * A function normally used to handle mob spawn in order to replace Minecraft's mob with a custom equivalent.
 *
 * @param <E> type of entity replaced
 */
@FunctionalInterface
public interface SpawnedMobEquivalentReplacer<E extends EntityType> extends Consumer<E> {

    /**
     * Replaces the entity spawned with a custom one.
     *
     * @param entity entity being spawned
     */
    @Override
    void accept(E entity);
}
