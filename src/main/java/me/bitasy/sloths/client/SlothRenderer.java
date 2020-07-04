package me.bitasy.sloths.client;

import me.bitasy.sloths.SlothEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SlothRenderer extends MobRenderer<SlothEntity, SlothModel<SlothEntity>> {
    private static final ResourceLocation SKIN = new ResourceLocation("sloths:textures/sloth_texture.png");

    public SlothRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SlothModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(SlothEntity entity) {
        return SKIN;
    }
}
