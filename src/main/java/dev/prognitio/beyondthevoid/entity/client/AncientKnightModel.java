package dev.prognitio.beyondthevoid.entity.client;

import dev.prognitio.beyondthevoid.BeyondTheVoid;
import dev.prognitio.beyondthevoid.entity.custom.AncientKnight;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AncientKnightModel extends AnimatedGeoModel<AncientKnight> {

    @Override
    public ResourceLocation getModelResource(AncientKnight object) {
        return new ResourceLocation(BeyondTheVoid.MODID, "geo/ancient_knight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AncientKnight object) {
        return new ResourceLocation(BeyondTheVoid.MODID, "textures/entity/ancient_knight_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AncientKnight animatable) {
        return new ResourceLocation(BeyondTheVoid.MODID, "animations/ancient_knight.animation.json");
    }
}
