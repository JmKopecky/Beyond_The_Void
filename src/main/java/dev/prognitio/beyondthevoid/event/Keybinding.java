package dev.prognitio.beyondthevoid.event;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class Keybinding {

    public static final String KEY_FIRE_ABILITY = "key.beyondthevoid.fire_ability_key";
    public static final String MOD_KEY_CATEGORY = "key.category.beyondthevoid.beyondthevoid";

    public static final KeyMapping FIRE_ABILITY_KEY = new KeyMapping(KEY_FIRE_ABILITY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_V, MOD_KEY_CATEGORY);
}
