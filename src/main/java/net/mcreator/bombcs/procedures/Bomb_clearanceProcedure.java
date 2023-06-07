package net.mcreator.bombcs.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.bombcs.potion.ProgressclearancePotionEffect;
import net.mcreator.bombcs.potion.CooldawnclearancePotionEffect;
import net.mcreator.bombcs.BombcsMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.AbstractMap;

public class Bomb_clearanceProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BombcsMod.LOGGER.warn("Failed to load dependency world for procedure Bomb_clearance!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BombcsMod.LOGGER.warn("Failed to load dependency x for procedure Bomb_clearance!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BombcsMod.LOGGER.warn("Failed to load dependency y for procedure Bomb_clearance!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BombcsMod.LOGGER.warn("Failed to load dependency z for procedure Bomb_clearance!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BombcsMod.LOGGER.warn("Failed to load dependency entity for procedure Bomb_clearance!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == CooldawnclearancePotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) == false) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Blocks.AIR
					.asItem()) == true) {
				if ((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) == false) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 0, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 0) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 1, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 1) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 2, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 2) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 3, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 3) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 4, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 4) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 5, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 5) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 6, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 6) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 7, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 7) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 8, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 8) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 9, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) >= 9) {
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"effect give @a bombcs:eff_bomb_fedused 5 2 true");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"effect clear @a bombcs:vzryvchieriez");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"me \u0411\u043E\u043C\u0431\u0430 \u0431\u044B\u043B\u0430 \u0440\u0430\u0437\u043C\u0438\u043D\u0438\u0440\u043E\u0432\u0430\u043D\u0430!");
					}
					GameendProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				}
			} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == Items.SHEARS) == true) {
				if ((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) == false) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 2, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 0) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 3, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 1) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 4, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 2) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 5, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 3) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 6, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 4) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 7, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 5) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 8, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 6) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 9, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 7) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 9, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) == 8) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(ProgressclearancePotionEffect.potion, (int) 100, (int) 9, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CooldawnclearancePotionEffect.potion, (int) 17, (int) 0, (false), (false)));
				} else if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == ProgressclearancePotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) >= 9) {
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"effect give @a bombcs:eff_bomb_fedused 5 2 true");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"effect clear @a bombcs:vzryvchieriez");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"me \u0411\u043E\u043C\u0431\u0430 \u0431\u044B\u043B\u0430 \u0440\u0430\u0437\u043C\u0438\u043D\u0438\u0440\u043E\u0432\u0430\u043D\u0430!");
					}
					GameendProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
							"\u041D\u0430\u0436\u043C\u0438\u0442\u0435 \u041F\u041A\u041C \u043F\u0443\u0441\u0442\u043E\u0439 \u0440\u0443\u043A\u043E\u0439 \u0438\u043B\u0438 \u043D\u043E\u0436\u043D\u0438\u0446\u0430\u043C\u0438!"),
							(false));
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u041F\u043E\u0434\u043E\u0436\u0434\u0438\u0442\u0435..."),
						(false));
			}
		}
	}
}
