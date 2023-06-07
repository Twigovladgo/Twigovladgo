package net.mcreator.bombcs.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.bombcs.potion.EffBombdefusedPotionEffect;
import net.mcreator.bombcs.potion.BoomgameendPotionEffect;
import net.mcreator.bombcs.BombcsMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.AbstractMap;

public class Vzriv_bombs_procedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BombcsMod.LOGGER.warn("Failed to load dependency world for procedure Vzriv_bombs_proced!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BombcsMod.LOGGER.warn("Failed to load dependency x for procedure Vzriv_bombs_proced!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BombcsMod.LOGGER.warn("Failed to load dependency y for procedure Vzriv_bombs_proced!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BombcsMod.LOGGER.warn("Failed to load dependency z for procedure Vzriv_bombs_proced!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BombcsMod.LOGGER.warn("Failed to load dependency entity for procedure Vzriv_bombs_proced!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isAlive() == true) {
			if ((new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == EffBombdefusedPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) == false) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(BoomgameendPotionEffect.potion, (int) 200, (int) 1));
				BabaxProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
	}
}
