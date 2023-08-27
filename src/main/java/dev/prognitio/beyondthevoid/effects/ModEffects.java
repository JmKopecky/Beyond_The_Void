package dev.prognitio.beyondthevoid.effects;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.UUID;

public class ModEffects {



    static String bladeProjectionEffectUUID = "1dd21bbf-12d1-48da-9b0b-81237368f844";
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BeyondTheVoid.MODID);

    public static final RegistryObject<MobEffect> ABILITY_CHARGING_EFFECT = EFFECTS.register("ability_charging",
            () -> new AbilityChargingEffect(MobEffectCategory.NEUTRAL, 3124687));
    public static final RegistryObject<MobEffect> BLADE_PROJECTION_EFFECT = EFFECTS.register("blade_projection",
            () -> new BladeProjectionEffect(MobEffectCategory.BENEFICIAL, 3124687).addAttributeModifier(ForgeMod.ATTACK_RANGE.get()
            , bladeProjectionEffectUUID, 0.5, AttributeModifier.Operation.ADDITION));

    //public static final RegistryObject<MobEffect> HyperGravity = EFFECT.register("hypergravity", () ->
    // new HyperGravityEffect(MobEffectCategory.NEUTRAL, 3124687).addAttributeModifier(ForgeMod.ENTITY_GRAVITY.get(),
    // hypergravityUUID, 0.1 , AttributeModifier.Operation.MULTIPLY_TOTAL));
}
