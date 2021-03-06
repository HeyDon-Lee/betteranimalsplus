package its_meow.betteranimalsplus.init;

import java.util.LinkedHashSet;

import its_meow.betteranimalsplus.Ref;
import its_meow.betteranimalsplus.common.config.BetterAnimalsPlusConfig;
import its_meow.betteranimalsplus.common.entity.EntityBear;
import its_meow.betteranimalsplus.common.entity.EntityBearNeutral;
import its_meow.betteranimalsplus.common.entity.EntityBearNeutralKermode;
import its_meow.betteranimalsplus.common.entity.EntityBoar;
import its_meow.betteranimalsplus.common.entity.EntityCoyote;
import its_meow.betteranimalsplus.common.entity.EntityDeer;
import its_meow.betteranimalsplus.common.entity.EntityFeralWolf;
import its_meow.betteranimalsplus.common.entity.EntityFox;
import its_meow.betteranimalsplus.common.entity.EntityGoat;
import its_meow.betteranimalsplus.common.entity.EntityJellyfish;
import its_meow.betteranimalsplus.common.entity.EntityLammergeier;
import its_meow.betteranimalsplus.common.entity.EntityPheasant;
import its_meow.betteranimalsplus.common.entity.EntityReindeer;
import its_meow.betteranimalsplus.common.entity.EntitySquirrel;
import its_meow.betteranimalsplus.common.entity.EntityTarantula;
import its_meow.betteranimalsplus.common.entity.miniboss.hirschgeist.EntityHirschgeist;
import its_meow.betteranimalsplus.common.entity.projectile.EntityTarantulaHair;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving.SpawnPlacementType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;


public class MobRegistry {
	public static int modEntities = 0;

	public static LinkedHashSet<EntityEntry> entrySet = new LinkedHashSet<EntityEntry>();
	public static LinkedHashSet<EntityContainer> entityList = new LinkedHashSet<EntityContainer>();

	private static final String LOCALIZE_PREFIX = Ref.MOD_ID + ".";

	public static void fillContainers() {
		entityList.add(new EntityContainer(EntityBear.class, "BrownBear", EnumCreatureType.CREATURE, 0x4F2900, 0x8E500E, BetterAnimalsPlusConfig.brownBearWeight, 1, 1, BiomeDictionary.getBiomes(Type.FOREST)));
		entityList.add(new EntityContainer(EntityBearNeutral.class, "BlackBear", EnumCreatureType.CREATURE, 0x000000, 0x333333, BetterAnimalsPlusConfig.blackBearWeight, 1, 1, BiomeDictionary.getBiomes(Type.FOREST)));
		entityList.add(new EntityContainer(EntityBearNeutralKermode.class, "KermodeBear", EnumCreatureType.CREATURE, 0xe8e8e8, 0xf7dabe, BetterAnimalsPlusConfig.kermodeBearWeight, 1, 1, BiomeDictionary.getBiomes(Type.FOREST)));
		entityList.add(new EntityContainer(EntityDeer.class, "Deer", EnumCreatureType.CREATURE, 0x8e510b, 0xc6863b, BetterAnimalsPlusConfig.deerWeight, 1, 4,  BiomeDictionary.getBiomes(Type.FOREST), BiomeDictionary.getBiomes(Type.MAGICAL)));
		entityList.add(new EntityContainer(EntityLammergeier.class, "Lammergeier", EnumCreatureType.CREATURE, 0xd8d8d8, 0xd82b11, BetterAnimalsPlusConfig.lammergeierWeight, 1, 2, BiomeDictionary.getBiomes(Type.HILLS), BiomeDictionary.getBiomes(Type.MOUNTAIN)));
		entityList.add(new EntityContainer(EntityFeralWolf.class, "FeralWolf", EnumCreatureType.CREATURE, 0xbababa, 0x232323, BetterAnimalsPlusConfig.feralWolfWeight, 1, 6, BiomeDictionary.getBiomes(Type.FOREST), BiomeDictionary.getBiomes(Type.MAGICAL), BiomeDictionary.getBiomes(Type.SPOOKY)));
		entityList.add(new EntityContainer(EntityCoyote.class, "Coyote", EnumCreatureType.CREATURE, 0x866a31, 0xb69762, BetterAnimalsPlusConfig.coyoteWeight, 1, 6, BiomeDictionary.getBiomes(Type.SANDY), BiomeDictionary.getBiomes(Type.PLAINS)));
		entityList.add(new EntityContainer(EntityFox.class, "Fox", EnumCreatureType.CREATURE, 0xe87422, 0x3f210c, BetterAnimalsPlusConfig.foxWeight, 1, 6, BiomeDictionary.getBiomes(Type.FOREST), BiomeDictionary.getBiomes(Type.MAGICAL)));
		entityList.add(new EntityContainer(EntityTarantula.class, "Tarantula", EnumCreatureType.MONSTER, 0x1e1e1e, 0x8c0c0c, BetterAnimalsPlusConfig.tarantulaWeight, 1, 3, BiomeDictionary.getBiomes(Type.SANDY)));
		entityList.add(new EntityContainer(EntityHirschgeist.class, "Hirschgeist", EnumCreatureType.CREATURE, 0xfffff, 0x00000, BetterAnimalsPlusConfig.hirschgeistWeight, 1, 1, BiomeDictionary.getBiomes(Type.FOREST)));
		entityList.add(new EntityContainer(EntityGoat.class, "Goat", EnumCreatureType.CREATURE, 0xffffff, 0xeeeeee, BetterAnimalsPlusConfig.goatWeight, 1, 4, BiomeDictionary.getBiomes(Type.HILLS), BiomeDictionary.getBiomes(Type.MOUNTAIN), BiomeDictionary.getBiomes(Type.SAVANNA), BiomeDictionary.getBiomes(Type.PLAINS), BiomeDictionary.getBiomes(Type.FOREST)));
		entityList.add(new EntityContainer(EntityJellyfish.class, "Jellyfish", EnumCreatureType.WATER_CREATURE, 0x226fe2, 0xf2b3b3, BetterAnimalsPlusConfig.jellyFishWeight, 1, 1, BiomeDictionary.getBiomes(Type.OCEAN)));
		entityList.add(new EntityContainer(EntityPheasant.class, "Pheasant", EnumCreatureType.CREATURE, 0x8e6b0b, 0xd8af3c, BetterAnimalsPlusConfig.pheasantWeight, 1, 3, BiomeDictionary.getBiomes(Type.FOREST), BiomeDictionary.getBiomes(Type.PLAINS), BiomeDictionary.getBiomes(Type.SAVANNA)));
		entityList.add(new EntityContainer(EntityReindeer.class, "Reindeer", EnumCreatureType.CREATURE, 0x8e510b, 0x017700, BetterAnimalsPlusConfig.reindeerWeight, 1, 4, BiomeDictionary.getBiomes(Type.SNOWY)));
		entityList.add(new EntityContainer(EntityBoar.class, "Boar", EnumCreatureType.CREATURE, 0x3d3c3b, 0xbca895, BetterAnimalsPlusConfig.boarWeight, 1, 4, BiomeDictionary.getBiomes(Type.FOREST), BiomeDictionary.getBiomes(Type.JUNGLE), BiomeDictionary.getBiomes(Type.PLAINS), BiomeDictionary.getBiomes(Type.SAVANNA)));
		entityList.add(new EntityContainer(EntitySquirrel.class, "Squirrel", EnumCreatureType.CREATURE, 0x89806f, 0xb2a489, BetterAnimalsPlusConfig.squirrelWeight, 1, 3, BiomeDictionary.getBiomes(Type.FOREST)));
	}

	//#################################################################################

	public static void reg(EntityContainer c){
		if(c.doSpawning) {
			registerWithSpawnAndEgg(c.entityClazz, c.entityName, c.eggColorSolid, c.eggColorSpot, c.type, c.weight, c.minGroup, c.maxGroup, c.spawnBiomes);
		} else {
			registerWithEgg(c.entityClazz, c.entityName, c.eggColorSolid, c.eggColorSpot);
		}
	}

	public static void registerWithSpawnAndEgg(Class<? extends Entity> EntityClass, String entityNameIn, int solidColorIn, int spotColorIn, EnumCreatureType typeIn, int prob, int min, int max, Biome[] biomes){
		EntityEntry entry = EntityEntryBuilder.create()
				.entity(EntityClass)
				.id(new ResourceLocation(Ref.MOD_ID, entityNameIn), modEntities++)
				.name(LOCALIZE_PREFIX + entityNameIn)
				.tracker(64, 1, true)
				.egg(solidColorIn, spotColorIn)
				.spawn(typeIn, prob, min, max, biomes)
				.build();
		if(typeIn == EnumCreatureType.WATER_CREATURE) {
			EntitySpawnPlacementRegistry.setPlacementType(EntityClass, SpawnPlacementType.IN_WATER);
		}
		entrySet.add(entry);
	}

	public static void registerWithEgg(Class<? extends Entity> EntityClass, String entityNameIn, int solidColorIn, int spotColorIn){
		EntityEntry entry = EntityEntryBuilder.create()
				.entity(EntityClass)
				.id(new ResourceLocation(Ref.MOD_ID, entityNameIn), modEntities++)
				.name(LOCALIZE_PREFIX + entityNameIn)
				.tracker(64, 1, true)
				.egg(solidColorIn, spotColorIn)
				.build();
		entrySet.add(entry);
	}

	public static void register(Class<? extends Entity> EntityClass, String entityNameIn){
		EntityEntry entry = EntityEntryBuilder.create()
				.entity(EntityClass)
				.id(new ResourceLocation(Ref.MOD_ID, entityNameIn), modEntities++)
				.name(LOCALIZE_PREFIX + entityNameIn)
				.tracker(64, 1, true)
				.build();

		entrySet.add(entry);
	}



	//####################################################################################

	@EventBusSubscriber(modid = Ref.MOD_ID)
	public static class RegistrationHandler
	{
		/**
		 * Register this mod's {@link EntityEntry}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<EntityEntry> event)
		{
			final IForgeRegistry<EntityEntry> registry = event.getRegistry();

			for(EntityContainer container : entityList) {
				if(container.doRegister)
					reg(container);
			}
			EntitySpawnPlacementRegistry.setPlacementType(EntityLammergeier.class, SpawnPlacementType.IN_AIR);
			register(EntityTarantulaHair.class, "tarantulahair");
			
			if(!entrySet.isEmpty()) {
				for (final EntityEntry entityEntry : entrySet)
				{
					//System.out.println("Registering entity: " + entityEntry.getName() + "   " + entityEntry.getRegistryName());
					registry.register(entityEntry);
				}
			}
		}
	}


}
