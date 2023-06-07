package net.mcreator.bombcs.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.bombcs.potion.VzryvchieriezPotionEffect;
import net.mcreator.bombcs.potion.TttPotionEffect;
import net.mcreator.bombcs.item.BombItem;
import net.mcreator.bombcs.block.BombaBlock;
import net.mcreator.bombcs.BombcsMod;

import java.util.Map;
import java.util.Collection;

public class PlantbombaProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BombcsMod.LOGGER.warn("Failed to load dependency world for procedure Plantbomba!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BombcsMod.LOGGER.warn("Failed to load dependency x for procedure Plantbomba!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BombcsMod.LOGGER.warn("Failed to load dependency y for procedure Plantbomba!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BombcsMod.LOGGER.warn("Failed to load dependency z for procedure Plantbomba!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BombcsMod.LOGGER.warn("Failed to load dependency entity for procedure Plantbomba!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		BlockState X_test_cdr = Blocks.AIR.getDefaultState();
		double cord_x = 0;
		double cord_y = 0;
		double cord_z = 0;
		double pre_cord_x = 0;
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == TttPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(BombItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			world.setBlockState(new BlockPos(x, y, z), BombaBlock.block.getDefaultState(), 3);
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"summon minecraft:armor_stand ~ ~5 ~ {NoAI:1b,LeftHanded:0,NoGravity:1b,CanPickUpLoot:0b,Silent:1,Invulnerable:1,IsBaby:0,ActiveEffects:[{Id:14,Amplifier:0,Duration:2147483647}],Tags:[\"bomb_plant\"]}");
			}
			if ((new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == VzryvchieriezPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) == false) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(VzryvchieriezPotionEffect.potion, (int) 810, (int) 0, (false), (false)));
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"title @s actionbar \"\u0412\u044B \u043D\u0430\u0445\u043E\u0434\u0438\u0442\u0435\u0441\u044C \u043D\u0435 \u0432 \u0437\u043E\u043D\u0435 \u0443\u0441\u0442\u0430\u043D\u043E\u0432\u043A\u0435 \u0431\u043E\u043C\u0431\u044B.\"");
				}
			}
		}
	}
}
