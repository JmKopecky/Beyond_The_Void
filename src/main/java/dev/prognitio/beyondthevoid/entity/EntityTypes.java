package dev.prognitio.beyondthevoid.entity;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.entity.custom.AncientKnight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_REGISTER = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BeyondTheVoid.MODID);

    public static final RegistryObject<EntityType<AncientKnight>> ANCIENT_KNIGHT = ENTITY_REGISTER.register("ancient_knight",
            () -> EntityType.Builder.of(AncientKnight::new, MobCategory.MONSTER).sized(2f, 3.75f)
                    .build(new ResourceLocation(BeyondTheVoid.MODID, "ancient_knight").toString()));


    //idea for a creature with a ranged attack

    //Idea for a magic caster

    //necromancer: summon other enemies to fight for it.
}
