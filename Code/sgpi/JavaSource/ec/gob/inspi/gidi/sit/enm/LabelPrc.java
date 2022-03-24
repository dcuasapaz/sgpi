package ec.gob.inspi.gidi.sit.enm;

public enum LabelPrc {
	DATE_PROCESS("Date process"), PROCESS("Process"), LOCATION("Location"), STATUS_PROCESS(
			"Status process"), DATE_PROCESS_CLOSE("Close process"), COMMENT("Comment");

	private String SLblNme;

	private LabelPrc(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
