package ec.gob.inspi.gidi.sit.enm;

public enum LabelDta {

	EMAIL("Email"), 	
	USER("User"), 
	DATE_RECORD("Date record"), 
	PASSWORD("Password"), 
	PROFILE_SESION("Profile Sesion"),
	PROFILES("Profiles");

	private String SLblNme;

	private LabelDta(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
