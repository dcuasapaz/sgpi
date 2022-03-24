package ec.gob.inspi.gidi.sit.enm;

public enum LabelLrv {
	COLECTED("Colected?"), DATE_PROCESS("Date process"), PROCESS("Process"), CONTAINT("Containt"), STAGE(
			"Stage"), N_LIVE("N. Live"), N_DEAD("N. Dead"), COMMENT("Comment");
	private String SLblNme;

	private LabelLrv(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
