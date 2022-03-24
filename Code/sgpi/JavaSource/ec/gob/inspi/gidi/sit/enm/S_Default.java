package ec.gob.inspi.gidi.sit.enm;

public enum S_Default {

	S_DLF_NO_DATA("NO DATA");

	private String SLblNme;

	private S_Default(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
