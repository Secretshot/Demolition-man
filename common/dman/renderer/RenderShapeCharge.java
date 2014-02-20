package dman.renderer;

import org.lwjgl.opengl.GL11;

import dman.models.ModelShapeCharge;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderShapeCharge extends TileEntitySpecialRenderer{

	private static final ResourceLocation texture = new ResourceLocation(dman.library.Reasource.Mod_ID, "textures/model/shapecharge.png");
	private ModelShapeCharge model;
	
	public RenderShapeCharge(){
		this.model = new ModelShapeCharge();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y,double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		this.bindTexture(texture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	
}
