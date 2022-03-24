package ec.gob.inspi.gidi.sit.enm;

public enum MessageForm {

	MSG_DLT_GNR_CLS("Cannot remove a closed ovitrap !"), MSG_DLT_GNR_DTL_LRV(
			"There is no record of larvae !"), MSG_DLT_GNR_DTL_ADL(
					"There is no record of adult !"), MSG_DLT_GNR_PRS_PRF("There is no record of agent !"), MSG_DLT_OK(
							"Record deleted successfully !"), MSG_DLT_ERROR("Failed to delete record !"), MSG_UPD_OK(
									"Record updated successfully !"), MSG_UPD_ERROR("Failed to update record !");

	private String SLblNme;

	private MessageForm(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
