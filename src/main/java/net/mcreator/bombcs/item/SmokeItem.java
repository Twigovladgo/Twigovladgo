
package net.mcreator.bombcs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.bombcs.itemgroup.BombmodItemGroup;
import net.mcreator.bombcs.BombcsModElements;

import java.util.List;

@BombcsModElements.ModElement.Tag
public class SmokeItem extends BombcsModElements.ModElement {
	@ObjectHolder("bombcs:smoke")
	public static final Item block = null;

	public SmokeItem(BombcsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BombmodItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("smoke");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\u041F\u0440\u043E\u0441\u0442\u043E_\u043C\u043E\u0434\u0435\u043B\u044C"));
		}
	}
}
