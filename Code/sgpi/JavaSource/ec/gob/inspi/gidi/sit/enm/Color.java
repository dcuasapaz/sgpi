package ec.gob.inspi.gidi.sit.enm;

public enum Color {

	PRIMARY(100), SECONDARY(101), SUCCESS(102), DANGER(103), WARNING(104), INFO(105), LIGHT(106), DARK(107), PROJECT(
			200), AUDIT(201), PROCESS(202), TRAP(202), EGGS(203), LARVAE(204), ADULTS(205), SEARCH(206), TITLE(207);

	private int IClrId;

	private Color(int IClrId) {
		this.IClrId = IClrId;
	}

	public int getIClrId() {
		return IClrId;
	}

}
