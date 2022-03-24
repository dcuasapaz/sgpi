package ec.gob.inspi.gidi.sit.enm;

public enum LabelAdl {
	COLECTED("Colected?"), DATE_PROCESS("Date process"), PROCESS("Process"), SEX("Sex"), GENUS_SPECIE(
			"Genus/Specie"), N_LIVE("N. Live"), N_DEAD("N. Dead"), COMMENT("Comment");
	private String SLblNme;

	private LabelAdl(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
