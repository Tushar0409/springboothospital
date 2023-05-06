package jdbchospitalapp;

public class HospitalDto {

	private int id;
	private String hname;
	private int noofdr;
	private int noofbeds;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getNoofdr() {
		return noofdr;
	}
	public void setNoofdr(int noofdr) {
		this.noofdr = noofdr;
	}
	public int getNoofbeds() {
		return noofbeds;
	}
	public void setNoofbeds(int noofbeds) {
		this.noofbeds = noofbeds;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "HospitalDto [id=" + id + ", hname=" + hname + ", noofdr=" + noofdr + ", noofbeds=" + noofbeds
				+ ", address=" + address + "]";
	}
	 
}
