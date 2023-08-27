package dev.prognitio.beyondthevoid.entity.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

public class TeleportationProjectile extends AbstractArrow {
    private int life;
    public TeleportationProjectile(EntityType<? extends AbstractArrow> p_36721_, Level p_36722_) {
        super(p_36721_, p_36722_);
    }

    public TeleportationProjectile(EntityType<? extends AbstractArrow> p_36711_, double p_36712_, double p_36713_, double p_36714_, Level p_36715_) {
        super(p_36711_, p_36712_, p_36713_, p_36714_, p_36715_);
    }

    public TeleportationProjectile(EntityType<? extends AbstractArrow> p_36717_, LivingEntity p_36718_, Level p_36719_) {
        super(p_36717_, p_36718_, p_36719_);
        life = 0;
    }

    @Override
    protected ItemStack getPickupItem() {
        return null;
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }

    @Override
    public void tick() {
        super.tick();
        life++;
        if (life > 100) {
            this.discard();
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult hitResult) {
        //level.sendParticles()
        //teleport entity to hit entity
        Vec3 target = hitResult.getEntity().position();
        if (this.getOwner() != null) {
            this.getOwner().teleportTo(target.x, target.y, target.z);
        }
        this.discard();
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        //level.sendParticles()
        //teleport entity to hit block
        Vec3 target = blockHitResult.getLocation();
        if (this.getOwner() != null) {
            this.getOwner().teleportTo(target.x, target.y, target.z);
        }
        this.discard();
    }
}
