package usersModule;

public class AddressBook {

	private String address;
	private char status;
	public AddressBook(String address, char status) {
		super();
		this.address = address;
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AddressBook [address=" + address + ", status=" + status + "]";
	}
	
	
	
	
}
