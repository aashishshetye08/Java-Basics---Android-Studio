package project_TrafficLight;

public enum TrafficLight {

	RED ("STOP"),
	YELlOW ("WAIT"),
	GREEN ("GO");

	private String action;
	
	private TrafficLight(String action) {		//in access modifier, only private is permitted
		this.action = action;
	}

	public String getAction() {
		return action;
	}
	
	
}
