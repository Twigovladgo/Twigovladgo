
package net.mcreator.bombcs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.bombcs.itemgroup.BombmodItemGroup;
import net.mcreator.bombcs.BombcsModElements;

@BombcsModElements.ModElement.Tag
public class MolotovItem extends BombcsModElements.ModElement {
	@ObjectHolder("bombcs:molotov")
	public static final Item block = null;

	public MolotovItem(BombcsModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BombmodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("molotov");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
