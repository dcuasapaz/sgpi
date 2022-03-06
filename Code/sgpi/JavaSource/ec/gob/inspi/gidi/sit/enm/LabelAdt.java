package ec.gob.inspi.gidi.sit.enm;

public enum LabelAdt {
	RECORD_DATE("Record date"), RECORD_TIME("Record time"), RECORD_PERSON("Record person"), RECORD_EMAIL("Email");

	private String SLblNme;

	private LabelAdt(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
