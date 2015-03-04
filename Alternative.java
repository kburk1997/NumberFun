public class Alternative {
	public String Name;
	public boolean isDistractor;
	public boolean helpsVent;
	public boolean createsSensation;
	public boolean seeBlood;
	public boolean stressReliever;
	public Alternative(){
		
	}
	public Alternative(String Name){
		this.Name = Name;
	}
	public Alternative(String Name, boolean isDistractor, boolean helpsVent, boolean createsSensation, boolean seeBlood, boolean stressReliever){
		this.Name = Name;
		this.isDistractor = isDistractor;
		this.helpsVent = helpsVent;
		this.createsSensation = createsSensation;
		this.seeBlood = seeBlood;
		this.stressReliever = stressReliever;
	}
	
	public String toString(){
		return Name + isDistractor + helpsVent + createsSensation+seeBlood+stressReliever;
	}
}
