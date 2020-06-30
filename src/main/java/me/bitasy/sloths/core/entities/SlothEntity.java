package me.bitasy.sloths.core.entities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.controller.JumpController;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

// https://forums.minecraftforge.net/topic/75549-how-create-a-custom-mob-entity-in-114-and-above/
public class SlothEntity extends AnimalEntity {

    protected SlothEntity(EntityType<? extends AnimalEntity> type, World world) {
        super(type, world);
        jumpController = new JumpController(this); // todo extend
        moveController = new MovementController(this); // todo extend
    }


    @Nullable
    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return null;
    }
}
