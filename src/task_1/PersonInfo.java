package task_1;

public class PersonInfo extends MandatoryFunctionality implements MandatoryFunctionalityInterface {
	private String name;
	private int personId;
	private String address;
	private NationalityEnum nationality;
	private String drivingPermit;
	private VehicleInfo vi; //Tracked and updated by separate business logic
	private LunchInfo li; //Tracked and updated by separate business logic
	
	@Override
	public String compareSameType(Object o) {
		String compare = "";
		if (o instanceof PersonInfo) {
			PersonInfo p = (PersonInfo) o;
			
			if(this.name.equals(p.getName())) {
				compare += "name ";
			}			
			if(this.personId == p.getPersonId()) {
				compare += "personid ";
			}
			if(this.address.equals(p.getAddress())) {
				compare += "license ";
			}
			if(this.nationality.equals(p.getNationality())) {
				compare += "nationality ";
			}
			if(this.drivingPermit.equals(p.getDrivingPermit())) {
				compare += "drivepermit ";
			}
			return compare;
		}
		return null;
	}
		
	@Override
	public String getInfo() {
		return name + "," + personId + "," + address + "," + nationality + "," + drivingPermit;
	}
	
	public void sendDailyDataToDB() {
		// Some method for sending daily person information to database.
	}
	
	public boolean checkFin() {
		return nationality == NationalityEnum.FIN;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public NationalityEnum getNationality() {
		return nationality;
	}

	public void setNationality(NationalityEnum nationality) {
		this.nationality = nationality;
	}

	public String getDrivingPermit() {
		return drivingPermit;
	}
	public void setDrivingPermit(String drivingPermit) {
		this.drivingPermit = drivingPermit;
	}

	public VehicleInfo getVi() {
		return vi;
	}

	public void setVi(VehicleInfo vi) {
		this.vi = vi;
	}

	public LunchInfo getLi() {
		return li;
	}

	public void setLi(LunchInfo li) {
		this.li = li;
	}
}
