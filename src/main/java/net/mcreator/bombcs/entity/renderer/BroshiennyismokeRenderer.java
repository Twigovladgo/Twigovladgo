package net.mcreator.bombcs.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.bombcs.item.BroshiennyismokeItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BroshiennyismokeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BroshiennyismokeItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<BroshiennyismokeItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("bombcs:textures/entities/texture.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(BroshiennyismokeItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelSmokeGranata();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(BroshiennyismokeItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.7.2
	// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSmokeGranata extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer Ocnov;
		private final ModelRenderer Obvodka;
		private final ModelRenderer Cheka;
		private final ModelRenderer Kolcho4_r1;
		private final ModelRenderer Zazdar;
		private final ModelRenderer Nadbic;
		private final ModelRenderer Zazdar1;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer Zazdar2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer Zazdar3;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer Zazdar4;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;

		public ModelSmokeGranata() {
			texWidth = 64;
			texHeight = 64;
			bone = new ModelRenderer(this);
			bone.setPos(9.0F, 24.0F, -7.0F);
			Ocnov = new ModelRenderer(this);
			Ocnov.setPos(0.0F, 0.0F, 0.0F);
			bone.addChild(Ocnov);
			Ocnov.texOffs(6, 50).addBox(-4.0F, -12.0F, 6.0F, 1.0F, 12.0F, 2.0F, 0.0F, false);
			Ocnov.texOffs(12, 46).addBox(-10.0F, -12.0F, 4.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
			Ocnov.texOffs(0, 51).addBox(-8.0F, -12.0F, 3.0F, 2.0F, 12.0F, 1.0F, 0.0F, false);
			Ocnov.texOffs(36, 50).addBox(-11.0F, -12.0F, 6.0F, 1.0F, 12.0F, 2.0F, 0.0F, false);
			Ocnov.texOffs(42, 51).addBox(-8.0F, -12.0F, 10.0F, 2.0F, 12.0F, 1.0F, 0.0F, false);
			Obvodka = new ModelRenderer(this);
			Obvodka.setPos(0.0F, 0.0F, 0.0F);
			bone.addChild(Obvodka);
			Obvodka.texOffs(59, 0).addBox(-8.0F, -9.0F, 11.0F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-6.0F, -9.0F, 10.0F, 0.1F, 0.3F, 1.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-6.0F, -9.0F, 10.0F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-4.0F, -9.0F, 8.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-4.0F, -9.0F, 8.0F, 1.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-3.0F, -9.0F, 6.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-4.0F, -9.0F, 4.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-6.0F, -9.0F, 3.9F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-4.0F, -9.0F, 5.9F, 1.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-6.0F, -9.0F, 3.0F, 0.1F, 0.3F, 1.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-8.0F, -9.0F, 2.9F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-8.1F, -9.0F, 3.0F, 0.1F, 0.3F, 1.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-10.0F, -9.0F, 3.9F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-10.1F, -9.0F, 4.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-11.0F, -9.0F, 5.9F, 1.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-11.1F, -9.0F, 6.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-11.0F, -9.0F, 8.0F, 1.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-10.1F, -9.0F, 8.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-10.0F, -9.0F, 10.0F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-8.1F, -9.0F, 10.0F, 0.1F, 0.3F, 1.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-8.0F, -3.0F, 11.0F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-8.1F, -3.0F, 10.0F, 0.1F, 0.3F, 1.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-10.0F, -3.0F, 10.0F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-10.1F, -3.0F, 8.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-11.0F, -3.0F, 8.0F, 1.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-11.1F, -3.0F, 6.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-11.0F, -3.0F, 5.9F, 1.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-10.1F, -3.0F, 4.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-10.0F, -3.0F, 3.9F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-8.1F, -3.0F, 3.0F, 0.1F, 0.3F, 1.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-8.0F, -3.0F, 2.9F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-6.0F, -3.0F, 3.9F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-6.0F, -3.0F, 3.0F, 0.1F, 0.3F, 1.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-4.0F, -3.0F, 4.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-4.0F, -3.0F, 5.9F, 1.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-3.0F, -3.0F, 6.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-4.0F, -3.0F, 8.0F, 1.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-4.0F, -3.0F, 8.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-6.0F, -3.0F, 10.0F, 0.1F, 0.3F, 1.0F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-6.0F, -3.0F, 10.0F, 2.0F, 0.3F, 0.1F, 0.0F, false);
			Obvodka.texOffs(59, 0).addBox(-4.0F, -9.0F, 8.0F, 0.1F, 0.3F, 2.0F, 0.0F, false);
			Cheka = new ModelRenderer(this);
			Cheka.setPos(0.0F, 0.0F, 0.0F);
			bone.addChild(Cheka);
			Cheka.texOffs(52, 59).addBox(-8.0F, -12.6F, 5.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			Cheka.texOffs(54, 61).addBox(-8.0F, -13.1F, 6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Cheka.texOffs(52, 61).addBox(-9.0F, -12.6F, 6.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			Kolcho4_r1 = new ModelRenderer(this);
			Kolcho4_r1.setPos(0.0F, 0.1F, 0.0F);
			Cheka.addChild(Kolcho4_r1);
			setRotationAngle(Kolcho4_r1, 0.3927F, 0.0F, 0.0F);
			Kolcho4_r1.texOffs(57, 57).addBox(-7.3F, -10.9F, 12.1F, 0.6F, 0.6F, 1.2F, 0.0F, false);
			Kolcho4_r1.texOffs(57, 57).addBox(-7.3F, -9.1F, 12.1F, 0.6F, 0.6F, 1.2F, 0.0F, false);
			Kolcho4_r1.texOffs(57, 57).addBox(-7.3F, -10.3F, 11.5F, 0.6F, 1.2F, 0.6F, 0.0F, false);
			Kolcho4_r1.texOffs(57, 57).addBox(-7.3F, -10.3F, 13.3F, 0.6F, 1.2F, 0.6F, 0.0F, false);
			Zazdar = new ModelRenderer(this);
			Zazdar.setPos(0.0F, 0.0F, 0.0F);
			bone.addChild(Zazdar);
			Nadbic = new ModelRenderer(this);
			Nadbic.setPos(0.0F, 0.0F, 0.0F);
			Zazdar.addChild(Nadbic);
			Zazdar1 = new ModelRenderer(this);
			Zazdar1.setPos(0.0F, 0.0F, 3.1F);
			Nadbic.addChild(Zazdar1);
			Zazdar1.texOffs(59, 2).addBox(-7.65F, -7.0F, -0.2F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.65F, -6.5F, -0.2F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.15F, -7.0F, -0.2F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.05F, -7.0F, -0.2F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-6.85F, -7.0F, -0.2F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.05F, -6.7F, -0.2F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-6.65F, -7.0F, -0.2F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-6.65F, -6.5F, -0.2F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.55F, -6.3F, -0.2F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.65F, -6.3F, -0.2F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.55F, -5.8F, -0.2F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.35F, -6.2F, -0.2F, 0.1F, 0.4F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.15F, -6.3F, -0.2F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.05F, -6.0F, -0.2F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-6.85F, -6.3F, -0.2F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-7.05F, -6.3F, -0.2F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-6.65F, -6.3F, -0.2F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-6.55F, -6.0F, -0.2F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-6.35F, -6.2F, -0.2F, 0.1F, 0.2F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-6.55F, -6.3F, -0.2F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar1.texOffs(59, 2).addBox(-6.35F, -5.9F, -0.2F, 0.1F, 0.2F, 0.1F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setPos(-6.45F, -6.65F, -0.15F);
			Zazdar1.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -1.0036F);
			cube_r1.texOffs(59, 2).addBox(-0.22F, -0.07F, -0.04F, 0.55F, 0.1F, 0.08F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setPos(-7.45F, -6.65F, -0.15F);
			Zazdar1.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -1.0036F);
			cube_r2.texOffs(59, 2).addBox(-0.22F, -0.07F, -0.04F, 0.55F, 0.1F, 0.08F, 0.0F, false);
			Zazdar2 = new ModelRenderer(this);
			Zazdar2.setPos(-6.9206F, -6.3267F, 11.05F);
			Nadbic.addChild(Zazdar2);
			setRotationAngle(Zazdar2, 0.0F, 3.1416F, 0.0F);
			Zazdar2.texOffs(59, 2).addBox(-0.7294F, -0.6733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.7294F, -0.1733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.2294F, -0.6733F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.1294F, -0.6733F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(0.0706F, -0.6733F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.1294F, -0.3733F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(0.2706F, -0.6733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(0.2706F, -0.1733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.6294F, 0.0267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.7294F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.6294F, 0.5267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.4294F, 0.1267F, -0.05F, 0.1F, 0.4F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.2294F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.1294F, 0.3267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(0.0706F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(-0.1294F, 0.0267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(0.2706F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(0.3706F, 0.3267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(0.5706F, 0.1267F, -0.05F, 0.1F, 0.2F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(0.3706F, 0.0267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar2.texOffs(59, 2).addBox(0.5706F, 0.4267F, -0.05F, 0.1F, 0.2F, 0.1F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setPos(0.4706F, -0.3233F, 0.0F);
			Zazdar2.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -1.0036F);
			cube_r3.texOffs(59, 2).addBox(-0.22F, -0.07F, -0.04F, 0.55F, 0.1F, 0.08F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setPos(-0.5294F, -0.3233F, 0.0F);
			Zazdar2.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -1.0036F);
			cube_r4.texOffs(59, 2).addBox(-0.22F, -0.07F, -0.04F, 0.55F, 0.1F, 0.08F, 0.0F, false);
			Zazdar3 = new ModelRenderer(this);
			Zazdar3.setPos(-11.0206F, -6.3267F, 6.95F);
			Nadbic.addChild(Zazdar3);
			setRotationAngle(Zazdar3, 0.0F, 1.5708F, 0.0F);
			Zazdar3.texOffs(59, 2).addBox(-0.7294F, -0.6733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.7294F, -0.1733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.2294F, -0.6733F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.1294F, -0.6733F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(0.0706F, -0.6733F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.1294F, -0.3733F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(0.2706F, -0.6733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(0.2706F, -0.1733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.6294F, 0.0267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.7294F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.6294F, 0.5267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.4294F, 0.1267F, -0.05F, 0.1F, 0.4F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.2294F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.1294F, 0.3267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(0.0706F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(-0.1294F, 0.0267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(0.2706F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(0.3706F, 0.3267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(0.5706F, 0.1267F, -0.05F, 0.1F, 0.2F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(0.3706F, 0.0267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar3.texOffs(59, 2).addBox(0.5706F, 0.4267F, -0.05F, 0.1F, 0.2F, 0.1F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setPos(0.4706F, -0.3233F, 0.0F);
			Zazdar3.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, -1.0036F);
			cube_r5.texOffs(59, 2).addBox(-0.22F, -0.07F, -0.04F, 0.55F, 0.1F, 0.08F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setPos(-0.5294F, -0.3233F, 0.0F);
			Zazdar3.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, -1.0036F);
			cube_r6.texOffs(59, 2).addBox(-0.22F, -0.07F, -0.04F, 0.55F, 0.1F, 0.08F, 0.0F, false);
			Zazdar4 = new ModelRenderer(this);
			Zazdar4.setPos(-2.9206F, -6.3267F, 6.95F);
			Nadbic.addChild(Zazdar4);
			setRotationAngle(Zazdar4, 0.0F, -1.5708F, 0.0F);
			Zazdar4.texOffs(59, 2).addBox(-0.7294F, -0.6733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.7294F, -0.1733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.2294F, -0.6733F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.1294F, -0.6733F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(0.0706F, -0.6733F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.1294F, -0.3733F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(0.2706F, -0.6733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(0.2706F, -0.1733F, -0.05F, 0.4F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.6294F, 0.0267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.7294F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.6294F, 0.5267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.4294F, 0.1267F, -0.05F, 0.1F, 0.4F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.2294F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.1294F, 0.3267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(0.0706F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(-0.1294F, 0.0267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(0.2706F, 0.0267F, -0.05F, 0.1F, 0.6F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(0.3706F, 0.3267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(0.5706F, 0.1267F, -0.05F, 0.1F, 0.2F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(0.3706F, 0.0267F, -0.05F, 0.2F, 0.1F, 0.1F, 0.0F, false);
			Zazdar4.texOffs(59, 2).addBox(0.5706F, 0.4267F, -0.05F, 0.1F, 0.2F, 0.1F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setPos(0.4706F, -0.3233F, 0.0F);
			Zazdar4.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -1.0036F);
			cube_r7.texOffs(59, 2).addBox(-0.22F, -0.07F, -0.04F, 0.55F, 0.1F, 0.08F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setPos(-0.5294F, -0.3233F, 0.0F);
			Zazdar4.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, -1.0036F);
			cube_r8.texOffs(59, 2).addBox(-0.22F, -0.07F, -0.04F, 0.55F, 0.1F, 0.08F, 0.0F, false);
		}

		@Override
		public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green,
				float blue, float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.xRot = x;
			modelRenderer.yRot = y;
			modelRenderer.zRot = z;
		}
	}

}
