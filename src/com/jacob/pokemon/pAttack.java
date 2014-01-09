package com.jacob.pokemon;

import java.util.Random;
public class pAttack {
	public static double se = 1;
	public static double pAttack(double mDamage, double yAtt, double oDef, Type aType, Type bType){
		Random r = new Random();
		if	(aType == Type.WATER && bType == Type.FIRE) se = 2;
		else if(aType == Type.WATER && bType == Type.GRASS) se = .5;
		else if(aType == Type.FIRE && bType == Type.GRASS) se = 2;
		else if(aType == Type.FIRE && bType == Type.WATER) se = .5;
		else if(aType == Type.GRASS && bType == Type.WATER) se = 2;
		else if(aType == Type.GRASS && bType == Type.FIRE) se = .5;
		
		System.out.println("se = " + se);
		System.out.println("Move Damage = " + mDamage);
		System.out.println("His Att = " + yAtt);
		System.out.println("Their Def = " + oDef);
		System.out.println("His Move Type = " + aType);
		System.out.println("Their PokeType = " + bType);
		
		return /*se **/ (Math.ceil(((((yAtt+(mDamage/2))/1.5) + oDef)/1.5))); 

	}
	
}

