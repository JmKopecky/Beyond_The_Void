package dev.prognitio.beyondthevoid.entity.projectile;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import dev.prognitio.beyondthevoid.BeyondTheVoid;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

public class TeleportationProjectileRenderer extends ArrowRenderer<TeleportationProjectile> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(BeyondTheVoid.MODID, "textures/entity/teleportation_projectile.png");


    public TeleportationProjectileRenderer(EntityRendererProvider.Context manager) {
        super(manager);
        RenderSystem.setShaderColor(0, 0.5F, 1, 1);
    }

    @Override
    public ResourceLocation getTextureLocation(TeleportationProjectile p_114482_) {
        return TEXTURE;
    }


    @Override
    public void render(TeleportationProjectile pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        RenderSystem.setShaderColor(0, 0.5F, 1, 1);
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        if (pEntity.getLevel().isClientSide) {
            //pEntity.getLevel().addParticle(ModParticles.SPELL_TRAIL_PARTICLE.get(), pEntity.getX(), pEntity.getY(), pEntity.getZ(), 0, 0, 0);
            Random random = new Random();
            Vec3 entityVector = pEntity.getDeltaMovement();
            for (int i = 0; i < 10; i++) {
                double xDir = random.nextDouble(-1, 1)*10;
                double yDir = random.nextDouble(-1, 1)*10;
                double zDir = random.nextDouble(-1, 1)*10;
                //pEntity.getLevel().addParticle(ModParticles.SPELL_PROJECTILE_PARTICLE.get(), pEntity.getX(), pEntity.getY(), pEntity.getZ(), xDir+entityVector.x, yDir+entityVector.y, zDir+entityVector.z);
            }
        } else {
            System.out.println("ERROR: Tried to render projectile while not on client side. How?????");
        }
    }
}
