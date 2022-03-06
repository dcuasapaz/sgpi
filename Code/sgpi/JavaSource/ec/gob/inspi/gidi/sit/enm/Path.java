package ec.gob.inspi.gidi.sit.enm;

public enum Path {

	PATH_IMG("/img/pnl/", "img-pnl");

	private String SPthNme;
	private String SPthStl;

	private Path(String SPthNme, String SPthStl) {
		this.SPthNme = SPthNme;
		this.SPthStl = SPthStl;

	}

	public String getSPthNme() {
		return SPthNme;
	}

	public String getSPthStl() {
		return SPthStl;
	}

}
