
public enum Type {

	FIRE("FIRE"), GRASS("GRASS"), WATER("WATER"), NORMAL("NORMAL");



	private String name;
	private Type(String name){
		this.name = name;
	}

	String getTypeName(){
		return name;
	}
}