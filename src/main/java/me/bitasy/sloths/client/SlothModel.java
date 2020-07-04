package me.bitasy.sloths.client;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import me.bitasy.sloths.SlothEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * SlothModel - Bitasy
 * Created using Tabula 8.0.0
 */

@OnlyIn(Dist.CLIENT)
public class SlothModel<T extends SlothEntity> extends EntityModel<T> {
    public ModelRenderer leg_1;
    public ModelRenderer nose;
    public ModelRenderer head;
    public ModelRenderer leg_2;
    public ModelRenderer leg_3;
    public ModelRenderer leg_4;

    public SlothModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.nose = new ModelRenderer(this, 28, 8);
        this.nose.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.nose.addBox(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(nose, 1.5707963267948966F, 0.0F, 0.0F);
        this.leg_4 = new ModelRenderer(this, 0, 16);
        this.leg_4.setRotationPoint(-3.0F, 14.0F, 6.0F);
        this.leg_4.addBox(-1.0F, 0.0F, -1.0F, 3.0F, 10.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.leg_4.addBox(0.25F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_4.addBox(1.25F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_4.addBox(-0.75F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_1 = new ModelRenderer(this, 0, 16);
        this.leg_1.setRotationPoint(3.0F, 14.0F, 6.0F);
        this.leg_1.addBox(-1.0F, 0.0F, -1.0F, 3.0F, 10.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.leg_1.addBox(0.25F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_1.addBox(1.25F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_1.addBox(-0.75F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_3 = new ModelRenderer(this, 0, 16);
        this.leg_3.setRotationPoint(-3.0F, 14.0F, -5.0F);
        this.leg_3.addBox(-1.0F, 0.0F, -1.0F, 3.0F, 10.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.leg_3.addBox(0.25F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_3.addBox(1.25F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_3.addBox(-0.75F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 10.0F, -6.0F);
        this.head.addBox(-3.0F, -2.0F, -7.5F, 6.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.head.setTextureOffset(16, 16).addBox(-0.75F, 0.5F, -8.0F, 1.5F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_2 = new ModelRenderer(this, 0, 16);
        this.leg_2.setRotationPoint(3.0F, 14.0F, -5.0F);
        this.leg_2.addBox(-1.0F, 0.0F, -1.0F, 3.0F, 10.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.leg_2.addBox(0.25F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_2.addBox(1.25F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
        this.leg_2.addBox(-0.75F, 10.0F, -0.5F, 0.5F, 2.0F, 0.5F, 0.0F, 0.0F, 0.0F);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.nose, this.leg_4, this.leg_1, this.leg_3, this.head, this.leg_2).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
