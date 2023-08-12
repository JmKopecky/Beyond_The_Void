package dev.prognitio.beyondthevoid.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.entity.custom.AncientKnight;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AncientKnightRenderer extends GeoEntityRenderer<AncientKnight> {

    public AncientKnightRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AncientKnightModel());
        this.shadowRadius = 1.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(AncientKnight animatable) {
        return new ResourceLocation(BeyondTheVoid.MODID, "textures/entity/ancient_knight_texture.png");
    }

    @Override
    public RenderType getRenderType(AncientKnight animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer,
                                    int packedLight, ResourceLocation texture) {

        poseStack.scale(1.5f, 1.5f, 1.5f);

        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
