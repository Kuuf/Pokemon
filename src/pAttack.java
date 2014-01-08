import java.util.Random;
public class pAttack {
	public static double se;
	public static double pAttack(double mDamage, double yAtt, double oDef, Type aType, Type bType){
		Random r = new Random();
		if	   (aType == Type.WATER && bType == Type.FIRE) se = 2;
		else if(aType == Type.WATER && bType == Type.GRASS) se = .5;
		else if(aType == Type.FIRE && bType == Type.GRASS) se = 2;
		else if(aType == Type.FIRE && bType == Type.WATER) se = .5;
		else if(aType == Type.GRASS && bType == Type.WATER) se = 2;
		else if(aType == Type.GRASS && bType == Type.FIRE) se = .5;
		else se = 1;
		System.out.println("se = " + se);
		
		return se * (Math.ceil(((((yAtt+(mDamage/2))/1.5) + oDef)/1.5))); 

	}
	
}

