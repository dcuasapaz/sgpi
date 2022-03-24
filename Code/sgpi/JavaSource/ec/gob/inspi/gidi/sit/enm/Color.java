package ec.gob.inspi.gidi.sit.enm;

public enum Color {

	PRIMARY(100), SECONDARY(101), SUCCESS(102), DANGER(103), WARNING(104), INFO(105), LIGHT(106), DARK(107), PROJECT(
			200), AUDIT(201), PROCESS(202), TRAP(203), EGGS(204), LARVAE(205), ADULTS(206), SEARCH(207), TITLE(208);

	private int IClrId;

	private Color(int IClrId) {
		this.IClrId = IClrId;
	}

	public int getIClrId() {
		return IClrId;
	}

}
