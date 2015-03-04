import java.util.*;
import java.io.*;


public class Driver {
	public static List<Alternative> alternatives = new ArrayList<Alternative>();

	public static void populateList(){
		String filePath = "alternativesprogram.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		try {
	 	 
			br = new BufferedReader(new FileReader(filePath));
			while ((line = br.readLine()) != null) {
	 
				// use comma as separator
				String[] data = line.split(cvsSplitBy);
				alternatives.add(new Alternative(data[0],Boolean.valueOf(data[1]),Boolean.valueOf(data[2]),Boolean.valueOf(data[3]),Boolean.valueOf(data[4]),Boolean.valueOf(data[5])));
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args){
		boolean loop = true;
		Random rand = new Random();
		int randIterator = 0;
		int value = 0;
		int input = 0;
		boolean outOfRange = false;
		boolean outOfRange2 = false;
		boolean outOfRange3 = false;
		boolean outOfRange4 = false;
		boolean outOfRange5 = false;
		boolean outOfRange6 = false;
		Scanner scanIn = new Scanner(System.in);
		populateList();
		List<Alternative> distractors = new ArrayList<Alternative>();
		List<Alternative> vent = new ArrayList<Alternative>();
		List<Alternative> sensations = new ArrayList<Alternative>();
		List<Alternative> blood = new ArrayList<Alternative>();
		List<Alternative> stressRelievers = new ArrayList<Alternative>();
		for (int i=0; i <alternatives.size(); i++){
			if (alternatives.get(i).isDistractor){
				distractors.add(alternatives.get(i));
			}
		}
		for (int i=0; i <alternatives.size(); i++){
			if (alternatives.get(i).helpsVent){
				vent.add(alternatives.get(i));
			}
		}
		for (int i=0; i <alternatives.size(); i++){
			if (alternatives.get(i).createsSensation){
				sensations.add(alternatives.get(i));
			}
		}
		for (int i=0; i <alternatives.size(); i++){
			if (alternatives.get(i).seeBlood){
				blood.add(alternatives.get(i));
			}
		}
		for (int i=0; i <alternatives.size(); i++){
			if (alternatives.get(i).stressReliever){
				stressRelievers.add(alternatives.get(i));
			}
		}
		do{
			loop = false;
			System.out.println("Welcome to the Self-Harm Alternatives Generator");
			do{
				System.out.println("Do you need a distractor? (type 1 for yes, 2 for no)");
				input = scanIn.nextInt();
				if (input == 1){
					outOfRange = false;
					value = rand.nextInt(alternatives.size());
					System.out.println(distractors.get(value).Name);
					do{
						System.out.println("Did that help? (type 1 for yes, 2 for no)");
						input = scanIn.nextInt();
						if (input ==1){
							loop = false;
							outOfRange2 = false;
						}
						else if (input ==2){
							loop = true;
							outOfRange2 = false;
						}
						else{
							outOfRange2 = true;
							System.out.println("That is not a valid response. Please try again.");
						}
					}
					while (outOfRange2 == true);
				}
				else if (input == 2){
					outOfRange = false;
					do{
						System.out.println("Do you need to vent? (type 1 for yes, 2 for no)");
						input = scanIn.nextInt();
						if (input == 1){
							outOfRange2 = false;
							value = rand.nextInt(alternatives.size());
							System.out.println(vent.get(value).Name);
							do{
								System.out.println("Did that help? (type 1 for yes, 2 for no)");
								input = scanIn.nextInt();
								if (input ==1){
									loop = false;
									outOfRange3 = false;
								}
								else if (input ==2){
									loop = true;
									outOfRange3 = false;
								}
								else{
									outOfRange3 = true;
									System.out.println("That is not a valid response. Please try again.");
								}
							}
							while (outOfRange3 == true);
						}
						else if (input == 2){
							outOfRange2 = false;
							do{
								System.out.println("Do you need to feel something? (type 1 for yes, 2 for no)");
								input = scanIn.nextInt();
								if (input == 1){
									outOfRange3 = false;
									value = rand.nextInt(alternatives.size());
									System.out.println(sensations.get(value).Name);
									do{
										System.out.println("Did that help? (type 1 for yes, 2 for no)");
										input = scanIn.nextInt();
										if (input ==1){
											loop = false;
											outOfRange4 = false;
										}
										else if (input ==2){
											loop = true;
											outOfRange4 = false;
										}
										else{
											outOfRange4 = true;
											System.out.println("That is not a valid response. Please try again.");
										}
									}
									while (outOfRange4 == true);
								}
								else if (input == 2){
									outOfRange3 = false;
									do{
										System.out.println("Do you need to see blood? (type 1 for yes, 2 for no)");
										input = scanIn.nextInt();
										if (input == 1){
											outOfRange4 = false;
											value = rand.nextInt(alternatives.size());
											System.out.println(blood.get(value).Name);
											do{
												System.out.println("Did that help? (type 1 for yes, 2 for no)");
												input = scanIn.nextInt();
												if (input ==1){
													loop = false;
													outOfRange5 = false;
												}
												else if (input ==2){
													loop = true;
													outOfRange5 = false;
												}
												else{
													outOfRange5 = true;
													System.out.println("That is not a valid response. Please try again.");
												}
											}
											while (outOfRange5 == true);
										}
										else if (input == 2){
											outOfRange4 = false;
											do{
												System.out.println("Do you need to destress? (type 1 for yes, 2 for no)");
												input = scanIn.nextInt();
												if (input == 1){
													outOfRange5 = false;
													value = rand.nextInt(alternatives.size());
													System.out.println(stressRelievers.get(value).Name);
													do{
														System.out.println("Did that help? (type 1 for yes, 2 for no)");
														input = scanIn.nextInt();
														if (input ==1){
															loop = false;
															outOfRange6 = false;
														}
														else if (input ==2){
															loop = true;
															outOfRange6 = false;
														}
														else{
															outOfRange6 = true;
															System.out.println("That is not a valid response. Please try again.");
														}
													}
													while (outOfRange6 == true);
												}
												else if (input == 2){
													outOfRange5 = false;
													loop = true;
													System.out.println("We could not find any alternatives matching your criteria. Please try again.");
												}
												else{
													outOfRange5 = true;
													System.out.println("That is not a valid response. Please try again.");
												}
											}
											while (outOfRange5 == true);
										}
										else{
											outOfRange4 = true;
											System.out.println("That is not a valid response. Please try again.");
										}
									}
									while (outOfRange4 == true);
								}
								else{
									outOfRange3 = true;
									System.out.println("That is not a valid response. Please try again.");
								}
							}
							while (outOfRange3 == true);
						}
						else{
							outOfRange2 = true;
							System.out.println("That is not a valid response. Please try again.");
						}
					}
					while (outOfRange2 == true);
				}
				else{
					outOfRange = true;
					System.out.println("That is not a valid response. Please try again.");
				}
			}
			while (outOfRange == true);
		}
		while (loop == true);
		System.out.println("Congratulations! You resisted the urge to self harm. Stay strong.");
		scanIn.close();
	}

}
