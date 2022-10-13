package kodlamaIO.entities;

public class Educator {
	private int educatorId;
	private String name;
	private String lastname;

	public Educator() {

	}

	public Educator(int educatorId, String name, String lastname) {
		this.educatorId = educatorId;
		this.name = name;
		this.lastname = lastname;
	}

	public int getEducatorId() {
		return educatorId;
	}

	public void setEducatorId(int educatorId) {
		this.educatorId = educatorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
