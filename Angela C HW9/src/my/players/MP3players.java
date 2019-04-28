package my.players;

class MP3players {
	private String name;
	private String function;

	public MP3players(String name, String function) {
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
