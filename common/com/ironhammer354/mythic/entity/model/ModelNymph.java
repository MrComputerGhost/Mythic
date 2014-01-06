package com.ironhammer354.mythic.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNymph extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer leftwing;
    ModelRenderer rightwing;
  
  public ModelNymph()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-2F, -4F, -2F, 4, 4, 4);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-2F, 0F, -1F, 4, 6, 2);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-1.5F, -1F, -1F, 2, 6, 2);
      rightarm.setRotationPoint(-2.5F, 1F, 0F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-0.5F, -1F, -1F, 2, 6, 2);
      leftarm.setRotationPoint(2.5F, 1F, 0F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-1F, 0F, -1F, 2, 6, 2);
      rightleg.setRotationPoint(-1F, 6F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-1F, 0F, -1F, 2, 6, 2);
      leftleg.setRotationPoint(1F, 6F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      leftwing = new ModelRenderer(this, 42, 0);
      leftwing.addBox(0F, -2F, 0F, 6, 5, 0);
      leftwing.setRotationPoint(1F, 2.5F, 1F);
      leftwing.setTextureSize(64, 32);
      leftwing.mirror = true;
      setRotation(leftwing, 0F, -0.9075712F, 0F);
      rightwing = new ModelRenderer(this, 42, 0);
      rightwing.addBox(-6F, -2F, 0F, 6, 5, 0);
      rightwing.setRotationPoint(-1F, 2.5F, 1F);
      rightwing.setTextureSize(64, 32);
      rightwing.mirror = true;
      setRotation(rightwing, 0F, 0.9075712F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    leftwing.render(f5);
    rightwing.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
