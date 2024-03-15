package net.krzysztof.tutorialmod.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.krzysztof.tutorialmod.KrzysMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Moditem {
    public  static  final  Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public  static  final  Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public  static  final  Item SAPPIRE = registerItem("sappire", new Item(new FabricItemSettings()));
    public  static  final  Item RAW_SAPPIRE = registerItem("raw_sappire", new Item(new FabricItemSettings()));
    public  static  final  Item TOPEZ = registerItem("topez", new Item(new FabricItemSettings()));
    public  static  final  Item RAW_TOPEZ = registerItem("raw_topez", new Item(new FabricItemSettings()));
    public  static  final  Item PLATINUM = registerItem("platinum", new Item(new FabricItemSettings()));
    public  static  final  Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new FabricItemSettings()));
    private static void creativeAddTab(FabricItemGroupEntries entries){

        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(SAPPIRE);
        entries.add(RAW_SAPPIRE);
        entries.add(TOPEZ);
        entries.add(RAW_TOPEZ);
        entries.add(PLATINUM);
        entries.add(RAW_PLATINUM);
    }


    private  static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(KrzysMod.Mod_ID, name), item);
    }




    public  static  void registerModItems(){
        KrzysMod.LOGGER.info("Registering Mod Items for " + KrzysMod.Mod_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditem::creativeAddTab);

    }


}
