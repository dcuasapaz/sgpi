package ec.gob.inspi.gidi.sit.enm;

public enum Process {
	SAVE("SAVE"), UPDATE("UPDATE"), DELETE("DELETE"), SELECT("SELECT"), LOAD("LOAD"), ADD("ADD"), CALCULATE(
			"Calculate"), VALIDATE("Validate"), EDIT("EDIT");

	private Process(String SNme) {
		this.SNme = SNme;
	}

	private String SNme;

	public String getSNme() {
		return SNme;
	}

}
