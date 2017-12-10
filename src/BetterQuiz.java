import java.util.Arrays;

public class BetterQuiz{

	public String peeps(String[] input) {

		String[] names= {"Alexander Hamilton", "Abraham Lincoln","William Shakespeare", "Albert Einstein", "Leonardo Da Vinci",
				"Thomas Hobbes", "Susan B. Anthony", "Marie Curie","Ruth Bader Ginsburg","Mary Shelley", "Hua Mulan",
				"Harriet Tubman"};

		int[] points=new int[12];

		String[][] answers=new String[12][6];
		answers[0] = new String[] {"Reason","Very skilled at many things","Ambition","Tenacity","Arrogance",
				"Something new"};
		answers[1] = new String[] {"Reason","Expert at one thing","Determination","Honesty","Stubborness",
				"Progress on already discovered topic"};
		answers[2] = new String[] {"Emotion","Expert at one thing","Creativity","Tenacity","Ambition",
				"Something new"};
		answers[3] = new String[] {"Reason","Expert at one thing","Intelligence","Kindness","Stubborness",
				"Something new"};
		answers[4] = new String[] {"Emotion","Very skilled at many things","Creativity", "Tenacity","Ambition",
				"Something new"};
		answers[5] = new String[] {"Reason","Expert at one thing", "Intelligence","Honesty","Arrogance",
				"Something new"};
		answers[6] = new String[] {"Emotion","Expert at one thing","Courage","Kindness","Stubborness",
				"Progress on already discovered topic"};
		answers[7] = new String[] {"Reason","Expert at one thing", "Ambition", "Honesty","Stubborness",
				"Something new"};
		answers[8] = new String[] {"Reason","Expert at one thing","Determination","Honesty","Stubborness",
				"Progress on already discovered topic"};
		answers[9] = new String[] {"Emotion","Very skilled at many things","Creativity", "Kindness","Ambition",
				"Progress on already discovered topic"};
		answers[10] = new String[] {"Reason","Expert at one thing","Courage","Caring","Stubborness",
				"Something new"};
		answers[11] = new String[] {"Reason","Very skilled at many things","Courage","Caring","Ambition",
				"Something new"};

		for (int i=0; i<input.length;i++) {
			for (int e=0; e<answers.length;e++) {
				if(Arrays.asList(answers[e]).contains(input[i])) {
					int x = Arrays.asList(answers[e]).indexOf(input[i]);
					if(x==0) {
						points[e] += 1;
					} else if(x == 1 || x == 5) {
						points[e] += 2;
					} else if(x ==2) {
						points[e] += 5;
					} else if(x == 3) {
						points[e] +=3;
					} else if(x == 4) {
						points[e] += 6;
					} else {
						points[e] += 4;
					}
				}
			}
		}
		int max= points[0];
		int index = 0;
		for (int i=1; i<points.length;i++) {
			if (max<points[i]) {
				max=points[i];
				index=i;
			}
		}
		return(names[index]);
	}

	public String harryPotter (String[] input) {
		for (int k=0;k<input.length;k++) {
			if(input[k].equals("Uh, no...")) {
				return ("Death Eater");
			}
		}
		String[] house= {"Gryffindor","Slytherin","Ravenclaw","Hufflepuff"};
		int[] points=new int[4];
		String[][] answers=new String[4][7];
		answers[0] = new String[] {"Run at it and fight it head on","Furious and hurt","Surprised, you help your friend, but guilt eats at you",
				"Anything but Slytherin", "Dog", "Furiously confront them, enraged and hurt.",
		"Punch them back"};
		answers[1] = new String[] {"Con yourself out of the situation","Passive aggressive","Help them, but you plan to keep a token of the evidence as blackmail",
				"(Doesn't Respond)","Crow", "Angered, you do something else in retaliation.","Taze them."};
		answers[2] = new String[] {"Plan a strategy to get out of the situation safely","Hurt but understanding","You ask them what they did, and depending on what they did, you either help them or you turn them in",
				"The house I deserve", "Hawk","You calmly confront them.","Knock them out and walk away calmly"};
		answers[3] = new String[] {"Make yourself hidden and wait patiently for the beast to leave","Understanding with no hard feelings",
				"Although loyal, you turn them in","I'm not sure","Seal","Hurt, you ask them why they did it.","Step back surprised and ask them why they punched you."};
		for (int i=0; i<input.length;i++) {
			for (int e=0; e<answers.length;e++) {
				if(Arrays.asList(answers[e]).contains(input[i])) {
					int x = Arrays.asList(answers[e]).indexOf(input[i]);
					if(x == 0 || x == 2) {
						points[e] += 3;
					} else if( x == 1 || x == 3) {
						points[e] +=4;
					} else if( x == 5) {
						points[e] +=5;
					} else {
						points[e] += 1;
					}
				}

			}

		}

		int max= points[0];
		int index = 0;
		for (int i=1; i<points.length;i++) {
			if (max<points[i]) {
				max=points[i];
				index=i;
			}
		}
		return(house[index]);
	}

	public String sharkos(String[] input) {

		String[] sharkies= {"Great White Shark","Goblin Shark","Tiger Shark","Whale Shark","Sandbar Shark","Hammerhead Shark"};

		int[] points=new int[6];

		String[][] answers=new String[6][8];
		answers[0] = new String[] {"Sightseeing in London or Strolling through cornfields in Illinois","White","Solid",
				"Introverted","Train for a marathon","Yes","Over the speed limit- you are a rebel","Get in a car and choose the first restaurant you see"};
		answers[1] = new String[] {"Sightseeing in London or Strolling through cornfields in Illinois","Grey","Solid",
				"Introverted","Stay home and eat cookies", "Yes", "Under the speed limit and enjoying the scenery","Get in a car and choose the first restaurant you see"};
		answers[2] = new String[] {"Relaxing on a beach in Hawaii","Blue","Stripes","Stripes","Extroverted","Train for a marathon",
				"Yes", "Under the speed limit and enjoying the scenery", "Get in a car and choose the first restaurant you see"};
		answers[3] = new String[] {"Relaxing on a beach in Hawaii","Blue","Dots","Extroverted","Stay home and eat cookies","No",
				"The speed limit- rules are important","Do nothing and hope food just arrives spontaneously" };
		answers[4] = new String[] {"Sightseeing in London or Strolling through cornfields in Illinois","Brown","Solid",
				"Extroverted", "Train for a marathon", "No", "Under the speed limit and enjoying the scenery", "Meticulously comb through Yelp and find a good restaurant"};
		answers[5] = new String[] {"Skiing in Colorado","Green","Solid","Extroverted","Train for a marathon","Yes",
				"Over the speed limit- you are a rebel","Drive around in circles and choose the restaurant that has the longest wait line"};
		for (int i=0; i<input.length;i++) {
			for (int e=0; e<answers.length;e++) {
				if(Arrays.asList(answers[e]).contains(input[i])) {
					int x = Arrays.asList(answers[e]).indexOf(input[i]);
					if(x == 0 || x == 2 || x == 6) {
						points[e] += 3;
					} else if( x == 1 || x == 3) {
						points[e] +=4;
					} else if (x==4) {
						points[e] += 1;
					} if( x == 5) {
						points[e] +=5;
					} else {
						points[e] += 2;
					}
				}
			}
		}
		int max= points[0];
		int index = 0;
		for (int i=1; i<points.length;i++) {
			if (max<points[i]) {
				max=points[i];
				index=i;
			}
		}
		return(sharkies[index]);

	}
	public static void main(String[] args) {
		BetterQuiz q = new BetterQuiz();
		String[][] arr = new String[4][7];
		arr[0] = new String[]{"Furiously confront them, enraged and hurt.", "Dog", "Yes!", "Anything but Slytherin", "Although loyal, you turn them in",
				"Furious and hurt", "Punch them back", "Run at it and fight it head on"};
		System.out.println(arr[0][2]);
		String[] wtf = {"Furiously confront them, enraged and hurt.", "Dog", "Yes!", "Anything but Slytherin", "Although loyal, you turn them in",
				"Furious and hurt", "Punch them back", "Run at it and fight it head on"};
		System.out.println(q.harryPotter(wtf));
	}
}