package its_meow.betteranimalsplus.client.renderer.entity;

import its_meow.betteranimalsplus.client.model.ModelFox;
import its_meow.betteranimalsplus.common.entity.EntityFox;
import its_meow.betteranimalsplus.init.TextureRegistry;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFox extends RenderLiving<EntityFox> {

	public RenderFox(RenderManager manager)
	{
		super(manager, new ModelFox(), 0.5F);
	}


	/**
	 * Defines what float the third param in setRotationAngles of ModelBase is
	 */
	protected float handleRotationFloat(EntityFox livingBase, float partialTicks)
	{
		return livingBase.getTailRotation();
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	public void doRender(EntityFox entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		if (entity.isWolfWet())
		{
			float f = entity.getBrightness() * entity.getShadingWhileWet(partialTicks);
			GlStateManager.color(f, f, f);
		}

		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityFox entity)
	{
		return this.getFoxTexture(entity.getTypeNumber(), entity);
	}
	
	private ResourceLocation getFoxTexture(int typeNumber, EntityFox entity) {
		ResourceLocation result = null;
		
		switch(typeNumber) {
			case 1:
				result = TextureRegistry.fox_1;
				break;
			case 2:
				result = TextureRegistry.fox_2;
				break;
			case 3:
				result = TextureRegistry.fox_3;
				break;
			case 4:
				result = TextureRegistry.fox_4;
				break;
		}
		return result;
	}

}
