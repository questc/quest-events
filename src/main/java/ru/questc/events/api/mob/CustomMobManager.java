package ru.questc.events.api.mob;

import org.bukkit.entity.EntityType;
import ru.progrm_jarvis.minecraft.commons.annotation.BukkitService;

/**
 * Manager to handle custom mobs.
 */
@BukkitService
public interface CustomMobManager {

    /**
     * Registers a replacement for the mob on its spawn.
     *
     * @param type type of mob to be replaced on spawn
     * @param replacer replacer to be used with the entity being spawned
     * @param <E> type of entity being replaced
     *
     * @apiNote this should be compatible with
     * {@link #registerMobSpawnReplacement(EntityType, SpawnedMobEquivalentReplacer, float)}
     * being used whenever no chanced spawn replacement was found
     */
    <E extends EntityType> void registerMobSpawnReplacement(E type, SpawnedMobEquivalentReplacer<? extends E> replacer);

    /**
     * Registers a replacement for the mob on its spawn with specified chance.
     *
     * @param type type of mob to be replaced on spawn
     * @param replacer replacer to be used with the entity being spawned
     * @param chance value between {@code 0.0} and {@code 1.0}, the higher it is the bigger the chance of replacement is
     * @param <E> type of entity being replaced
     *
     * @apiNote this should be compatible with
     */
    <E extends EntityType> void registerMobSpawnReplacement(E type, SpawnedMobEquivalentReplacer<? extends E> replacer,
                                                            float chance);
}
