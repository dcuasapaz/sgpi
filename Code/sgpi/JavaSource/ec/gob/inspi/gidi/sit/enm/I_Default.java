package ec.gob.inspi.gidi.sit.enm;

public enum I_Default {

	I_DFL_VALUE(0), I_DFL_NO_DATA(-99);

	private int ICdeVle;

	private I_Default(int ICdeVle) {
		this.ICdeVle = ICdeVle;
	}

	public int getICdeVle() {
		return ICdeVle;
	}
}
