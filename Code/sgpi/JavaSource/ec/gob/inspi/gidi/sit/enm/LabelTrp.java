package ec.gob.inspi.gidi.sit.enm;

public enum LabelTrp {
	TRAP("Trap"), NUMBER("Number"), DATE_OVITRAP_SET("Date set"), DATE_OVITRAP_COLECTED(
			"Date colected"), TRAP_RECOVERED(
					"Recovered"), TRAP_SET_UP("Set up"), FIELD_AGENT("Field Agents"), LAB_TECHNICIAN("Lab Technician");

	private String SLblNme;

	private LabelTrp(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
