package task_1;

import java.util.HashSet;

public class VehicleInfo extends MandatoryFunctionality implements MandatoryFunctionalityInterface{
	private String licensePlate;
	private HashSet<Integer> users;
	
	public VehicleInfo() {
		users = new HashSet<Integer>();
	}

	@Override
	public String compareSameType(Object o) {
		String compare = "";
		if (o instanceof VehicleInfo) {
			VehicleInfo v = (VehicleInfo) o;
			
			if(this.licensePlate.equals(v.getLicensePlate())) {
				compare += "license ";
			}
			if(this.users.equals(v.getUsers())) {
				compare += "users";
			}
			return compare;
		}
		return null;
	}

	@Override
	public String getInfo() {
		return licensePlate + "," + users.toString();
	}
	
	public void loadUsers() {
		//Some method for loading users from the database
	}
	
	public void addUser(int userId) {
		users.add(userId);
	}
	
	public void removeUser(int userId) {
		users.remove(userId);
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public HashSet<Integer> getUsers() {
		return users;
	}

	public void setUsers(HashSet<Integer> users) {
		this.users = users;
	}
	
}
