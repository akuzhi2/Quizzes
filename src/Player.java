
public class Player {
	private int[] harryPotter;
	private int[] hist;
	private int[] sharkos;
	private int quiz; 
	public Player(int quiz) {
		this.quiz = quiz;
		if(this.quiz == 0) {
			hist = new int[12];
		} else if (this.quiz == 1) {
			harryPotter = new int[5];
		} else if(this.quiz == 2) {
			sharkos = new int[6];
		}
   }
}
