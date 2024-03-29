package ec.gob.inspi.gidi.sit.cmm;

import javax.faces.bean.ManagedBean;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;

import ec.gob.inspi.gidi.sit.enm.LabelAdt;
import ec.gob.inspi.gidi.sit.enm.LabelDta;
import ec.gob.inspi.gidi.sit.enm.LabelEgs;
import ec.gob.inspi.gidi.sit.enm.LabelLrv;
import ec.gob.inspi.gidi.sit.enm.LabelPrc;
import ec.gob.inspi.gidi.sit.enm.LabelPrj;
import ec.gob.inspi.gidi.sit.enm.LabelTableExport;
import ec.gob.inspi.gidi.sit.enm.LabelTrp;
import ec.gob.inspi.gidi.sit.enm.HtmlButton;
import ec.gob.inspi.gidi.sit.enm.HtmlObject;
import ec.gob.inspi.gidi.sit.enm.LabelAdl;

@ManagedBean
public class Html {
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-28 | Panel view | Title
	// Diego Cuasapaz | 2022-03-06 | Label | panel project
	// Diego Cuasapaz | 2022-03-06 | Label | panel audit
	// Diego Cuasapaz | 2022-03-06 | Spacer | default
	// Diego Cuasapaz | 2022-03-06 | Label | panel trap
	// Diego Cuasapaz | 2022-03-06 | Label | panel process
	// Diego Cuasapaz | 2022-03-06 | HTML | placeholder
	// Diego Cuasapaz | 2022-03-07 | HTML | button table
	// --------------------------------------------------------------

	public Html() {

	}

	// --------------------------------------------------------------
	public static String S_LBL_PRS_EML() {
		return LabelDta.EMAIL.getSLblNme();
	}

	public static String S_LBL_PRS_USR() {
		return LabelDta.USER.getSLblNme();
	}

	public static String D_LBL_PRS_DTE_RGS() {
		return LabelDta.DATE_RECORD.getSLblNme();
	}

	public static String S_LBL_PRS_PSW() {
		return LabelDta.PASSWORD.getSLblNme();
	}

	public static String S_LBL_PRS_PRF_SSS() {
		return LabelDta.PROFILE_SESION.getSLblNme();
	}

	public static String S_LBL_PRS_PRF() {
		return LabelDta.PROFILES.getSLblNme();
	}

	// --------------------------------------------------------------

	public static String S_LBL_PRJ_NME() {
		return LabelPrj.NAME.getSLblNme() + Print.S_OBJ_PNT_TWO;
	}

	public static String S_LBL_PRJ_NME_TBL() {
		return LabelPrj.NAME.getSLblNme();
	}

	public static String S_LBL_PRJ_EPI() {
		return LabelPrj.EPI_WEEK.getSLblNme();
	}

	// --------------------------------------------------------------
	public static String D_LBL_ADT_RCR_DTE() {
		return LabelAdt.RECORD_DATE.getSLblNme();
	}

	public static String S_LBL_ADT_RCR_TME() {
		return LabelAdt.RECORD_TIME.getSLblNme();
	}

	public static String S_LBL_ADT_RCR_PRS() {
		return LabelAdt.RECORD_PERSON.getSLblNme();
	}

	public static String S_LBL_ADT_RCR_EML() {
		return LabelAdt.RECORD_EMAIL.getSLblNme();
	}

	// --------------------------------------------------------------
	public static String D_LBL_PRC_DTE() {
		return LabelPrc.DATE_PROCESS.getSLblNme();
	}

	public static String S_LBL_PRC_NME() {
		return LabelPrc.PROCESS.getSLblNme();
	}

	public static String S_LBL_PRC_LCT() {
		return LabelPrc.LOCATION.getSLblNme();
	}

	public static String S_LBL_PRC_STS() {
		return LabelPrc.STATUS_PROCESS.getSLblNme();
	}

	public static String D_LBL_PRC_DTE_CLS() {
		return LabelPrc.DATE_PROCESS_CLOSE.getSLblNme();
	}

	public static String S_LBL_PRC_CMM() {
		return LabelPrc.COMMENT.getSLblNme();
	}

	// --------------------------------------------------------------

	public static String S_LBL_TRP_TPE() {
		return LabelTrp.TRAP.getSLblNme();
	}

	public static String S_LBL_TRP_NMB() {
		return LabelTrp.NUMBER.getSLblNme();
	}

	public static String D_LBL_TRP_DTE_SET() {
		return LabelTrp.DATE_OVITRAP_SET.getSLblNme();
	}

	public static String D_LBL_TRP_DTE_CLC() {
		return LabelTrp.DATE_OVITRAP_COLECTED.getSLblNme();
	}

	public static String S_LBL_TRP_RCV() {
		return LabelTrp.TRAP_RECOVERED.getSLblNme();
	}

	public static String S_LBL_TRP_SUP() {
		return LabelTrp.TRAP_SET_UP.getSLblNme();
	}

	public static String S_LBL_TRP_FLD_AGN() {
		return LabelTrp.FIELD_AGENT.getSLblNme();
	}

	public static String S_LBL_TRP_LAB_TCH() {
		return LabelTrp.LAB_TECHNICIAN.getSLblNme();
	}

	// --------------------------------------------------------------

	public static String B_LBL_EGS_CLC() {
		return LabelEgs.COLECTED.getSLblNme();
	}

	public static String S_LBL_EGS_N_WHL() {
		return LabelEgs.N_WHOLE.getSLblNme();
	}

	public static String S_LBL_EGS_N_BRK() {
		return LabelEgs.N_BROKEN.getSLblNme();
	}

	public static String S_LBL_EGS_N_VLB() {
		return LabelEgs.N_VIABLE.getSLblNme();
	}

	public static String S_LBL_EGS_N_NO_VLB() {
		return LabelEgs.N_NO_VIABLE.getSLblNme();
	}

	public static String S_LBL_EGS_CMM() {
		return LabelEgs.COMMENT.getSLblNme();
	}

	// --------------------------------------------------------------

	public static String B_LBL_LRV_CLC() {
		return LabelLrv.COLECTED.getSLblNme();
	}

	public static String D_LBL_LRV_PRC_DTE() {
		return LabelLrv.DATE_PROCESS.getSLblNme();
	}

	public static String S_LBL_LRV_PRC() {
		return LabelLrv.PROCESS.getSLblNme();
	}

	public static String S_LBL_LRV_CTT() {
		return LabelLrv.CONTAINT.getSLblNme();
	}

	public static String S_LBL_LRV_STG() {
		return LabelLrv.STAGE.getSLblNme();
	}

	public static String I_LBL_LRV_N_LVE() {
		return LabelLrv.N_LIVE.getSLblNme();
	}

	public static String I_LBL_LRV_N_DD() {
		return LabelLrv.N_DEAD.getSLblNme();
	}

	public static String S_LBL_LRV_CMM() {
		return LabelLrv.COMMENT.getSLblNme();
	}

	// --------------------------------------------------------------

	public static String B_LBL_ADL_CLC() {
		return LabelAdl.COLECTED.getSLblNme();
	}

	public static String D_LBL_ADL_PRC_DTE() {
		return LabelAdl.DATE_PROCESS.getSLblNme();
	}

	public static String S_LBL_ADL_PRC() {
		return LabelAdl.PROCESS.getSLblNme();
	}

	public static String S_LBL_ADL_SEX() {
		return LabelAdl.SEX.getSLblNme();
	}

	public static String S_LBL_ADL_GNS() {
		return LabelAdl.GENUS_SPECIE.getSLblNme();
	}

	public static String I_LBL_ADL_N_LVE() {
		return LabelAdl.N_LIVE.getSLblNme();
	}

	public static String I_LBL_ADL_N_DD() {
		return LabelAdl.N_DEAD.getSLblNme();
	}

	public static String S_LBL_ADL_CMM() {
		return LabelAdl.COMMENT.getSLblNme();
	}

	// --------------------------------------------------------------

	public static String S_HTML_PLC_CMM() {
		return HtmlObject.PLACEHOLDER_COMMENT.getSLblNme();
	}

	public static String S_HTML_PLC_RCN() {
		return HtmlObject.PLACEHOLDER_RECOUNT.getSLblNme();
	}

	public static int I_PNL_SPC() {
		return 2;
	}

	public static int I_HTML_PLC_SZE() {
		return 300;
	}

	public static int I_HTML_SZE_CMB() {
		return 60;
	}

	public static int I_HTML_SZE_TXT_AREA_CLS() {
		return 30;
	}

	public static int I_HTML_SZE_TXT_AREA_ROWS() {
		return 2;
	}

	public static int I_HTML_SZE_CLN() {
		return 80;
	}

	public static String S_TBL_OPT() {
		return HtmlObject.OPTIONS.getSLblNme();
	}

	// --------------------------------------------------------------

	public static int I_BTN_MNU_HME() {
		return HtmlButton.BTN_MNU_HME.getIClrId();
	}

	public static String S_BTN_MNU_HME() {
		return HtmlButton.BTN_MNU_HME.getSBtnNme();
	}

	public static String S_BTN_MNU_HME_STL() {
		return HtmlButton.BTN_MNU_HME.getSBtnStl();
	}

	public static int I_BTN_MNU_NEW() {
		return HtmlButton.BTN_MNU_NEW.getIClrId();
	}

	public static String S_BTN_MNU_NEW() {
		return HtmlButton.BTN_MNU_NEW.getSBtnNme();
	}

	public static int I_BTN_MNU_CPY() {
		return HtmlButton.BTN_MNU_CPY.getIClrId();
	}

	public static String S_BTN_MNU_CPY() {
		return HtmlButton.BTN_MNU_CPY.getSBtnNme();
	}

	public static int I_BTN_MNU_SVE() {
		return HtmlButton.BTN_MNU_SVE.getIClrId();
	}

	public static String S_BTN_MNU_SVE() {
		return HtmlButton.BTN_MNU_SVE.getSBtnNme();
	}

	public static int I_BTN_MNU_UPD() {
		return HtmlButton.BTN_MNU_UPD.getIClrId();
	}

	public static String S_BTN_MNU_UPD() {
		return HtmlButton.BTN_MNU_UPD.getSBtnNme();
	}

	public static int I_BTN_MNU_SRC() {
		return HtmlButton.BTN_MNU_SRC.getIClrId();
	}

	public static String S_BTN_MNU_SRC() {
		return HtmlButton.BTN_MNU_SRC.getSBtnNme();
	}

	public static int I_BTN_MNU_DWN() {
		return HtmlButton.BTN_MNU_DWN.getIClrId();
	}

	public static String S_BTN_MNU_DWN() {
		return HtmlButton.BTN_MNU_DWN.getSBtnNme();
	}

	public static int I_BTN_MNU_RST() {
		return HtmlButton.BTN_MNU_RST.getIClrId();
	}

	public static String S_BTN_MNU_RST() {
		return HtmlButton.BTN_MNU_RST.getSBtnNme();
	}

	public static String S_BTN_TBL_NEW() {
		return HtmlButton.BTN_TBL_NEW.getSBtnNme();
	}

	public static String S_BTN_TBL_NEW_STL() {
		return HtmlButton.BTN_TBL_NEW.getSBtnStl();
	}

	public static int I_BTN_TBL_NEW_CLR() {
		return HtmlButton.BTN_TBL_NEW.getIClrId();
	}

	public static String S_BTN_TBL_ADD() {
		return HtmlButton.BTN_TBL_ADD.getSBtnNme();
	}

	public static String S_BTN_TBL_ADD_STL() {
		return HtmlButton.BTN_TBL_ADD.getSBtnStl();
	}

	public static int I_BTN_TBL_ADD_CLR() {
		return HtmlButton.BTN_TBL_ADD.getIClrId();
	}

	public static String S_BTN_TBL_RST() {
		return HtmlButton.BTN_TBL_RST.getSBtnNme();
	}

	public static String S_BTN_TBL_RST_STL() {
		return HtmlButton.BTN_TBL_RST.getSBtnStl();
	}

	public static int I_BTN_TBL_RST_CLR() {
		return HtmlButton.BTN_TBL_RST.getIClrId();
	}

	public static String S_BTN_TBL_EDT() {
		return HtmlButton.BTN_TBL_EDT.getSBtnNme();
	}

	public static String S_BTN_TBL_EDT_STL() {
		return HtmlButton.BTN_TBL_EDT.getSBtnStl();
	}

	public static int I_BTN_TBL_EDT_CLR() {
		return HtmlButton.BTN_TBL_EDT.getIClrId();
	}

	public static String S_BTN_TBL_DLT() {
		return HtmlButton.BTN_TBL_DLT.getSBtnNme();
	}

	public static String S_BTN_TBL_DLT_STL() {
		return HtmlButton.BTN_TBL_DLT.getSBtnStl();
	}

	public static int I_BTN_TBL_DLT_CLR() {
		return HtmlButton.BTN_TBL_DLT.getIClrId();
	}

	public static String S_BTN_DLG_CNF_YES() {
		return HtmlButton.BTN_DLG_YES.getSBtnNme();
	}

	public static String S_BTN_DLG_CNF_YES_STL() {
		return HtmlButton.BTN_DLG_YES.getSBtnStl();
	}

	public static int I_BTN_DLG_CNF_YES_CLR() {
		return HtmlButton.BTN_DLG_YES.getIClrId();
	}

	public static String S_BTN_DLG_CNF_NO() {
		return HtmlButton.BTN_DLG_NO.getSBtnNme();
	}

	public static String S_BTN_DLG_CNF_NO_STL() {
		return HtmlButton.BTN_DLG_NO.getSBtnStl();
	}

	public static int I_BTN_DLG_CNF_NO_CLR() {
		return HtmlButton.BTN_DLG_NO.getIClrId();
	}

	// --------------------------------------------------------------
	public static String S_PNL_SRC_PRM_DTE() {
		return HtmlObject.PARAM_DATE.getSLblNme();
	}

	public static String S_PNL_SRC_PRM_DTE_STR() {
		return HtmlObject.DATE_START.getSLblNme();
	}

	public static String S_PNL_SRC_PRM_DTE_END() {
		return HtmlObject.DATE_END.getSLblNme();
	}

	// --------------------------------------------------------------
	public static String S_NME_FILE_DWN() {
		return "SGPI_SIT_Summary_";
	}

	public void postProcessXLS(Object document) {
		HSSFWorkbook wb = (HSSFWorkbook) document;
		HSSFSheet sheet = wb.getSheetAt(0);
		HSSFRow header = sheet.getRow(0);
		HSSFFont fnt = wb.createFont();
		fnt.setColor(HSSFColor.HSSFColorPredefined.WHITE.getIndex());
		fnt.setItalic(false);
		fnt.setFontHeightInPoints((short) 10);
		fnt.setBold(true);
		HSSFCellStyle cellStyle = wb.createCellStyle();
		cellStyle.setFillForegroundColor(HSSFColor.HSSFColorPredefined.DARK_BLUE.getIndex());
		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cellStyle.setFont(fnt);
		for (int i = 0; i < header.getPhysicalNumberOfCells(); i++) {
			HSSFCell cell = header.getCell(i);
			cell.setCellStyle(cellStyle);
		}
	}

	// --------------------------------------------------------------
	public static String D_LBL_TBL_PRC_DTE() {
		return LabelTableExport.DATE_PROCESS.getSLblNme();
	}

	public static String S_LBL_TBL_PRC_NME() {
		return LabelTableExport.PROCESS.getSLblNme();
	}

	public static String I_LBL_TBL_YR() {
		return LabelTableExport.YEAR.getSLblNme();
	}

	public static String S_LBL_TBL_MTH() {
		return LabelTableExport.MONTH.getSLblNme();
	}

	public static String S_LBL_TBL_SSN() {
		return LabelTableExport.SEASON.getSLblNme();
	}

	public static String I_LBL_TBL_EPI_WEK() {
		return LabelTableExport.EPI_WEEK.getSLblNme();
	}

	public static String S_LBL_TBL_TRP_CDE_UNQ() {
		return LabelTableExport.TRAP_CODE_UNQ.getSLblNme();
	}

	public static String S_LBL_TBL_TRP_CDE_UNN() {
		return LabelTableExport.TRAP_CODE_UNN.getSLblNme();
	}

	public static String S_LBL_TBL_STE_LTR() {
		return LabelTableExport.LOCATION_LETTER.getSLblNme();
	}

	public static String S_LBL_TBL_STE_NME() {
		return LabelTableExport.LOCATION.getSLblNme();
	}

	public static String S_LBL_TBL_STE_BLC() {
		return LabelTableExport.TRAP_BLOCK.getSLblNme();
	}

	public static String S_LBL_TBL_STE_HSE() {
		return LabelTableExport.TRAP_HOUSE.getSLblNme();
	}

	public static String S_LBL_TBL_TRP_NMB() {
		return LabelTableExport.TRAP_NUMBER.getSLblNme();
	}

	public static String D_LBL_TBL_TRP_DTE_SET() {
		return LabelTableExport.DATE_OVITRAP_SET.getSLblNme();
	}

	public static String D_LBL_TBL_TRP_DTE_CLC() {
		return LabelTableExport.DATE_OVITRAP_COLECTED.getSLblNme();
	}

	public static String B_LBL_TBL_TRP_SUP() {
		return LabelTableExport.TRAP_SET_UP.getSLblNme();
	}

	public static String B_LBL_TBL_TRP_RCV() {
		return LabelTableExport.TRAP_RECOVERED.getSLblNme();
	}

	public static String S_LBL_TBL_TRP_AGN() {
		return LabelTableExport.FIELD_AGENT.getSLblNme();
	}

	public static String S_LBL_TBL_TRP_LAB() {
		return LabelTableExport.LAB_TECHNICIAN.getSLblNme();
	}

	public static String B_LBL_TBL_EGS_CLC() {
		return LabelTableExport.COLECTED_EGS.getSLblNme();
	}

	public static String I_LBL_TBL_EGS_CLC() {
		return LabelTableExport.N_COLLECTED.getSLblNme();
	}

	public static String I_LBL_TBL_EGS_WHL() {
		return LabelTableExport.N_WHOLE.getSLblNme();
	}

	public static String I_LBL_TBL_EGS_BRK() {
		return LabelTableExport.N_BROKEN.getSLblNme();
	}

	public static String I_LBL_TBL_EGS_VLB() {
		return LabelTableExport.N_VIABLE.getSLblNme();
	}

	public static String I_LBL_TBL_EGS_VLB_NO() {
		return LabelTableExport.N_NO_VIABLE.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_AE_F() {
		return LabelTableExport.i_ttl_egs_emg_ae_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_AE_M() {
		return LabelTableExport.i_ttl_egs_emg_ae_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_AE() {
		return LabelTableExport.i_ttl_egs_emg_ae.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_ALB_F() {
		return LabelTableExport.i_ttl_egs_emg_alb_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_ALB_M() {
		return LabelTableExport.i_ttl_egs_emg_alb_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_ALB() {
		return LabelTableExport.i_ttl_egs_emg_alb.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_CLX_F() {
		return LabelTableExport.i_ttl_egs_emg_clx_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_CLX_M() {
		return LabelTableExport.i_ttl_egs_emg_clx_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_CLX() {
		return LabelTableExport.i_ttl_egs_emg_clx.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_CLX_SP_F() {
		return LabelTableExport.i_ttl_egs_emg_clx_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_CLX_SP_M() {
		return LabelTableExport.i_ttl_egs_emg_clx_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_CLX_SP() {
		return LabelTableExport.i_ttl_egs_emg_clx_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_CLX_SP_CS_F() {
		return LabelTableExport.i_ttl_egs_emg_clx_sp_cs_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_CLX_SP_CS_M() {
		return LabelTableExport.i_ttl_egs_emg_clx_sp_cs_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_CLX_SP_CS() {
		return LabelTableExport.i_ttl_egs_emg_clx_sp_cs.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_F() {
		return LabelTableExport.i_ttl_egs_emg_lmt_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_M() {
		return LabelTableExport.i_ttl_egs_emg_lmt_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT() {
		return LabelTableExport.i_ttl_egs_emg_lmt.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_DRH_F() {
		return LabelTableExport.i_ttl_egs_emg_lmt_drh_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_DRH_M() {
		return LabelTableExport.i_ttl_egs_emg_lmt_drh_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_DRH() {
		return LabelTableExport.i_ttl_egs_emg_lmt_drh.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_FLV_F() {
		return LabelTableExport.i_ttl_egs_emg_lmt_flv_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_FLV_M() {
		return LabelTableExport.i_ttl_egs_emg_lmt_flv_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_FLV() {
		return LabelTableExport.i_ttl_egs_emg_lmt_flv.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_SP_F() {
		return LabelTableExport.i_ttl_egs_emg_lmt_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_SP_M() {
		return LabelTableExport.i_ttl_egs_emg_lmt_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_LMT_SP() {
		return LabelTableExport.i_ttl_egs_emg_lmt_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_ONR_F() {
		return LabelTableExport.i_ttl_egs_emg_onr_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_ONR_M() {
		return LabelTableExport.i_ttl_egs_emg_onr_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_ONR() {
		return LabelTableExport.i_ttl_egs_emg_onr.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_ONR_SP_F() {
		return LabelTableExport.i_ttl_egs_emg_onr_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_ONR_SP_M() {
		return LabelTableExport.i_ttl_egs_emg_onr_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_ONR_SP() {
		return LabelTableExport.i_ttl_egs_emg_onr_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_SP_F() {
		return LabelTableExport.i_ttl_egs_emg_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_SP_M() {
		return LabelTableExport.i_ttl_egs_emg_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_SP() {
		return LabelTableExport.i_ttl_egs_emg_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_WYM_SP_F() {
		return LabelTableExport.i_ttl_egs_emg_wym_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_WYM_SP_M() {
		return LabelTableExport.i_ttl_egs_emg_wym_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_WYM_SP() {
		return LabelTableExport.i_ttl_egs_emg_wym_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_WYM_SP_CS_F() {
		return LabelTableExport.i_ttl_egs_emg_wym_sp_cs_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_WYM_SP_CS_M() {
		return LabelTableExport.i_ttl_egs_emg_wym_sp_cs_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_WYM_SP_CS() {
		return LabelTableExport.i_ttl_egs_emg_wym_sp_cs.getSLblNme();
	}

	public static String B_LBL_TBL_LRV_CLC() {
		return LabelTableExport.COLECTED_LRV.getSLblNme();
	}

	public static String I_LBL_TBL_LRV_CLC_LIVE() {
		return LabelTableExport.N_LARVAE_LIVE.getSLblNme();
	}

	public static String I_LBL_TBL_LRV_CLC_DEAD() {
		return LabelTableExport.N_LARVAE_DEAD.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_AE_F() {
		return LabelTableExport.i_ttl_lrv_emg_ae_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_AE_M() {
		return LabelTableExport.i_ttl_lrv_emg_ae_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_AE() {
		return LabelTableExport.i_ttl_lrv_emg_ae.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_ALB_F() {
		return LabelTableExport.i_ttl_lrv_emg_alb_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_ALB_M() {
		return LabelTableExport.i_ttl_lrv_emg_alb_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_ALB() {
		return LabelTableExport.i_ttl_lrv_emg_alb.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_CLX_F() {
		return LabelTableExport.i_ttl_lrv_emg_clx_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_CLX_M() {
		return LabelTableExport.i_ttl_lrv_emg_clx_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_CLX() {
		return LabelTableExport.i_ttl_lrv_emg_clx.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_CLX_SP_F() {
		return LabelTableExport.i_ttl_lrv_emg_clx_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_CLX_SP_M() {
		return LabelTableExport.i_ttl_lrv_emg_clx_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_CLX_SP() {
		return LabelTableExport.i_ttl_lrv_emg_clx_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_CLX_SP_CS_F() {
		return LabelTableExport.i_ttl_lrv_emg_clx_sp_cs_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_CLX_SP_CS_M() {
		return LabelTableExport.i_ttl_lrv_emg_clx_sp_cs_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_CLX_SP_CS() {
		return LabelTableExport.i_ttl_lrv_emg_clx_sp_cs.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_F() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_M() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT() {
		return LabelTableExport.i_ttl_lrv_emg_lmt.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_DRH_F() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_drh_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_DRH_M() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_drh_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_DRH() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_drh.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_FLV_F() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_flv_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_FLV_M() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_flv_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_FLV() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_flv.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_SP_F() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_SP_M() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_LMT_SP() {
		return LabelTableExport.i_ttl_lrv_emg_lmt_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_ONR_F() {
		return LabelTableExport.i_ttl_lrv_emg_onr_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_ONR_M() {
		return LabelTableExport.i_ttl_lrv_emg_onr_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_ONR() {
		return LabelTableExport.i_ttl_lrv_emg_onr.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_ONR_SP_F() {
		return LabelTableExport.i_ttl_lrv_emg_onr_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_ONR_SP_M() {
		return LabelTableExport.i_ttl_lrv_emg_onr_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_ONR_SP() {
		return LabelTableExport.i_ttl_lrv_emg_onr_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_SP_F() {
		return LabelTableExport.i_ttl_lrv_emg_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_SP_M() {
		return LabelTableExport.i_ttl_lrv_emg_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_SP() {
		return LabelTableExport.i_ttl_lrv_emg_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_WYM_SP_F() {
		return LabelTableExport.i_ttl_lrv_emg_wym_sp_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_WYM_SP_M() {
		return LabelTableExport.i_ttl_lrv_emg_wym_sp_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_WYM_SP() {
		return LabelTableExport.i_ttl_lrv_emg_wym_sp.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_WYM_SP_CS_F() {
		return LabelTableExport.i_ttl_lrv_emg_wym_sp_cs_f.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_WYM_SP_CS_M() {
		return LabelTableExport.i_ttl_lrv_emg_wym_sp_cs_m.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_WYM_SP_CS() {
		return LabelTableExport.i_ttl_lrv_emg_wym_sp_cs.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_TRC_ADL() {
		return LabelTableExport.i_ttl_egs_emg_adl.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_LRV_TRC_ADL() {
		return LabelTableExport.i_ttl_lrv_emg_adl.getSLblNme();
	}

	public static String I_LBL_TBL_TTL_EGS_EMG_ADL() {
		return LabelTableExport.i_dfr_egs_emg_adl_emg.getSLblNme();
	}

	public static String S_LBL_TBL_EGS_VLD() {
		return LabelTableExport.s_ttl_vld_egs.getSLblNme();
	}

	public static String I_LBL_TBL_LRV_EMG_ADL() {
		return LabelTableExport.i_dfr_lrv_emg_adl_emg.getSLblNme();
	}

	public static String S_LBL_TBL_LRV_VLD() {
		return LabelTableExport.s_ttl_vld_lrv.getSLblNme();
	}

	public static String S_LBL_TBL_PRC_CMM() {
		return LabelTableExport.COMMENT.getSLblNme();
	}

	public static String S_LBL_TBL_EGS_CMM() {
		return LabelTableExport.COMMENT_EGS.getSLblNme();
	}

	public static String S_LBL_TBL_LRV_CMM() {
		return LabelTableExport.COMMENT_LRV.getSLblNme();
	}
	// --------------------------------------------------------------

	public static String FRM_VW_TTL_SCR() {
		return "SECURITY";
	}

	public static String FRM_VW_TTL_PRJ() {
		return "PROJECT";
	}

	public static String FRM_VW_TTL_PRC() {
		return "PROCESS";
	}

	public static String FRM_VW_TTL_TRP() {
		return "TRAP";
	}

	public static String FRM_VW_TTL_EGS() {
		return "EGGS";
	}

	public static String FRM_VW_TTL_LRV() {
		return "REGISTER LARVAES";
	}

	public static String FRM_VW_TTL_ADL() {
		return "REGISTER ADULTS";
	}
	// --------------------------------------------------------------

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// Date: 2022-02-09
	// L: LABEL; O: OPTION; P: PLACEHOLDER; I: IMAGE;

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// DATE: 2022-02-09
	// DESCRIPTION: Label Format 1

	public static String D_LBL_FRM01_PRC_DTE() {
		return Message.D_MSG_FRM01_PRC_DTE() + Html.S_LBL_PNT();
	}

	public static String S_LBL_FRM01_PRC() {
		return "Process:";
	}

	public static String S_LBL_FRM01_STE() {
		return "Location:";
	}

	public static String S_LBL_FRM01_TRP() {
		return "Trap:";
	}

	public static String S_LBL_FRM01_NMB() {
		return "Number:";
	}

	public static String S_LBL_FRM01_TCH_FLD() {
		return "Field agent:";
	}

	public static String D_LBL_FRM01_DTE_SET() {
		return "Date ovitrap Set:";
	}

	public static String D_LBL_FRM01_DTE_CLC() {
		return "Date ovitrap Colected";
	}

	public static String B_LBL_FRM01_RCV() {
		return "Trap recovered";
	}

	public static String B_LBL_FRM01_SUP() {
		return "Trap set up";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

	public static String S_TTL_FRM01_TRP() {
		return "Trap";
	}

	public static String S_TTL_FRM01_EGS() {
		return "Eggs";
	}

	public static String S_TTL_FRM01_LRV() {
		return "Larvaes";
	}

	public static String S_TTL_FRM01_ADL() {
		return "Adults";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	public static String S_LBL_FRM01_Y_N() {
		return "Yes/No";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	public static String I_LBL_FRM01_EGS_WHL() {
		return "N. Whole Eggs:";
	}

	public static String I_LBL_FRM01_EGS_BRK() {
		return "N. Broken Eggs:";
	}

	public static String I_LBL_FRM01_EGS_VLB() {
		return "N. Viable Eggs:";
	}

	public static String I_LBL_FRM01_EGS_VLB_NO() {
		return "N. No Viable Eggs:";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	public static String I_LBL_FRM01_LRP_NMB() {
		return "N. Live:";
	}

	public static String I_LBL_FRM01_LRP_NMB_DD() {
		return "N. Dead:";
	}

	public static String I_LBL_FRM01_LRP_STG() {
		return "Stage:";
	}

	public static String I_LBL_FRM01_LRP_CTN() {
		return Message.I_MSG_FRM01_LRP_CTN() + Html.S_LBL_PNT();
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-22 | Label Adults | Label, Style
	// --------------------------------------------------------------
	public static String S_LBL_PNT() {
		return ":";
	}

	public static String I_LBL_FRM01_ADL_NMB() {
		return Message.I_MSG_FRM01_ADL_NMB() + Html.S_LBL_PNT();
	}

	public static String I_LBL_FRM01_ADL_NMB_DD() {
		return Message.I_MSG_FRM01_ADL_NMB_DD() + Html.S_LBL_PNT();
	}

	public static String I_LBL_FRM01_ADL_SEX() {
		return Message.I_MSG_FRM01_ADL_SEX() + Html.S_LBL_PNT();
	}

	public static String I_LBL_FRM01_ADL_GNR() {
		return Message.I_MSG_FRM01_ADL_GNR() + Html.S_LBL_PNT();
	}
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// Date: 2022-02-09
	// Description: Label item

	public static String D_PTT() {
		return "yyyy-MM-dd";
	}

	public static String S_ITM_SLC() {
		return HtmlObject.SELECTED.getSLblNme();
	}

	public static String S_ITM_ALL() {
		return HtmlObject.ALL.getSLblNme();
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++ PAGE: LOGIN ++++++++++++++++++++++++ */

	public final String L_PRS_USR() {
		return "User/Email *:";
	}

	public final String L_PRS_PSW() {
		return "Password *:";
	}

	public final String L_SCR_PRF() {
		return "Profile *:";
	}

	public final String O_SCR_PRF() {
		return "Select Profile *:";
	}

	public final String P_PRS_USR() {
		return "Enter Email/User";
	}

	public String P_PRS_PSW() {
		return "Enter Password";
	}

	public String I_LGO_SECUNDATY() {
		return "/img/lgo/gidi.png";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++ PAGE: MAIN +++++++++++++++++++++ */

	public final String L_MAIN_SCR_DTE_RGS() {
		return "Registration date:";
	}

	public final String L_MAIN_PRS_EML() {
		return "Email:";
	}

	public final String L_MAIN_PRS_USR() {
		return "User:";
	}

	public final String L_MAIN_PRS_PSW() {
		return "Password:";
	}

	public final String L_MAIN_SCR_PRF_SSS() {
		return "Profile in session:";
	}

	public final String L_MAIN_SCR_PRF() {
		return "Profiles:";
	}

	public final String L_MAIN_PRS_PSW_NOT() {
		return "Not view (edit)";
	}

	/*---------------------------------------------------------------------------------------------------------*/
	/* PAGE: Title */
	/*---------------------------------------------------------------------------------------------------------*/
	public String ttlPgeField = "Field";

	public static String P_TTL_PRT() {
		return HtmlObject.TTL_PARENTAL.getSLblNme();
	}

	public String imgLoad = "/img/gif/load.gif";
	public String slcOne = "Select one";
	public String dteYr = "Year";
	public String dteMth = "Month";
	public String dteDay = "Day";
	public String dteEpiWek = "Epi Week";

	/*** Adult ***/
	private String sitTtlAdl = "Adult";
	private String sitLblAdlNmb = "Number:";
	private String sitLblAdlSex = "Sex:";
	private String sitLblAdlSpc = "Genus/Species:";

	/*** Professional ***/
	private String sitTtlPfs = "Professional";
	private String sitLblPfsAgn = "Field agent:";
	private String sitLblPfsTch = "Lab technician:";

	/*---------------------------------------------------------------------------------------------------------*/
	/* IMAGES: */
	/*---------------------------------------------------------------------------------------------------------*/
	public String imgLdn = "/img/gif/load.gif";
	public String imgUsrs = "/img/users.png";

	/*---------------------------------------------------------------------------------------------------------*/
	/* ICONS: */
	/*---------------------------------------------------------------------------------------------------------*/
	public String hme = "hme";
	public String add = "add";
	public String addUsr = "addUsr";
	public String nvo = "new";
	public String sve = "sve";
	public String upd = "upd";
	public String dlt = "dlt";
	public String src = "src";
	public String rfr = "rfr";
	public String edt = "edt";
	public String arw = "arw";

	public String pdf = "pdf";
	public String xls = "xls";
	public String fle = "fle";

	public String png = "png";
	public String jpg = "jpg";
	public String gif = "gif";
	public String pthIcn = "/img/icn/";

	public String icn(String icn, int sze, String frm) {
		String icono = "";
		if (this.add.compareTo(icn) == 0) {
			icono = pthIcn + add + sze + "." + frm;
		} else if (this.nvo.compareTo(icn) == 0) {
			icono = pthIcn + nvo + sze + "." + frm;
		} else if (this.sve.compareTo(icn) == 0) {
			icono = pthIcn + sve + sze + "." + frm;
		} else if (this.upd.compareTo(icn) == 0) {
			icono = pthIcn + upd + sze + "." + frm;
		} else if (this.dlt.compareTo(icn) == 0) {
			icono = pthIcn + dlt + sze + "." + frm;
		} else if (this.src.compareTo(icn) == 0) {
			icono = pthIcn + src + sze + "." + frm;
		} else if (this.rfr.compareTo(icn) == 0) {
			icono = pthIcn + rfr + sze + "." + frm;
		} else if (this.edt.compareTo(icn) == 0) {
			icono = pthIcn + edt + sze + "." + frm;
		} else if (this.pdf.compareTo(icn) == 0) {
			icono = pthIcn + pdf + sze + "." + frm;
		} else if (this.xls.compareTo(icn) == 0) {
			icono = pthIcn + xls + sze + "." + frm;
		} else if (this.addUsr.compareTo(icn) == 0) {
			icono = pthIcn + addUsr + sze + "." + frm;
		} else if (this.hme.compareTo(icn) == 0) {
			icono = pthIcn + hme + sze + "." + frm;
		}

		return icono;

	}

	public String icono(String icn, int sze, String frm) {
		return pthIcn + icn + sze + "." + frm;
	}

	/*---------------------------------------------------------------------------------------------------------*/
	/* PAGE: Login */
	/*---------------------------------------------------------------------------------------------------------*/
	public String plhEmlAln = "Email *";

	public String lblBtn = "Login";
	public String lblLnkCrt = "Crear Cuenta";
	public String lblLnkRst = "Recuperar Contrase�a";
	public String ttlPgeLgn = "Login";
	public String lblBtnNxt = "Continuar";
	public String lnkMain = "http://www.investigacionsalud.gob.ec/";
	public String lnkSecundary = "http://www.investigacionsalud.gob.ec/webs/cirev/";
	public String lnkOeia = "https://www.iaea.org/";

	public String lgoMain = "/img/lgo/main.png";

	public String lgoOeia = "/img/lgo/oiea_nrm.png";

	public String getPlhEmlAln() {
		return plhEmlAln;
	}

	/*---------------------------------------------------------------------------------------------------------*/
	/* PAGE: Create account */
	/*---------------------------------------------------------------------------------------------------------*/
	public String ttlPgeRgs = "Crear cuenta";

	public String ttlPgeRgsGood = "Usuario Registrado Correctamente";
	public String ttlPgeRgsError = "Usuario No Se Registro Correctamente";

	public String plhEmail = "Correo electr�nico *";
	public String plhEmailMsg = "Su correo electr�nico es su nombre de usuario";

	public String plhPsw = "Contrase�a *";
	public String plhPswMsg = "La contrase�a debe tener letras may�sculas y min�sculas, al menos un n�mero, no coincidir con ninguna parte de su correo electr�nico y tener al menos 8 caracteres";

	public String plhPswRpt = "Confirmar Contrase�a *";
	public String plhGrt = "Saludo *";
	public String plhNme = "Nombres *";
	public String plhLstNme = "Apellidos *";
	public String plhCnr = "Pa�s *";
	public String plhCty = "Ciudad *";
	public String plhPhn = "Tel�fono celular ";
	public String plhEmailAlt = "Correo electr�nico alternativo ";

	public String plhTpeEnt = "Tipo Instituci�n *";
	public String plhEnt = "Instituci�n *";
	public String plhEntOth = "Otra Instituci�n *";
	public String plhUnt = "�rea *";
	public String plhUntOth = "Otra �rea *";
	public String plhApn = "Cargo *";
	public String plhApnOth = "Otro Cargo *";

	public String plhAcd = "Grado acad�mico *";
	public String plhDsc = "Disciplina *";
	public String plhDscSub = "Subdisciplina *";

	/*---------------------------------------------------------------------------------------------------------*/
	/* OBJECTS: Buttons */
	/*---------------------------------------------------------------------------------------------------------*/
	public String lblBtnCrtAcc = "Crear cuenta";
	/*---------------------------------------------------------------------------------------------------------*/
	/* OBJECTS: List */
	/*---------------------------------------------------------------------------------------------------------*/
	private String msgLstEmpty = "* No se encontrar�n registros *";

	public String getMsgLstEmpty() {
		return msgLstEmpty;
	}

	/*---------------------------------------------------------------------------------------------------------*/
	/* PAGE: Prf My Profile */
	/*---------------------------------------------------------------------------------------------------------*/
	public String ttlPgeMyPfl = "Mi Perfil";

	public String ttlPgeEvents = "Eventos";

	public String ttlBtnHme = "Inicio";
	public String ttlBtnNew = "Nuevo registro";
	public String ttlBtnAdd = "A�adir registro";
	public String ttlBtnSve = "Guardar registro";
	public String ttlBtnEdt = "Editar registro";
	public String ttlBtnDlt = "Eliminar regsitro";
	public String ttlBtnSee = "Ver registro";
	public String ttlBtnUpd = "Guardar cambios";
	public String ttlBtnRfr = "Refrescar";

	/*---------------------------------------------------------------------------------------------------------*/
	/* PAGE: Tsk */
	/*---------------------------------------------------------------------------------------------------------*/
	public String ttlPgeTask = "Actividades";
	public String ttlPgeMnuTask = "Men�";
	public String imgTask = "/img/icn/mdl_tsk.png";
	public String lblTask = "Actividades";
	public String pgeMnuTask = "/prf/menu_task.jsf";
	/*---------------------------------------------------------------------------------------------------------*/
	/* PAGE: Date */
	public String SDteYr = "A�o *";
	public String SDteMnt = "Mes *";
	public String SDteDay = "D�a *";

	public String getSDteYr() {
		return SDteYr;
	}

	public String getSDteMnt() {
		return SDteMnt;
	}

	public String getSDteDay() {
		return SDteDay;
	}

	/*---------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------------------------------------------------------------------------*/
	/* MENU: Administrador */
	/*---------------------------------------------------------------------------------------------------------*/
	public String ttlPgeEnt = "Entidad";
	public String ttlPgeUnt = "Unidad/Sub-unidad";
	public String ttlPgeApn = "Puesto";
	public String ttlPgePrsApn = "Profesional - Puesto";
	public String ttlPgePrs = "Profesional";
	public String ttlPgePrf = "Perfil";

	public String getTtlPgePrf() {
		return ttlPgePrf;
	}

	public String getTtlPgePrsApn() {
		return ttlPgePrsApn;
	}

	public String getTtlPgePrs() {
		return ttlPgePrs;
	}

	/*---------------------------------------------------------------------------------------------------------*/
	/* MENU: Profesional */
	/*---------------------------------------------------------------------------------------------------------*/
	public String ttlPgeTsk = "Registro de Actividades";
	public String ttlPgeRsl = "Registro de Entregables";
	public String ttlPgePrm = "Registro de Permisos";
	public String ttlPgeMain = "Registro de Temas principales";
	public String ttlPgePrt = "Registro de Participantes";

	public String getTtlPgeMain() {
		return ttlPgeMain;
	}

	public String getTtlPgePrm() {
		return ttlPgePrm;
	}

	public String getTtlPgeTsk() {
		return ttlPgeTsk;
	}

	public String getTtlPgeRsl() {
		return ttlPgeRsl;
	}

	public String getTtlPgePrt() {
		return ttlPgePrt;
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-22 | Dialog confirm | Label, message
	// --------------------------------------------------------------

	public static String FRM_DLG_CNF_HDR() {
		return "Confirmation";
	}

	public static String FRM_DLG_CNF_MSG() {
		return "Are you sure?";
	}

	public static String FRM_DLG_CNF_ICN() {
		return "ui-icon-alert";
	}

	public static int FRM_DLG_CNF_SZE() {
		return 300;
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-22 | Dialog button confirm | Label, style, delete
	// code
	// --------------------------------------------------------------

	public static String FRM_DLG_BTN_YES_NME() {
		return "Yes";
	}

	public static String FRM_DLG_BTN_YES_STL() {
		return "btn-cnf btn-success";
	}

	public static String FRM_DLG_BTN_NOT_NME() {
		return "No";
	}

	public static String FRM_DLG_BTN_NOT_STL() {
		return "btn-cnf btn-danger";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-22 | Button new | Label, style, delete code
	// --------------------------------------------------------------

	public static String FRM_BTN_NEW_NME() {
		return "New";
	}

	public static String FRM_BTN_NEW_STL() {
		return "btn-cnf-pnl btn-primary";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-22 | Button add | Label, style, delete code
	// --------------------------------------------------------------

	public static String FRM_BTN_ADD_NME() {
		return "Add";
	}

	public static String FRM_BTN_ADD_STL() {
		return "btn-cnf-pnl btn-success";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-22 | Button delete | Label, style, delete code
	// --------------------------------------------------------------

	public static String FRM_BTN_DLT_NME() {
		return "Delete";
	}

	public static String FRM_BTN_DLT_STL() {
		return "btn btn-danger";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-22 | Button reset | Label, style, delete code
	// --------------------------------------------------------------

	public static String FRM_BTN_RST_NME() {
		return "Reset";
	}

	public static String FRM_BTN_RST_STL() {
		return "btn-cnf-pnl btn-warning";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-22 | Button table edit, delete | Label, style
	// --------------------------------------------------------------

	public static String FRM_TBL_BTN_EDT_ID() {
		return "frm-tbl-btn-edt";
	}

	public static String FRM_TBL_BTN_EDT_NME() {
		return "Edit";
	}

	public static String FRM_TBL_BTN_EDT_STL() {
		return "btn-tbl btn-info";
	}

	public static String FRM_TBL_BTN_DLT_ID() {
		return "frm-tbl-btn-dlt";
	}

	public static String FRM_TBL_BTN_DLT_NME() {
		return "Delete";
	}

	public static String FRM_TBL_BTN_DLT_STL() {
		return "btn-tbl btn-danger";
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	public String rfrBtnDsc = "Recargar ventana";
	public String rfrCsvBtnImg = "/img/icn/refresh256.png";

	public String newBlcId = "frm-blc-btn-new";
	public String sveBlcId = "frm-blc-btn-sve";
	public String updBlcId = "frm-blc-btn-upd";
	public String shwBlcId = "frm-blc-tbl-btn-shw";
	public String edtBlcId = "frm-blc-tbl-btn-edt";
	public String dltBlcId = "frm-blc-tbl-btn-dlt";

	public String dwnCsvBtnId = "frm-btn-dwn-csv";
	public String dwnCsvBtnNme = "Descargar csv";
	public String dwnCsvBtnBtnIcn = "ui-icon-circle-arrow-s";
	public String dwnCsvBtnDsc = "Descargar en CSV";
	public String dwnCsvBtnImg = "/img/icn/csv256.png";

	public String dwnXlsBtnId = "frm-btn-dwn-xls";
	public String dwnXlsBtnNme = "Descargar xls";
	public String dwnXlsBtnBtnIcn = "ui-icon-circle-arrow-s";
	public String dwnXlsBtnDsc = "Descargar en xls";
	public String dwnXlsBtnImg = "/img/icn/xls256.png";

	public String getDwnXlsBtnId() {
		return dwnXlsBtnId;
	}

	public String getDwnXlsBtnNme() {
		return dwnXlsBtnNme;
	}

	public String getDwnXlsBtnBtnIcn() {
		return dwnXlsBtnBtnIcn;
	}

	public String getDwnXlsBtnDsc() {
		return dwnXlsBtnDsc;
	}

	public String getDwnXlsBtnImg() {
		return dwnXlsBtnImg;
	}

	public String getShwBlcId() {
		return shwBlcId;
	}

	public String getRfrCsvBtnImg() {
		return rfrCsvBtnImg;
	}

	public String getDwnCsvBtnImg() {
		return dwnCsvBtnImg;
	}

	public String getRfrBtnDsc() {
		return rfrBtnDsc;
	}

	public String getDwnCsvBtnDsc() {
		return dwnCsvBtnDsc;
	}

	public String getDwnCsvBtnId() {
		return dwnCsvBtnId;
	}

	public String getDwnCsvBtnNme() {
		return dwnCsvBtnNme;
	}

	public String getDwnCsvBtnBtnIcn() {
		return dwnCsvBtnBtnIcn;
	}

	public String getNewBlcId() {
		return newBlcId;
	}

	public String getSveBlcId() {
		return sveBlcId;
	}

	public String getUpdBlcId() {
		return updBlcId;
	}

	public String getEdtBlcId() {
		return edtBlcId;
	}

	public String getDltBlcId() {
		return dltBlcId;
	}

	/*---------------------------------------------------------------------------------------------------------*/
	/* PAGE: ADMIN */
	/*---------------------------------------------------------------------------------------------------------*/
	public String ttlAdmin = "Menu ";
	public String ttlAtrSlc = "Selected";
	public String ttlAtrObl = "Mandatory";
	public String ttlAtrOpt = "OPtional";

	public String getTtlAtrObl() {
		return ttlAtrObl;
	}

	public String getTtlAtrOpt() {
		return ttlAtrOpt;
	}

	public String getTtlPgeApn() {
		return ttlPgeApn;
	}

	public String getArw() {
		return arw;
	}

	public String getLnkMain() {
		return lnkMain;
	}

	public String getLnkSecundary() {
		return lnkSecundary;
	}

	public String getLgoMain() {
		return lgoMain;
	}

	public String getTtlAdmin() {
		return ttlAdmin;
	}

	public String getTtlAtrSlc() {
		return ttlAtrSlc;
	}

	public String getTtlPgeUnt() {
		return ttlPgeUnt;
	}

	public String getTtlPgeEnt() {
		return ttlPgeEnt;
	}

	public String cmbSlc = "Todos";

	public String getPgeMnuTask() {
		return pgeMnuTask;
	}

	public void setPgeMnuTask(String pgeMnuTask) {
		this.pgeMnuTask = pgeMnuTask;
	}

	public String getTtlBtnHme() {
		return ttlBtnHme;
	}

	public void setTtlBtnHme(String ttlBtnHme) {
		this.ttlBtnHme = ttlBtnHme;
	}

	public String getHme() {
		return hme;
	}

	public void setHme(String hme) {
		this.hme = hme;
	}

	public String getLblTask() {
		return lblTask;
	}

	public void setLblTask(String lblTask) {
		this.lblTask = lblTask;
	}

	public String getImgTask() {
		return imgTask;
	}

	public void setImgTask(String imgTask) {
		this.imgTask = imgTask;
	}

	public String getTtlPgeMnuTask() {
		return ttlPgeMnuTask;
	}

	public void setTtlPgeMnuTask(String ttlPgeMnuTask) {
		this.ttlPgeMnuTask = ttlPgeMnuTask;
	}

	public void setImgLoad(String imgLoad) {
		this.imgLoad = imgLoad;
	}

	public String getImgLdn() {
		return imgLdn;
	}

	public void setImgLdn(String imgLdn) {
		this.imgLdn = imgLdn;
	}

	public String getImgUsrs() {
		return imgUsrs;
	}

	public void setImgUsrs(String imgUsrs) {
		this.imgUsrs = imgUsrs;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getAddUsr() {
		return addUsr;
	}

	public void setAddUsr(String addUsr) {
		this.addUsr = addUsr;
	}

	public String getNvo() {
		return nvo;
	}

	public void setNvo(String nvo) {
		this.nvo = nvo;
	}

	public String getSve() {
		return sve;
	}

	public void setSve(String sve) {
		this.sve = sve;
	}

	public String getUpd() {
		return upd;
	}

	public void setUpd(String upd) {
		this.upd = upd;
	}

	public String getDlt() {
		return dlt;
	}

	public void setDlt(String dlt) {
		this.dlt = dlt;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getRfr() {
		return rfr;
	}

	public void setRfr(String rfr) {
		this.rfr = rfr;
	}

	public String getEdt() {
		return edt;
	}

	public void setEdt(String edt) {
		this.edt = edt;
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public String getXls() {
		return xls;
	}

	public void setXls(String xls) {
		this.xls = xls;
	}

	public String getFle() {
		return fle;
	}

	public void setFle(String fle) {
		this.fle = fle;
	}

	public String getPng() {
		return png;
	}

	public void setPng(String png) {
		this.png = png;
	}

	public String getJpg() {
		return jpg;
	}

	public void setJpg(String jpg) {
		this.jpg = jpg;
	}

	public String getGif() {
		return gif;
	}

	public void setGif(String gif) {
		this.gif = gif;
	}

	public String getPthIcn() {
		return pthIcn;
	}

	public void setPthIcn(String pthIcn) {
		this.pthIcn = pthIcn;
	}

	public String getLblBtn() {
		return lblBtn;
	}

	public void setLblBtn(String lblBtn) {
		this.lblBtn = lblBtn;
	}

	public String getLblLnkCrt() {
		return lblLnkCrt;
	}

	public void setLblLnkCrt(String lblLnkCrt) {
		this.lblLnkCrt = lblLnkCrt;
	}

	public String getLblLnkRst() {
		return lblLnkRst;
	}

	public void setLblLnkRst(String lblLnkRst) {
		this.lblLnkRst = lblLnkRst;
	}

	public String getTtlPgeLgn() {
		return ttlPgeLgn;
	}

	public void setTtlPgeLgn(String ttlPgeLgn) {
		this.ttlPgeLgn = ttlPgeLgn;
	}

	public String getLblBtnNxt() {
		return lblBtnNxt;
	}

	public void setLblBtnNxt(String lblBtnNxt) {
		this.lblBtnNxt = lblBtnNxt;
	}

	public String getTtlPgeRgs() {
		return ttlPgeRgs;
	}

	public void setTtlPgeRgs(String ttlPgeRgs) {
		this.ttlPgeRgs = ttlPgeRgs;
	}

	public String getTtlPgeRgsGood() {
		return ttlPgeRgsGood;
	}

	public void setTtlPgeRgsGood(String ttlPgeRgsGood) {
		this.ttlPgeRgsGood = ttlPgeRgsGood;
	}

	public String getTtlPgeRgsError() {
		return ttlPgeRgsError;
	}

	public void setTtlPgeRgsError(String ttlPgeRgsError) {
		this.ttlPgeRgsError = ttlPgeRgsError;
	}

	public String getPlhEmail() {
		return plhEmail;
	}

	public void setPlhEmail(String plhEmail) {
		this.plhEmail = plhEmail;
	}

	public String getPlhEmailMsg() {
		return plhEmailMsg;
	}

	public void setPlhEmailMsg(String plhEmailMsg) {
		this.plhEmailMsg = plhEmailMsg;
	}

	public String getPlhPsw() {
		return plhPsw;
	}

	public void setPlhPsw(String plhPsw) {
		this.plhPsw = plhPsw;
	}

	public String getPlhPswMsg() {
		return plhPswMsg;
	}

	public void setPlhPswMsg(String plhPswMsg) {
		this.plhPswMsg = plhPswMsg;
	}

	public String getPlhPswRpt() {
		return plhPswRpt;
	}

	public void setPlhPswRpt(String plhPswRpt) {
		this.plhPswRpt = plhPswRpt;
	}

	public String getPlhGrt() {
		return plhGrt;
	}

	public void setPlhGrt(String plhGrt) {
		this.plhGrt = plhGrt;
	}

	public String getPlhNme() {
		return plhNme;
	}

	public void setPlhNme(String plhNme) {
		this.plhNme = plhNme;
	}

	public String getPlhLstNme() {
		return plhLstNme;
	}

	public void setPlhLstNme(String plhLstNme) {
		this.plhLstNme = plhLstNme;
	}

	public String getPlhCnr() {
		return plhCnr;
	}

	public void setPlhCnr(String plhCnr) {
		this.plhCnr = plhCnr;
	}

	public String getPlhCty() {
		return plhCty;
	}

	public void setPlhCty(String plhCty) {
		this.plhCty = plhCty;
	}

	public String getPlhPhn() {
		return plhPhn;
	}

	public void setPlhPhn(String plhPhn) {
		this.plhPhn = plhPhn;
	}

	public String getPlhEmailAlt() {
		return plhEmailAlt;
	}

	public void setPlhEmailAlt(String plhEmailAlt) {
		this.plhEmailAlt = plhEmailAlt;
	}

	public String getPlhTpeEnt() {
		return plhTpeEnt;
	}

	public void setPlhTpeEnt(String plhTpeEnt) {
		this.plhTpeEnt = plhTpeEnt;
	}

	public String getPlhEnt() {
		return plhEnt;
	}

	public void setPlhEnt(String plhEnt) {
		this.plhEnt = plhEnt;
	}

	public String getPlhEntOth() {
		return plhEntOth;
	}

	public void setPlhEntOth(String plhEntOth) {
		this.plhEntOth = plhEntOth;
	}

	public String getPlhUnt() {
		return plhUnt;
	}

	public void setPlhUnt(String plhUnt) {
		this.plhUnt = plhUnt;
	}

	public String getPlhUntOth() {
		return plhUntOth;
	}

	public void setPlhUntOth(String plhUntOth) {
		this.plhUntOth = plhUntOth;
	}

	public String getPlhApn() {
		return plhApn;
	}

	public void setPlhApn(String plhApn) {
		this.plhApn = plhApn;
	}

	public String getPlhApnOth() {
		return plhApnOth;
	}

	public void setPlhApnOth(String plhApnOth) {
		this.plhApnOth = plhApnOth;
	}

	public String getPlhAcd() {
		return plhAcd;
	}

	public void setPlhAcd(String plhAcd) {
		this.plhAcd = plhAcd;
	}

	public String getPlhDsc() {
		return plhDsc;
	}

	public void setPlhDsc(String plhDsc) {
		this.plhDsc = plhDsc;
	}

	public String getPlhDscSub() {
		return plhDscSub;
	}

	public void setPlhDscSub(String plhDscSub) {
		this.plhDscSub = plhDscSub;
	}

	public String getLblBtnCrtAcc() {
		return lblBtnCrtAcc;
	}

	public void setLblBtnCrtAcc(String lblBtnCrtAcc) {
		this.lblBtnCrtAcc = lblBtnCrtAcc;
	}

	public String getTtlPgeMyPfl() {
		return ttlPgeMyPfl;
	}

	public void setTtlPgeMyPfl(String ttlPgeMyPfl) {
		this.ttlPgeMyPfl = ttlPgeMyPfl;
	}

	public String getTtlPgeEvents() {
		return ttlPgeEvents;
	}

	public void setTtlPgeEvents(String ttlPgeEvents) {
		this.ttlPgeEvents = ttlPgeEvents;
	}

	public String getTtlBtnNew() {
		return ttlBtnNew;
	}

	public void setTtlBtnNew(String ttlBtnNew) {
		this.ttlBtnNew = ttlBtnNew;
	}

	public String getTtlBtnAdd() {
		return ttlBtnAdd;
	}

	public void setTtlBtnAdd(String ttlBtnAdd) {
		this.ttlBtnAdd = ttlBtnAdd;
	}

	public String getTtlBtnSve() {
		return ttlBtnSve;
	}

	public void setTtlBtnSve(String ttlBtnSve) {
		this.ttlBtnSve = ttlBtnSve;
	}

	public String getTtlBtnEdt() {
		return ttlBtnEdt;
	}

	public void setTtlBtnEdt(String ttlBtnEdt) {
		this.ttlBtnEdt = ttlBtnEdt;
	}

	public String getTtlBtnDlt() {
		return ttlBtnDlt;
	}

	public void setTtlBtnDlt(String ttlBtnDlt) {
		this.ttlBtnDlt = ttlBtnDlt;
	}

	public String getTtlBtnSee() {
		return ttlBtnSee;
	}

	public void setTtlBtnSee(String ttlBtnSee) {
		this.ttlBtnSee = ttlBtnSee;
	}

	public String getTtlBtnUpd() {
		return ttlBtnUpd;
	}

	public void setTtlBtnUpd(String ttlBtnUpd) {
		this.ttlBtnUpd = ttlBtnUpd;
	}

	public String getTtlBtnRfr() {
		return ttlBtnRfr;
	}

	public void setTtlBtnRfr(String ttlBtnRfr) {
		this.ttlBtnRfr = ttlBtnRfr;
	}

	public String getTtlPgeTask() {
		return ttlPgeTask;
	}

	public void setTtlPgeTask(String ttlPgeTask) {
		this.ttlPgeTask = ttlPgeTask;
	}

	public String getCmbSlc() {
		return cmbSlc;
	}

	public void setCmbSlc(String cmbSlc) {
		this.cmbSlc = cmbSlc;
	}

	public String getTtlPgeField() {
		return ttlPgeField;
	}

	public String getLnkOeia() {
		return lnkOeia;
	}

	public String getLgoOeia() {
		return lgoOeia;
	}

	public String getImgLoad() {
		return imgLoad;
	}

	public String getSlcOne() {
		return slcOne;
	}

	public String getDteYr() {
		return dteYr;
	}

	public String getDteMth() {
		return dteMth;
	}

	public String getDteDay() {
		return dteDay;
	}

	public String getDteEpiWek() {
		return dteEpiWek;
	}

	public String getSitTtlPfs() {
		return sitTtlPfs;
	}

	public String getSitLblPfsAgn() {
		return sitLblPfsAgn;
	}

	public String getSitLblPfsTch() {
		return sitLblPfsTch;
	}

	public String getSitTtlAdl() {
		return sitTtlAdl;
	}

	public String getSitLblAdlNmb() {
		return sitLblAdlNmb;
	}

	public String getSitLblAdlSex() {
		return sitLblAdlSex;
	}

	public String getSitLblAdlSpc() {
		return sitLblAdlSpc;
	}
}
