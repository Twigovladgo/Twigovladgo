package net.mcreator.bombcs.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.bombcs.potion.TttPotionEffect;
import net.mcreator.bombcs.BombcsMod;

import java.util.Map;

public class TriggerKoghdaSushchnostStalkivaietsiaSBlokomProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BombcsMod.LOGGER.warn("Failed to load dependency entity for procedure TriggerKoghdaSushchnostStalkivaietsiaSBlokom!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(TttPotionEffect.potion, (int) 4, (int) 1, (false), (false)));
	}
}
