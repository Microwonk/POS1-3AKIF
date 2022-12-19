import java.util.*;
import java.lang.Thread;

public class Enemy {
    
    public Player player = Menu.player;

    private int playerHealth = this.player.health;
    
    private int strength, health, maxHealth;
    private String name;
    private static Random r = new Random();
    
    
    /**
     * constructor (enemies get harder, the higher the player level is)
     * @param level Playerlevel, to which the difficulty is set
     */
    public Enemy (int level) {
        if (level < 4) {
            this.strength = r.nextInt(1 * level, 10 * level );
            this.health = r.nextInt(10 * level, 31 * level);
        }
        else {
            this.strength = r.nextInt(10, 61);
            this.health = r.nextInt(20, 100);
        }
        this.name = nameArray[r.nextInt(0, nameArray.length - 1)];
        this.maxHealth = this.health;
        
        return;
    }

    
    //prints out all the stats of the Enemy
    public void getEnemystats () {
        System.out.println(this.name + "'s Stats");
        System.out.println("Strength: " + this.strength);
        System.out.println("Health: " + this.health);
        try {
            Thread.sleep(2000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return;
    }

    //der komplette Kampfablauf
    public void fight () {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int input, attackdamage;
        boolean used = false;
        
        System.out.println("<Do you accept the fight? (y) (n)>");
        String decision = scan.next();

        //deciding to fight
        if (decision.equalsIgnoreCase("y")) {
            //fights, until you or the enemy is dead / until you flee
            while (true) {
                System.out.println("<It's your turn, what do you wish to do?>");
                input = attackMenu();
                //attack
                if (input == 1) {
                    System.out.println("<YOU ATTACKED>");
                    attackdamage = attack(player.strength);
                    System.out.println("Your attack did " + attackdamage + " damage.");
                    this.health = this.health - attackdamage;
                    System.out.println("The Enemy is now at " + this.health + " health");
                }
                //heal
                else if (input == 2) {
                    System.out.println("<YOU HEALED>");
                    playerHealth += r.nextInt(1, 10);
                    if (playerHealth > player.health) {
                        playerHealth = player.health;
                    }
                    System.out.println("<You healed up to " + playerHealth + " health>");
                }
                //special attack
                else if (input == 3) {
                    // the attack has already been used this round
                    if (used) {
                        System.out.println("Already used special move!");
                    }
                    // using the special move, sets used to true
                    else {
                        System.out.println("<YOU USED " + player.specialMove + ">");
                        attackdamage = attack(player.specialMoveStrength * 3);
                        System.out.println("Your attack did " + attackdamage + " damage.");
                        this.health -= attackdamage;
                        System.out.println("The Enemy is now at " + this.health + " health");
                        used = true;
                    }
                        
                }
                //fleeing
                else {
                    int xp = getXP(this.strength, this.maxHealth);
                    System.out.println("<Be more prepared next Time>");
                    Menu.player.levelUp(-xp);
                    System.out.println("<" + xp + " XP lost>");

                    //resets the health after every fight
                    playerHealth = player.health;
                    return;
                }

                // if it dies, no move can be done by the enemy
                if (this.health > 0) {
                    enemyTurn();
                }
                else {
                    System.out.println(this.name + " died!");
                }

                if ((this.health <= 0 ) || (playerHealth <= 0)) {
                    break;
                }
            }
            int xp = getXP(this.strength, this.maxHealth);

            //if you win
            if (this.health <= 0) {
                System.out.println("<You win!>");
                Menu.player.levelUp(xp);
                System.out.println("<" + xp + " XP received>");
            }
            //if you lost
            else if (playerHealth <= 0) {
                System.out.println("<You lose!>");
                Menu.player.levelUp(-xp);
                System.out.println("<" + xp + " XP lost>");
            }
            //resets the health after every fight
            playerHealth = Menu.player.health;
            return;
        }
        else {
            System.out.println("<Be more prepared next Time>");
            return;
        }
    }

    //pops up every Round, until you beat the enemy or until u die
    public int attackMenu () {
        Scanner scan = new Scanner(System.in);
        int input;
        while (true) {
            System.out.println("------------------------------");
            System.out.println("-- (1) Attack ------------------");
            System.out.println("-- (2) Heal --------------------");
            System.out.println("-- (3) Special Attack (one use only)");
            System.out.println("-- (4) Flee (lose XP) ------------");
            System.out.println("-------------------------------");
            input = scan.nextInt();
            if (input == 1 || input == 2 || input == 3 || input == 4) {
                return input;
            }
            System.out.println("Error: Invalid Argument");
        }
    }

    // enemies Turn
    public void enemyTurn () {
        Random r = new Random();
        int decision = r.nextInt(1, 4);

        // 2/3 chance it attacks
        if (decision == 1 || decision == 2) {
            System.out.println("<" + this.name + " attacks you!>");
            int damage = attack(this.strength);
            playerHealth -= damage;
            if (playerHealth < 0) {
                playerHealth = 0;
            }
            System.out.println("<You take " + damage + " damage, your Health is now at " + playerHealth);
        }

        // 1/3 chance it heals itself
        else if (decision == 3) {
            System.out.println("<" + this.name + " heals itself!>");
            this.health += r.nextInt(1, 6);

            if (this.health > maxHealth) {
                this.health = maxHealth;
            }
            else if (this.health < 0) {
                this.health = 0;
            }
            System.out.println("<" + this.name + " is now at " + this.health + " health!>");

        }
        // delay, so that its easier to see
        try {
            Thread.sleep(2000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return;
    }

    //returns attackdamage
    public int attack (int strength) {
        Random r = new Random();
        int damage = strength / 4 + r.nextInt(1, 4);
        return damage;
    }

    //calculates the amount of xp you get, when beating an enemy
    public static int getXP (int strength, int health) {
        return (strength + health) * 5;
    }

    // array of all pokemon names
    private static String[] nameArray = {
        "Abomasnow", "Abra", "Absol", "Accelgor", "Aegislash", "Aerodacty", "Aggron", "Aipom", "Alakazam", "Alcremie", "Alomomola", "Altaria", "Amaura", "Ambipom", "Amoonguss", "Ampharos", "Anorith", "Appletun", "Applin", "Araquanid", "Arbok", "Arcanine", "Arceus", "Archen", "Archeops", "Arctovish", "Arctozolt", "Ariados", "Armaldo", "Aromatiss", "Aron", "Arrokuda", "Articuno", "Audino", "Aurorus", "Avalugg", "Axew", "Azelf", "Azumarill", "Azurill", "Bagon", "Baltoy", "Banette", "Barbaracl", "Barboach", "Barraskewa", "Basculin", "Bastiodon", "Bayleef", "Beartic", "Beautifly", "Beedrill", "Beheeyem", "Beldum", "Bellossom", "Bellsprou", "Bergmite", "Bewear", "Bibarel", "Bidoof", "Binacle", "Bisharp", "Blacephaln", "Blastoise", "Blaziken", "Blipbug", "Blissey", "Blitzle", "Boldore", "Boltund", "Bonsly", "Bouffalan", "Bounsweet", "Braixen", "Braviary", "Breloom", "Brionne", "Bronzong", "Bronzor", "Bruxish", "Budew", "Buizel", "Bulbasaur", "Buneary", "Bunnelby", "Burmy", "Butterfre", "Buzzwole", "Cacnea", "Cacturne", "Calyrex", "Camerupt", "Carbink", "Carkol", "Carnivine", "Carracost", "Carvanha", "Cascoon", "Castform", "Caterpie", "Celebi", "Celesteel", "Centiskorh", "Chandelur", "Chansey", "Charizard", "Charjabug", "Charmande", "Charmeleo", "Chatot", "Cherrim", "Cherubi", "Chesnaugh", "Chespin", "Chewtle", "Chikorita", "Chimchar", "Chimecho", "Chinchou", "Chingling", "Cinccino", "Cinderace", "Clamperl", "Clauncher", "Clawitzer", "Claydol", "Clefable", "Clefairy", "Cleffa", "Clobbopus", "Cloyster", "Coalossal", "Cobalion", "Cofagrigu", "Combee", "Combusken", "Comfey", "Conkeldur", "Copperaja", "Corphish", "Corsola", "Corviknigt", "Corvisquie", "Cosmoem", "Cosmog", "Cottonee", "Crabominale", "Crabrawle", "Cradily", "Cramorant", "Cranidos", "Crawdaunt", "Cresselia", "Croagunk", "Crobat", "Croconaw", "Crustle", "Cryogonal", "Cubchoo", "Cubone", "Cufant", "Cursola", "Cutiefly", "Cyndaquil", "Darkrai", "Darmanita", "Dartrix", "Darumaka", "Decidueye", "Dedenne", "Deerling", "Deino", "Delcatty", "Delibird", "Delphox", "Deoxys", "Dewgong", "Dewott", "Dewpider", "Dhelmise", "Dialga", "Diancie", "Diggersby", "Diglett", "Ditto", "Dodrio", "Doduo", "Donphan", "Dottler", "Doublade", "Dracovish", "Dracozolt", "Dragalge", "Dragapult", "Dragonair", "Dragonite", "Drakloak", "Drampa", "Drapion", "Dratini", "Drednaw", "Dreepy", "Drifblim", "Drifloon", "Drilbur", "Drizzile", "Drowzee", "Druddigon", "Dubwool", "Ducklett", "Dugtrio", "Dunsparce", "Duosion", "Duraludon", "Durant", "Dusclops", "Dusknoir", "Duskull", "Dustox", "Dwebble", "Eelektrik", "Eelektros", "Eevee", "Eiscue", "Ekans", "Eldegoss", "Electabuz", "Electivir", "Electrike", "Electrode", "Elekid", "Elgyem", "Emboar", "Emolga", "Empoleon", "Entei", "Escavalie", "Espeon", "Espurr", "Eternatus", "Excadrill", "Exeggcute", "Exeggutor", "Exploud", "Falinks", "Farfetch", "Fearow", "Feebas", "Fennekin", "Feraligat", "Ferroseed", "Ferrothor", "Finneon", "Flaaffy", "Flabébé", "Flapple", "Flareon", "Fletchindr", "Fletchlin", "Floatzel", "Floette", "Florges", "Flygon", "Fomantis", "Foongus", "Forretres", "Fraxure", "Frillish", "Froakie", "Frogadier", "Froslass", "Frosmoth", "Furfrou", "Furret", "Gabite", "Gallade", "Galvantul", "Garbodor", "Garchomp", "Gardevoir", "Gastly", "Gastrodon", "Genesect", "Gengar", "Geodude", "Gible", "Gigalith", "Girafarig", "Giratina", "Glaceon", "Glalie", "Glameow", "Glastrier", "Gligar", "Gliscor", "Gloom", "Gogoat", "Golbat", "Goldeen", "Golduck", "Golem", "Golett", "Golisopod", "Golurk", "Goodra", "Goomy", "Gorebyss", "Gossifleu", "Gothita", "Gothitell", "Gothorita", "Gourgeist", "Granbull", "Grapploct", "Graveler", "Greedent", "Greninja", "Grimer", "Grimmsnar", "Grookey", "Grotle", "Groudon", "Grovyle", "Growlithe", "Grubbin", "Grumpig", "Gulpin", "Gumshoos", "Gurdurr", "Guzzlord", "Gyarados", "Hakamo-o", "Happiny", "Hariyama", "Hatenna", "Hatterene", "Hattrem", "Haunter", "Hawlucha", "Haxorus", "Heatmor", "Heatran", "Heliolisk", "Helioptil", "Heracross", "Herdier", "Hippopota", "Hippowdon", "Hitmoncha", "Hitmonlee", "Hitmontop", "Honchkrow", "Honedge", "Ho-Oh", "Hoopa", "Hoothoot", "Hoppip", "Horsea", "Houndoom", "Houndour", "Huntail", "Hydreigon", "Hypno", "Igglybuff", "Illumise", "Impidimp", "Incineroar", "Indeedee", "Infernape", "Inkay", "Inteleon", "Ivysaur", "Jangmo-o", "Jellicent", "Jigglypuf", "Jirachi", "Jolteon", "Joltik", "Jumpluff", "Jynx", "Kabuto", "Kabutops", "Kadabra", "Kakuna", "Kangaskha", "Karrablas", "Kartana", "Kecleon", "Keldeo", "Kingdra", "Kingler", "Kirlia", "Klang", "Klefki", "Klink", "Klinklang", "Koffing", "Komala", "Kommo-o", "Krabby", "Kricketot", "Kricketun", "Krokorok", "Krookodil", "Kubfu", "Kyogre", "Kyurem", "Lairon", "Lampent", "Landorus", "Lanturn", "Lapras", "Larvesta", "Larvitar", "Latias", "Latios", "Leafeon", "Leavanny", "Ledian", "Ledyba", "Lickilick", "Lickitung", "Liepard", "Lileep", "Lilligant", "Lillipup", "Linoone", "Litleo", "Litten", "Litwick", "Lombre", "Lopunny", "Lotad", "Loudred", "Lucario", "Ludicolo", "Lugia", "Lumineon", "Lunala", "Lunatone", "Lurantis", "Luvdisc", "Luxio", "Luxray", "Lycanroc", "Machamp", "Machoke", "Machop", "Magby", "Magcargo", "Magearna", "Magikarp", "Magmar", "Magmortar", "Magnemite", "Magneton", "Magnezone", "Makuhita", "Malamar", "Mamoswine", "Manaphy", "Mandibuzz", "Manectric", "Mankey", "Mantine", "Mantyke", "Maractus", "Mareanie", "Mareep", "Marill", "Marowak", "Marshadow", "Marshtomp", "Masquerai", "Mawile", "Medicham", "Meditite", "Meganium", "Melmetal", "Meloetta", "Meltan", "Meowstic", "Meowth", "Mesprit", "Metagross", "Metang", "Metapod", "Mew", "Mewtwo", "Mienfoo", "Mienshao", "Mightyena", "Milcery", "Milotic", "Miltank", "Mime Jr.", "Mimikyu", "Minccino", "Minior", "Minun", "Misdreavu", "Mismagius", "Moltres", "Monferno", "Morelull", "Morgrem", "Morpeko", "Mothim", "Mr. Mime", "Mr. Rime", "Mudbray", "Mudkip", "Mudsdale", "Muk", "Munchlax", "Munna", "Murkrow", "Musharna", "Naganadel", "Natu", "Necrozma", "Nickit", "Nidoking", "Nidoqueen", "Nidoran♀", "Nidoran♂", "Nidorina", "Nidorino", "Nihilego", "Nincada", "Ninetales", "Ninjask", "Noctowl", "Noibat", "Noivern", "Nosepass", "Numel", "Nuzleaf", "Obstagoon", "Octillery", "Oddish", "Omanyte", "Omastar", "Onix", "Oranguru", "Orbeetle", "Oricorio", "Oshawott", "Pachirisu", "Palkia", "Palossand", "Palpitoad", "Pancham", "Pangoro", "Panpour", "Pansage", "Pansear", "Paras", "Parasect", "Passimian", "Patrat", "Pawniard", "Pelipper", "Perrserke", "Persian", "Petilil", "Phanpy", "Phantump", "Pheromosa", "Phione", "Pichu", "Pidgeot", "Pidgeotto", "Pidgey", "Pidove", "Pignite", "Pikachu", "Pikipek", "Piloswine", "Pincurchi", "Pineco", "Pinsir", "Piplup", "Plusle", "Poipole", "Politoed", "Poliwag", "Poliwhirl", "Poliwrath", "Polteageit", "Ponyta", "Poochyena", "Popplio", "Porygon", "Porygon2", "Porygon-Z", "Primarina", "Primeape", "Prinplup", "Probopass", "Psyduck", "Pumpkaboo", "Pupitar", "Purrloin", "Purugly", "Pyroar", "Pyukumuku", "Quagsire", "Quilava", "Quilladin", "Qwilfish", "Raboot", "Raichu", "Raikou", "Ralts", "Rampardos", "Rapidash", "Raticate", "Rattata", "Rayquaza", "Regice", "Regidrago", "Regieleki", "Regigigas", "Regirock", "Registeel", "Relicanth", "Remoraid", "Reshiram", "Reuniclus", "Rhydon", "Rhyhorn", "Rhyperior", "Ribombee", "Rillaboom", "Riolu", "Rockruff", "Roggenrol", "Rolycoly", "Rookidee", "Roselia", "Roserade", "Rotom", "Rowlet", "Rufflet", "Runerigus", "Sableye", "Salamence", "Salandit", "Salazzle", "Samurott", "Sandacond", "Sandile", "Sandshrew", "Sandslash", "Sandygast", "Sawk", "Sawsbuck", "Scatterbu", "Sceptile", "Scizor", "Scolipede", "Scorbunny", "Scrafty", "Scraggy", "Scyther", "Seadra", "Seaking", "Sealeo", "Seedot", "Seel", "Seismitoa", "Sentret", "Serperior", "Servine", "Seviper", "Sewaddle", "Sharpedo", "Shaymin", "Shedinja", "Shelgon", "Shellder", "Shellos", "Shelmet", "Shieldon", "Shiftry", "Shiinotic", "Shinx", "Shroomish", "Shuckle", "Shuppet", "Sigilyph", "Silcoon", "Silicobra", "Silvally", "Simipour", "Simisage", "Simisear", "Sinistea", "Sirfetch", "Sizzliped", "Skarmory", "Skiddo", "Skiploom", "Skitty", "Skorupi", "Skrelp", "Skuntank", "Skwovet", "Slaking", "Slakoth", "Sliggoo", "Slowbro", "Slowking", "Slowpoke", "Slugma", "Slurpuff", "Smeargle", "Smoochum", "Sneasel", "Snivy", "Snom", "Snorlax", "Snorunt", "Snover", "Snubbull", "Sobble", "Solgaleo", "Solosis", "Solrock", "Spearow", "Spectrier", "Spewpa", "Spheal", "Spinarak", "Spinda", "Spiritomb", "Spoink", "Spritzee", "Squirtle", "Stakataka", "Stantler", "Staraptor", "Staravia", "Starly", "Starmie", "Staryu", "Steelix", "Steenee", "Stonjournr", "Stoutland", "Stufful", "Stunfisk", "Stunky", "Sudowoodo", "Suicune", "Sunflora", "Sunkern", "Surskit", "Swablu", "Swadloon", "Swalot", "Swampert", "Swanna", "Swellow", "Swinub", "Swirlix", "Swoobat", "Sylveon", "Taillow", "Talonflam", "Tangela", "Tangrowth", "Tapu Bulu", "Tapu Fini", "Tapu Koko", "Tapu Lele", "Tauros", "Teddiursa", "Tentacool", "Tentacruel", "Tepig", "Terrakion", "Thievul", "Throh", "Thundurus", "Thwackey", "Timburr", "Tirtouga", "Togedemaru", "Togekiss", "Togepi", "Togetic", "Torchic", "Torkoal", "Tornadus", "Torracat", "Torterra", "Totodile", "Toucannon", "Toxapex", "Toxel", "Toxicroak", "Toxtricity", "Tranquill", "Trapinch", "Treecko", "Trevenant", "Tropius", "Trubbish", "Trumbeak", "Tsareena", "Turtonator", "Turtwig", "Tympole", "Tynamo", "Typhlosion", "Tyranitar", "Tyrantrum", "Tyrogue", "Tyrunt", "Umbreon", "Unfezant", "Unown", "Ursaring", "Urshifu", "Uxie", "Vanillish", "Vanillite", "Vanilluxe", "Vaporeon", "Venipede", "Venomoth", "Venonat", "Venusaur", "Vespiquen", "Vibrava", "Victini", "Victreebel", "Vigoroth", "Vikavolt", "Vileplume", "Virizion", "Vivillon", "Volbeat", "Volcanion", "Volcarona", "Voltorb", "Vullaby", "Vulpix", "Wailmer", "Wailord", "Walrein", "Wartortle", "Watchog", "Weavile", "Weedle", "Weepinbell", "Weezing", "Whimsicott", "Whirlipede", "Whiscash", "Whismur", "Wigglytuff", "Wimpod", "Wingull", "Wishiwashi", "Wobbuffet", "Woobat", "Wooloo", "Wooper", "Wormadam", "Wurmple", "Wynaut", "Xatu", "Xerneas", "Xurkitree", "Yamask", "Yamper", "Yanma", "Yanmega", "Yungoos", "Yveltal", "Zacian", "Zamazenta", "Zangoose", "Zapdos", "Zarude", "Zebstrika", "Zekrom", "Zeraora", "Zigzagoon", "Zoroark", "Zorua", "Zubat", "Zweilous", "Zygarde"
    };
}
