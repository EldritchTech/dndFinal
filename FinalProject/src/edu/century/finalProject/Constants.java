package edu.century.finalProject;

//Array order {Charisma, Constitution, Dexterity, Intelligence, Strength, Wisdom}

public interface Constants {
	
	//Armor
		//Light Armor
			public final Armor LIGHT_PADDED = new Armor(11, true, "Light");
			public final Armor LIGHT_LEATHER = new Armor(11, false, "Light");
			public final Armor LIGHT_STUDDED = new Armor(12, false, "Light");
			
		//Medium Armor
			public final Armor MEDIUM_HIDE = new Armor(12, false, "Medium");
			public final Armor MEDIUM_CHAINSHIRT = new Armor(13, false, "Medium");
			public final Armor MEDIUM_SCALEMAIL = new Armor(14, true, "Medium");
			public final Armor MEDIUM_BREASTPLATE = new Armor(14, false, "Medium");
			public final Armor MEDIUM_HALFPLATE = new Armor(15, true, "Medium");
		
		//Heavy Armor
			public final Armor HEAVY_RINGMAIL = new Armor(14, true, "Heavy");
			public final Armor HEAVY_CHAINMAIL = new Armor(16, true, "Heavy");
			public final Armor HEAVY_SPLINT = new Armor(17, true, "Heavy");
	
	
	//Races
		//Aasimar
			public final String AASIMAR_NAME = "Aasimar";
			public final int [] AASIMAR_RACIALBONUS = {2, 0, 0, 0, 0, 0};
			public final String AASIMAR_NAME_FALLEN = "Fallen";
			public final int [] AASIMAR_SUBRACEBONUS_FALLEN = {0, 0, 0, 0, 1, 0};
			public final String AASIMAR_NAME_PROTECTOR = "Protector";
			public final int [] AASIMAR_SUBRACEBONUS_PROTECTOR = {0, 0, 0, 0, 0, 1};
			public final String AASIMAR_NAME_SCOURGE = "Scourge";
			public final int [] AASIMAR_SUBRACEBONUS_SCOURGE = {0, 1, 0, 0, 0, 0};
			public final int AASIMAR_SPEED = 30;
			public final int AASIMAR_DARKVISION = 60;
			public final String [] AASIMAR_RESISTANCES = {"Necrotic", "Radiant"};
			public final String [] AASIMAR_LANGUAGES = {"Celestial", "Common"};
			public final Feature [] AASIMAR_FEATURE = {new Feature("Light", "You know the light cantrip, charisma is spellcasting ability"), 
					new Feature ("Healing hands", "You can heal a creature you can touch hit points to your level once per long rest")};
			public final Feature[] AASIMAR_FEATURE_FALLEN = {new Feature("Necrotic Shroud", "Starting at 3rd level, you can use your action to unleash the divine energy within yourself, "
					+ "causing your eyes to turn into pools of darkness and two skeletal, ghostly, flightless wings to sprout from your back. The instant you transform, other creatures "
					+ "within 10 feet of you that can see you must each succeed on a Charisma saving throw (DC 8 + prof + mod) or become frightened of you until the end of your next "
					+ "turn. Your transformation lasts for 1 minute or until you end it as a bonus action. During it, once on each of your turns, you can "
					+ "eal extra necrotic damage equal to your level to one target when you deal damage to it with an attack.", 1, false, true, 3)};
			public final Feature [] AASIMAR_FEATURE_PROTECTOR = {new Feature("Radiant Consumption", "You unleash the divine energy within yourself, causing a searing light to radiate from you,"
					+ " pour out of your eyes and mouth, and threaten to char you. Your transformation lasts for 1 minute or until you end it as a bonus action. During it, you shed "
					+ "bright light in a 10-foot radius and dim light for an additional 10 feet, and at the end of each of your turns, you and each creature within 10 feet of you take "
					+ "radiant damage equal to half your level (rounded up). In addition, once on each of your turns, you can deal extra radiant damage to one target when you deal damage "
					+ "to it with an attack or a spell. The extra radiant damage equals your level.", 1, false, true, 3)};
			public final Feature [] AASIMAR_FEATURE_SCOURGE = {new Feature("Radiant Soul", "Unleash the divine energy within yourself, causing your eyes to glimmer and two luminous, incorporeal "
					+ "wings to sprout from your back. Your transformation lasts for 1 minute or until you end it as a bonus action. During it, you have a flying speed of 30 feet, and once on "
					+ "each of your turns, you can deal extra radiant damage to one target when you deal damage to it with an attack or a spell. The extra radiant damage equals your level.", 
					1, false, true, 3)};
			public final Proficiency [] AASIMAR_PROFICIENCIES = {};
			public final Proficiency [] AASIMAR_PROFICIENCIES_SUBRACE = {};
			
			//Dragonborn
			public final String DRAGONBORN_NAME = "Dragonborn";
			public final int [] DRAGONBORN_RACIALBONUS = {1, 0, 0, 0, 1, 0};
			public final int [] DRAGONBORN_SUBRACEBONUS = {0, 0, 0, 0, 0, 0};
			public final int DRAGONBORN_SPEED = 30;
			public final int DRAGONBORN_DARKVISION = 0;
			public final String [] DRAGONBORN_RESISTANCES = {};
			public final String DRAGONBORN_NAME_BLACK = "Black";
			public final String [] DRAGONBORN_RESISTANCES_BLACK = {"Acid"};
			public final String DRAGONBORN_NAME_BLUE = "Blue";
			public final String [] DRAGONBORN_RESISTANCES_BLUE = {"Lightning"};
			public final String DRAGONBORN_NAME_BRASS = "Brass";
			public final String [] DRAGONBORN_RESISTANCES_BRASS = {"Fire"};
			public final String DRAGONBORN_NAME_BRONZE = "Bronze";
			public final String [] DRAGONBORN_RESISTANCES_BRONZE = {"Lightning"};
			public final String DRAGONBORN_NAME_COPPER = "Copper";
			public final String [] DRAGONBORN_RESISTANCES_COPPER = {"Acid"};
			public final String DRAGONBORN_NAME_GOLD = "Gold";
			public final String [] DRAGONBORN_RESISTANCES_GOLD = {"Fire"};
			public final String DRAGONBORN_NAME_GREEN = "Green";
			public final String [] DRAGONBORN_RESISTANCES_GREEN = {"Poison"};
			public final String DRAGONBORN_NAME_RED = "Red";
			public final String [] DRAGONBORN_RESISTANCES_RED = {"Fire"};
			public final String DRAGONBORN_NAME_SILVER = "Silver";
			public final String [] DRAGONBORN_RESISTANCES_SILVER = {"Cold"};
			public final String DRAGONBORN_NAME_WHITE = "White";
			public final String [] DRAGONBORN_RESISTANCES_WHITE = {"Cold"};
			public final String [] DRAGONBORN_LANGUAGES = {"Draconic", "Common"};
			public final Feature [] DRAGONBORN_FEATURE = {new Feature("Breath weapon", "Once per long rest, you can unleash a breath of energy determined by your color. Creatures in the area"
					+ "must roll a dexterity saving throw. DC for this saving throw is 8 + Con mod + Prof mod. A creature takes 2d6 on failed, half on a successful save. The damage increases "
					+ "to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. Black, Blue, Brass, Bronze, Copper dragons breath is 5 by 30 ft. line (Dex. save). Gold and Red breaths"
					+ "are a 15ft cone (Dex save). Green, Silver, White dragons breath are a 15ft cone (Con save)", 1, false, true, 1)};
			public final Feature [] DRAGONBORN_SUBRACE_FEATURE = null;
			public final Proficiency [] DRAGONBORN_PROFICIENCIES = {};
			public final Proficiency [] DRAGONBORN_PROFICIENCIES_SUBRACE = {};
			
			
			//Dwarf
			public final String DWARF_NAME = "Dwarf";
			public final int [] DWARF_RACIALBONUS = {0, 2, 0, 0, 0, 0};
			public final String DWARF_NAME_HILL = "Hill";
			public final int [] DWARF_SUBRACEBONUS_HILL = {0, 0, 0, 0, 0, 1};
			public final String DWARF_NAME_MOUNTAIN = "Mountain";
			public final int [] DWARF_SUBRACEBONUS_MOUNTAIN = {0, 0, 0, 0, 2, 0};
			public final int DWARF_SPEED = 25;
			public final int DWARF_DARKVISION = 60;
			public final String [] DWARF_RESISTANCES = {"Poision"};
			public final String [] DWARF_LANGUAGES = {"Dwarvish", "Common"};
			public final Feature [] DWARF_FEATURES = {new Feature("Dwarven Combat Training", "You have proficiency with the battleaxe, handaxe, light hammer, and warhammer."), 
					new Feature("Tool Proficency", "You gain proficiency with one of smith's tools, brewer's supplies, or mason's tools."), new Feature("Stonecutting", "Whenever you make a"
							+ " History check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.")};
			public final Feature [] DWARF_FEATURES_HILL = {new Feature("Dwarven Toughness", "Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.")};
			public final Feature [] DWARF_FEATURES_MOUNTAIN = {new Feature("Dwarven Armor Training", "You have proficiency with light and medium armor.")};
			public final Proficiency [] DWARF_PROFICIENCIES = {};
			public final Proficiency [] DWARF_PROFICIENCIES_HILL = {};
			public final Proficiency [] DWARF_PROFICIENCIES_MOUNTAIN = {};
			
			
			//Elf
			public final String ELF_NAME = "Elf";
			public final int [] ELF_RACIALBONUS = {0, 0, 2, 0, 0, 0};
			public final String ELF_NAME_DROW = "Dark";
			public final int [] ELF_SUBRACEBONUS_DROW = {1, 0, 0, 0, 0, 0};
			public final int ELF_DARKVISION_DROW = 120;
			public final String ELF_NAME_HIGH = "High";
			public final int [] ELF_SUBRACEBONUS_HIGH = {0, 0, 1, 0, 0, 0};
			public final String ELF_NAME_WOOD = "Wood";
			public final int [] ELF_SUBRACEBONUS_WOOD = {0, 0, 0, 0, 0, 1};
			public final int ELF_SPEED_WOOD = 35;
			public final String [] ELF_RESISTANCES = {};
			public final String [] ELF_LANGUAGES = {"Common", "Elvish"};
			public final Feature [] ELF_FEATURES = {new Feature("Fey Ancestory", "You have advantage on saves against being charmed, and magic can't put you to sleep"), new Feature("Trance",
					"Instead of sleeping, Elves can meditate for 4 hours and receive the same benefits of a long rest")};
			public final Feature [] ELF_FEATURES_DROW = {};
			public final Feature [] ELF_FEATURES_HIGH = {};
			public final Feature [] ELF_FEATURES_WOOD = {};
			public final Proficiency [] ELF_PROFICIENCIES = {};
			public final Proficiency [] ELF_PROFICIENCIES_DROW = {};
			public final Proficiency [] ELF_PROFICIENCIES_WOOD = {};
			public final Proficiency [] ELF_PROFICIENCIES_HIGH = {};
			
			public final int ELF_SPEED = 30;
			public final int ELF_DARKVISION = 60;
			
			//Gnome
			public final String GNOME_NAME = "Gnome";
			public final int [] GNOME_RACIALBONUS = {0, 0, 0, 2, 0, 0};
			public final String GNOME_NAME_ROCK = "Rock";
			public final int [] GNOME_SUBRACEBONUS_ROCK = {0, 1, 0, 0, 0, 0};
			public final String GNOME_NAME_DEEP = "Deep";
			public final int [] GNOME_SUBRACEBONUS_DEEP = {0, 0, 1, 0, 0, 0};
			public final int GNOME_SPEED = 25;
			public final int GNOME_DARKVISION = 60;
			public final int GNOME_DARKVISION_DEEP = 120;
			public final String [] GNOME_RESISTANCES = {};
			public final String [] GNOME_LANGUAGES = {"Common", "Gnomish"};
			public final String [] GNOME_LANGUAGES_DEEP = {"Common", "Gnomish", "Undercommon"};
			public final Feature [] GNOME_FEATURES = {new Feature("Gnome Cunning", "You have advantage on all Intelligence, "
					+ "Wisdom, and Charisma saving throws against magic.")};
			public final Feature [] GNOME_FEATURES_ROCK = {new Feature("Artificer's Lore", "Whenever you make an Intelligence "
					+ "(History) check related to magic items, alchemical objects, or technological devices, you can add twice "
					+ "your proficiency bonus, instead of any proficiency bonus you normally apply."), new Feature("Tinkerer", 
					"You have proficiency with artisanís tools (tinkerís tools). Using those tools, you can spend 1 hour "
					+ "and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp). The device ceases "
					+ "to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), "
					+ "or when you use your action to dismantle it; at that time, you can reclaim the materials used to "
					+ "create it. You can have up to three such devices active at a time.")};
			public final Feature [] GNOME_FEATURES_DEEP = {new Feature("Stone Camouflage", "You have advantage on Dexterity "
					+ "(stealth) checks to hide in rocky terrain.")};
			public final Proficiency [] GNOME_PROFICIENCIES = {};
			public final Proficiency [] GNOME_PROFICIENCIES_ROCK = {};
			public final Proficiency [] GNOME_PROFICIENCIES_DEEP = {};
			
			//Half-elf
			
			public final String HALFELF_NAME = "Half-Elf";
			public final int [] HALFELF_RACIALBONUS = {2, 0, 0, 0, 0, 0};
			public final String [] HALFELF_RESISTANCES = {};
			public final int HALFELF_SPEED = 30;
			public final int HALFELF_DARKVISION = 60;
			public final Feature [] HALFELF_FEATURES = {ELF_FEATURES[0]};
			public final String [] HALFELF_LANGUAGES = {"Common", "Elvish"};
			public final Proficiency [] HALFELF_PROFICIENCIES = new Proficiency [2];
			
			//Half-Orc
			
			public final String HALFORC_NAME = "Half orc";
			public final int [] HALFORC_RACIALBONUS = {0, 1, 0, 0, 2, 0};
			public final String [] HALFORC_RESISTANCES = {};
			public final int HALFORC_SPEED = 30;
			public final int HALFORC_DARKVISION = 60;
			public final Feature [] HALFORC_FEATURES = {new Feature("Relentless Endurance", "When you are reduced "
					+ "to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can't use "
					+ "this feature again until you finish a long rest.", 1, false, true, 1), new Feature("Savage Attack", 
							"When you score a critical hit with a melee weapon attack, you can roll one of the weapon's "
							+ "damage dice one additional time and add it to the extra damage of the critical hit.")};
			public final String [] HALFORC_LANGUAGES = {"Common", "Orc"};
			public final Proficiency [] HALFORC_PROFICIENCIES = new Proficiency[1];
			
			//Halfling
			
			public final String HALFLING_NAME = "Halfling";
			public final int [] HALFLING_RACIALBONUS = {0, 0, 2, 0, 0, 0};
			public final String [] HALFLING_RESISTANCES = {};
			public final int HALFLING_SPEED = 25;
			public final int HALFLING_DARKVISION = 0;
			public final Feature [] HALFLING_FEATURES = {new Feature("Lucky", "When you roll a 1 on the d20 for an attack "
					+ "roll, ability check, or saving throw, you can reroll the die and must use the new roll."), new Feature("Brave", 
							"You have advantage on saving throws against being frightened."), new Feature ("Halfling Nimbleness", 
									"You can move through the space of any creature that is of a size larger than yours.")};
			public final String [] HALFLING_LANGUAGES = {"Halfling", "Common"}; 
			public final Proficiency [] HALFLING_PROFICIENCIES = {};
			
			public final String HALFLING_NAME_LIGHTFOOT = "Lightfoot";
			public final int [] HALFLING_SUBRACEBONUS_LIGHTFOOT = {1, 0, 0, 0, 0, 0};
			public final Feature [] HALFLING_FEATURES_LIGHTFOOT = {new Feature("Naturally Stealthy", "You can attempt to hide "
					+ "even when you are obscured only by a creature that is at least one size larger than you.")};
			public final Proficiency [] HALFLING_PROFICIENCIES_LIGHTFOOT = {};
			
			public final String HALFLING_NAME_STOUT = "Stout";
			public final int [] HALFLING_SUBRACEBONUS_STOUT = {0, 1, 0, 0, 0, 0};
			public final String [] HALFLING_RESISTANCES_STOUT = {"Poison"};
			public final Feature [] HALFLING_FEATURES_STOUT = {new Feature("Stout Resilience", "You have advantage on saving throws"
					+ " against poison")};
			public final Proficiency [] HALFLING_PROFICIENCIES_STOUT = {};
			
			//Human
			
			public final String HUMAN_NAME = "Human";
			public final int [] HUMAN_RACIALBONUS = {1, 1, 1, 1, 1, 1};
			public final String [] HUMAN_RESISTANCES = {};
			public final int HUMAN_SPEED = 30;
			public final int HUMAN_DARKVISION = 0;
			public final String [] HUMAN_LANGUAGES = {"Common"};
			public final Feature [] HUMAN_FEATURES = {};
			public final Proficiency [] HUMAN_PROFICIENCIES = {};
			
			//Tiefling
			
			public final String TIEFLING_NAME = "Tiefling";
			public final int [] TIEFLING_RACIALBONUS = {2, 0, 0, 1, 0, 0};
			public final String [] TIEFLING_RESISTANCES = {"Fire"};
			public final int TIEFLING_SPEED = 30;
			public final int TIEFLING_DARKVISION = 60;
			public final String [] TIEFLING_LANGUAGES = {"Common", "Infernal"};
			public final Feature [] TIEFLING_FEATURES = {new Feature("Infernal Legacy", "You know the Thaumaturgy cantrip. "
					+ "When you reach 3rd level, you can cast the Hellish Rebuke spell as a 2nd-level spell once with this "
					+ "trait and regain the ability to do so when you finish a long rest. When you reach 5th level, you can "
					+ "cast the Darkness spell once with this trait and regain the ability to do so when you finish a long rest. "
					+ "Charisma is your spellcasting ability for these spells.")};
			public final Proficiency [] TIEFLING_PROFICIENCIES = {};
			
			
			
			
			/*
			 * DICE
			 */
			
			public final Dice d4 = new Dice(4);
			public final Dice d6 = new Dice(6);
			public final Dice d8 = new Dice(8);
			public final Dice d10 = new Dice(10);
			public final Dice d12 = new Dice(12);
			public final Dice d20 = new Dice(20);
			public final Dice d100 = new Dice(100);
			
			/* 
			 * Classes
			 */
			//Barbarian
			public final String BARBARIAN_NAME = "Barbarian";
			public final int BARBARIAN_BASEHP = 12;
			public final Dice BARBARIAN_HITDICE = d12;
			public final int BARBARIAN_NUMHITDIE = 1;
			public final int [] BARBARIAN_SPELLSLOTS = {};
			public final Proficiency [] BARBARIAN_PROFICIENCIES = new Proficiency[9];
			
			//Bard
			
			
			
			
			/*
			 * Spells
			 */
			
			public final Damage VICIOUSMOCKERY = new Damage(1, d4, 0, "Psychic");
			
			public final Damage CUREWOUNDS = new Damage(1, d8, 0, "Healing");

			/*
			 * Weapons
			 */
			
			public final Attack battleAxeAtt = new Attack(0, new Damage(1, d8, 0, "Slashing"));
			public final int [] battleAxeRange = {};
			public final boolean [] battleAxeProp = {false, false, false, false, false, false, true};
			
			public final boolean [] daggerProperties = {false, true, true, false, true, false, false};
			public final int [] daggerRange = {20, 60};
			public final Attack daggerAttack = new Attack(0, new Damage(1, d4, 0, "Piercing"));
			
}
