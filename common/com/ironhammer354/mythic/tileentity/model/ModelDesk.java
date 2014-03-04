package com.ironhammer354.mythic.tileentity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDesk extends ModelBase {
    //fields
    ModelRenderer Top;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;

    public ModelDesk() {
        textureWidth = 128;
        textureHeight = 64;

        Top = new ModelRenderer(this, 0, 0);
        Top.addBox(0F, 0F, 0F, 16, 4, 32);
        Top.setRotationPoint(-8F, 4F, -8F);
        Top.setTextureSize(128, 64);
        Top.mirror = true;
        setRotation(Top, 0F, 0F, 0F);
        Leg1 = new ModelRenderer(this, 0, 40);
        Leg1.addBox(0F, 0F, 0F, 4, 16, 4);
        Leg1.setRotationPoint(4F, 8F, -8F);
        Leg1.setTextureSize(128, 64);
        Leg1.mirror = true;
        setRotation(Leg1, 0F, 0F, 0F);
        Leg2 = new ModelRenderer(this, 0, 40);
        Leg2.addBox(0F, 0F, 0F, 4, 16, 4);
        Leg2.setRotationPoint(-8F, 8F, -8F);
        Leg2.setTextureSize(128, 64);
        Leg2.mirror = true;
        setRotation(Leg2, 0F, 0F, 0F);
        Leg3 = new ModelRenderer(this, 0, 40);
        Leg3.addBox(0F, 0F, 0F, 4, 16, 4);
        Leg3.setRotationPoint(4F, 8F, 20F);
        Leg3.setTextureSize(128, 64);
        Leg3.mirror = true;
        setRotation(Leg3, 0F, 0F, 0F);
        Leg4 = new ModelRenderer(this, 0, 40);
        Leg4.addBox(0F, 0F, 0F, 4, 16, 4);
        Leg4.setRotationPoint(-8F, 8F, 20F);
        Leg4.setTextureSize(128, 64);
        Leg4.mirror = true;
        setRotation(Leg4, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Top.render(f5);
        Leg1.render(f5);
        Leg2.render(f5);
        Leg3.render(f5);
        Leg4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    }

}