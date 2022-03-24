package ec.gob.inspi.gidi.sit.enm;

public enum MessageForm {

	MSG_DLT_GNR_CLS("Cannot remove a closed ovitrap !"), 
	MSG_DLT_GNR_DTL_LRV("There is no record of larvae !"), 
	MSG_DLT_GNR_DTL_ADL("There is no record of adult !"), 
	MSG_DLT_GNR_PRS_PRF("There is no record of agent !"), 
	MSG_DLT_OK("Record deleted successfully !"), 
	MSG_DLT_ERROR("Failed to delete record !"), 
	MSG_UPD_OK("Record updated successfully !"), 
	MSG_UPD_ERROR("Failed to update record !"), 
	MSG_UPD_AGN_FLD_OK("Field Agents --> Records updated successfully !"), 
	MSG_UPD_AGN_FLD_ERROR("Field Agents --> Records not updated correctly !"), 
	MSG_UPD_AGN_FLD_EMPTY("Field Agents --> No records selected for update  !"), 
	MSG_UPD_LAB_TCH_OK("Lab Technician --> Records updated successfully !"), 
	MSG_UPD_LAB_TCH_EMPTY("Lab Technician --> No records selected for update !"), 
	MSG_UPD_LAB_TCH_ERROR("Lab Technician --> Records not updated correctly  !"),
	MSG_UPD_LRV_OK("Larvae --> Records updated successfully !"), 
	MSG_UPD_LRV_EMPTY("Larvae --> No records selected for update !"), 
	MSG_UPD_LRV_ERROR("Larvae --> Records not updated correctly  !"),
	MSG_UPD_ADL_OK("Adults --> Records updated successfully !"), 
	MSG_UPD_ADL_EMPTY("Adults --> No records selected for update !"), 
	MSG_UPD_ADL_ERROR("Adults --> Records not updated correctly  !");
	
	private String SLblNme;

	private MessageForm(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}
}
