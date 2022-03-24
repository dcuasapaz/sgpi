package ec.gob.inspi.gidi.sit.enm;

public enum LabelEgs {

	COLECTED("Colected?"), N_WHOLE("N. Whole"), N_BROKEN("N. Broken"), N_VIABLE("N. Viable"), N_NO_VIABLE(
			"N. No Viable"), COMMENT("Comment");
	private String SLblNme;

	private LabelEgs(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
