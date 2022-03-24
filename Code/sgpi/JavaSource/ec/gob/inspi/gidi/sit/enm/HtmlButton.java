package ec.gob.inspi.gidi.sit.enm;

public enum HtmlButton {

	BTN_TBL_NEW("New", "btn-tbl-primary", 100), BTN_TBL_ADD("Add", "btn-tbl-success", 102), BTN_TBL_RST("Reset",
			"btn-tbl-warning", 104), BTN_TBL_EDT("Edit", "btn-tbl-primary", 100), BTN_TBL_DLT("Delete",
					"btn-tbl-danger", 103), BTN_DLG_YES("Yes", "btn-tbl-success", 102), BTN_DLG_NO("No",
							"btn-tbl-danger", 103), BTN_MNU_NEW("New", "btn-dark", 107), BTN_MNU_HME("Home",
									"btn-primary",
									100), BTN_MNU_CPY("Copy", "btn-dark", 107), BTN_MNU_SVE("Save", "btn-dark",
											107), BTN_MNU_UPD("Update", "btn-dark", 107), BTN_MNU_RST("Restore",
													"btn-dark", 107), BTN_MNU_SRC("Search", "btn-tbl-success",
															102), BTN_MNU_DWN("Download", "btn-tbl-success", 101);

	private String SBtnNme;
	private String SBtnStl;
	private int IClrId;

	private HtmlButton(String SBtnNme, String SBtnStl, int IClrId) {
		this.SBtnNme = SBtnNme;
		this.SBtnStl = SBtnStl;
		this.IClrId = IClrId;

	}

	public String getSBtnNme() {
		return SBtnNme;
	}

	public String getSBtnStl() {
		return SBtnStl;
	}

	public int getIClrId() {
		return IClrId;
	}
}
