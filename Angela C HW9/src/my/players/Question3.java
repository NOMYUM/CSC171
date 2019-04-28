package my.players;

public class Question3 {
	public static void main(String[] args) {
	MP3players mplayer= new MP3players(" mp3 player", " music.");
	System.out.println(mplayer.toString());
	
	saxophoneplayers splayer= new saxophoneplayers(" saxophone player", " sound.");
	System.out.println(splayer.toString());
	
	soccerplayers soplayer= new soccerplayers(" soccer player", " kick.");
	System.out.println(soplayer.toString());
	}
}
