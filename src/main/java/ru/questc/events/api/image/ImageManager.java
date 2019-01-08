package ru.questc.events.api.image;

import lombok.NonNull;
import ru.progrm_jarvis.minecraft.commons.annotation.BukkitService;
import ru.progrm_jarvis.minecraft.commons.mapimage.MapImage;

import javax.annotation.Nonnull;
import java.awt.image.BufferedImage;
import java.util.Collection;

/**
 * Manager responsible for managing map images related to event.
 */
@BukkitService
public interface ImageManager {

    /**
     * Registered the image to be shown to players on login.
     *
     * @param image image to register to be shown on players' logins
     *
     * @apiNote if there are multiple images registered then random one should be used on player's login
     */
    void registerLoginImage(@Nonnull MapImage image);

    /**
     * Registered the image to be shown to players on login.
     *
     * @param image image to register to be shown on players' logins
     * @return map image created for the specified image
     *
     * @apiNote if there are multiple images registered then random one should be used on player's login
     */
    MapImage registerLoginImage(@NonNull BufferedImage image);

    /**
     * uNRegistered the image shown to players on login.
     *
     * @param image image shown on players' logins to get unregistered
     *
     * @apiNote if the image is not registered no exceptions should be thrown
     */
    void unregistreLoginImage(@Nonnull MapImage image);

    /**
     * Gets all images shown to players on login.
     *
     * @return all images shown to players on login
     */
    Collection<MapImage> getLoginImages();
}
