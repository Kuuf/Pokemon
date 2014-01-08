import java.util.Scanner;
import java.util.Random;
public class Battle {
	public static Pokemon a1;
	public static Pokemon b1;;
	public static String move;
	public static void Battle(Pokemon a, Pokemon b){
		Random r = new Random();
		a1 = a; b1 = b;

		Scanner s = new Scanner(System.in);

		System.out.println("This is a battle between " + Main.player + " and " + Main.rival + ".");
		System.out.println("\nCue battle music!");
		System.out.println("\n" + Main.player + " sends out " + Main.nick);
		System.out.println("\n" + Main.rival + " sends out " + b.getName());

		while(b.getHp() > 0 && a.getHp() > 0) {
			System.out.println("\nHere are your move options: \n"
					+ "1." + a.getMove1() + "\n" + "2." +  a.getMove2() + "\nWhat move would you like to use?");
				move = s.nextLine().toUpperCase();

			while(!move.toUpperCase().equals(a.move1.getName()) && !move.toUpperCase().equals(a.move2.getName())){
				System.out.println("Please enter a valid move.");
				move = s.nextLine().toUpperCase();
				
				
			}
			int choice = r.nextInt(2)+1;
			if(a.getSpd()>b.getSpd()) {aTurn(); bTurn();}
			if(a.getSpd()<b.getSpd()) {bTurn(); aTurn();}
			if(a.getSpd()==b.getSpd() && choice == 1) {aTurn(); bTurn();}
			if(a.getSpd()==b.getSpd() && choice == 2) {bTurn(); aTurn();}
		}
		
	}

	public static void aTurn(){
	
			if(move.equals(a1.move1.getName())){ 

				System.out.println("\n" + a1.getName() + " uses " + a1.move1.getName() + "!");
				System.out.println("Damage before se = " + (pAttack.pAttack(a1.move1.getDamage(), a1.getAtt(), b1.getDef(), a1.getType(), b1.getType()))/*/pAttack.se*/);
				System.out.println(a1.move1.getType().getTypeName() + " " + b1.getType().getTypeName());
				b1.hp -= pAttack.pAttack(a1.move1.getDamage(), a1.getAtt(), b1.getDef(), a1.move1.getType(), b1.getType());
				System.out.println("Damage after se = " + pAttack.pAttack(a1.move1.getDamage(), a1.getAtt(), b1.getDef(), a1.getType(), b1.getType()));
				System.out.println(b1.getName()+"'s hp = " + b1.hp);
				if(b1.getHp() <=  0) System.out.println("You Win!");

			}

			if(move.equals(a1.move2.getName())) {
				System.out.println("\n" + a1.getName() + " uses " + a1.move2.getName() + "!");
				System.out.println(a1.move2.getType().getTypeName() + " " + b1.getType().getTypeName());
				b1.hp -= pAttack.pAttack(a1.move2.getDamage(), a1.getAtt(), b1.getDef(), a1.move2.getType(), b1.getType());
				System.out.println("Damage dealt before se = " + (pAttack.pAttack(a1.move2.getDamage(), a1.getAtt(), b1.getDef(), a1.getType(), b1.getType()))/*/pAttack.se*/);
				System.out.println("Damage dealt = " + pAttack.pAttack(a1.move2.getDamage(), a1.getAtt(), b1.getDef(), a1.getType(), b1.getType()));
				System.out.println(b1.getName()+"'s hp = " + b1.hp);
				if(b1.getHp() <=  0) System.out.println("You Win!");
			}
		

	}

	public static void bTurn(){
		Random r = new Random();
		
		int bMove = r.nextInt(2)+1;//+b1.getMoveNum();
		
			if(bMove == 1){ 
				System.out.println("\n" + b1.getName() + " uses " + b1.move1.getName() + "!");
				System.out.println(b1.move1.getType().getTypeName() + " " + a1.getType().getTypeName());
				a1.hp -= pAttack.pAttack(b1.move2.getDamage(), b1.getAtt(), a1.getDef(), b1.move1.getType(), a1.getType());
				System.out.println("Damage dealt before se = " + pAttack.pAttack(b1.move1.getDamage(), b1.getAtt(), a1.getDef(), b1.getType(), a1.getType())/*/pAttack.se*/);
				System.out.println("Damage dealt = " + pAttack.pAttack(b1.move1.getDamage(), b1.getAtt(), a1.getDef(), b1.getType(), a1.getType()));
				System.out.println(a1.getName()+"'s hp = " + a1.hp);
				if(a1.getHp() <= 0) System.out.println("You loose!");
			}

			if(bMove == 2) {
				System.out.println("\n" + b1.getName() + " uses " + b1.move2.getName() + "!");
				System.out.println(b1.move2.getType().getTypeName() + " " + a1.getType().getTypeName());
				a1.hp -= pAttack.pAttack(b1.move2.getDamage(), b1.getAtt(), a1.getDef(), b1.move2.getType(), a1.getType());
				System.out.println("Damage dealt before se = " + (pAttack.pAttack(b1.move2.getDamage(), b1.getAtt(), a1.getDef(), b1.getType(), a1.getType()))/*/pAttack.se*/);
				System.out.println("Damage dealt after se = " + pAttack.pAttack(b1.move2.getDamage(), b1.getAtt(), a1.getDef(), b1.getType(), a1.getType()));
				System.out.println(a1.getName()+"'s hp = " + a1.hp);
				if(a1.getHp() <=  0) System.out.println("You loose!");
			}
		
	}

}
