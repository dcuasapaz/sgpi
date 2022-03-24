package ec.gob.inspi.gidi.sit.enm;

public enum HtmlObject {

	PLACEHOLDER_COMMENT("Comment"), PLACEHOLDER_RECOUNT("characters remaining."), OPTIONS("Options"), PARAM_DATE(
			"Param"), DATE_START("Date Start"), DATE_END("Date End"), ALL("All"), SELECTED("Selected");
	private String SLblNme;

	private HtmlObject(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
