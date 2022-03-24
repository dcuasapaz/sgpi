package ec.gob.inspi.gidi.sit.enm;

public enum LabelTableExport {

	DATE_PROCESS("Date process"), PROCESS("Process"), YEAR("Year"), MONTH("Month"), SEASON("Season"), EPI_WEEK(
			"Epi week"), TRAP_CODE_UNQ("Code unique"), TRAP_CODE_UNN("Code union"), LOCATION_LETTER(
					"Location Letter"), LOCATION("Location"), TRAP_BLOCK("Block"), TRAP_HOUSE("House"), TRAP_NUMBER(
							"Trap"), DATE_OVITRAP_SET("Date set"), DATE_OVITRAP_COLECTED(
									"Date colected"), TRAP_RECOVERED("Recovered"), TRAP_SET_UP("Set up"), FIELD_AGENT(
											"Field Agents"), LAB_TECHNICIAN("Lab Technician"), COLECTED_EGS(
													"Collected eggs in field"), N_COLLECTED(
															"N. Eggs collected"), N_WHOLE("N. Whole"), N_BROKEN(
																	"N. Broken"), N_VIABLE("N. Viable"), N_NO_VIABLE(
																			"N. No Viable"), COLECTED_LRV(
																					"Collected larvae in field"), N_LARVAE_LIVE(
																							"N. Larvae collected live"), N_LARVAE_DEAD(
																									"N. Larvae collected dead"), COMMENT(
																											"Comment"), COMMENT_EGS(
																													"Comment eggs"), COMMENT_LRV(
																															"Comment larvae");

	private String SLblNme;

	private LabelTableExport(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}

}
