package ec.gob.inspi.gidi.sit.enm;

public enum LabelTableExport {

	DATE_PROCESS("Date process")
	, PROCESS("Process")
	, YEAR("Year")
	, MONTH("Month")
	, SEASON("Season")
	, EPI_WEEK("Epi week")
	, TRAP_CODE_UNQ("Code unique")
	, TRAP_CODE_UNN("Code union")
	, LOCATION_LETTER("Location Letter")
	, LOCATION("Location")
	, TRAP_BLOCK("Block")
	, TRAP_HOUSE("House")
	, TRAP_NUMBER("Trap")
	, DATE_OVITRAP_SET("Date set")
	, DATE_OVITRAP_COLECTED("Date colected")
	, TRAP_RECOVERED("Recovered")
	, TRAP_SET_UP("Set up")
	, FIELD_AGENT("Field Agents")
	, LAB_TECHNICIAN("Lab Technician")
	, COLECTED_EGS("Collected eggs in field")
	, N_COLLECTED("N. Eggs collected")
	, N_WHOLE("N. Whole")
	, N_BROKEN("N. Broken")
	, N_VIABLE("N. Viable")
	, N_NO_VIABLE("N. No Viable")
	, i_ttl_egs_emg_ae_f("Total adults hatched eggs female A. aegypti")
	, i_ttl_egs_emg_ae_m("Total adults hatched eggs male A. aegypti")
	, i_ttl_egs_emg_ae("Total adults hatched eggs A. aegypti")
	
	, i_ttl_egs_emg_alb_f("Total adults hatched eggs female A. albopictus")
	, i_ttl_egs_emg_alb_m("Total adults hatched eggs male A. albopictus")
	, i_ttl_egs_emg_alb("Total adults hatched eggs A. albopictus")
	
	, i_ttl_egs_emg_clx_f("Total adults hatched eggs female Culex")
	, i_ttl_egs_emg_clx_m("Total adults hatched eggs male Culex")
	, i_ttl_egs_emg_clx("Total adults hatched eggs Culex")
	
	, i_ttl_egs_emg_clx_sp_f("Total adults hatched eggs female Culex sp.")
	, i_ttl_egs_emg_clx_sp_m("Total adults hatched eggs male Culex sp.")
	, i_ttl_egs_emg_clx_sp("Total adults hatched eggs Culex sp.")
	
	, i_ttl_egs_emg_clx_sp_cs_f("Total adults hatched eggs female Culex sp. C.S.")
	, i_ttl_egs_emg_clx_sp_cs_m("Total adults hatched eggs male Culex sp. C.S.")
	, i_ttl_egs_emg_clx_sp_cs("Total adults hatched eggs Culex sp. C.S.")
	
	, i_ttl_egs_emg_lmt_f("Total adults hatched eggs female Limatus")
	, i_ttl_egs_emg_lmt_m("Total adults hatched eggs male Limatus")
	, i_ttl_egs_emg_lmt("Total adults hatched eggs Limatus")
	
	, i_ttl_egs_emg_lmt_drh_f("Total adults hatched eggs female Limatus durhamii")
	, i_ttl_egs_emg_lmt_drh_m("Total adults hatched eggs male Limatus durhamii")
	, i_ttl_egs_emg_lmt_drh("Total adults hatched eggs Limatus durhamii")
	
	, i_ttl_egs_emg_lmt_flv_f("Total adults hatched eggs female Limatus flavisetosus (cf.)")
	, i_ttl_egs_emg_lmt_flv_m("Total adults hatched eggs male Limatus flavisetosus (cf.)")
	, i_ttl_egs_emg_lmt_flv("Total adults hatched eggs Limatus flavisetosus (cf.)")
	
	, i_ttl_egs_emg_lmt_sp_f("Total adults hatched eggs female Limatus sp.")
	, i_ttl_egs_emg_lmt_sp_m("Total adults hatched eggs male Limatus sp.")
	, i_ttl_egs_emg_lmt_sp("Total adults hatched eggs Limatus sp.")
	
	, i_ttl_egs_emg_onr_f("Total adults hatched eggs female Onirion")
	, i_ttl_egs_emg_onr_m("Total adults hatched eggs male Onirion")
	, i_ttl_egs_emg_onr("Total adults hatched eggs Onirion")
	
	, i_ttl_egs_emg_onr_sp_f("Total adults hatched eggs female Onirion sp.")
	, i_ttl_egs_emg_onr_sp_m("Total adults hatched eggs male Onirion sp.")
	, i_ttl_egs_emg_onr_sp("Total adults hatched eggs Onirion sp.")
	
	, i_ttl_egs_emg_sp_f("Total adults hatched eggs female sp.")
	, i_ttl_egs_emg_sp_m("Total adults hatched eggs male sp.")
	, i_ttl_egs_emg_sp("Total adults hatched eggs sp.")
	
	, i_ttl_egs_emg_wym_sp_f("Total adults hatched eggs female Wyeomyia sp.")
	, i_ttl_egs_emg_wym_sp_m("Total adults hatched eggs male Wyeomyia sp.")
	, i_ttl_egs_emg_wym_sp("Total adults hatched eggs Wyeomyia sp.")
	
	, i_ttl_egs_emg_wym_sp_cs_f("Total adults hatched eggs female Wyeomyia sp. C.S.")
	, i_ttl_egs_emg_wym_sp_cs_m("Total adults hatched eggs male Wyeomyia sp. C.S.")
	, i_ttl_egs_emg_wym_sp_cs("Total adults hatched eggs Wyeomyia sp. C.S. ")
	
	, COLECTED_LRV("Collected larvae in field")
	, N_LARVAE_LIVE("N. Larvae collected live")
	, N_LARVAE_DEAD("N. Larvae collected dead")
	, i_ttl_lrv_emg_ae_f("Total adults emerged larvaes female A. aegypti")
	, i_ttl_lrv_emg_ae_m("Total adults emerged larvaes male A. aegypti")
	, i_ttl_lrv_emg_ae("Total adults emerged larvaes A. aegypti")
	, i_ttl_lrv_emg_alb_f("Total adults emerged larvaes female A. albopictus")
	, i_ttl_lrv_emg_alb_m("Total adults emerged larvaes male A. albopictus")
	, i_ttl_lrv_emg_alb("Total adults emerged larvaes A. albopictus")
	, i_ttl_lrv_emg_clx_f("Total adults emerged larvaes female Culex")
	, i_ttl_lrv_emg_clx_m("Total adults emerged larvaes male Culex")
	, i_ttl_lrv_emg_clx("Total adults emerged larvaes Culex")
	, i_ttl_lrv_emg_clx_sp_f("Total adults emerged larvaes female Culex sp.")
	, i_ttl_lrv_emg_clx_sp_m("Total adults emerged larvaes male Culex sp.")
	, i_ttl_lrv_emg_clx_sp("Total adults emerged larvaes Culex sp.")
	, i_ttl_lrv_emg_clx_sp_cs_f("Total adults emerged larvaes female Culex sp. C.S.")
	, i_ttl_lrv_emg_clx_sp_cs_m("Total adults emerged larvaes female Culex sp. C.S.")
	, i_ttl_lrv_emg_clx_sp_cs("Total adults emerged larvaes female Culex sp. C.S.")
	, i_ttl_lrv_emg_lmt_f("Total adults emerged larvaes female Limatus")
	, i_ttl_lrv_emg_lmt_m("Total adults emerged larvaes male Limatus")
	, i_ttl_lrv_emg_lmt("Total adults emerged larvaes Limatus")
	, i_ttl_lrv_emg_lmt_drh_f("Total adults emerged larvaes female Limatus durhamii")
	, i_ttl_lrv_emg_lmt_drh_m("Total adults emerged larvaes male Limatus durhamii")
	, i_ttl_lrv_emg_lmt_drh("Total adults emerged larvaes Limatus durhamii")
	, i_ttl_lrv_emg_lmt_flv_f("Total adults emerged larvaes female Limatus flavisetosus (cf.)")
	, i_ttl_lrv_emg_lmt_flv_m("Total adults emerged larvaes male Limatus flavisetosus (cf.)")
	, i_ttl_lrv_emg_lmt_flv("Total adults emerged larvaes Limatus flavisetosus (cf.)")
	, i_ttl_lrv_emg_lmt_sp_f("Total adults emerged larvaes female Limatus sp.")
	, i_ttl_lrv_emg_lmt_sp_m("Total adults emerged larvaes male Limatus sp.")
	, i_ttl_lrv_emg_lmt_sp("Total adults emerged larvaes Limatus sp.")
	, i_ttl_lrv_emg_onr_f("Total adults emerged larvaes female Onirion")
	, i_ttl_lrv_emg_onr_m("Total adults emerged larvaes male Onirion")
	, i_ttl_lrv_emg_onr("Total adults emerged larvaes Onirion")
	, i_ttl_lrv_emg_onr_sp_f("Total adults emerged larvaes female Onirion sp.")
	, i_ttl_lrv_emg_onr_sp_m("Total adults emerged larvaes male Onirion sp.")
	, i_ttl_lrv_emg_onr_sp("Total adults emerged larvaes Onirion sp.")
	, i_ttl_lrv_emg_sp_f("Total adults emerged larvaes female sp.")
	, i_ttl_lrv_emg_sp_m("Total adults emerged larvaes male sp.")
	, i_ttl_lrv_emg_sp("Total adults emerged larvaes sp.")
	, i_ttl_lrv_emg_wym_sp_f("Total adults emerged larvaes female Wyeomyia sp.")
	, i_ttl_lrv_emg_wym_sp_m("Total adults emerged larvaes male Wyeomyia sp.")
	, i_ttl_lrv_emg_wym_sp("Total adults emerged larvaes Wyeomyia sp.")
	, i_ttl_lrv_emg_wym_sp_cs_f("Total adults emerged larvaes female Wyeomyia sp. C.S.")
	, i_ttl_lrv_emg_wym_sp_cs_m("Total adults emerged larvaes male Wyeomyia sp. C.S.")
	, i_ttl_lrv_emg_wym_sp_cs("Total adults emerged larvaes Wyeomyia sp. C.S.")
	, i_ttl_egs_emg_adl("Total Adult Egg Tracking")
	, i_ttl_lrv_emg_adl("Total Adult Larval Tracking")
	, i_dfr_egs_emg_adl_emg("Difference between number of eggs versus total adult follow-up eggs ")
	, s_ttl_vld_egs("Validation between number of eggs against total adults monitoring eggs ")
	, i_dfr_lrv_emg_adl_emg("Difference between number of larvae versus total adults monitoring larvae ")
	, s_ttl_vld_lrv("Validation between number of larvae against total adults monitoring larvae ")
	, COMMENT("Comment")
	, COMMENT_EGS("Comment eggs")
	, COMMENT_LRV("Comment larvae");

	private String SLblNme;

	private LabelTableExport(String SLblNme) {
		this.SLblNme = SLblNme;
	}

	public String getSLblNme() {
		return SLblNme;
	}

}
