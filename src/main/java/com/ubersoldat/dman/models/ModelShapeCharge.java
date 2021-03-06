package com.ubersoldat.dman.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelShapeCharge extends ModelBase
{
	
	ModelRenderer Base_Plate;
    ModelRenderer Shaping_Plate;
    ModelRenderer Control_Pannel;
    ModelRenderer Locking_Pin_4;
    ModelRenderer Locking_Pin_3;
    ModelRenderer Locking_Pin_1;
    ModelRenderer Locking_Pin_2;
  
  public ModelShapeCharge()
  {
	  textureWidth = 64;
	  textureHeight = 64;
	    
	  Base_Plate = new ModelRenderer(this, 0, 46);
      Base_Plate.addBox(0F, 0F, 0F, 16, 2, 16);
      Base_Plate.setRotationPoint(-8F, 22F, -8F);
      Base_Plate.setTextureSize(64, 64);
      Base_Plate.mirror = true;
      setRotation(Base_Plate, 0F, 0F, 0F);
      Shaping_Plate = new ModelRenderer(this, 0, 30);
      Shaping_Plate.addBox(0F, 0F, 0F, 14, 2, 14);
      Shaping_Plate.setRotationPoint(-7F, 20F, -7F);
      Shaping_Plate.setTextureSize(64, 64);
      Shaping_Plate.mirror = true;
      setRotation(Shaping_Plate, 0F, 0F, 0F);
      Control_Pannel = new ModelRenderer(this, 0, 19);
      Control_Pannel.addBox(0F, 0F, 0F, 8, 1, 10);
      Control_Pannel.setRotationPoint(-4F, 19F, -5F);
      Control_Pannel.setTextureSize(64, 64);
      Control_Pannel.mirror = true;
      setRotation(Control_Pannel, 0F, 0F, 0F);
      Locking_Pin_4 = new ModelRenderer(this, 25, 2);
      Locking_Pin_4.addBox(0F, 0F, 0F, 2, 6, 2);
      Locking_Pin_4.setRotationPoint(-8F, 16F, 6F);
      Locking_Pin_4.setTextureSize(64, 64);
      Locking_Pin_4.mirror = true;
      setRotation(Locking_Pin_4, 0F, 0F, 0F);
      Locking_Pin_3 = new ModelRenderer(this, 35, 2);
      Locking_Pin_3.addBox(0F, 0F, 0F, 2, 6, 2);
      Locking_Pin_3.setRotationPoint(-8F, 16F, -8F);
      Locking_Pin_3.setTextureSize(64, 64);
      Locking_Pin_3.mirror = true;
      setRotation(Locking_Pin_3, 0F, 0F, 0F);
      Locking_Pin_1 = new ModelRenderer(this, 55, 2);
      Locking_Pin_1.addBox(6F, 16F, -8F, 2, 6, 2);
      Locking_Pin_1.setRotationPoint(0F, 0F, 0F);
      Locking_Pin_1.setTextureSize(64, 64);
      Locking_Pin_1.mirror = true;
      setRotation(Locking_Pin_1, 0F, 0F, 0F);
      Locking_Pin_2 = new ModelRenderer(this, 45, 2);
      Locking_Pin_2.addBox(0F, 0F, 0F, 2, 6, 2);
      Locking_Pin_2.setRotationPoint(6F, 16F, 6F);
      Locking_Pin_2.setTextureSize(64, 64);
      Locking_Pin_2.mirror = true;
      setRotation(Locking_Pin_2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Base_Plate.render(f5);
	    Shaping_Plate.render(f5);
	    Control_Pannel.render(f5);
	    Locking_Pin_4.render(f5);
	    Locking_Pin_3.render(f5);
	    Locking_Pin_1.render(f5);
	    Locking_Pin_2.render(f5);
  }
  
  public void renderModel(float f){
	    Base_Plate.render(f);
	    Shaping_Plate.render(f);
	    Control_Pannel.render(f);
	    Locking_Pin_4.render(f);
	    Locking_Pin_3.render(f);
	    Locking_Pin_1.render(f);
	    Locking_Pin_2.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
