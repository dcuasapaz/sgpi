package ec.gob.inspi.gidi.sit.enm;

public enum LabelPrj {

	NAME("Project"), EPI_WEEK("Epi week");

	private String SLblNme;

	private LabelPrj(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}

}
