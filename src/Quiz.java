import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.*;

import Photos.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.*;

public class Quiz {
	public HashMap<String, String[]> q;
	private QuizList l = new QuizList(0);
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	ArrayList<String> answers = new ArrayList<String>();
	public void startGame() throws InterruptedException, IOException, URISyntaxException {
		Menu menu = new Menu();
		menu.createAndShowGUI(l);
		while(l.getDone())
		{
			Thread.sleep(1000);
		}
		QuizImplement q = new QuizImplement();
		for (Map.Entry<String, String[]> entry : l.implement().entrySet()) {
			String key = entry.getKey();
			String[] value = entry.getValue();
			q.createAndShowGUI(l, l.getQuizType(), key, value, answers);
		}
		End end = new End();
		String[] answered = new String[answers.size()];
		for(int i = 0; i < answers.size(); i++) {
			answered[i] = answers.get(i);
		}
		BetterQuiz better = new BetterQuiz();
		String s = "hi";
		if(l.getQuizType() == 0) {
			s = better.peeps(answered);
		} else if(l.getQuizType() == 1) {
			s = better.sharkos(answered);
		} else {
			s = better.harryPotter(answered);
		}
		end.createAndShowGUI(l, s, l.getQuizType());
	}
	public void setQuizlist(QuizList q) {
		l = q;
	}
	public class Menu {
		final static boolean shouldFill = true;
		final static boolean shouldWeightX = true;
		final static boolean RIGHT_TO_LEFT = false;
		public void addComponentsToPaneMenu(Container pane, QuizList l) throws IOException, URISyntaxException {
			JPanel panel;
			pane.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			if (shouldFill) {
				//natural height, maximum width
				c.fill = GridBagConstraints.HORIZONTAL;
			}

			panel = new JPanel();
			JLabel label = new JLabel("<html><br>Welcome to Quiz Master! Pick a Quiz!<html>");
			label.setFont(new Font("Times New Roman", Font.PLAIN, 72));
			panel.add(label);
			Color news = Color.decode("#d292a3");
			panel.setBackground(news);
			c.weightx = 1;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.ipady = 700;
			c.ipadx = 1500;
			c.gridy = 0;
			c.gridwidth = 3;
			pane.add(panel, c);
			JButton button1 = new JButton("Harry Potter Quiz!");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 1;
			c.gridwidth = 1;
			button1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
			pane.add(button1, c);
			JButton button2 = new JButton("Sharks Quiz!");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 1;
			c.gridwidth = 1;
			button2.setFont(new Font("Times New Roman", Font.PLAIN, 40));
			pane.add(button2, c);
			JButton button3 = new JButton("Historical Figures Quiz!");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 2;
			c.gridy = 1;
			c.gridwidth = 1;
			button3.setFont(new Font("Times New Roman", Font.PLAIN, 40));
			pane.add(button3, c);
			class AddInterestListener implements ActionListener
			{
				public void actionPerformed(ActionEvent event) 
				{
					l.setQuizType(2);
					pane.setVisible(false);

				}
			}
			class AddInterestListener1 implements ActionListener
			{
				public void actionPerformed(ActionEvent event) 
				{
					l.setQuizType(1);
					pane.setVisible(false);


				}
			}
			class AddInterestListener2 implements ActionListener
			{
				public void actionPerformed(ActionEvent event) 
				{
					l.setQuizType(0);
					pane.setVisible(false);


				}
			}
			ActionListener listener = new AddInterestListener();
			button1.addActionListener(listener);
			ActionListener listen = new AddInterestListener1();

			button2.addActionListener(listen);
			ActionListener list = new AddInterestListener2();

			button3.addActionListener(list);

		}
		public void createAndShowGUI(QuizList l) throws InterruptedException, IOException, URISyntaxException {
			//Create and set up the window.
			JFrame frame = new JFrame("Quiz Master");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			addComponentsToPaneMenu(frame.getContentPane(), l);
			Color news = Color.decode("#d292a3");
			frame.setBackground(news);
			//Display the window.
			frame.pack();
			frame.setVisible(true);
			while(l.getDone()) {
				Thread.sleep(1000);
			}
			frame.dispose();
		}

	}
	public class QuizImplement {
		final static boolean shouldFill = true;
		final static boolean shouldWeightX = true;
		final static boolean RIGHT_TO_LEFT = false;
		private boolean done = true;


		public void addComponentsToPaneQuestions(Container pane, int x, String s, String[] answers, ArrayList<String> answered) throws IOException, URISyntaxException {
			JPanel panels;
			JPanel panel;
			JButton button;
			pane.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			if (shouldFill) {
				//natural height, maximum width
				c.fill = GridBagConstraints.HORIZONTAL;
			}

			panel = new JPanel();
			JLabel label = new JLabel("<html>" + s + "<html>");
			Color news = Color.decode("#73a1a2");
			panel.setBackground(news);
			label.setFont(new Font("Times New Roman", Font.PLAIN, 72));
			panel.add(label);
			c.anchor = GridBagConstraints.NORTHWEST;
			c.weightx = 1;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.ipady = 300;
			c.ipadx = 1000;
			c.gridy = 0;
			c.gridwidth = 1;
			pane.add(panel, c);
			if(x == 0) {
				panels = new History();
			} else if(x ==1) {
				panels = new Shark();
			} else {
				panels = new HarryPotter();
			}
			c.weightx = 1;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.ipady = 300;
			c.ipadx = 1000;
			c.gridy = 0;
			c.gridwidth = 1;
			pane.add(panels, c);

			int count = 0;
			int gridx = 0;
			int gridy = 1;
			ArrayList<JButton> buttons = new ArrayList<JButton>();
			for(int i = 0; i < answers.length; i ++) {
				button = new JButton(answers[i]);
				c.fill = GridBagConstraints.HORIZONTAL;
				if(count%2 == 0) {
					gridx = 0;
				} else if(count%2 == 1) {
					gridx = 1;
				}
				c.gridwidth = 1;
				c.weightx = 0.5;
				c.ipady = 200;
				c.ipadx = 1000;
				c.gridx = gridx;
				c.gridy = gridy;
				count +=1;
				if(count%2 == 0) {
					gridy++;
				}
				class AddInterestListener implements ActionListener
				{
					private String str;
					public AddInterestListener(String str) {
						this.str = str;
					}
					public void actionPerformed(ActionEvent event) 
					{
						answered.add(str);
						done = false;
						pane.removeAll();


					}
				}
				buttons.add(button);
				ActionListener action = new AddInterestListener(answers[i]);
				button.addActionListener(action);
				button.setFont(new Font("Times New Roman", Font.PLAIN, 40));
				pane.add(button, c);

			}

		}
		public void createAndShowGUI(QuizList l, int x, String s, String[] ans, ArrayList<String> answer) throws InterruptedException, IOException, URISyntaxException {



			//Create and set up the window.
			JFrame frame = new JFrame("Quiz");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//Set up the content pane.
			//quiz.addComponentsToPaneQuestions(frame.getContentPane(), "Heck yeah", s);
			addComponentsToPaneQuestions(frame,x, s, ans, answer);
			//Display the window.
			frame.pack();
			Color news = Color.decode("#73a1a2");
			frame.getContentPane().setBackground(news);

			frame.setVisible(true);
			while(done) {
				Thread.sleep(1000);
			}
			done = true;
			frame.dispose();
		}
	}
	public class End {
		final static boolean shouldFill = true;
		final static boolean shouldWeightX = true;
		final static boolean RIGHT_TO_LEFT = false;
		public void addComponentsToPaneEnd(Container pane, String s, int x) throws IOException, URISyntaxException {
			JPanel panel;
			JPanel panels;
			pane.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			if (shouldFill) {
				//natural height, maximum width
				c.fill = GridBagConstraints.HORIZONTAL;
			}

			panels = new JPanel();
			JLabel label;
			if(x == 0) {
				label = new JLabel("<html><br>You are <br>" + s +"! <html>");

			} else if(x==1) {
				label = new JLabel("<html><br>You are a <br>" + s +"! <html>");

			} else {
				if(s.equals("Death Eater")) {
					label = new JLabel("<html><br>You are a <br>" + s +"! <html>" +"<br> You are a bad person <br> for not thinking <br> Ron is a good friend.");

				} else {
					label = new JLabel("<html><br>You are in <br>" + s +"! <html>");
				}

			}
			Color news = Color.decode("#73a1a2");
			label.setFont(new Font("Comic Sans", Font.PLAIN, 170));
			label.setBackground(news);
			panels.add(label);
			panels.setBackground(news);
			c.weightx = 1;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.ipady = 700;
			c.anchor = GridBagConstraints.NORTHWEST;
			c.ipadx = 1500;
			c.gridy = 0;
			pane.add(panels, c);
			if(x == 0) {
				if(s.equalsIgnoreCase("Alexander Hamilton")) {
					panel = new Hamilton();
				} else if(s.equalsIgnoreCase("Abraham Lincoln")) {
					panel = new Lincoln();
				} else if(s.equalsIgnoreCase("William Shakespeare")) {
					panel = new Shakespeare();
				} else if(s.equalsIgnoreCase("Albert Einstein")) {
					panel = new Einstein();
				} else if(s.equalsIgnoreCase("Leonardo Da Vinci")) {
					panel = new Davinci();
				} else if(s.equalsIgnoreCase("Thomas Hobbes")) {
					panel = new Hobbes();
				} else if(s.equalsIgnoreCase("Susan B. Anthony")) {
					panel = new Antony();
				} else if(s.equalsIgnoreCase("Marie Curie")) {
					panel = new Curie();
				} else if(s.equalsIgnoreCase("Ruth Bader Ginsburg")) {
					panel = new Ginsburg();
				} else if(s.equalsIgnoreCase("Mary Shelley")) {
					panel = new Shelley();
				} else if(s.equalsIgnoreCase("Hua Mulan")) {
					panel = new Mulan();
				} else {
					panel = new Tubman();
				}
			} else if(x==1) {
				if(s.equalsIgnoreCase("Great White Shark")) {
					panel = new GreatWhiteShark();
				} else if(s.equalsIgnoreCase("Goblin Shark")) {
					panel = new GoblinShark();		    		
				} else if(s.equalsIgnoreCase("Tiger Shark")) {
					panel = new TigerShark();
				} else if(s.equalsIgnoreCase("Whale Shark")) {
					panel = new WhaleShark();
				} else if(s.equalsIgnoreCase("Sandbar Shark")) {
					panel = new SandBarShark();
				} else {
					panel = new HammerHeadShark();
				}
			} else {
				if(s.equalsIgnoreCase("Gryffindor")) {
					panel = new Gryffindor();
				} else if(s.equalsIgnoreCase("Hufflepuff")) {
					panel = new Hufflepuff();
				} else if(s.equalsIgnoreCase("Slytherin")) {
					panel = new Syltherin();
				} else if(s.equalsIgnoreCase("Ravenclaw")) {
					panel = new Ravenclaw();
				} else {
					panel = new DeathEater();
				}
			}
			c.weightx = 1;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.ipady = 700;
			c.anchor = GridBagConstraints.NORTHEAST;
			c.ipadx = 1500;
			c.gridy = 0;
			panel.setBackground(news);
			pane.add(panel, c);
		}

		public void createAndShowGUI(QuizList l, String s, int x) throws InterruptedException, IOException, URISyntaxException {
			//Create and set up the window.
			JFrame frame = new JFrame("You are...");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Color news = Color.decode("#73a1a2");
			frame.getContentPane().setBackground(news);
			addComponentsToPaneEnd(frame.getContentPane(), s, x);
			//Display the window.
			frame.pack();
			frame.setVisible(true);
		}
	}
	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		Quiz q = new Quiz();
		q.startGame();
	}
}