package SpringCoreAssignment.SpringCoreAssignment;

public class ShopingCart {
	private String username;
	private Items itms;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Items getItms() {
		return itms;
	}

	public void setItms(Items itms) {
		this.itms = itms;
	}

	@Override
	public String toString() {
		return "ShopingCart [username=" + username + ", itms=" + itms + "]";
	}


	

}
