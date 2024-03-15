package net.krzysztof.tutorialmod.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.krzysztof.tutorialmod.KrzysMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemClass {
    public  static  final ItemGroup GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(KrzysMod.Mod_ID, "ancient_shinobi"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby")).icon(() -> new ItemStack(Moditem.RUBY)).entries((displayContext, entries) -> {
        entries.add(Moditem.RAW_RUBY);
        entries.add(Moditem.RUBY);
        entries.add(Moditem.SAPPIRE);
        entries.add(Moditem.PLATINUM);
        entries.add(Moditem.TOPEZ);
        entries.add(Moditem.RAW_TOPEZ);
        entries.add(Moditem.RAW_PLATINUM);
        entries.add(Moditem.RAW_SAPPIRE);

    }).build());
    public static void registerItemGroups(){
        KrzysMod.LOGGER.info("Registering Item Group for " + KrzysMod.Mod_ID);
    }
}
