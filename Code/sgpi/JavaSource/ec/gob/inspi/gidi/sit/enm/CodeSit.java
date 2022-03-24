package ec.gob.inspi.gidi.sit.enm;

public enum CodeSit {

	PROCESS_STATUS(100), PROCESS_STATUS_OPEN(1001), PROCESS_STATUS_CLOSE(1002), PROCESS(7), PROCESS_FIELD(701), LARVAE(
			301), ADULT(302), TCH_FIELD(103), TCH_LAB(
					104), DATE_FILTER(20), DATE_FILTER_PRC(2001), DATE_FILTER_SET(2002), DATE_FILTER_CLC(2003);

	private int ICdeVle;

	private CodeSit(int ICdeVle) {
		this.ICdeVle = ICdeVle;
	}

	public int getICdeVle() {
		return ICdeVle;
	}
}
