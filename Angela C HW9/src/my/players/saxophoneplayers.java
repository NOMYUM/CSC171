package my.players;

public class saxophoneplayers {
	private String name;
	private String function;

	public saxophoneplayers(String name, String function) {
		this.name = name;
		this.function = function;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String toString() {
		return "Name of the player is" + this.name + ". " + "The function is to play" + this.function;
	}
}