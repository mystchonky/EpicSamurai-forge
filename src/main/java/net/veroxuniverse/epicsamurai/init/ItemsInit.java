package net.veroxuniverse.epicsamurai.init;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.epicsamurai.EpicSamuraiMod;
import net.veroxuniverse.epicsamurai.entity.ModEntityTypes;
import net.veroxuniverse.epicsamurai.item.*;
import net.veroxuniverse.epicsamurai.util.EpicSamuraiModCreativeTabs;

@SuppressWarnings("unused")
public class ItemsInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicSamuraiMod.MOD_ID);

    public static final RegistryObject<Item> RED_SAMURAI_HELMET = ITEMS.register("red_samurai_helmet",
            () -> new RedSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.HEAD, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> RED_SAMURAI_CHESTPLATE = ITEMS.register("red_samurai_chestplate",
            () -> new RedSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.CHEST, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> RED_SAMURAI_LEGGINGS = ITEMS.register("red_samurai_leggings",
            () -> new RedSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.LEGS, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> RED_SAMURAI_BOOTS = ITEMS.register("red_samurai_boots",
            () -> new RedSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.FEET, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));

    public static final RegistryObject<Item> BLUE_SAMURAI_HELMET = ITEMS.register("blue_samurai_helmet",
            () -> new BlueSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.HEAD, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> BLUE_SAMURAI_CHESTPLATE = ITEMS.register("blue_samurai_chestplate",
            () -> new BlueSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.CHEST, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> BLUE_SAMURAI_LEGGINGS = ITEMS.register("blue_samurai_leggings",
            () -> new BlueSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.LEGS, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> BLUE_SAMURAI_BOOTS = ITEMS.register("blue_samurai_boots",
            () -> new BlueSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.FEET, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));

    public static final RegistryObject<Item> GREEN_SAMURAI_HELMET = ITEMS.register("green_samurai_helmet",
            () -> new GreenSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.HEAD, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> GREEN_SAMURAI_CHESTPLATE = ITEMS.register("green_samurai_chestplate",
            () -> new GreenSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.CHEST, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> GREEN_SAMURAI_LEGGINGS = ITEMS.register("green_samurai_leggings",
            () -> new GreenSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.LEGS, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> GREEN_SAMURAI_BOOTS = ITEMS.register("green_samurai_boots",
            () -> new GreenSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.FEET, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));

    public static final RegistryObject<Item> GRAY_SAMURAI_HELMET = ITEMS.register("gray_samurai_helmet",
            () -> new GraySamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.HEAD, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> GRAY_SAMURAI_CHESTPLATE = ITEMS.register("gray_samurai_chestplate",
            () -> new GraySamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.CHEST, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> GRAY_SAMURAI_LEGGINGS = ITEMS.register("gray_samurai_leggings",
            () -> new GraySamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.LEGS, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> GRAY_SAMURAI_BOOTS = ITEMS.register("gray_samurai_boots",
            () -> new GraySamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.FEET, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));

    public static final RegistryObject<Item> WHITE_SAMURAI_HELMET = ITEMS.register("white_samurai_helmet",
            () -> new WhiteSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.HEAD, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> WHITE_SAMURAI_CHESTPLATE = ITEMS.register("white_samurai_chestplate",
            () -> new WhiteSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.CHEST, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> WHITE_SAMURAI_LEGGINGS = ITEMS.register("white_samurai_leggings",
            () -> new WhiteSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.LEGS, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> WHITE_SAMURAI_BOOTS = ITEMS.register("white_samurai_boots",
            () -> new WhiteSamuraiArmorItem(ArmorMaterialsInit.SAMURAI, EquipmentSlot.FEET, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));

    public static final RegistryObject<Item> KATANA = ITEMS.register("katana",
            () -> new SwordItem(ItemMaterialsInit.SAMURAI,2,-2.4f, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> NAGINATA = ITEMS.register("naginata",
            () -> new SwordItem(ItemMaterialsInit.SAMURAI,2,-2.4f, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> NAGAMAKI = ITEMS.register("nagamaki",
            () -> new SwordItem(ItemMaterialsInit.SAMURAI,2,-2.4f, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> KUNAI = ITEMS.register("kunai",
            () -> new SwordItem(ItemMaterialsInit.SAMURAI,0,-2.0f, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> KAMA = ITEMS.register("kama",
            () -> new SwordItem(ItemMaterialsInit.SAMURAI,0,-2.0f, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> SAI = ITEMS.register("sai",
            () -> new SwordItem(ItemMaterialsInit.SAMURAI,0,-2.0f, new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> SHURIKEN = ITEMS.register("shuriken",
            () -> new ShurikenItem(new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));

    public static final RegistryObject<Item> AKANAME_SPAWN_EGG = ITEMS.register("akaname_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.AKANAME, 0x5e100a, 0xa88c8a,
                    new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> ENENRA_SPAWN_EGG = ITEMS.register("enenra_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ENENRA, 0x08090a, 0xa88c8a,
                    new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx",
            () -> new Item(new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(EpicSamuraiModCreativeTabs.EPICSAMURAI_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}