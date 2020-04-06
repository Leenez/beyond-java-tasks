package task_1;

import java.time.LocalTime;

public class LunchInfo extends MandatoryFunctionality implements MandatoryFunctionalityInterface{	
	private String venue;
	private LocalTime lunchingTime;
	
	@Override
	public String compareSameType(Object o) {
		String compare = "";
		if (o instanceof LunchInfo) {
			LunchInfo l = (LunchInfo) o;			
			if(this.venue.equals(l.getVenue())) {
				compare += "venue ";
			}
			if(this.lunchingTime.equals(l.getLunchingTime())) {
				compare += "lunchingTime";
			}
			return compare;
		}
		return null;
	}
	
	@Override
	public String getInfo() {
		return venue + "," + lunchingTime;
	}	
	
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}

	public LocalTime getLunchingTime() {
		return lunchingTime;
	}

	public void setLunchingTime(LocalTime lunchingTime) {
		this.lunchingTime = lunchingTime;
	}
	

}
