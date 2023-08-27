package dev.prognitio.beyondthevoid.entity;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.entity.custom.AncientKnight;
import dev.prognitio.beyondthevoid.entity.projectile.TeleportationProjectile;
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

    //public static final RegistryObject<EntityType<SpellProjectile>> SPELL_PROJECTILE = ENTITY_REGISTER.register("spell_projectile",
    //            () -> EntityType.Builder.of((EntityType.EntityFactory<SpellProjectile>) SpellProjectile::new, MobCategory.MISC).sized(0.5F, 0.5F).build("spell_projectile"));

    public static final RegistryObject<EntityType<TeleportationProjectile>> TELEPORTATION_PROJECTILE = ENTITY_REGISTER.register("teleportation_projectile",
            () -> EntityType.Builder.of((EntityType.EntityFactory<TeleportationProjectile>) TeleportationProjectile::new,
                    MobCategory.MISC).sized(0.5F, 0.5F).build("teleportation_projectile"));
    //idea for a creature with a ranged attack

    //Idea for a magic caster

    //necromancer: summon other enemies to fight for it.
}
