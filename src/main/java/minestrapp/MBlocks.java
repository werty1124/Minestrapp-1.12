package minestrapp;

import java.util.ArrayList;
import java.util.List;

import minestrapp.block.BlockColdSand;
import minestrapp.block.BlockMDirt;
import minestrapp.block.BlockMFarmland;
import minestrapp.block.BlockMGrass;
import minestrapp.block.BlockMPath;
import minestrapp.block.BlockRedstoneOre;
import minestrapp.block.BlockSoulsteelVessel;
import minestrapp.block.BlockStoneSlab1;
import minestrapp.block.BlockTundraGrass;
import minestrapp.block.EnumStoneType;
import minestrapp.block.EnumStoneTypeMOnly;
import minestrapp.block.crops.CropWithered;
import minestrapp.block.crops.CabbagePlant;
import minestrapp.block.crops.CeleryPlant;
import minestrapp.block.crops.LettucePlant;
import minestrapp.block.crops.OnionPlant;
import minestrapp.block.crops.PeanutsPlant;
import minestrapp.block.crops.PepperPlant;
import minestrapp.block.crops.TomatoPlant;
import minestrapp.block.item.ItemBlockMultistate;
import minestrapp.block.util.BlockBase;
import minestrapp.block.util.BlockItemDropBase;
import minestrapp.block.util.BlockStoneBase;
import minestrapp.block.util.BlockStoneBaseMOnly;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MBlocks
{
	public static List<Block> blockList = new ArrayList<Block>();
	
	//Plant
	public static Block tundra_grass;
	
	//Soil
	public static Block cold_sand;
	public static BlockMDirt clay_soil;
	public static Block clay_grass;
	public static Block clay_grass_path;
	public static Block clay_farmland;
	public static BlockMDirt permafrost;
	public static Block lichen;
	public static Block lichen_path;
	public static Block permafrost_farmland;
	
	//Stone
	public static Block stone;
	public static Block cobblestone;
	public static Block stone_bricks;
	public static Block mossy_stone_bricks;
	public static Block cracked_stone_bricks;
	public static Block stone_slab_1;
	
	//Ore
	public static Block ore_coal;
	public static Block ore_copper;
	public static Block ore_tin;
	public static Block ore_iron;
	public static Block ore_gold;
	public static Block ore_redstone;
	public static Block ore_redstone_lit;
	public static Block ore_lapis;
	public static Block ore_torite;
	public static Block ore_diamond;
	public static Block ore_emerald;
	public static Block ore_titanium;
	public static Block ore_soul;
	
	//Resource
	public static Block block_copper;
	public static Block block_tin;
	public static Block block_bronze;
	public static Block block_steel;
	public static Block block_torite;
	public static Block block_titanium;
	public static Block block_glacierite;
	public static Block block_blazium;
	public static Block block_dimensium;
	
	//Utility
	public static Block soulsteel_vessel;
	
	//Crops
	public static Block crop_withered;
	public static Block crop_pepper;
	public static Block crop_cabbage;
	public static Block crop_celery;
	public static Block crop_lettuce;
	public static Block crop_onion;
	public static Block crop_peanuts;
	public static Block crop_tomato;
	
	public static void init()
	{
		//Plant
		register(tundra_grass = new BlockTundraGrass("tundra_grass"));
		
		//Soil
		register(cold_sand = new BlockColdSand("cold_sand", Material.SAND, SoundType.SAND, 0.7F, "shovel", 0).setCreativeTab(MTabs.environment), new ItemBlockMultistate(cold_sand));
		register(clay_soil = new BlockMDirt("clay_soil", MapColor.ADOBE, SoundType.GROUND, 0.5F, 0), new ItemBlockMultistate(clay_soil));
		register(clay_grass = new BlockMGrass("clay_grass", MapColor.GRASS, SoundType.PLANT, 0.6F, 0, clay_soil, true));
		register(clay_grass_path = new BlockMPath("clay_grass_path", MapColor.DIRT, SoundType.PLANT, 0.65F, 0, clay_soil));
		register(clay_farmland = new BlockMFarmland("clay_farmland", MapColor.ADOBE, SoundType.GROUND, 0.6F, 0, clay_soil, 2));
		register(permafrost = new BlockMDirt("permafrost", MapColor.LIGHT_BLUE, SoundType.GROUND, 0.7F, 0), new ItemBlockMultistate(permafrost));
		register(lichen = new BlockMGrass("lichen", MapColor.SAND, SoundType.PLANT, 0.8F, 0, permafrost, false));
		register(lichen_path = new BlockMPath("lichen_path", MapColor.DIRT, SoundType.PLANT, 0.75F, 0, permafrost));
		register(permafrost_farmland = new BlockMFarmland("permafrost_farmland", MapColor.ADOBE, SoundType.GROUND, 0.6F, 0, permafrost, 6));
		
		//Stone
		register(cobblestone = new BlockStoneBaseMOnly("m_cobblestone", Material.ROCK, SoundType.STONE, 2F, "pickaxe", 0).setResistance(10F).setCreativeTab(MTabs.stone), new ItemBlockMultistate(cobblestone));
		register(stone = new BlockStoneBaseMOnly("m_stone", Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0).setDropsItem(new ItemStack(Item.getItemFromBlock(MBlocks.cobblestone)), 0, 0, 0, true, false, true).setResistance(10F).setCreativeTab(MTabs.stone), new ItemBlockMultistate(stone));
		register(stone_bricks = new BlockStoneBaseMOnly("m_stone_bricks", Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0).setResistance(10F).setCreativeTab(MTabs.stone), new ItemBlockMultistate(stone_bricks));
		register(mossy_stone_bricks = new BlockStoneBaseMOnly("m_stone_bricks_mossy", Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0).setResistance(10F).setCreativeTab(MTabs.stone), new ItemBlockMultistate(mossy_stone_bricks));
		register(cracked_stone_bricks = new BlockStoneBaseMOnly("m_stone_bricks_cracked", Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0).setResistance(10F).setCreativeTab(MTabs.stone), new ItemBlockMultistate(cracked_stone_bricks));
		//register(stone_slab_1 = new BlockStoneSlab1("m_stone_slab_1"));
		
		//Ore
		register(ore_coal = new BlockStoneBaseMOnly("ore_coal", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 0).setDropsItem(new ItemStack(Items.COAL, 1, 0), 0, 0, 2, true, true, false).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_coal));
		register(ore_copper = new BlockStoneBase("ore_copper", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 0).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_copper));
		register(ore_tin = new BlockStoneBase("ore_tin", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 0).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_tin));
		register(ore_iron = new BlockStoneBaseMOnly("ore_iron", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 1).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_iron));
		register(ore_gold = new BlockStoneBaseMOnly("ore_gold", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 2).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_gold));
		register(ore_lapis = new BlockStoneBaseMOnly("ore_lapis", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 1).setDropsItem(new ItemStack(Items.DYE, 4, EnumDyeColor.BLUE.getDyeDamage()), 4, 2, 5, true, true,false).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_lapis));
		register(ore_redstone = new BlockRedstoneOre("ore_redstone", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 2, false).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_redstone));
		register(ore_redstone_lit = new BlockRedstoneOre("ore_redstone", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 2, true).setResistance(5F).setLightLevel(0.625F));
		register(ore_torite = new BlockStoneBase("ore_torite", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 0).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_torite));
		register(ore_diamond = new BlockStoneBaseMOnly("ore_diamond", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 2).setDropsItem(new ItemStack(Items.DIAMOND, 1, 0), 0, 3, 7, true, true, false).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_diamond));
		register(ore_emerald = new BlockStoneBaseMOnly("ore_emerald", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 2).setDropsItem(new ItemStack(Items.EMERALD, 1, 0), 0, 3, 7, true, true, false).setResistance(5F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_emerald));
		register(ore_titanium = new BlockStoneBase("ore_titanium", Material.ROCK, SoundType.STONE, 3F, "pickaxe", 0).setResistance(100F).setCreativeTab(MTabs.ore), new ItemBlockMultistate(ore_titanium));
		register(ore_soul = new BlockItemDropBase("ore_soul", Material.SAND, MapColor.BROWN, SoundType.SAND, 0.8F, "shovel", 3, new ItemStack(MItems.gem_soul, 1), 0, 5, 9, true).setCreativeTab(MTabs.ore));
		
		//Resource
		register(block_copper = new BlockBase("block_copper", Material.IRON, MapColor.ADOBE, SoundType.METAL, 4F, "pickaxe", 0).setResistance(10F).setCreativeTab(MTabs.resource));
		register(block_tin = new BlockBase("block_tin", Material.IRON, MapColor.CLOTH, SoundType.METAL, 4F, "pickaxe", 0).setResistance(5F).setCreativeTab(MTabs.resource));
		register(block_bronze = new BlockBase("block_bronze", Material.IRON, MapColor.field_193565_Q, SoundType.METAL, 6F, "pickaxe", 1).setResistance(15F).setCreativeTab(MTabs.resource));
		register(block_steel = new BlockBase("block_steel", Material.IRON, MapColor.field_193564_P, SoundType.METAL, 5F, "pickaxe", 1).setResistance(12F).setCreativeTab(MTabs.resource));
		register(block_torite = new BlockBase("block_torite", Material.IRON, MapColor.FOLIAGE, SoundType.METAL, 5F, "pickaxe", 2).setResistance(10F).setCreativeTab(MTabs.resource));
		register(block_titanium = new BlockBase("block_titanium", Material.IRON, MapColor.BLACK, SoundType.METAL, 10F, "pickaxe", 3).setResistance(6000000.0F).setCreativeTab(MTabs.resource));

		//Utility
		register(soulsteel_vessel = new BlockSoulsteelVessel().setHardness(3.0F).setCreativeTab(MTabs.utility));
		
		//Crops
		GameRegistry.register(crop_withered = new CropWithered("crop_withered"));
		GameRegistry.register(crop_pepper = new PepperPlant("crop_pepper"));
		GameRegistry.register(crop_cabbage = new CabbagePlant("crop_cabbage"));
		GameRegistry.register(crop_celery = new CeleryPlant("crop_celery"));
		GameRegistry.register(crop_lettuce = new LettucePlant("crop_lettuce"));
		GameRegistry.register(crop_onion = new OnionPlant("crop_onion"));
		GameRegistry.register(crop_peanuts = new PeanutsPlant("crop_peanuts"));
		GameRegistry.register(crop_tomato = new TomatoPlant("crop_tomato"));


	}
	
	public static void register(Block block)
	{
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		blockList.add(block);
	}
	
	public static void register(Block block, ItemBlock itemBlock)
	{
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
	}
	
	public static void registerRenders()
	{
		for(Block block: blockList)
		{
			initModel(block);
		}
		for(int i = 0 ; i < BlockColdSand.EnumType.values().length ; i++)
		{
			initModel(cold_sand, i, "cold_sand_" + BlockColdSand.EnumType.values()[i].getName());
		}
		for(int i = 0 ; i < BlockMDirt.DirtType.values().length ; i++)
		{
			initModel(clay_soil, i, "clay_soil_" + BlockMDirt.DirtType.values()[i].getName());
			initModel(permafrost, i, "permafrost_" + BlockMDirt.DirtType.values()[i].getName());
		}
		for(int i = 0 ; i < EnumStoneTypeMOnly.values().length ; i++)
		{
			initModel(ore_coal, i, "ore_coal_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(ore_iron, i, "ore_iron_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(ore_gold, i, "ore_gold_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(ore_lapis, i, "ore_lapis_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(ore_redstone, i, "ore_redstone_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(ore_redstone_lit, i, "ore_redstone_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(ore_diamond, i, "ore_diamond_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(ore_emerald, i, "ore_emerald_" + EnumStoneTypeMOnly.values()[i].getName());
			
			initModel(stone, i, "m_stone_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(cobblestone, i, "m_cobblestone_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(stone_bricks, i, "m_stone_bricks_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(mossy_stone_bricks, i, "m_stone_bricks_mossy_" + EnumStoneTypeMOnly.values()[i].getName());
			initModel(cracked_stone_bricks, i, "m_stone_bricks_cracked_" + EnumStoneTypeMOnly.values()[i].getName());
		}
		for(int i = 0 ; i < EnumStoneType.values().length ; i++)
		{
			initModel(ore_copper, i, "ore_copper_" + EnumStoneType.values()[i].getName());
			initModel(ore_tin, i, "ore_tin_" + EnumStoneType.values()[i].getName());
			initModel(ore_torite, i, "ore_torite_" + EnumStoneType.values()[i].getName());
			initModel(ore_titanium, i, "ore_titanium_" + EnumStoneType.values()[i].getName());
		}

	}
	
	private static void initModel(Block block)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}
	
	private static void initModel(Block block, int meta, String fileName)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Minestrapp5.MODID + ":" + fileName,"inventory"));
	}
}
