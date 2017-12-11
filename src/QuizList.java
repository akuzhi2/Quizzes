import java.util.HashMap;
public class QuizList {
	HashMap<String, String[]> historical = new HashMap<String, String[]>();
	HashMap<String, String[]> shark = new HashMap<String, String[]>();
	HashMap<String, String[]> harry = new HashMap<String, String[]>();
	private int quizType;
	private boolean done;
	public QuizList(int q) {
		quizType = q;
		done = true;
	}
	public boolean getDone() {
		return done; 
	}
	public void setQuizType(int q) {
		done = false;
		quizType = q;
	
	}
	public void done() {
		done = false;
	}
	public int getQuizType() {
		return quizType;
	}
	public HashMap<String, String[]> implement() {
		String[] arr = {"Reason", "Emotion"};
		historical.put("How do you most often make decisions?", arr);
		String[] arr2 = {"Very skilled at many things", "Expert at one thing"};
		historical.put("<br>Would you rather be very skilled at many things<br> or an expert one thing?", arr2);
		String[] arr3 = {"Ambition", "Determination", "Courage", "Intelligence", "Creativity"};
		historical.put("<br>What do you believe is most key to success?", arr3);
		String[] arr4 = {"Honesty", "Kindness", "Caring", "Tenacity"};
		historical.put("Which quality do you identify with the most?", arr4);
		String[] arr5 = {"Arrogance", "Ambition", "Stubborness"};
		historical.put("Which quality do you believe hinders you most?" , arr5);
		String[] arr6 = {"Something new", "Progress on already discovered topic"};
		historical.put("<br>Would you rather discover something new <br>or make major progress on a disocvered topic?", arr6);
		String[] arr7 = {"Leader", "Follower"};
		historical.put("<br>Do uncondtionally follow authority,<br> or do you believe that there are exceptions?", arr7);
		String[] shark1 = {"Relaxing on a beach in Hawaii", "Skiing in Colorado","Strolling through cornfields in Illinois", "Sightseeing in London"};
		shark.put("What vacation activity sounds most appealing?", shark1);
		String[] shark2 = {"White", "Grey", "Blue", "Brown", "Green"};
		shark.put("Pick a color: ", shark2);
		String[] shark3 = {"Solid", "Stripes", "Dots"};
		shark.put("Choose a pattern: ", shark3);
		String[] shark4 = {"Introverted", "Extroverted"};
		shark.put("Choose one:", shark4);
		String[] shark5 = {"Train for a marathon", "Stay home and eat cookies"};
		shark.put("Choose a situation", shark5);
		String[] shark6 = {"Yes", "No"};
		shark.put("Have you ever bullied someone( answer honestly :)", shark6);
		String[] shark7 = {"Over the speed limit- you are a rebel", "The speed limit- rules are important", "Under the speed limit and enjoying the scenery"};
		shark.put("<br>You are driving a car down an empty country road- <br>what speed do you go?", shark7);
		String[] shark8 = {"Get in a car and choose the first restaurant you see", "Meticulously comb through Yelp and find a good restaurant",
				"Drive around in circles and choose the restaurant that has the longest wait line",
				"Do nothing and hope food just arrives spontaneously"};
		shark.put("<br>You and your friends are going out for food. <br> How do you choose where to eat?", shark8);
		String[] harry1 = {"Run at it and fight it head on", "Con yourself out of the situation","Plan a strategy to get out of the situation safely",
				"Make yourself hidden and wait patiently for the beast to leave"};
		harry.put("<br>        You encountered a terrifying beast <br>         blocking your way to freedom.<br>         What do you do?", harry1);
		String[] harry2 = {"Furious and hurt","Understanding with no hard feelings", "Passive aggressive", "Hurt but understanding"};
		harry.put("<br>You and your partner have been planning<br> an important date for months, <br>but your partner had to cancel last minute <br> because of work. <br> What do you feel?", harry2);
		String[] harry3 = {"Although loyal, you turn them in","Help them, but you plan to keep a token of the evidence as blackmail",
				"You ask them what they did, and depending on what they did, you either help them or you turn them in",
				"Surprised, you help your friend, but guilt eats at you"};
		harry.put("        Your friend tells you to come over. <br>        You walk into your friend’s house, and you see them crying. <br>They said that did something horrible, <br>        and they need your help to cover up their mess. <br>        What do you do?",harry3);
		String[] harry4 = {"Anything but Slytherin", "The house I deserve", "(Doesn't Respond)", "I'm not sure"};
		harry.put("What house do you want to be in?", harry4);
		String[] harry5 = {"Dog", "Hawk", "Seal", "Crow"};
		harry.put("What animal do you most relate to?", harry5);
		String[] harry6 = {"Furiously confront them, enraged and hurt.","Angered, you do something else in retaliation.",
				"Hurt, you ask them why they did it.",
				"You calmly confront them." };
		harry.put("Someone close to you has wronged you. What do you do?", harry6);
		String[] harry7 = {"Punch them back", "Taze them.", "Step back surprised and ask them why they punched you.", "Knock them out and walk away calmly"};
		harry.put("<br>         You’re minding your own business, <br>          and suddenly, someone approaches you and, <br>          out of the blue, punches you. <br>         You ___", harry7);
		String[] harry8 = {"Yes!", "Uh, no..."};
		harry.put("Do you think ron was a good friend?", harry8);
		if(quizType == 0) {
			return historical;
		} else if(quizType == 1) {
			return shark;
		} else if(quizType == 2) {
			return harry;
		}
		return null;
		
	}
}
