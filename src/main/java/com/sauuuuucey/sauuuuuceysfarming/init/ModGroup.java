package com.sauuuuucey.sauuuuuceysfarming.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import com.sauuuuucey.sauuuuuceysfarming.SauuuuuceysFarming;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroup 
{
	public static final ItemGroup MOD_ITEM_GROUP = new ModTabGroup(SauuuuuceysFarming.MODID, () -> new ItemStack(ModItems.corn));

    public static final class ModTabGroup extends ItemGroup
    {

        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public ModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}