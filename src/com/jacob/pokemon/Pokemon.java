package com.jacob.pokemon;


public class Pokemon {
	public double hp,att,def,spd;
	public int moveNum;
	public String name;
	public Moves move1,move2,move3,move4;
	public Type type;
	public static Pokemon BULBASAUR = new Pokemon
			("BULBASAUR", 45, 5, 5, 4, Moves.TACKLE, Moves.VINE_WHIP, 2, Type.GRASS);
	public static Pokemon CHARMANDER = new Pokemon
			("CHARMANDER", 43, 7, 3, 5, Moves.SCRATCH, Moves.EMBER, 2, Type.FIRE);
	public static Pokemon SQUIRTLE = new Pokemon
			("SQUIRTLE", 46, 3, 7, 3, Moves.TACKLE, Moves.WATER_GUN, 2, Type.WATER );

	public Pokemon(String name, int hp, int att, int def, int spd, Moves move1, Moves move2, int moveNum, Type type){
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.spd = spd;
		this.move1 = move1;
		this.move2 = move2;
		this.moveNum = moveNum;
		this.type = type;
		//this.move3 = move3; <<to be used later
		//this.move4 = move4; <<to be used later
	}
	
	public double getDef() {
		return def;
	}
	public double getAtt(){
		return att;
	}
	public double getSpd(){
		return spd;
	}
	public double getHp(){
		return hp;
	}
	public String getName(){
		return name;
	}
	public Moves getMove1(){
		return move1;
	}
	public Moves getMove2(){
		return move2;
	}
	public int getMoveNum(){
		return moveNum;
	}
	public Type getType(){
		return type;
	}


}
