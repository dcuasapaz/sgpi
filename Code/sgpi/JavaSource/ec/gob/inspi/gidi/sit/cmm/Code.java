package ec.gob.inspi.gidi.sit.cmm;

import javax.faces.bean.ManagedBean;

import ec.gob.inspi.gidi.sit.enm.CodeSit;

@ManagedBean
public class Code {

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-03-06 | Code | enum --> status process

	public Code() {

	}

	// --------------------------------------------------------------
	public static int I_CODE_PRJ_RLA5074() {
		return CodeSit.RLA5074.getICdeVle();
	}

	public static int I_CODE_PRJ_ECU5032() {
		return CodeSit.ECU5032.getICdeVle();
	}

	public static int I_CODE_AE() {
		return CodeSit.AE.getICdeVle();
	}

	public static int I_CODE_ALB() {
		return CodeSit.ALB.getICdeVle();
	}

	public static int I_CODE_CLX() {
		return CodeSit.CLX.getICdeVle();
	}

	public static int I_CODE_CLX_SP() {
		return CodeSit.CLX_SP.getICdeVle();
	}

	public static int I_CODE_CLX_SP_CS() {
		return CodeSit.CLX_SP_CS.getICdeVle();
	}

	public static int I_CODE_LMT() {
		return CodeSit.LMT.getICdeVle();
	}

	public static int I_CODE_LMT_DRH() {
		return CodeSit.LMT_DRH.getICdeVle();
	}

	public static int I_CODE_LMT_FLV() {
		return CodeSit.LMT_FLV.getICdeVle();
	}

	public static int I_CODE_LMT_SP() {
		return CodeSit.LMT_SP.getICdeVle();
	}

	public static int I_CODE_ONR() {
		return CodeSit.ONR.getICdeVle();
	}

	public static int I_CODE_ONR_SP() {
		return CodeSit.ONR_SP.getICdeVle();
	}

	public static int I_CODE_SP() {
		return CodeSit.SP.getICdeVle();
	}

	public static int I_CODE_WYM_SP() {
		return CodeSit.WYM_SP.getICdeVle();
	}

	public static int I_CODE_WYM_SP_CS() {
		return CodeSit.WYM_SP_CS.getICdeVle();
	}

	public static int I_CODE_F() {
		return CodeSit.FEMALE.getICdeVle();
	}

	public static int I_CODE_M() {
		return CodeSit.MALE.getICdeVle();
	}
	// --------------------------------------------------------------

	public static int I_SIT_PRC_STS() {
		return CodeSit.PROCESS_STATUS.getICdeVle();
	}

	public static int I_SIT_PRC() {
		return CodeSit.PROCESS.getICdeVle();
	}

	public static int I_SIT_PRC_STS_OPN() {
		return CodeSit.PROCESS_STATUS_OPEN.getICdeVle();
	}

	public static int I_SIT_PRC_STS_CLS() {
		return CodeSit.PROCESS_STATUS_CLOSE.getICdeVle();
	}

	public static int I_SIT_PRC_FLD() {
		return CodeSit.PROCESS_FIELD.getICdeVle();
	}

	public static int I_SIT_PRC_FLD_EGS() {
		return CodeSit.PROCESS_FIELD_EGS.getICdeVle();
	}

	public static int I_SIT_PRC_FLD_LRV() {
		return CodeSit.PROCESS_FIELD_LRV.getICdeVle();
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ MDL: SCR +++++++++++++++++++++++++++++++ */
	/****************************************************************************/

	public int I_SCR_STT_DVL() {
		return 401;
	}

	public int I_SCR_STT_TST() {
		return 402;
	}

	public int I_SCR_STT_PRD() {
		return 403;
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ MDL: DTA +++++++++++++++++++++++++++++++ */
	/****************************************************************************/

	public int dtaPrfAdm() {
		return 102;
	}

	public static int I_TCH_FLD() {
		return CodeSit.TCH_FIELD.getICdeVle();
	}

	public static int I_TCH_LAB() {
		return CodeSit.TCH_LAB.getICdeVle();
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ MDL: SIT +++++++++++++++++++++++++++++++ */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | OBJECT | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-02-22 | Code Option | UPPER METHOD
	// --------------------------------------------------------------
	public int sitTrp() {
		return 2;
	}

	public int sitTpe() {
		return 7;
	}

	public static int I_SIT_TPE_FLD() {
		return 701;
	}

	public int sitPrj() {
		return 1;
	}

	public int I_SIT_SEX() {
		return 4;
	}

	public int I_SIT_GNR() {
		return 5;
	}

	public static int I_SIT_STG() {
		return 6;
	}

	public static int I_SIT_CTN() {
		return 9;
	}

	public static int I_SIT_LRV() {
		return CodeSit.LARVAE.getICdeVle();
	}

	public static int I_SIT_ADL() {
		return CodeSit.ADULT.getICdeVle();
	}

	public static int I_SIT_SRC_DTE() {
		return CodeSit.DATE_FILTER.getICdeVle();
	}

	public static int I_SIT_SRC_DTE_PRC() {
		return CodeSit.DATE_FILTER_PRC.getICdeVle();
	}

	public static int I_SIT_SRC_DTE_SET() {
		return CodeSit.DATE_FILTER_SET.getICdeVle();
	}

	public static int I_SIT_SRC_DTE_CLC() {
		return CodeSit.DATE_FILTER_CLC.getICdeVle();
	}

	/****************************************************************************/
	/* ++++++++++++++++++++++++++++++++ PASSWORD +++++++++++++++++++++++++++++++ */
	/****************************************************************************/

	public String keySecurity() {
		return "SGIEpiSIG";
	}

	/****************************************************************************/
	/* ++++++++++++++++++++++++++++++++ DEFAULT +++++++++++++++++++++++++++++++ */
	/****************************************************************************/
	public int otherValue() {
		return -99;
	}

	public String other() {
		return "Otro(a) (ingresar)";
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ MDL: WEB +++++++++++++++++++++++++++++++ */
	/****************************************************************************/
	/* ------------------------------ WebTblMnu ------------------------------- */

	public int mnuTsk() {
		return 20000;
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ MDL: DTA +++++++++++++++++++++++++++++++ */
	/****************************************************************************/

	public int dtaGrt() {
		return 1;
	}

	public int dtaGnd() {
		return 3;
	}

	public int dtaIdn() {
		return 2;
	}

	public int dtaStt() {
		return 9;
	}

	public int dtaIdnNne() {
		return 201;
	}

	public int dtaIdnCdl() {
		return 3000001;
	}

	public int dtaLvl() {
		return 4000000;
	}

	public int dtaPhnTpe() {
		return 5000000;
	}

	public int dtaEmlTpe() {
		return 6000000;
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ MDL: DPA +++++++++++++++++++++++++++++++ */
	/****************************************************************************/
	public int dpaCnrEcd() {
		return 57;
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ MDL: INS +++++++++++++++++++++++++++++++ */
	/****************************************************************************/
	public int insEntTpe() {
		return 1;
	}

	public int insUntEpiSIG() {
		return 3;
	}

	public int insUntGIDi() {
		return 1;
	}

	public int insUntLvl() {
		return 2;
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ MDL: SCR +++++++++++++++++++++++++++++++ */
	/****************************************************************************/

	/* --------------------------------- ENT ---------------------------------- */
	public int scrMdl() {
		return 100;
	}

	public int scrRol() {
		return 1;
	}

	public int scrStt() {
		return 9;
	}

	/* ------------------------------- SCR: ROL ------------------------------- */
	public int scrRolMng() {
		return 101;
	}

	public int scrRolPrf() {
		return 102;
	}

	public int scrRolUsr() {
		return 103;
	}

	public int scrRolLdr() {
		return 105;
	}

	public int scrRolTchGlp() {
		return 107;
	}

	public int scrRolMain() {
		return 109;
	}

	public int scrRolScn() {
		return 110;
	}

	/* ------------------------------- ENT: STT ------------------------------- */
	public int sctSttSss() {
		return 901;
	}

	public int sctSttNoSss() {
		return 900;
	}

	public int sctSttRgs() {
		return 902;
	}

	/* ------------------------------- ENT: MDL ------------------------------- */

	public int scrMdlScr() {
		return 201;
	}

	public int scrMdlTsk() {
		return 202;
	}

	public int scrMdlAtc() {
		return 203;
	}

	public int scrMdlEvn() {
		return 25;
	}

	public int scrMdlDpa() {
		return 205;
	}

	public int scrMdlIns() {
		return 206;
	}

	public int scrMdlDta() {
		return 207;
	}

	public int scrMdlDte() {
		return 208;
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ MDL: DTE +++++++++++++++++++++++++++++++ */
	/****************************************************************************/
	public int dteDayBss() {
		return 29;
	}

	public int dteDayBssNo() {
		return 28;
	}

	public int dteDayNrm() {
		return 31;
	}

	public int dteDayNrmNo() {
		return 30;
	}

}
