package jdbchospitalapp;

public class HospitalController {

	public static void main(String[] args) {
		
//	HospitalDto hsp = new HospitalDto();
//	hsp.setId(1);
//	hsp.setHname("Global");
//	hsp.setNoofdr(35);
//	hsp.setNoofbeds(500);
//	hsp.setAddress("pune");
		
//		HospitalDto hsp = new HospitalDto();
//		hsp.setId(2);
//		hsp.setHname("CityCare");
//		hsp.setNoofdr(50);
//		hsp.setNoofbeds(700);
//		hsp.setAddress("Amt");
		
	HospitalDao dao = new HospitalDao();
	//dao.saveHospital(hsp);
	//dao.getAllHospital();
	//dao.getHospitalById();
//	dao.updateHospitalById();
	dao.deleteHospital();
	}
}
