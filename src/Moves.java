
public enum Moves {
	
	WATER_GUN(30, "WATER GUN", Type.WATER), EMBER(30, "EMBER", Type.FIRE), VINE_WHIP(20, "VINE WHIP", Type.GRASS), 
	SCRATCH(25, "SCRATCH", Type.NORMAL), TACKLE(30, "TACKLE", Type.NORMAL);
	
	
	private double damage;
	private String name;
	private Type type;
	
	
	private Moves(double damage,String name, Type type){
		this.damage = damage;
		this.name = name;
		this.type = type;
	}
	public double getDamage(){
		return damage;
	}
	public String getName(){
		return name;
	}
	public Type getType(){
		return type;
	}
	
}
