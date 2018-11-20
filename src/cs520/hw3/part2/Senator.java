package cs520.hw3.part2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Senator implements Serializable {
	
	private String 	senatorName;
	private int		sentatorYearsInOffice;
	private String 	senatorParty;
	private String 	senatorState;
	

	public Senator(String name, int yearsInOffice, String party, String state)
	{
		this.senatorName = name;
		this.sentatorYearsInOffice = yearsInOffice;
		this.senatorParty = party;
		this.senatorState = state;
		
	}
	
	public String displayInfo() {
		return String.format(
				"%s (%-7s) from %s has been the senator for %d years", 
				senatorName, senatorParty,  senatorState, sentatorYearsInOffice);
	}
}
