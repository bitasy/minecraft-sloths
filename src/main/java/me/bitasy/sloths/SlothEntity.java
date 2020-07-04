package me.bitasy.sloths;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.JumpController;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

// https://forums.minecraftforge.net/topic/75549-how-create-a-custom-mob-entity-in-114-and-above/
public class SlothEntity extends AnimalEntity {
    @ObjectHolder(Sloths.MOD_ID + ":sloths")
    public static final EntityType<SlothEntity> sloth = null;

    public SlothEntity(EntityType<? extends SlothEntity> type, World world) {
        super(type, world);
        jumpController = new JumpController(this); // todo extend
        moveController = new MovementController(this); // todo extend
    }


    public SlothEntity createChild(AgeableEntity ageable) {
        return sloth.create(world);
    }

    public static AttributeModifierMap.MutableAttribute func_234215_eI_() {
        //set health to 10 and speed to 0.1
        return MobEntity.func_233666_p_().func_233815_a_(Attributes.field_233818_a_, 10.0D)
                .func_233815_a_(Attributes.field_233821_d_, 0.1D);
    }
}
