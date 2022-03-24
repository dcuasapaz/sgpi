package ec.gob.inspi.gidi.sit.ctl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.util.Optional;

import ec.gob.inspi.gidi.sit.cmm.Code;
import ec.gob.inspi.gidi.sit.cmm.Default;
import ec.gob.inspi.gidi.sit.cmm.Message;
import ec.gob.inspi.gidi.sit.cmm.Method;
import ec.gob.inspi.gidi.sit.cmm.Print;
import ec.gob.inspi.gidi.sit.enm.CodeSit;
import ec.gob.inspi.gidi.sit.enm.MessageForm;
import ec.gob.inspi.gidi.sit.enm.Process;
import ec.gob.inspi.gidi.sit.ent.ScrTblPrsRol;
import ec.gob.inspi.gidi.sit.ent.SitTblGnr;
import ec.gob.inspi.gidi.sit.ent.SitTblGnrDtl;
import ec.gob.inspi.gidi.sit.ent.SitTblGnrPrsPrf;
import ec.gob.inspi.gidi.sit.ent.SitTblNmb;
import ec.gob.inspi.gidi.sit.ent.SitTblSte;
import ec.gob.inspi.gidi.sit.srv.ScrSrvPrsRol;
import ec.gob.inspi.gidi.sit.srv.SitSrvGnr;
import ec.gob.inspi.gidi.sit.srv.SitSrvGnrDtl;
import ec.gob.inspi.gidi.sit.srv.SitSrvGnrPrsPrf;
import ec.gob.inspi.gidi.sit.srv.SitSrvOPt;
import ec.gob.inspi.gidi.sit.srv.SitSrvNmb;
import ec.gob.inspi.gidi.sit.srv.SitSrvSte;

@ManagedBean
@ViewScoped
public class SitCtlGnr {

	/*
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * +++++++
	 */
	// AUTOR | DATE | SECTION | OBJECT | DESCRIPTION
	// --------------------------------------------------------------------------------------
	// Diego Cuasapaz | 2022-03-06 | PRC | Date | boolean: vsb, rqr, dsb
	// Diego Cuasapaz | 2022-03-06| PRC | Status | boolean: vsb, rqr, dsb
	// Diego Cuasapaz | 2022-03-06 | PRC | Date close | boolean: vsb, rqr, dsb
	// Diego Cuasapaz | 2022-03-06 | PRC | Comment | boolean: vsb, rqr, dsb
	// Diego Cuasapaz | 2022-03-07 | TRP | Action | depurate code
	// Diego Cuasapaz | 2022-03-07 | EGS | Action | depurate code
	// Diego Cuasapaz | 2022-03-07 | LRV | Action | depurate code
	// Diego Cuasapaz | 2022-03-07 | ADL | Action | depurate code
	// --------------------------------------------------------------------------------------
	protected Method mth;
	protected Default dfl;
	private ScrTblPrsRol prl;
	protected ScrCtlSss sss;
	private static Logger LOG;

	private SitTblGnr gnr;
	private SitTblGnrDtl gnrDtl;
	private List<SitTblGnr> lstGnr;
	@EJB
	protected SitSrvGnr SGnr;

	private boolean dsbTrp;
	private boolean vsbTrp;
	private boolean rqrTrp;

	private void actTrp(boolean dsb, boolean vsb, boolean rqr) {
		dsbTrp = dsb;
		vsbTrp = vsb;
		rqrTrp = rqr;
	}

	@EJB
	protected SitSrvOPt SOtp;

	private int ITrpId;

	public SitCtlGnr() {
		gnr = new SitTblGnr();
		gnrDtl = new SitTblGnrDtl();
		mth = new Method();
		dfl = new Default();
		gnrDtlAdl = new SitTblGnrDtl();
		gnrDtlLrv = new SitTblGnrDtl();
		prl = new ScrTblPrsRol();
		sss = new ScrCtlSss();
		LOG = Logger.getLogger(this.getClass().getName());
	}

	public void loadPrl() {
		try {
			prl = sss.getPrl();
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.LOAD, e.getMessage());
		}
	}

	private void cptInit() {

		this.actPgr(false, false);
		this.actBtnHme(false, true);
		this.actBtnAdd(false, true);
		this.actBtnAddCpy(true, true);
		this.actBtnSve(true, true);
		this.actBtnUpd(true, true);
		this.actBtnSrc(false, true);
		this.actBtnDwn(true, true);
		this.actBtnRtr(false, true);
		this.actTblBtnEdt(true, true);
		this.actTblBtnDlt(false, true);

		this.actPrcDte(true, true, false); // Date process
		this.actPrc(true, true, false); // Process
		this.actPrcSte(true, true, false); // Location
		this.actPrcSts(true, true, false); // Status
		this.actPrcDteCls(true, true, false); // Date process close
		this.actPrcCmm(true, true, false); // Comment

		this.actTrp(true, true, false); // Trap
		this.actTrpNmb(true, true, false); // Number
		this.actTrpDteSet(true, true, false); // Date set up
		this.actTrpDteClc(true, true, false); // Date collected
		this.actTrpRcv(true, true, false); // Recover
		this.actTrpSup(true, true, false); // Set up
		this.actTrpAgnFld(true, true, false); // Field agent
		this.actTrpAgnLab(true, true, false); // Lab technician
		this.actBtnRstPrfAgn(true, true); // Button Reset Field agent
		this.actBtnRstPrfTch(true, true); // Button Reset Lab technician

		this.actBEgs(true, true, false); // Collected eggs
		this.actEgsNmbCpl(true, true, false); // Whole
		this.actEgsNmbBrk(true, true, false); // Broken
		this.actEgsNmbVbl(true, true, false); // Viable
		this.actEgsNmbVblNo(true, true, false); // No viable
		this.actEgsCmm(true, true, false); // Comment

		this.actBLrv(true, true, false); // Collected larvae
		this.actLrvPrc(true, true, false); // Process
		this.actLrvPrcDte(true, true, false); // Date process
		this.actLrvCtn(true, true, false); // Contain
		this.actLrvStg(true, true, false); // Stage
		this.actLrvNmbLive(true, true, false); // N. live
		this.actLrvNmbDied(true, true, false); // N. dead
		this.actLrvCmm(true, true, false); // Comment
		this.actLrvBtnAdd(true, true); // Button new
		this.actLrvBtnNew(true, true); // Button add
		this.actLrvBtnRst(true, true); // Button restore

		this.actBAdl(true, true, false); // Collected adults
		this.actAdlPrc(true, true, false); // Process
		this.actAdlPrcDte(true, true, false); // Date process
		this.actAdlSex(true, true, false); // Sex
		this.actAdlSpc(true, true, false); // Specie
		this.actAdlNmb(true, true, false); // N. Live
		this.actAdlNmbDd(true, true, false); // N. Dead
		this.actAdlCmm(true, true, false); // Comment
		this.actAdlBtnAdd(true, true); // Button new
		this.actAdlBtnNew(true, true); // Button add
		this.actAdlBtnRst(true, true); // Button restore

		this.actSrcSte(true, true, false); // Location
		this.actSrcPrc(true, true, false); // Process
		this.actSrcPrm(true, true, false); // Parameter
		this.actSrcDteSrt(true, true, false); // Date start
		this.actSrcDteEnd(true, true, false); // Date end
		this.actBtnSrcPrm(true, true); // Button search

	}

	@PostConstruct
	public void init() {

		this.loadPrl();
		this.cptInit();
	}

	private void cptAdd() {
		this.actPgr(false, true);
		this.actBtnHme(true, true);
		this.actBtnAdd(true, true);
		this.actBtnSve(false, true);
		this.actBtnSrc(true, true);

		this.actPrcDte(false, true, true); // Date process
		this.actPrc(true, true, false); // Process
		this.actPrcSte(false, true, true); // Location
		this.actPrcSts(true, true, false); // Status
		this.actPrcDteCls(true, true, false); // Date process close
		this.actPrcCmm(false, true, false); // Comment

		this.actBEgs(true, true, false);
		this.actBLrv(true, true, false);
		this.actBAdl(true, true, false);
		this.actGnrPrfAgn(true, true, false);

	}

	public void add() {
		try {
			this.cptAdd();
			gnr = new SitTblGnr();
			gnrDtlLrv = new SitTblGnrDtl();
			gnrDtlAdl = new SitTblGnrDtl();
			ISteId = Default.I_DFL_VLE();
			INmbId = Default.I_DFL_VLE();
			gnr.setIGnrNmbEgsBrk(Default.I_DFL_VLE());
			gnr.setIGnrNmbEgsCpl(Default.I_DFL_VLE());
			gnr.setIGnrNmbEgsUsd(Default.I_DFL_VLE());
			gnr.setIGnrNmbEgsVlb(Default.I_DFL_VLE());
			gnr.setiGnrNmbEgsVlbNo(Default.I_DFL_VLE());
			gnr.setdGnrDteSet(Default.D_DAY_SUBTRACT(Default.D_CURRENT_DATE(), Default.I_DAYS_SBS()));
			gnr.setdGnrDteClc(Default.D_CURRENT_DATE());
			gnr.setdGnrRgsDte(Default.D_CURRENT_DATE());
			gnr.setdGnrDtePrcCls(Default.D_CURRENT_DATE());
			gnr.setiPrcStsId(CodeSit.PROCESS_STATUS_OPEN.getICdeVle());
			gnr.setITpeId(CodeSit.PROCESS_FIELD.getICdeVle());
			this.newAdlSlc();
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.LOAD, e.getMessage());
		}
	}

	public void addCopy() {
		this.actTrpAgnFld(false, true, true);
		this.actPrcSte(false, true, true);
		this.actTrp(false, true, true);
		this.actTrpNmb(false, true, true);
		this.actTrpDteSet(false, true, true);
		this.actTrpDteClc(false, true, true);
		this.actTrpRcv(false, true, false);
		this.actTrpSup(false, true, false);
		Date DPrc = new Date();
		Date DSet = new Date();
		Date DClc = new Date();
		int ISteId = 0;
		int ITrpId = 0;
		int IStsId = 0;
		DPrc = gnr.getdGnrRgsDte();
		DSet = gnr.getdGnrDteSet();
		DClc = gnr.getdGnrDteClc();
		ISteId = gnr.getSitTblNmb().getSitTblSte().getISteId();
		ITrpId = gnr.getITrpId();
		IStsId = gnr.getiPrcStsId();
		gnr = new SitTblGnr();
		gnr.setIGnrNmbEgsBrk(Default.I_DFL_VLE());
		gnr.setIGnrNmbEgsCpl(Default.I_DFL_VLE());
		gnr.setIGnrNmbEgsUsd(Default.I_DFL_VLE());
		gnr.setIGnrNmbEgsVlb(Default.I_DFL_VLE());
		gnr.setiGnrNmbEgsVlbNo(Default.I_DFL_VLE());
		gnr.setdGnrRgsDte(DPrc);
		gnr.setdGnrDteSet(DSet);
		gnr.setdGnrDteClc(DClc);
		this.ISteId = ISteId;
		gnr.setITrpId(ITrpId);
		gnr.setdGnrDtePrcCls(Default.D_CURRENT_DATE());
		gnr.setITpeId(CodeSit.PROCESS_FIELD.getICdeVle());
		gnr.setiPrcStsId(IStsId);
		this.newLstLrvStg();
		this.newAdlSlc();
		gnrDtlLrv = new SitTblGnrDtl();
		gnrDtlAdl = new SitTblGnrDtl();
		ILrsStgId = Default.I_DFL_VLE();
		ISexId = Default.I_DFL_VLE();
		ISpcId = Default.I_DFL_VLE();
		this.actGnrPrfAgn(false, true, false);
		this.actBtnSve(false, true);
		this.actBtnAdd(true, true);
		this.actBtnAddCpy(true, true);
	}

	private void cptSve() {
		this.actPrcSte(true, true, false);
		this.actTrp(true, true, false);
		this.actTrpNmb(true, true, false);
		this.actTrpDteSet(true, true, false);
		this.actTrpDteClc(true, true, false);
		this.actTrpRcv(true, true, false);
		this.actTrpSup(true, true, false);

		this.actBEgs(true, true, false);
		this.actEgsNmbCpl(true, true, false);
		this.actEgsNmbBrk(true, true, false);
		this.actEgsNmbVbl(true, true, false);
		this.actEgsNmbVblNo(true, true, false);
		this.actEgsCmm(true, true, false);

		this.actBLrv(true, true, false);
		this.actLrvNmbDied(true, true, false);
		this.actLrvNmbLive(true, true, false);
		this.actLrvCmm(true, true, false);
		this.actLrvBtnAdd(true, true);
		this.actLrvBtnNew(true, true);
		this.actLrvBtnRst(true, true);

		this.actBAdl(true, true, false);
		this.actAdlNmb(true, true, false);
		this.actAdlNmbDd(true, true, false);
		this.actAdlSex(true, true, false);
		this.actAdlSpc(true, true, false);
		this.actAdlCmm(true, true, false);
		this.actAdlBtnAdd(true, true);
		this.actAdlBtnNew(true, true);
		this.actAdlBtnRst(true, true);

		this.actGnrPrfAgn(true, true, false);
		this.actTrpAgnLab(true, true, false);

		this.actBtnSve(true, true);
		this.actBtnAdd(false, true);
		this.actBtnAddCpy(false, true);
		this.actPrc(true, true, false);
	}

	public void upd() {
		try {
			try {
				gnr.setITrpId(ITrpId);
				SGnr.update(gnr);
				Message.msgInf(MessageForm.MSG_UPD_OK.getSLblNme());
			} catch (Exception e) {
				Message.msgErr(MessageForm.MSG_UPD_ERROR.getSLblNme());
				Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.UPDATE, e.getMessage());
			}
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.UPDATE, e.getMessage());
		}
	}

	@EJB
	protected SitSrvGnrDtl SGnrDtl;
	@EJB
	protected SitSrvGnrPrsPrf SGnrPrsPrf;

	public void sve() {
		try {
			this.loadPrl();

			if (SGnr.sve(prl, gnr, nmb, ITrpId) != false) {
				try {
					if (lstLrsStgSlc.size() > Default.I_DFL_VLE()) {
						for (SitTblGnrDtl gnrDtlLrvAux : lstLrsStgSlc) {
							if (SGnrDtl.sve(prl, gnrDtlLrvAux, gnr) != false) {

							} else {
								Message.msgErr("Larvae: Information was not stored correctly");
								break;
							}
						}
					}
				} catch (Exception e) {
					LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
					Message.msgWrn("No larvae information");
				}

				try {
					if (lstAdlSlc.size() > Default.I_DFL_VLE()) {
						for (SitTblGnrDtl gnrDtlAdlAux : lstAdlSlc) {
							if (SGnrDtl.sve(prl, gnrDtlAdlAux, gnr) != false) {
							} else {
								Message.msgErr("Adults: Information was not stored correctly");
								break;
							}
						}
					}
				} catch (Exception e) {
					LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
					Message.msgWrn("No adult information");
				}

				try {
					if (lstPrsPrfAgnAdd.size() > Default.I_DFL_VLE()) {
						for (ScrTblPrsRol prsPrfAux : lstPrsPrfAgnAdd) {
							if (SGnrPrsPrf.sve(prl, prsPrfAux, gnr) != false) {
							} else {
								Message.msgErr("Agent: Information was not stored correctly");
								break;
							}
						}
					}
				} catch (Exception e) {
					LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
					Message.msgWrn("No Field agent information");
				}

				Message.msgInf("Information stored correctly");
				this.cptSve();

			} else {
				Message.msgErr("Information is not stored correctly");
			}

		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SAVE, e.getMessage());
		}
	}

	public void src() {
		try {
			this.actSrcSte(false, true, true); // Location
			this.actSrcPrc(false, true, true); // Process
			this.actSrcPrm(false, true, true); // Parameter
			this.actSrcDteSrt(false, true, true); // Date start
			this.actSrcDteEnd(false, true, true); // Date end
			this.actBtnSrcPrm(false, true); // Button search
			this.actPgr(true, false);
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
		}
	}

	public void edt() {
		try {
			this.actPgr(false, true);
			this.actBtnHme(true, true);
			this.actBtnAdd(true, true);
			this.actBtnAddCpy(true, true);
			this.actBtnSve(true, true);
			this.actBtnUpd(false, true);
			this.actBtnSrc(true, true);
			this.actBtnDwn(true, true);

			this.ISteId = Default.I_DFL_VLE(); // Site
			this.ISteId = gnr.getSitTblNmb().getSitTblSte().getISteId(); // Site
			this.ste = new SitTblSte();
			ste = SSte.searchId(ISteId);
			this.actPrcSte(false, true, true); // Site
			this.actPrcSts(false, true, true); // Status
			this.actPrcCmm(false, true, false); // Comment
			this.ITrpId = gnr.getITrpId(); // Trap type
			this.actTrp(false, true, true);
			this.INmbId = gnr.getSitTblNmb().getINmbId();// Trap number
			this.actTrpNmb(false, true, true);
			this.actTrpDteSet(false, true, true); // Date set
			this.actTrpDteClc(false, true, true); // Date collected
			this.actTrpSup(false, true, false); // Set up
			this.actTrpRcv(false, true, false); // Recover
			try {
				this.actGnrPrfAgn(false, true, true); // Field Agents
				this.newPrsPrfAgnAdd();
				this.newPrsPrfAgnSlc();
				List<SitTblGnrPrsPrf> auxLstGnrPrsPrf = new ArrayList<SitTblGnrPrsPrf>();
				auxLstGnrPrsPrf = SGnrPrsPrf.lstGnrPrsPrf(gnr, Code.I_TCH_FLD());
				if (auxLstGnrPrsPrf.size() > 0) {
					for (SitTblGnrPrsPrf auxGnrPrsPrf : auxLstGnrPrsPrf) {
						this.lstPrsPrfAgnAdd.add(auxGnrPrsPrf.getScrTblPrsRol());
						this.IPrsPrfAgnSlcId.add(auxGnrPrsPrf.getScrTblPrsRol().getIPrsRolId() + "");
					}
				}
			} catch (Exception e) {
				Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			}

			try {
				this.actTrpAgnLab(false, true, false); // Lab Technician
				this.newPrsPrfTchAdd();
				this.newPrsPrfTchSlc();
				List<SitTblGnrPrsPrf> auxLstGnrPrsPrf = new ArrayList<SitTblGnrPrsPrf>();
				auxLstGnrPrsPrf = SGnrPrsPrf.lstGnrPrsPrf(gnr, Code.I_TCH_LAB());
				if (auxLstGnrPrsPrf.size() > 0) {
					for (SitTblGnrPrsPrf auxGnrPrsPrf : auxLstGnrPrsPrf) {
						this.lstPrsPrfTchAdd.add(auxGnrPrsPrf.getScrTblPrsRol());
						this.IPrsPrfTchSlcId.add(auxGnrPrsPrf.getScrTblPrsRol().getIPrsRolId() + "");
					}
				}
			} catch (Exception e) {
				Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			}

			// EGGS
			this.actEgsNmbCpl(false, true, true);
			this.actEgsNmbBrk(false, true, true);
			this.actEgsNmbVbl(false, true, true);
			this.actEgsNmbVblNo(false, true, true);
			this.actEgsCmm(false, true, false);

			// LARVAE
			try {
				this.actLrvCmm(false, true, false);
				this.actLrvBtnNew(false, true);
				this.actLrvBtnAdd(true, true);
				this.actLrvBtnRst(true, true);
				this.newLstLrvStg();
				lstLrsStgSlc = SGnrDtl.lstGnrDtl(gnr, Code.I_SIT_LRV(), true);
			} catch (Exception e) {
				Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			}

			// ADULT
			try {
				this.actAdlCmm(false, true, false);
				this.actAdlBtnNew(false, true);
				this.actAdlBtnAdd(true, true);
				this.actAdlBtnRst(true, true);
				this.newAdlSlc();
				lstAdlSlc = SGnrDtl.lstGnrDtl(gnr, Code.I_SIT_ADL(), true);
			} catch (Exception e) {
				Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			}

		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.EDIT, e.getMessage());
		}
	}

	public void dlt() {
		try {
			if (gnr.getiPrcStsId() == Code.I_SIT_PRC_STS_CLS()) {
				Message.msgWrn(MessageForm.MSG_DLT_GNR_CLS.getSLblNme());
			} else {
				try {
					// Delete Larvae
					List<SitTblGnrDtl> auxLstGnrDtlLrv = new ArrayList<SitTblGnrDtl>();
					auxLstGnrDtlLrv = SGnrDtl.lstGnrDtl(gnr, Code.I_SIT_LRV(), true);
					if (auxLstGnrDtlLrv.size() > 0) {
						for (SitTblGnrDtl auxGnrDtlLrv : auxLstGnrDtlLrv) {
							SGnrDtl.dltLgc(auxGnrDtlLrv);
						}
					} else {
						Message.msgWrn(MessageForm.MSG_DLT_GNR_DTL_LRV.getSLblNme());
					}
				} catch (Exception e) {
					Print.LOG_INFO_CONTROLLER(this.getClass().getSimpleName(), Process.DELETE, e.getMessage());
				}

				try {
					// Delete Adl
					List<SitTblGnrDtl> auxLstGnrDtlAdl = new ArrayList<SitTblGnrDtl>();
					auxLstGnrDtlAdl = SGnrDtl.lstGnrDtl(gnr, Code.I_SIT_ADL(), true);
					if (auxLstGnrDtlAdl.size() > 0) {
						for (SitTblGnrDtl auxGnrDtlAdl : auxLstGnrDtlAdl) {
							SGnrDtl.dltLgc(auxGnrDtlAdl);
						}
					} else {
						Message.msgWrn(MessageForm.MSG_DLT_GNR_DTL_ADL.getSLblNme());
					}
				} catch (Exception e) {
					Print.LOG_INFO_CONTROLLER(this.getClass().getSimpleName(), Process.DELETE, e.getMessage());
				}

				try {
					// Delete Tch
					List<SitTblGnrPrsPrf> auxLstGnrPrsPrf = new ArrayList<SitTblGnrPrsPrf>();
					auxLstGnrPrsPrf = SGnrPrsPrf.lstGnrPrsPrf(gnr, true);
					if (auxLstGnrPrsPrf.size() > 0) {
						for (SitTblGnrPrsPrf auxGnrPrsPrf : auxLstGnrPrsPrf) {
							SGnrPrsPrf.dltLgc(auxGnrPrsPrf);
						}
					} else {
						Message.msgWrn(MessageForm.MSG_DLT_GNR_PRS_PRF.getSLblNme());
					}
				} catch (Exception e) {
					Print.LOG_INFO_CONTROLLER(this.getClass().getSimpleName(), Process.DELETE, e.getMessage());
				}

				if (SGnr.dltLgc(gnr)) {
					Message.msgInf(MessageForm.MSG_DLT_OK.getSLblNme());
				} else {
					Message.msgErr(MessageForm.MSG_DLT_ERROR.getSLblNme());
				}
			}
			this.srcPrm();
		} catch (Exception e) {
			Print.LOG_INFO_CONTROLLER(this.getClass().getSimpleName(), Process.DELETE, e.getMessage());
			Message.msgErr(MessageForm.MSG_DLT_ERROR.getSLblNme() + ": " + e.getLocalizedMessage());
		}
	}

	public List<SitTblGnrDtl> lstGnrDtl(SitTblGnr gnr, int ITpeDtl) {
		try {
			List<SitTblGnrDtl> auxLstGnrDtl = new ArrayList<SitTblGnrDtl>();
			auxLstGnrDtl = SGnrDtl.lstGnrDtl(gnr, ITpeDtl, true);
			Collections.sort(auxLstGnrDtl, new Comparator<SitTblGnrDtl>() {
				public int compare(SitTblGnrDtl o1, SitTblGnrDtl o2) {
					return o1.getDGnrDtlDtePrc().compareTo(o2.getDGnrDtlDtePrc());
				}
			});
			return auxLstGnrDtl;
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
			return null;
		}
	}

	public List<SitTblGnrPrsPrf> lstGnrDtlPrs(SitTblGnr gnr, int IRolId) {
		try {
			List<SitTblGnrPrsPrf> auxLstGnrDtl = new ArrayList<SitTblGnrPrsPrf>();
			auxLstGnrDtl = SGnrPrsPrf.lstGnrPrsPrf(gnr, IRolId);
			return auxLstGnrDtl;
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public String STchAgn(SitTblGnr gnr, int IRolId) {
		try {
			List<SitTblGnrPrsPrf> auxLstGnrDtl = new ArrayList<SitTblGnrPrsPrf>();
			auxLstGnrDtl = SGnrPrsPrf.lstGnrPrsPrf(gnr, IRolId);
			String tch = "";
			for (SitTblGnrPrsPrf auxPrsPrf : auxLstGnrDtl) {
				tch = tch + auxPrsPrf.getScrTblPrsRol().getDtaTblPr().getSPrsNme().substring(0, 1)
						+ auxPrsPrf.getScrTblPrsRol().getDtaTblPr().getSPrsLstNme().substring(0, 1) + ",";
			}
			tch = Optional.ofNullable(tch).filter(s -> s.length() != 0).map(s -> s.substring(0, s.length() - 1))
					.orElse(tch);
			return tch;
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public int ITtlEgs(SitTblGnr gnr) {
		try {
			return (gnr.getIGnrNmbEgsCpl() + gnr.getIGnrNmbEgsBrk());
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.CALCULATE, e.getMessage());
			return Default.I_DFL_SLC_VLE();
		}
	}

	public int ITtlLrvLive(SitTblGnr gnr) {
		try {
			List<SitTblGnrDtl> auxLstGnrDtl = new ArrayList<SitTblGnrDtl>();
			auxLstGnrDtl = SGnrDtl.lstGnrDtlPrc(gnr, Code.I_SIT_LRV(), Code.I_SIT_PRC_FLD(), true);
			int ttl = 0;
			for (SitTblGnrDtl auxGnrDtl : auxLstGnrDtl) {
				ttl = ttl + auxGnrDtl.getIGnrDtlNmb();
			}
			return ttl;
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.CALCULATE, e.getMessage());
			return Default.I_DFL_SLC_VLE();
		}
	}

	public int ITtlLrvDead(SitTblGnr gnr) {
		try {
			List<SitTblGnrDtl> auxLstGnrDtl = new ArrayList<SitTblGnrDtl>();
			auxLstGnrDtl = SGnrDtl.lstGnrDtlPrc(gnr, Code.I_SIT_LRV(), Code.I_SIT_PRC_FLD(), true);
			int ttl = 0;
			for (SitTblGnrDtl auxGnrDtl : auxLstGnrDtl) {
				ttl = ttl + auxGnrDtl.getiGnrDtlNmbDd();
			}
			return ttl;
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.CALCULATE, e.getMessage());
			return Default.I_DFL_SLC_VLE();
		}
	}

	public boolean vldDsbBtnTbl(SitTblGnr gnr) {
		try {
			boolean vlr = true;
			if (prl.getIPrsRolId() == gnr.getScrTblPrsRol().getIPrsRolId()) { // Compare user session with user register
				vlr = false;
			} else {
				vlr = true;
			}
			return vlr;
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.VALIDATE, e.getMessage());
			return false;
		}
	}

	// BOTONES DE PANELES DE FORMULARIO
	private boolean vsbPgrTbl;
	private boolean vsbPgrDta;

	private void actPgr(boolean tbl, boolean dta) {
		vsbPgrTbl = tbl;
		vsbPgrDta = dta;
	}

	// BOTONES DEL FORMULARIO
	private boolean vsbBtnHme;
	private boolean dsbBtnHme;

	private void actBtnHme(boolean dsb, boolean vsb) {
		vsbBtnHme = vsb;
		dsbBtnHme = dsb;
	}

	private boolean vsbBtnAdd;
	private boolean dsbBtnAdd;

	private void actBtnAdd(boolean dsb, boolean vsb) {
		vsbBtnAdd = vsb;
		dsbBtnAdd = dsb;
	}

	private boolean vsbBtnAddCpy;
	private boolean dsbBtnAddCpy;

	private void actBtnAddCpy(boolean dsb, boolean vsb) {
		vsbBtnAddCpy = vsb;
		dsbBtnAddCpy = dsb;
	}

	private boolean vsbBtnSve;
	private boolean dsbBtnSve;

	private void actBtnSve(boolean dsb, boolean vsb) {
		vsbBtnSve = vsb;
		dsbBtnSve = dsb;
	}

	private boolean vsbBtnUpd;
	private boolean dsbBtnUpd;

	private void actBtnUpd(boolean dsb, boolean vsb) {
		vsbBtnUpd = vsb;
		dsbBtnUpd = dsb;
	}

	private boolean vsbBtnSrc;
	private boolean dsbBtnSrc;

	private void actBtnSrc(boolean dsb, boolean vsb) {
		vsbBtnSrc = vsb;
		dsbBtnSrc = dsb;
	}

	private boolean vsbBtnRtr;
	private boolean dsbBtnRtr;

	private void actBtnRtr(boolean dsb, boolean vsb) {
		vsbBtnRtr = vsb;
		dsbBtnRtr = dsb;
	}

	// BOTONES DE TABLA
	private boolean dsbTblBtnEdt;
	private boolean vsbTblBtnEdt;

	private void actTblBtnEdt(boolean dsb, boolean vsb) {
		dsbTblBtnEdt = dsb;
		vsbTblBtnEdt = vsb;
	}

	private boolean dsbTblBtnDlt;
	private boolean vsbTblBtnDlt;

	private void actTblBtnDlt(boolean dsb, boolean vsb) {
		dsbTblBtnDlt = dsb;
		vsbTblBtnDlt = vsb;
	}

	/** +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ **/
	/**
	 * <h1>DECLARE OBJECTS AND METHODS --> SEARCH !</h1> 1. Declare objects <br/>
	 * 2. Actions objects <br/>
	 * 
	 * @author DC
	 * @param none
	 * @return none
	 * @version 1.0
	 * @since 2022-03-23
	 */
	private boolean dsbSrcSte;
	private boolean vsbSrcSte;
	private boolean rqrSrcSte;
	private int ISrcSteId;
	private boolean dsbSrcPrc;
	private boolean vsbSrcPrc;
	private boolean rqrSrcPrc;
	private int ISrcPrcId;
	private boolean dsbSrcPrm;
	private boolean vsbSrcPrm;
	private boolean rqrSrcPrm;
	private int ISrcPrmId;
	private Date DSrcDteStr;
	private Date DSrcDteEnd;
	private boolean dsbSrcDteStr;
	private boolean vsbSrcDteStr;
	private boolean rqrSrcDteStr;
	private boolean dsbSrcDteEnd;
	private boolean vsbSrcDteEnd;
	private boolean rqrSrcDteEnd;
	private boolean dsbBtnSrcPrm;
	private boolean vsbBtnSrcPrm;

	private void actSrcSte(boolean dsb, boolean vsb, boolean rqr) {
		this.dsbSrcSte = dsb;
		this.vsbSrcSte = vsb;
		this.rqrSrcSte = rqr;
	}

	private void actSrcPrc(boolean dsb, boolean vsb, boolean rqr) {
		this.dsbSrcPrc = dsb;
		this.vsbSrcPrc = vsb;
		this.rqrSrcPrc = rqr;
	}

	private void actSrcPrm(boolean dsb, boolean vsb, boolean rqr) {
		this.dsbSrcPrm = dsb;
		this.vsbSrcPrm = vsb;
		this.rqrSrcPrm = rqr;
	}

	private void actSrcDteSrt(boolean dsb, boolean vsb, boolean rqr) {
		this.dsbSrcDteStr = dsb;
		this.vsbSrcDteStr = vsb;
		this.rqrSrcDteStr = rqr;
	}

	private void actSrcDteEnd(boolean dsb, boolean vsb, boolean rqr) {
		this.dsbSrcDteEnd = dsb;
		this.vsbSrcDteEnd = vsb;
		this.rqrSrcDteEnd = rqr;
	}

	private void actBtnSrcPrm(boolean dsb, boolean vsb) {
		this.dsbBtnSrcPrm = dsb;
		this.vsbBtnSrcPrm = vsb;
	}

	/**
	 * <h1>METHOD --> SEARCH PARAM !</h1> Search for parameter <br/>
	 * 
	 * @author DC
	 * @param none
	 * @return SitTblGnr
	 * @version 1.0
	 * @since 2022-03-23
	 */
	public void srcPrm() {
		try {
			this.newGnr();
			this.actBtnDwn(false, true);
			if (ISrcSteId == Default.I_DFL_SLC_VLE() && ISrcPrcId != Default.I_DFL_SLC_VLE()) {
				if (ISrcPrmId == Code.I_SIT_SRC_DTE_PRC()) {
					lstGnr = SGnr.lstGnrPrmNoStePrc(prl.getIPrjId(), ISrcPrcId, DSrcDteStr, DSrcDteEnd, true);
				} else if (ISrcPrmId == Code.I_SIT_SRC_DTE_SET()) {
					lstGnr = SGnr.lstGnrPrmNoSteSet(prl.getIPrjId(), ISrcPrcId, DSrcDteStr, DSrcDteEnd, true);
				} else if (ISrcPrmId == Code.I_SIT_SRC_DTE_CLC()) {
					lstGnr = SGnr.lstGnrPrmNoSteClc(prl.getIPrjId(), ISrcPrcId, DSrcDteStr, DSrcDteEnd, true);
				}
			} else if (ISrcSteId == Default.I_DFL_SLC_VLE() && ISrcPrcId == Default.I_DFL_SLC_VLE()) {
				if (ISrcPrmId == Code.I_SIT_SRC_DTE_PRC()) {
					lstGnr = SGnr.lstGnrPrmNoStePrcPrc(prl.getIPrjId(), DSrcDteStr, DSrcDteEnd, true);
				} else if (ISrcPrmId == Code.I_SIT_SRC_DTE_SET()) {
					lstGnr = SGnr.lstGnrPrmNoStePrcSet(prl.getIPrjId(), DSrcDteStr, DSrcDteEnd, true);
				} else if (ISrcPrmId == Code.I_SIT_SRC_DTE_CLC()) {
					lstGnr = SGnr.lstGnrPrmNoStePrcClc(prl.getIPrjId(), DSrcDteStr, DSrcDteEnd, true);
				}
			} else if (ISrcSteId != Default.I_DFL_SLC_VLE() && ISrcPrcId == Default.I_DFL_SLC_VLE()) {
				SitTblSte steAux = new SitTblSte();
				steAux = SSte.searchId(ISrcSteId);
				if (ISrcPrmId == Code.I_SIT_SRC_DTE_PRC()) {
					lstGnr = SGnr.lstGnrPrmNoPrcPrc(prl.getIPrjId(), steAux, DSrcDteStr, DSrcDteEnd, true);
				} else if (ISrcPrmId == Code.I_SIT_SRC_DTE_SET()) {
					lstGnr = SGnr.lstGnrPrmNoPrcSet(prl.getIPrjId(), steAux, DSrcDteStr, DSrcDteEnd, true);
				} else if (ISrcPrmId == Code.I_SIT_SRC_DTE_CLC()) {
					lstGnr = SGnr.lstGnrPrmNoPrcClc(prl.getIPrjId(), steAux, DSrcDteStr, DSrcDteEnd, true);
				}
			} else {
				SitTblSte steAux = new SitTblSte();
				steAux = SSte.searchId(ISrcSteId);
				if (ISrcPrmId == Code.I_SIT_SRC_DTE_PRC()) {
					lstGnr = SGnr.lstGnrPrmPrc(prl.getIPrjId(), steAux, ISrcPrcId, DSrcDteStr, DSrcDteEnd, true);
				} else if (ISrcPrmId == Code.I_SIT_SRC_DTE_SET()) {
					lstGnr = SGnr.lstGnrPrmSet(prl.getIPrjId(), steAux, ISrcPrcId, DSrcDteStr, DSrcDteEnd, true);
				} else if (ISrcPrmId == Code.I_SIT_SRC_DTE_CLC()) {
					lstGnr = SGnr.lstGnrPrmClc(prl.getIPrjId(), steAux, ISrcPrcId, DSrcDteStr, DSrcDteEnd, true);
				}
			}
			this.cptSrcPrm();
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
		}
	}

	private void cptSrcPrm() {
		try {
		} catch (Exception e) {
			Print.LOG_INFO_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
		}
	}

	/** +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ **/
	/**
	 * <h1>DECLARE OBJECTS AND METHODS --> DOWNLOAD !</h1> 1. Declare objects <br/>
	 * 2. Actions objects <br/>
	 * 
	 * @author DC
	 * @param none
	 * @return none
	 * @version 1.0
	 * @since 2022-03-23
	 */
	private boolean dsbBtnDwn;
	private boolean vsbBtnDwn;

	private void actBtnDwn(boolean dsb, boolean vsb) {
		this.dsbBtnDwn = dsb;
		this.vsbBtnDwn = vsb;
	}

	/** +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ **/
	public void chsTrp() {
		this.actTrpNmb(false, true, true);
	}

	/** +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ **/

	@EJB
	protected SitSrvSte SSte;
	private int ISteId;
	private SitTblSte ste;

	public void chsSte() {
		try {
			ste = new SitTblSte();
			ste = SSte.searchId(ISteId);
			this.actTrp(false, true, true);
			this.actTrpRcv(false, true, false);
			this.actTrpSup(false, true, false);
			this.actGnrPrfAgn(false, true, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** ++++++++++++++++++++++++++++PROCESS+++++++++++++++++++++++++++++++ **/

	private boolean dsbPrcDte;
	private boolean vsbPrcDte;
	private boolean rqrPrcDte;

	private boolean dsbTpe;
	private boolean vsbTpe;
	private boolean rqrTpe;
	private int ITpeId;

	private boolean dsbSte;
	private boolean vsbSte;
	private boolean rqrSte;

	private boolean dsbPrcSts;
	private boolean vsbPrcSts;
	private boolean rqrPrcSts;

	private boolean dsbPrcDteCls;
	private boolean vsbPrcDteCls;
	private boolean rqrPrcDteCls;

	private boolean dsbPrcCmm;
	private boolean vsbPrcCmm;
	private boolean rqrPrcCmm;

	private void actPrcDte(boolean dsb, boolean vsb, boolean rqr) {
		dsbPrcDte = dsb;
		vsbPrcDte = vsb;
		rqrPrcDte = rqr;
	}

	private void actPrc(boolean dsb, boolean vsb, boolean rqr) {
		dsbTpe = dsb;
		vsbTpe = vsb;
		rqrTpe = rqr;
	}

	private void actPrcSte(boolean dsb, boolean vsb, boolean rqr) {
		dsbSte = dsb;
		vsbSte = vsb;
		rqrSte = rqr;
	}

	private void actPrcSts(boolean dsb, boolean vsb, boolean rqr) {
		dsbPrcSts = dsb;
		vsbPrcSts = vsb;
		rqrPrcSts = rqr;
	}

	private void actPrcDteCls(boolean dsb, boolean vsb, boolean rqr) {
		dsbPrcDteCls = dsb;
		vsbPrcDteCls = vsb;
		rqrPrcDteCls = rqr;
	}

	private void actPrcCmm(boolean dsb, boolean vsb, boolean rqr) {
		dsbPrcCmm = dsb;
		vsbPrcCmm = vsb;
		rqrPrcCmm = rqr;
	}

	public void chsPrcSts() {
		try {
			if (gnr.getiPrcStsId() == Code.I_SIT_PRC_STS_CLS()) {
				this.actPrcDteCls(false, true, true);
			} else {
				this.actPrcDteCls(true, true, false);
			}
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.VALIDATE, e.getMessage());
		}
	}

	/** ++++++++++++++++++++++++++++TRAP+++++++++++++++++++++++++++++++ **/

	@EJB
	protected SitSrvNmb SNmb;
	private int INmbId;
	private SitTblNmb nmb;

	private boolean dsbNmb;
	private boolean vsbNmb;
	private boolean rqrNmb;

	private boolean dsbDteSet;
	private boolean vsbDteSet;
	private boolean rqrDteSet;

	private boolean dsbDteClc;
	private boolean vsbDteClc;
	private boolean rqrDteClc;

	private boolean dsbTrpRcv;
	private boolean vsbTrpRcv;
	private boolean rqrTrpRcv;

	private boolean dsbTrpSup;
	private boolean vsbTrpSup;
	private boolean rqrTrpSup;

	private void actTrpNmb(boolean dsb, boolean vsb, boolean rqr) {
		dsbNmb = dsb;
		vsbNmb = vsb;
		rqrNmb = rqr;
	}

	private void actTrpDteSet(boolean dsb, boolean vsb, boolean rqr) {
		dsbDteSet = dsb;
		vsbDteSet = vsb;
		rqrDteSet = rqr;
	}

	private void actTrpDteClc(boolean dsb, boolean vsb, boolean rqr) {
		dsbDteClc = dsb;
		vsbDteClc = vsb;
		rqrDteClc = rqr;
	}

	private void actTrpRcv(boolean dsb, boolean vsb, boolean rqr) {
		dsbTrpRcv = dsb;
		vsbTrpRcv = vsb;
		rqrTrpRcv = rqr;
	}

	private void actTrpSup(boolean dsb, boolean vsb, boolean rqr) {
		dsbTrpSup = dsb;
		vsbTrpSup = vsb;
		rqrTrpSup = rqr;
	}

	public void chsNmb() {
		try {
			nmb = new SitTblNmb();
			nmb = SNmb.searchId(INmbId);
			this.actTrpDteSet(false, true, true);
			this.actTrpDteClc(false, true, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void chsClc() {
		try {
			if (mth.vldDte(gnr.getdGnrDteSet(), gnr.getdGnrDteClc()) == -1) { // # FECHA FIN > FECHA INICIO
				if (mth.vldDte(gnr.getdGnrDteSet(), gnr.getdGnrDteClc()) == Default.I_DFL_VLE()) { // # FECHA FIN =
																									// FECHA INICIO
				} else {
					this.actBEgs(false, true, false);
					this.actBLrv(false, true, false);
					this.actBAdl(false, true, false);
					this.actTrpRcv(false, true, false);
					this.actTrpSup(false, true, false);
					this.actGnrPrfAgn(false, true, false);
				}
			} else if (mth.vldDte(gnr.getdGnrDteSet(), gnr.getdGnrDteClc()) == 1) {// # FECHA FIN < FECHA INICIO
				Message.msgWrn("La fecha ingresada es incorrecta");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void chsTrpRcv() {
		if (gnr.getBGnrTrpRcv() == false) {
			this.actBEgs(true, true, false);
			this.actBLrv(true, true, false);
			this.actBAdl(true, true, false);
		} else {
			this.actBEgs(false, true, false);
			this.actBLrv(false, true, false);
			this.actBAdl(false, true, false);
		}
	}

	/** +++++++++++++++++++++++++++EGGS++++++++++++++++++++++++++++ **/

	private boolean dsbBEgs;
	private boolean vsbBEgs;
	private boolean rqrBEgs;

	private boolean dsbEgsNmbCpl;
	private boolean vsbEgsNmbCpl;
	private boolean rqrEgsNmbCpl;

	private boolean dsbEgsNmbBrk;
	private boolean vsbEgsNmbBrk;
	private boolean rqrEgsNmbBrk;

	private boolean dsbEgsNmbVbl;
	private boolean vsbEgsNmbVbl;
	private boolean rqrEgsNmbVbl;

	private boolean dsbEgsNmbVblNo;
	private boolean vsbEgsNmbVblNo;
	private boolean rqrEgsNmbVblNo;

	private boolean dsbEgsCmm;
	private boolean vsbEgsCmm;
	private boolean rqrEgsCmm;

	private void actBEgs(boolean dsb, boolean vsb, boolean rqr) {
		dsbBEgs = dsb;
		vsbBEgs = vsb;
		rqrBEgs = rqr;
	}

	private void actEgsNmbCpl(boolean dsb, boolean vsb, boolean rqr) {
		dsbEgsNmbCpl = dsb;
		vsbEgsNmbCpl = vsb;
		rqrEgsNmbCpl = rqr;
	}

	private void actEgsNmbBrk(boolean dsb, boolean vsb, boolean rqr) {
		dsbEgsNmbBrk = dsb;
		vsbEgsNmbBrk = vsb;
		rqrEgsNmbBrk = rqr;
	}

	private void actEgsNmbVblNo(boolean dsb, boolean vsb, boolean rqr) {
		dsbEgsNmbVblNo = dsb;
		vsbEgsNmbVblNo = vsb;
		rqrEgsNmbVblNo = rqr;
	}

	private void actEgsNmbVbl(boolean dsb, boolean vsb, boolean rqr) {
		dsbEgsNmbVbl = dsb;
		vsbEgsNmbVbl = vsb;
		rqrEgsNmbVbl = rqr;
	}

	private void actEgsCmm(boolean dsb, boolean vsb, boolean rqr) {
		dsbEgsCmm = dsb;
		vsbEgsCmm = vsb;
		rqrEgsCmm = rqr;
	}

	public void chsEgs() {
		if (gnr.getBGnrEgs() != false) {
			this.actEgsNmbCpl(false, true, true);
			this.actEgsNmbBrk(false, true, true);
			this.actEgsNmbVbl(false, true, true);
			this.actEgsNmbVblNo(false, true, true);
			this.actEgsCmm(false, true, false);
		} else {
			this.actEgsNmbCpl(true, true, false);
			this.actEgsNmbBrk(true, true, false);
			this.actEgsNmbVbl(true, true, false);
			this.actEgsNmbVblNo(true, true, false);
			this.actEgsCmm(true, true, false);
		}
	}

	/** +++++++++++++++++++++++++++LARVAE++++++++++++++++++++++++++++ **/

	private boolean dsbBLrs;
	private boolean vsbBLrs;
	private boolean rqrBLrs;

	private boolean dsbLrvCmm;
	private boolean vsbLrvCmm;
	private boolean rqrLrvCmm;

	private boolean dsbAdlCmm;
	private boolean vsbAdlCmm;
	private boolean rqrAdlCmm;

	private boolean dsbLrvNmbLive;
	private boolean vsbLrvNmbLive;
	private boolean rqrLrvNmbLive;

	private boolean dsbLrvNmbDied;
	private boolean vsbLrvNmbDied;
	private boolean rqrLrvNmbDied;

	private boolean dsbLrvBtnAdd;
	private boolean vsbLrvBtnAdd;

	private boolean dsbLrvBtnNew;
	private boolean vsbLrvBtnNew;

	private boolean dsbLrvBtnRst;
	private boolean vsbLrvBtnRst;

	private void actLrvBtnRst(boolean dsb, boolean vsb) {
		dsbLrvBtnRst = dsb;
		vsbLrvBtnRst = vsb;
	}

	private void actLrvBtnNew(boolean dsb, boolean vsb) {
		dsbLrvBtnNew = dsb;
		vsbLrvBtnNew = vsb;
	}

	private void actLrvBtnAdd(boolean dsb, boolean vsb) {
		dsbLrvBtnAdd = dsb;
		vsbLrvBtnAdd = vsb;
	}

	private void actLrvNmbDied(boolean dsb, boolean vsb, boolean rqr) {
		dsbLrvNmbDied = dsb;
		vsbLrvNmbDied = vsb;
		rqrLrvNmbDied = rqr;
	}

	private void actLrvNmbLive(boolean dsb, boolean vsb, boolean rqr) {
		dsbLrvNmbLive = dsb;
		vsbLrvNmbLive = vsb;
		rqrLrvNmbLive = rqr;
	}

	private void actLrvCmm(boolean dsb, boolean vsb, boolean rqr) {
		dsbLrvCmm = dsb;
		vsbLrvCmm = vsb;
		rqrLrvCmm = rqr;
	}

	private void actAdlCmm(boolean dsb, boolean vsb, boolean rqr) {
		dsbAdlCmm = dsb;
		vsbAdlCmm = vsb;
		rqrAdlCmm = rqr;
	}

	/** +++++++++++++++++++++++++++ADULTS++++++++++++++++++++++++++++ **/

	private boolean dsbBAdl;
	private boolean vsbBAdl;
	private boolean rqrBAdl;

	private void actBLrv(boolean dsb, boolean vsb, boolean rqr) {
		dsbBLrs = dsb;
		vsbBLrs = vsb;
		rqrBLrs = rqr;
	}

	private void actBAdl(boolean dsb, boolean vsb, boolean rqr) {
		dsbBAdl = dsb;
		vsbBAdl = vsb;
		rqrBAdl = rqr;
	}

	private void newGnr() {
		lstGnr = new ArrayList<SitTblGnr>();
	}

	/** +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ **/
	private boolean dsbPrsPrf;
	private boolean vsbPrsPrf;
	private boolean rqrPrsPrf;

	private void actTrpAgnFld(boolean dsb, boolean vsb, boolean rqr) {
		dsbPrsPrf = dsb;
		vsbPrsPrf = vsb;
		rqrPrsPrf = rqr;
	}

	private int IPrsPrfId;

	private List<ScrTblPrsRol> lstAgn;
	private List<ScrTblPrsRol> lstTch;
	private List<ScrTblPrsRol> lstAgnCmp;
	private List<ScrTblPrsRol> lstTchCmp;

	private String IAgnId;
	private String ITchId;

	public void chsPrsPrf() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void chsAddAgn() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void chsAddTch() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ Larvae +++++++++++++++++++++++++++ */
	/****************************************************************************/
	private boolean dsbGnrDtlLrvPrc;
	private boolean vsbGnrDtlLrvPrc;
	private boolean rqrGnrDtlLrvPrc;

	private boolean dsbGnrDtlLrvPrcDte;
	private boolean vsbGnrDtlLrvPrcDte;
	private boolean rqrGnrDtlLrvPrcDte;

	private boolean dsbLrsStg;
	private boolean vsbLrsStg;
	private boolean rqrLrsStg;

	private boolean dsbLrsCtn;
	private boolean vsbLrsCtn;
	private boolean rqrLrsCtn;

	private int ILrsStgId;

	private List<SitTblGnrDtl> lstLrsStgSlc;
	private SitTblGnrDtl gnrDtlLrv;

	public void chsLrs() {
		this.newLrvStg();
		if (gnr.getBGnrLrs() != false) {
			this.actLrvStg(false, true, true);
			this.actLrvCtn(false, true, false);
			this.actLrvBtnAdd(false, true);
			this.actLrvNmbLive(false, true, true);
			this.actLrvNmbDied(false, true, true);
		} else {
			this.actLrvNmbLive(true, true, false);
			this.actLrvNmbDied(true, true, false);
			this.actLrvStg(true, true, false);
			this.actLrvCtn(true, true, false);
			this.actLrvBtnAdd(true, true);
		}
		this.newLstLrvStg();
	}

	private void actLrvPrc(boolean dsb, boolean vsb, boolean rqr) {
		dsbGnrDtlLrvPrc = dsb;
		vsbGnrDtlLrvPrc = vsb;
		rqrGnrDtlLrvPrc = rqr;
	}

	private void actLrvPrcDte(boolean dsb, boolean vsb, boolean rqr) {
		dsbGnrDtlLrvPrcDte = dsb;
		vsbGnrDtlLrvPrcDte = vsb;
		rqrGnrDtlLrvPrcDte = rqr;
	}

	private void actLrvStg(boolean dsb, boolean vsb, boolean rqr) {
		dsbLrsStg = dsb;
		vsbLrsStg = vsb;
		rqrLrsStg = rqr;
	}

	private void actLrvCtn(boolean dsb, boolean vsb, boolean rqr) {
		dsbLrsCtn = dsb;
		vsbLrsCtn = vsb;
		rqrLrsCtn = rqr;
	}

	public void newLstLrvStg() {
		lstLrsStgSlc = new ArrayList<SitTblGnrDtl>();
	}

	public void newLrvStg() {
		ILrsStgId = Default.I_DFL_VLE();
		gnrDtlLrv = new SitTblGnrDtl();
		gnrDtlLrv.setIGnrDtlNmb(Default.I_DFL_VLE());
		gnrDtlLrv.setiGnrDtlNmbDd(Default.I_DFL_VLE());
		gnrDtlLrv.setITpeDtl(Code.I_SIT_LRV());
		this.actLrvNmbLive(false, true, true);
		this.actLrvNmbDied(false, true, true);
		this.actLrvStg(false, true, true);
		this.actLrvCtn(false, true, false);
		this.actLrvBtnAdd(false, true);
		this.actLrvBtnNew(true, true);
		this.actLrvBtnRst(false, true);
		this.actLrvPrc(false, true, true);
		this.actLrvPrcDte(false, true, true);
	}

	public void addLrvStg() {
		try {
			if (gnr.getITpeId() == Code.I_SIT_TPE_FLD()) {
				gnrDtlLrv.setIGnsId(Default.I_DFL_SLC_VLE());
				gnrDtlLrv.setISexId(Default.I_DFL_SLC_VLE());
				if (gnrDtlLrv.getIGnrDtlNmb() == Default.I_DFL_VLE()
						&& gnrDtlLrv.getiGnrDtlNmbDd() == Default.I_DFL_VLE()) {
					Message.msgWrn(Message.S_MSG_FRMO1_INPUT_DST_ZERO);
				} else {
					lstLrsStgSlc.add(gnrDtlLrv);
					this.actLrvCmm(false, true, false);
					this.actLrvNmbLive(true, true, false);
					this.actLrvNmbDied(true, true, false);
					this.actLrvBtnAdd(true, true);
					this.actLrvBtnNew(false, true);
					this.actLrvBtnRst(true, true);
					this.actLrvStg(true, true, false);
					this.actLrvCtn(true, true, false);
					this.actLrvPrc(true, true, false);
					this.actLrvPrcDte(true, true, false);
				}
			}
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.ADD, e.getMessage());
		}

	}

	public void dltLrvStg() {
		try {
			lstLrsStgSlc.remove(gnrDtlLrv);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	public void rstLrvStg() {
		try {
			this.actLrvBtnAdd(true, true);
			this.actLrvBtnNew(false, true);
			this.actLrvBtnRst(true, true);
			ILrsStgId = Default.I_DFL_VLE();
			gnrDtlLrv = new SitTblGnrDtl();
			gnrDtlLrv.setIGnrDtlNmb(Default.I_DFL_VLE());
			gnrDtlLrv.setiGnrDtlNmbDd(Default.I_DFL_VLE());
			this.actLrvNmbDied(true, true, false);
			this.actLrvStg(true, true, false);
			this.actLrvCtn(true, true, false);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ Adult +++++++++++++++++++++++++++ */
	/****************************************************************************/

	private boolean dsbAdlPrc;
	private boolean vsbAdlPrc;
	private boolean rqrAdlPrc;

	private boolean dsbAdlPrcDte;
	private boolean vsbAdlPrcDte;
	private boolean rqrAdlPrcDte;

	private boolean dsbAdlNmb;
	private boolean vsbAdlNmb;
	private boolean rqrAdlNmb;

	private boolean dsbAdlNmbDd;
	private boolean vsbAdlNmbDd;
	private boolean rqrAdlNmbDd;

	private boolean dsbAdlSex;
	private boolean vsbAdlSex;
	private boolean rqrAdlSex;

	private boolean dsbAdlSpc;
	private boolean vsbAdlSpc;
	private boolean rqrAdlSpc;

	private boolean dsbBtnAdlAdd;
	private boolean vsbBtnAdlAdd;

	private boolean dsbBtnAdlNew;
	private boolean vsbBtnAdlNew;

	private boolean dsbBtnAdlRst;
	private boolean vsbBtnAdlRst;

	private List<SitTblGnrDtl> lstAdlSlc;
	private SitTblGnrDtl gnrDtlAdl;
	private int ISexId;
	private int ISpcId;

	private void actAdlPrc(boolean dsb, boolean vsb, boolean rqr) {
		dsbAdlPrc = dsb;
		vsbAdlPrc = vsb;
		rqrAdlPrc = rqr;
	}

	private void actAdlPrcDte(boolean dsb, boolean vsb, boolean rqr) {
		dsbAdlPrcDte = dsb;
		vsbAdlPrcDte = vsb;
		rqrAdlPrcDte = rqr;
	}

	private void newAdlSlc() {
		lstAdlSlc = new ArrayList<SitTblGnrDtl>();
	}

	public void newAdl() {
		try {
			gnrDtlAdl = new SitTblGnrDtl();
			ISexId = Default.I_DFL_VLE();
			ISpcId = Default.I_DFL_VLE();
			gnrDtlAdl.setITpeDtl(Code.I_SIT_ADL());
			gnrDtlAdl.setIGnrDtlNmb(Default.I_DFL_VLE());
			gnrDtlAdl.setiGnrDtlNmbDd(Default.I_DFL_VLE());
			this.actAdlBtnAdd(false, true);
			this.actAdlBtnRst(false, true);
			this.actAdlBtnNew(true, true);
			this.actAdlNmb(false, true, true);
			this.actAdlNmbDd(false, true, true);
			this.actAdlSex(false, true, true);
			this.actAdlSpc(false, true, true);
			this.actAdlPrc(false, true, true);
			this.actAdlPrcDte(false, true, true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	public void chsAdl() {
		this.newAdl();
		this.actAdlCmm(false, true, false);
		if (gnr.getBGnrAdl() != false) {
			this.actAdlNmb(false, true, true);
			this.actAdlNmbDd(false, true, true);
			this.actAdlSex(false, true, true);
			this.actAdlSpc(false, true, true);
			this.actAdlBtnAdd(false, true);
			this.actAdlBtnRst(false, true);
		} else {
			this.actAdlNmb(true, true, false);
			this.actAdlNmbDd(true, true, false);
			this.actAdlSex(true, true, false);
			this.actAdlSpc(true, true, false);
			this.actAdlBtnAdd(true, true);
		}

	}

	public void addAdl() {
		try {

			if (gnr.getITpeId() == Code.I_SIT_TPE_FLD()) {
				if (gnrDtlAdl.getIGnrDtlNmb() == Default.I_DFL_VLE()
						&& gnrDtlAdl.getiGnrDtlNmbDd() == Default.I_DFL_VLE()) {
					Message.msgWrn(Message.S_MSG_FRMO1_INPUT_DST_ZERO);
				} else {
					gnrDtlAdl.setITpeDtl(Code.I_SIT_ADL());
					gnrDtlAdl.setIStgId(Default.I_DFL_SLC_VLE());
					gnrDtlAdl.setICtnId(Default.I_DFL_SLC_VLE());
					gnrDtlAdl.setDGnrDtlDtePrc(gnr.getdGnrRgsDte());
					lstAdlSlc.add(gnrDtlAdl);
					this.actAdlNmb(true, true, false);
					this.actAdlNmbDd(true, true, false);
					this.actAdlSex(true, true, false);
					this.actAdlSpc(true, true, false);
					this.actAdlBtnAdd(true, true);
					this.actAdlBtnNew(false, true);
					this.actAdlBtnRst(true, true);
					this.actAdlPrc(true, true, false);
					this.actAdlPrcDte(true, true, false);
				}
			}

		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	public void rstAdl() {
		try {
			this.actAdlBtnAdd(true, true);
			this.actAdlBtnNew(false, true);
			this.actAdlBtnRst(true, true);
			gnrDtlAdl = new SitTblGnrDtl();
			ISexId = Default.I_DFL_VLE();
			ISpcId = Default.I_DFL_VLE();
			gnrDtlAdl.setIGnrDtlNmb(Default.I_DFL_VLE());
			gnrDtlAdl.setiGnrDtlNmbDd(Default.I_DFL_VLE());
			this.actAdlNmb(true, true, false);
			this.actAdlNmbDd(true, true, false);
			this.actAdlSex(true, true, false);
			this.actAdlSpc(true, true, false);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	public void dltAdl() {
		try {
			lstAdlSlc.remove(gnrDtlAdl);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	private void actAdlBtnRst(boolean dsb, boolean vsb) {
		dsbBtnAdlRst = dsb;
		vsbBtnAdlRst = vsb;
	}

	private void actAdlBtnNew(boolean dsb, boolean vsb) {
		dsbBtnAdlNew = dsb;
		vsbBtnAdlNew = vsb;
	}

	private void actAdlBtnAdd(boolean dsb, boolean vsb) {
		dsbBtnAdlAdd = dsb;
		vsbBtnAdlAdd = vsb;
	}

	private void actAdlNmb(boolean dsb, boolean vsb, boolean rqr) {
		dsbAdlNmb = dsb;
		vsbAdlNmb = vsb;
		rqrAdlNmb = rqr;
	}

	private void actAdlNmbDd(boolean dsb, boolean vsb, boolean rqr) {
		dsbAdlNmbDd = dsb;
		vsbAdlNmbDd = vsb;
		rqrAdlNmbDd = rqr;
	}

	private void actAdlSex(boolean dsb, boolean vsb, boolean rqr) {
		dsbAdlSex = dsb;
		vsbAdlSex = vsb;
		rqrAdlSex = rqr;
	}

	private void actAdlSpc(boolean dsb, boolean vsb, boolean rqr) {
		dsbAdlSpc = dsb;
		vsbAdlSpc = vsb;
		rqrAdlSpc = rqr;
	}

	/****************************************************************************/
	/* +++++++++++++++++++++++++++++++ Professional +++++++++++++++++++++++++++ */
	/****************************************************************************/

	private boolean dsbGnrPrfAgn;
	private boolean vsbGnrPrfAgn;
	private boolean rqrGnrPrfAgn;

	private boolean dsbGnrPrfTch;
	private boolean vsbGnrPrfTch;
	private boolean rqrGnrPrfTch;

	private boolean dsbBtnRstPrfAgn;
	private boolean vsbBtnRstPrfAgn;

	private boolean dsbBtnRstPrfTch;
	private boolean vsbBtnRstPrfTch;

	@EJB
	protected ScrSrvPrsRol SPrsPrf;
	private List<ScrTblPrsRol> lstPrsPrfAgnAdd;
	private List<String> IPrsPrfAgnSlcId;

	private List<ScrTblPrsRol> lstPrsPrfTchAdd;
	private List<String> IPrsPrfTchSlcId;

	private void newPrsPrfAgnSlc() {
		try {
			IPrsPrfAgnSlcId = new ArrayList<String>();
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	private void newPrsPrfAgnAdd() {
		try {
			lstPrsPrfAgnAdd = new ArrayList<ScrTblPrsRol>();
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	public void chsPrsPrfAgn() {
		try {
			if (IPrsPrfAgnSlcId.size() > Default.I_DFL_VLE()) {
				this.newPrsPrfAgnAdd();
				for (String prsPrfAux : IPrsPrfAgnSlcId) {
					lstPrsPrfAgnAdd.add(SPrsPrf.searchId(Integer.valueOf(prsPrfAux)));
				}
				this.actBtnRstPrfAgn(false, true);
			} else {
				this.newPrsPrfAgnSlc();
				this.newPrsPrfAgnAdd();
				this.actBtnRstPrfAgn(true, true);
			}

		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	public void rstTchFld() {
		try {
			this.newPrsPrfAgnSlc();
			this.newPrsPrfAgnAdd();
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	public void rstTchAgn() {
		try {
			this.newPrsPrfTchSlc();
			this.newPrsPrfTchAdd();
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	private void newPrsPrfTchSlc() {
		try {
			IPrsPrfTchSlcId = new ArrayList<String>();
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	private void newPrsPrfTchAdd() {
		try {
			lstPrsPrfTchAdd = new ArrayList<ScrTblPrsRol>();
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	public void chsPrsPrfTch() {
		try {
			this.newPrsPrfTchAdd();
			for (String prsPrfAux : IPrsPrfTchSlcId) {
				lstPrsPrfTchAdd.add(SPrsPrf.searchId(Integer.valueOf(prsPrfAux)));
			}
		} catch (Exception e) {
			LOG.log(Level.WARNING, Message.S_LOG_NME_CTL + e.getMessage());
		}
	}

	private void actGnrPrfAgn(boolean dsb, boolean vsb, boolean rqr) {
		dsbGnrPrfAgn = dsb;
		vsbGnrPrfAgn = vsb;
		rqrGnrPrfAgn = rqr;
	}

	private void actTrpAgnLab(boolean dsb, boolean vsb, boolean rqr) {
		dsbGnrPrfTch = dsb;
		vsbGnrPrfTch = vsb;
		rqrGnrPrfTch = rqr;
	}

	private void actBtnRstPrfTch(boolean dsb, boolean vsb) {
		dsbBtnRstPrfTch = dsb;
		vsbBtnRstPrfTch = vsb;
	}

	private void actBtnRstPrfAgn(boolean dsb, boolean vsb) {
		dsbBtnRstPrfAgn = dsb;
		vsbBtnRstPrfAgn = vsb;
	}

	/** +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ **/

	public int getISteId() {
		return ISteId;
	}

	public void setISteId(int iSteId) {
		ISteId = iSteId;
	}

	public SitTblSte getSte() {
		return ste;
	}

	public void setSte(SitTblSte ste) {
		this.ste = ste;
	}

	public SitTblGnr getGnr() {
		return gnr;
	}

	public void setGnr(SitTblGnr gnr) {
		this.gnr = gnr;
	}

	public List<SitTblGnr> getLstGnr() {
		return lstGnr;
	}

	public void setLstGnr(List<SitTblGnr> lstGnr) {
		this.lstGnr = lstGnr;
	}

	public int getIPrsPrfId() {
		return IPrsPrfId;
	}

	public void setIPrsPrfId(int iPrsPrfId) {
		IPrsPrfId = iPrsPrfId;
	}

	public boolean isDsbPrsPrf() {
		return dsbPrsPrf;
	}

	public void setDsbPrsPrf(boolean dsbPrsPrf) {
		this.dsbPrsPrf = dsbPrsPrf;
	}

	public boolean isVsbPrsPrf() {
		return vsbPrsPrf;
	}

	public void setVsbPrsPrf(boolean vsbPrsPrf) {
		this.vsbPrsPrf = vsbPrsPrf;
	}

	public boolean isRqrPrsPrf() {
		return rqrPrsPrf;
	}

	public void setRqrPrsPrf(boolean rqrPrsPrf) {
		this.rqrPrsPrf = rqrPrsPrf;
	}

	public boolean isDsbTrp() {
		return dsbTrp;
	}

	public void setDsbTrp(boolean dsbTrp) {
		this.dsbTrp = dsbTrp;
	}

	public boolean isVsbTrp() {
		return vsbTrp;
	}

	public void setVsbTrp(boolean vsbTrp) {
		this.vsbTrp = vsbTrp;
	}

	public boolean isRqrTrp() {
		return rqrTrp;
	}

	public void setRqrTrp(boolean rqrTrp) {
		this.rqrTrp = rqrTrp;
	}

	public int getITrpId() {
		return ITrpId;
	}

	public void setITrpId(int iTrpId) {
		ITrpId = iTrpId;
	}

	public boolean isDsbSte() {
		return dsbSte;
	}

	public void setDsbSte(boolean dsbSte) {
		this.dsbSte = dsbSte;
	}

	public boolean isVsbSte() {
		return vsbSte;
	}

	public void setVsbSte(boolean vsbSte) {
		this.vsbSte = vsbSte;
	}

	public boolean isRqrSte() {
		return rqrSte;
	}

	public void setRqrSte(boolean rqrSte) {
		this.rqrSte = rqrSte;
	}

	public boolean isDsbDteSet() {
		return dsbDteSet;
	}

	public void setDsbDteSet(boolean dsbDteSet) {
		this.dsbDteSet = dsbDteSet;
	}

	public boolean isVsbDteSet() {
		return vsbDteSet;
	}

	public void setVsbDteSet(boolean vsbDteSet) {
		this.vsbDteSet = vsbDteSet;
	}

	public boolean isRqrDteSet() {
		return rqrDteSet;
	}

	public void setRqrDteSet(boolean rqrDteSet) {
		this.rqrDteSet = rqrDteSet;
	}

	public boolean isDsbDteClc() {
		return dsbDteClc;
	}

	public void setDsbDteClc(boolean dsbDteClc) {
		this.dsbDteClc = dsbDteClc;
	}

	public boolean isVsbDteClc() {
		return vsbDteClc;
	}

	public void setVsbDteClc(boolean vsbDteClc) {
		this.vsbDteClc = vsbDteClc;
	}

	public boolean isRqrDteClc() {
		return rqrDteClc;
	}

	public void setRqrDteClc(boolean rqrDteClc) {
		this.rqrDteClc = rqrDteClc;
	}

	public boolean isDsbTrpRcv() {
		return dsbTrpRcv;
	}

	public void setDsbTrpRcv(boolean dsbTrpRcv) {
		this.dsbTrpRcv = dsbTrpRcv;
	}

	public boolean isVsbTrpRcv() {
		return vsbTrpRcv;
	}

	public void setVsbTrpRcv(boolean vsbTrpRcv) {
		this.vsbTrpRcv = vsbTrpRcv;
	}

	public boolean isRqrTrpRcv() {
		return rqrTrpRcv;
	}

	public void setRqrTrpRcv(boolean rqrTrpRcv) {
		this.rqrTrpRcv = rqrTrpRcv;
	}

	public boolean isDsbTrpSup() {
		return dsbTrpSup;
	}

	public void setDsbTrpSup(boolean dsbTrpSup) {
		this.dsbTrpSup = dsbTrpSup;
	}

	public boolean isVsbTrpSup() {
		return vsbTrpSup;
	}

	public void setVsbTrpSup(boolean vsbTrpSup) {
		this.vsbTrpSup = vsbTrpSup;
	}

	public boolean isRqrTrpSup() {
		return rqrTrpSup;
	}

	public void setRqrTrpSup(boolean rqrTrpSup) {
		this.rqrTrpSup = rqrTrpSup;
	}

	public boolean isDsbLrsStg() {
		return dsbLrsStg;
	}

	public void setDsbLrsStg(boolean dsbLrsStg) {
		this.dsbLrsStg = dsbLrsStg;
	}

	public boolean isVsbLrsStg() {
		return vsbLrsStg;
	}

	public void setVsbLrsStg(boolean vsbLrsStg) {
		this.vsbLrsStg = vsbLrsStg;
	}

	public boolean isRqrLrsStg() {
		return rqrLrsStg;
	}

	public void setRqrLrsStg(boolean rqrLrsStg) {
		this.rqrLrsStg = rqrLrsStg;
	}

	public int getILrsStgId() {
		return ILrsStgId;
	}

	public void setILrsStgId(int iLrsStgId) {
		ILrsStgId = iLrsStgId;
	}

	public List<SitTblGnrDtl> getLstLrsStgSlc() {
		return lstLrsStgSlc;
	}

	public void setLstLrsStgSlc(List<SitTblGnrDtl> lstLrsStgCmp) {
		this.lstLrsStgSlc = lstLrsStgCmp;
	}

	public boolean isDsbBEgs() {
		return dsbBEgs;
	}

	public void setDsbBEgs(boolean dsbBEgs) {
		this.dsbBEgs = dsbBEgs;
	}

	public boolean isVsbBEgs() {
		return vsbBEgs;
	}

	public void setVsbBEgs(boolean vsbBEgs) {
		this.vsbBEgs = vsbBEgs;
	}

	public boolean isRqrBEgs() {
		return rqrBEgs;
	}

	public void setRqrBEgs(boolean rqrBEgs) {
		this.rqrBEgs = rqrBEgs;
	}

	public boolean isDsbBLrs() {
		return dsbBLrs;
	}

	public void setDsbBLrs(boolean dsbBLrs) {
		this.dsbBLrs = dsbBLrs;
	}

	public boolean isVsbBLrs() {
		return vsbBLrs;
	}

	public void setVsbBLrs(boolean vsbBLrs) {
		this.vsbBLrs = vsbBLrs;
	}

	public boolean isRqrBLrs() {
		return rqrBLrs;
	}

	public void setRqrBLrs(boolean rqrBLrs) {
		this.rqrBLrs = rqrBLrs;
	}

	public boolean isDsbNmb() {
		return dsbNmb;
	}

	public void setDsbNmb(boolean dsbNmb) {
		this.dsbNmb = dsbNmb;
	}

	public boolean isVsbNmb() {
		return vsbNmb;
	}

	public void setVsbNmb(boolean vsbNmb) {
		this.vsbNmb = vsbNmb;
	}

	public boolean isRqrNmb() {
		return rqrNmb;
	}

	public void setRqrNmb(boolean rqrNmb) {
		this.rqrNmb = rqrNmb;
	}

	public int getINmbId() {
		return INmbId;
	}

	public void setINmbId(int iNmbId) {
		INmbId = iNmbId;
	}

	public SitTblNmb getNmb() {
		return nmb;
	}

	public void setNmb(SitTblNmb nmb) {
		this.nmb = nmb;
	}

	public boolean isDsbBtnAdlAdd() {
		return dsbBtnAdlAdd;
	}

	public void setDsbBtnAdlAdd(boolean dsbBtnAdlAdd) {
		this.dsbBtnAdlAdd = dsbBtnAdlAdd;
	}

	public boolean isVsbBtnAdlAdd() {
		return vsbBtnAdlAdd;
	}

	public void setVsbBtnAdlAdd(boolean vsbBtnAdlAdd) {
		this.vsbBtnAdlAdd = vsbBtnAdlAdd;
	}

	public boolean isDsbBtnAdlNew() {
		return dsbBtnAdlNew;
	}

	public void setDsbBtnAdlNew(boolean dsbBtnAdlNew) {
		this.dsbBtnAdlNew = dsbBtnAdlNew;
	}

	public boolean isVsbBtnAdlNew() {
		return vsbBtnAdlNew;
	}

	public void setVsbBtnAdlNew(boolean vsbBtnAdlNew) {
		this.vsbBtnAdlNew = vsbBtnAdlNew;
	}

	public boolean isDsbBtnAdlRst() {
		return dsbBtnAdlRst;
	}

	public void setDsbBtnAdlRst(boolean dsbBtnAdlRst) {
		this.dsbBtnAdlRst = dsbBtnAdlRst;
	}

	public boolean isVsbBtnAdlRst() {
		return vsbBtnAdlRst;
	}

	public void setVsbBtnAdlRst(boolean vsbBtnAdlRst) {
		this.vsbBtnAdlRst = vsbBtnAdlRst;
	}

	public int getISexId() {
		return ISexId;
	}

	public void setISexId(int iSexId) {
		ISexId = iSexId;
	}

	public int getISpcId() {
		return ISpcId;
	}

	public void setISpcId(int iSpcId) {
		ISpcId = iSpcId;
	}

	public List<ScrTblPrsRol> getLstAgn() {
		return lstAgn;
	}

	public void setLstAgn(List<ScrTblPrsRol> lstAgn) {
		this.lstAgn = lstAgn;
	}

	public List<ScrTblPrsRol> getLstTch() {
		return lstTch;
	}

	public void setLstTch(List<ScrTblPrsRol> lstTch) {
		this.lstTch = lstTch;
	}

	public List<ScrTblPrsRol> getLstAgnCmp() {
		return lstAgnCmp;
	}

	public void setLstAgnCmp(List<ScrTblPrsRol> lstAgnCmp) {
		this.lstAgnCmp = lstAgnCmp;
	}

	public List<ScrTblPrsRol> getLstTchCmp() {
		return lstTchCmp;
	}

	public void setLstTchCmp(List<ScrTblPrsRol> lstTchCmp) {
		this.lstTchCmp = lstTchCmp;
	}

	public String getIAgnId() {
		return IAgnId;
	}

	public void setIAgnId(String iAgnId) {
		IAgnId = iAgnId;
	}

	public String getITchId() {
		return ITchId;
	}

	public void setITchId(String iTchId) {
		ITchId = iTchId;
	}

	public SitTblGnrDtl getGnrDtl() {
		return gnrDtl;
	}

	public void setGnrDtl(SitTblGnrDtl gnrDtl) {
		this.gnrDtl = gnrDtl;
	}

	public boolean isDsbBAdl() {
		return dsbBAdl;
	}

	public void setDsbBAdl(boolean dsbBAdl) {
		this.dsbBAdl = dsbBAdl;
	}

	public boolean isVsbBAdl() {
		return vsbBAdl;
	}

	public void setVsbBAdl(boolean vsbBAdl) {
		this.vsbBAdl = vsbBAdl;
	}

	public boolean isRqrBAdl() {
		return rqrBAdl;
	}

	public void setRqrBAdl(boolean rqrBAdl) {
		this.rqrBAdl = rqrBAdl;
	}

	public boolean isDsbGnrPrfAgn() {
		return dsbGnrPrfAgn;
	}

	public void setDsbGnrPrfAgn(boolean dsbGnrPrfAgn) {
		this.dsbGnrPrfAgn = dsbGnrPrfAgn;
	}

	public boolean isVsbGnrPrfAgn() {
		return vsbGnrPrfAgn;
	}

	public void setVsbGnrPrfAgn(boolean vsbGnrPrfAgn) {
		this.vsbGnrPrfAgn = vsbGnrPrfAgn;
	}

	public boolean isRqrGnrPrfAgn() {
		return rqrGnrPrfAgn;
	}

	public void setRqrGnrPrfAgn(boolean rqrGnrPrfAgn) {
		this.rqrGnrPrfAgn = rqrGnrPrfAgn;
	}

	public boolean isDsbGnrPrfTch() {
		return dsbGnrPrfTch;
	}

	public void setDsbGnrPrfTch(boolean dsbGnrPrfTch) {
		this.dsbGnrPrfTch = dsbGnrPrfTch;
	}

	public boolean isVsbGnrPrfTch() {
		return vsbGnrPrfTch;
	}

	public void setVsbGnrPrfTch(boolean vsbGnrPrfTch) {
		this.vsbGnrPrfTch = vsbGnrPrfTch;
	}

	public boolean isRqrGnrPrfTch() {
		return rqrGnrPrfTch;
	}

	public void setRqrGnrPrfTch(boolean rqrGnrPrfTch) {
		this.rqrGnrPrfTch = rqrGnrPrfTch;
	}

	public List<ScrTblPrsRol> getLstPrsPrfAgnAdd() {
		return lstPrsPrfAgnAdd;
	}

	public void setLstPrsPrfAgnAdd(List<ScrTblPrsRol> lstPrsPrfAgnAdd) {
		this.lstPrsPrfAgnAdd = lstPrsPrfAgnAdd;
	}

	public List<String> getIPrsPrfAgnSlcId() {
		return IPrsPrfAgnSlcId;
	}

	public void setIPrsPrfAgnSlcId(List<String> iPrsPrfAgnSlcId) {
		IPrsPrfAgnSlcId = iPrsPrfAgnSlcId;
	}

	public List<ScrTblPrsRol> getLstPrsPrfTchAdd() {
		return lstPrsPrfTchAdd;
	}

	public void setLstPrsPrfTchAdd(List<ScrTblPrsRol> lstPrsPrfTchAdd) {
		this.lstPrsPrfTchAdd = lstPrsPrfTchAdd;
	}

	public List<String> getIPrsPrfTchSlcId() {
		return IPrsPrfTchSlcId;
	}

	public void setIPrsPrfTchSlcId(List<String> iPrsPrfTchSlcId) {
		IPrsPrfTchSlcId = iPrsPrfTchSlcId;
	}

	public boolean isDsbAdlNmb() {
		return dsbAdlNmb;
	}

	public void setDsbAdlNmb(boolean dsbAdlNmb) {
		this.dsbAdlNmb = dsbAdlNmb;
	}

	public boolean isVsbAdlNmb() {
		return vsbAdlNmb;
	}

	public void setVsbAdlNmb(boolean vsbAdlNmb) {
		this.vsbAdlNmb = vsbAdlNmb;
	}

	public boolean isRqrAdlNmb() {
		return rqrAdlNmb;
	}

	public void setRqrAdlNmb(boolean rqrAdlNmb) {
		this.rqrAdlNmb = rqrAdlNmb;
	}

	public boolean isDsbAdlSex() {
		return dsbAdlSex;
	}

	public void setDsbAdlSex(boolean dsbAdlSex) {
		this.dsbAdlSex = dsbAdlSex;
	}

	public boolean isVsbAdlSex() {
		return vsbAdlSex;
	}

	public void setVsbAdlSex(boolean vsbAdlSex) {
		this.vsbAdlSex = vsbAdlSex;
	}

	public boolean isRqrAdlSex() {
		return rqrAdlSex;
	}

	public void setRqrAdlSex(boolean rqrAdlSex) {
		this.rqrAdlSex = rqrAdlSex;
	}

	public boolean isDsbAdlSpc() {
		return dsbAdlSpc;
	}

	public void setDsbAdlSpc(boolean dsbAdlSpc) {
		this.dsbAdlSpc = dsbAdlSpc;
	}

	public boolean isVsbAdlSpc() {
		return vsbAdlSpc;
	}

	public void setVsbAdlSpc(boolean vsbAdlSpc) {
		this.vsbAdlSpc = vsbAdlSpc;
	}

	public boolean isRqrAdlSpc() {
		return rqrAdlSpc;
	}

	public void setRqrAdlSpc(boolean rqrAdlSpc) {
		this.rqrAdlSpc = rqrAdlSpc;
	}

	public List<SitTblGnrDtl> getLstAdlSlc() {
		return lstAdlSlc;
	}

	public void setLstAdlSlc(List<SitTblGnrDtl> lstAdlSlc) {
		this.lstAdlSlc = lstAdlSlc;
	}

	public SitTblGnrDtl getGnrDtlAdl() {
		return gnrDtlAdl;
	}

	public void setGnrDtlAdl(SitTblGnrDtl gnrDtlAdl) {
		this.gnrDtlAdl = gnrDtlAdl;
	}

	public SitTblGnrDtl getGnrDtlLrv() {
		return gnrDtlLrv;
	}

	public void setGnrDtlLrv(SitTblGnrDtl gnrDtlLrv) {
		this.gnrDtlLrv = gnrDtlLrv;
	}

	public boolean isVsbPgrTbl() {
		return vsbPgrTbl;
	}

	public void setVsbPgrTbl(boolean vsbPgrTbl) {
		this.vsbPgrTbl = vsbPgrTbl;
	}

	public boolean isVsbPgrDta() {
		return vsbPgrDta;
	}

	public void setVsbPgrDta(boolean vsbPgrDta) {
		this.vsbPgrDta = vsbPgrDta;
	}

	public boolean isVsbBtnHme() {
		return vsbBtnHme;
	}

	public void setVsbBtnHme(boolean vsbBtnHme) {
		this.vsbBtnHme = vsbBtnHme;
	}

	public boolean isDsbBtnHme() {
		return dsbBtnHme;
	}

	public void setDsbBtnHme(boolean dsbBtnHme) {
		this.dsbBtnHme = dsbBtnHme;
	}

	public boolean isVsbBtnAdd() {
		return vsbBtnAdd;
	}

	public void setVsbBtnAdd(boolean vsbBtnAdd) {
		this.vsbBtnAdd = vsbBtnAdd;
	}

	public boolean isDsbBtnAdd() {
		return dsbBtnAdd;
	}

	public void setDsbBtnAdd(boolean dsbBtnAdd) {
		this.dsbBtnAdd = dsbBtnAdd;
	}

	public boolean isVsbBtnAddCpy() {
		return vsbBtnAddCpy;
	}

	public void setVsbBtnAddCpy(boolean vsbBtnAddCpy) {
		this.vsbBtnAddCpy = vsbBtnAddCpy;
	}

	public boolean isDsbBtnAddCpy() {
		return dsbBtnAddCpy;
	}

	public void setDsbBtnAddCpy(boolean dsbBtnAddCpy) {
		this.dsbBtnAddCpy = dsbBtnAddCpy;
	}

	public boolean isVsbBtnSve() {
		return vsbBtnSve;
	}

	public void setVsbBtnSve(boolean vsbBtnSve) {
		this.vsbBtnSve = vsbBtnSve;
	}

	public boolean isDsbBtnSve() {
		return dsbBtnSve;
	}

	public void setDsbBtnSve(boolean dsbBtnSve) {
		this.dsbBtnSve = dsbBtnSve;
	}

	public boolean isVsbBtnUpd() {
		return vsbBtnUpd;
	}

	public void setVsbBtnUpd(boolean vsbBtnUpd) {
		this.vsbBtnUpd = vsbBtnUpd;
	}

	public boolean isDsbBtnUpd() {
		return dsbBtnUpd;
	}

	public void setDsbBtnUpd(boolean dsbBtnUpd) {
		this.dsbBtnUpd = dsbBtnUpd;
	}

	public boolean isVsbBtnRtr() {
		return vsbBtnRtr;
	}

	public void setVsbBtnRtr(boolean vsbBtnRtr) {
		this.vsbBtnRtr = vsbBtnRtr;
	}

	public boolean isDsbBtnRtr() {
		return dsbBtnRtr;
	}

	public void setDsbBtnRtr(boolean dsbBtnRtr) {
		this.dsbBtnRtr = dsbBtnRtr;
	}

	public boolean isDsbTblBtnEdt() {
		return dsbTblBtnEdt;
	}

	public void setDsbTblBtnEdt(boolean dsbTblBtnEdt) {
		this.dsbTblBtnEdt = dsbTblBtnEdt;
	}

	public boolean isVsbTblBtnEdt() {
		return vsbTblBtnEdt;
	}

	public void setVsbTblBtnEdt(boolean vsbTblBtnEdt) {
		this.vsbTblBtnEdt = vsbTblBtnEdt;
	}

	public boolean isDsbTblBtnDlt() {
		return dsbTblBtnDlt;
	}

	public void setDsbTblBtnDlt(boolean dsbTblBtnDlt) {
		this.dsbTblBtnDlt = dsbTblBtnDlt;
	}

	public boolean isVsbTblBtnDlt() {
		return vsbTblBtnDlt;
	}

	public void setVsbTblBtnDlt(boolean vsbTblBtnDlt) {
		this.vsbTblBtnDlt = vsbTblBtnDlt;
	}

	public ScrTblPrsRol getPrl() {
		return prl;
	}

	public void setPrl(ScrTblPrsRol prl) {
		this.prl = prl;
	}

	public boolean isDsbTpe() {
		return dsbTpe;
	}

	public void setDsbTpe(boolean dsbTpe) {
		this.dsbTpe = dsbTpe;
	}

	public boolean isVsbTpe() {
		return vsbTpe;
	}

	public void setVsbTpe(boolean vsbTpe) {
		this.vsbTpe = vsbTpe;
	}

	public boolean isRqrTpe() {
		return rqrTpe;
	}

	public void setRqrTpe(boolean rqrTpe) {
		this.rqrTpe = rqrTpe;
	}

	public int getITpeId() {
		return ITpeId;
	}

	public void setITpeId(int iTpeId) {
		ITpeId = iTpeId;
	}

	public boolean isDsbBtnRstPrfTch() {
		return dsbBtnRstPrfTch;
	}

	public void setDsbBtnRstPrfTch(boolean dsbBtnRstPrfTch) {
		this.dsbBtnRstPrfTch = dsbBtnRstPrfTch;
	}

	public boolean isVsbBtnRstPrfTch() {
		return vsbBtnRstPrfTch;
	}

	public void setVsbBtnRstPrfTch(boolean vsbBtnRstPrfTch) {
		this.vsbBtnRstPrfTch = vsbBtnRstPrfTch;
	}

	public boolean isDsbAdlNmbDd() {
		return dsbAdlNmbDd;
	}

	public void setDsbAdlNmbDd(boolean dsbAdlNmbDd) {
		this.dsbAdlNmbDd = dsbAdlNmbDd;
	}

	public boolean isVsbAdlNmbDd() {
		return vsbAdlNmbDd;
	}

	public void setVsbAdlNmbDd(boolean vsbAdlNmbDd) {
		this.vsbAdlNmbDd = vsbAdlNmbDd;
	}

	public boolean isRqrAdlNmbDd() {
		return rqrAdlNmbDd;
	}

	public void setRqrAdlNmbDd(boolean rqrAdlNmbDd) {
		this.rqrAdlNmbDd = rqrAdlNmbDd;
	}

	public boolean isDsbLrsCtn() {
		return dsbLrsCtn;
	}

	public void setDsbLrsCtn(boolean dsbLrsCtn) {
		this.dsbLrsCtn = dsbLrsCtn;
	}

	public boolean isVsbLrsCtn() {
		return vsbLrsCtn;
	}

	public void setVsbLrsCtn(boolean vsbLrsCtn) {
		this.vsbLrsCtn = vsbLrsCtn;
	}

	public boolean isRqrLrsCtn() {
		return rqrLrsCtn;
	}

	public void setRqrLrsCtn(boolean rqrLrsCtn) {
		this.rqrLrsCtn = rqrLrsCtn;
	}

	public boolean isDsbPrcDte() {
		return dsbPrcDte;
	}

	public void setDsbPrcDte(boolean dsbPrcDte) {
		this.dsbPrcDte = dsbPrcDte;
	}

	public boolean isVsbPrcDte() {
		return vsbPrcDte;
	}

	public void setVsbPrcDte(boolean vsbPrcDte) {
		this.vsbPrcDte = vsbPrcDte;
	}

	public boolean isRqrPrcDte() {
		return rqrPrcDte;
	}

	public void setRqrPrcDte(boolean rqrPrcDte) {
		this.rqrPrcDte = rqrPrcDte;
	}

	public boolean isDsbPrcDteCls() {
		return dsbPrcDteCls;
	}

	public void setDsbPrcDteCls(boolean dsbPrcDteCls) {
		this.dsbPrcDteCls = dsbPrcDteCls;
	}

	public boolean isVsbPrcDteCls() {
		return vsbPrcDteCls;
	}

	public void setVsbPrcDteCls(boolean vsbPrcDteCls) {
		this.vsbPrcDteCls = vsbPrcDteCls;
	}

	public boolean isRqrPrcDteCls() {
		return rqrPrcDteCls;
	}

	public void setRqrPrcDteCls(boolean rqrPrcDteCls) {
		this.rqrPrcDteCls = rqrPrcDteCls;
	}

	public boolean isDsbPrcSts() {
		return dsbPrcSts;
	}

	public void setDsbPrcSts(boolean dsbPrcSts) {
		this.dsbPrcSts = dsbPrcSts;
	}

	public boolean isVsbPrcSts() {
		return vsbPrcSts;
	}

	public void setVsbPrcSts(boolean vsbPrcSts) {
		this.vsbPrcSts = vsbPrcSts;
	}

	public boolean isRqrPrcSts() {
		return rqrPrcSts;
	}

	public void setRqrPrcSts(boolean rqrPrcSts) {
		this.rqrPrcSts = rqrPrcSts;
	}

	public boolean isDsbPrcCmm() {
		return dsbPrcCmm;
	}

	public void setDsbPrcCmm(boolean dsbPrcCmm) {
		this.dsbPrcCmm = dsbPrcCmm;
	}

	public boolean isVsbPrcCmm() {
		return vsbPrcCmm;
	}

	public void setVsbPrcCmm(boolean vsbPrcCmm) {
		this.vsbPrcCmm = vsbPrcCmm;
	}

	public boolean isRqrPrcCmm() {
		return rqrPrcCmm;
	}

	public void setRqrPrcCmm(boolean rqrPrcCmm) {
		this.rqrPrcCmm = rqrPrcCmm;
	}

	public boolean isDsbGnrDtlLrvPrc() {
		return dsbGnrDtlLrvPrc;
	}

	public void setDsbGnrDtlLrvPrc(boolean dsbGnrDtlLrvPrc) {
		this.dsbGnrDtlLrvPrc = dsbGnrDtlLrvPrc;
	}

	public boolean isVsbGnrDtlLrvPrc() {
		return vsbGnrDtlLrvPrc;
	}

	public void setVsbGnrDtlLrvPrc(boolean vsbGnrDtlLrvPrc) {
		this.vsbGnrDtlLrvPrc = vsbGnrDtlLrvPrc;
	}

	public boolean isRqrGnrDtlLrvPrc() {
		return rqrGnrDtlLrvPrc;
	}

	public void setRqrGnrDtlLrvPrc(boolean rqrGnrDtlLrvPrc) {
		this.rqrGnrDtlLrvPrc = rqrGnrDtlLrvPrc;
	}

	public boolean isDsbGnrDtlLrvPrcDte() {
		return dsbGnrDtlLrvPrcDte;
	}

	public void setDsbGnrDtlLrvPrcDte(boolean dsbGnrDtlLrvPrcDte) {
		this.dsbGnrDtlLrvPrcDte = dsbGnrDtlLrvPrcDte;
	}

	public boolean isVsbGnrDtlLrvPrcDte() {
		return vsbGnrDtlLrvPrcDte;
	}

	public void setVsbGnrDtlLrvPrcDte(boolean vsbGnrDtlLrvPrcDte) {
		this.vsbGnrDtlLrvPrcDte = vsbGnrDtlLrvPrcDte;
	}

	public boolean isRqrGnrDtlLrvPrcDte() {
		return rqrGnrDtlLrvPrcDte;
	}

	public void setRqrGnrDtlLrvPrcDte(boolean rqrGnrDtlLrvPrcDte) {
		this.rqrGnrDtlLrvPrcDte = rqrGnrDtlLrvPrcDte;
	}

	public boolean isDsbEgsNmbCpl() {
		return dsbEgsNmbCpl;
	}

	public void setDsbEgsNmbCpl(boolean dsbEgsNmbCpl) {
		this.dsbEgsNmbCpl = dsbEgsNmbCpl;
	}

	public boolean isVsbEgsNmbCpl() {
		return vsbEgsNmbCpl;
	}

	public void setVsbEgsNmbCpl(boolean vsbEgsNmbCpl) {
		this.vsbEgsNmbCpl = vsbEgsNmbCpl;
	}

	public boolean isRqrEgsNmbCpl() {
		return rqrEgsNmbCpl;
	}

	public void setRqrEgsNmbCpl(boolean rqrEgsNmbCpl) {
		this.rqrEgsNmbCpl = rqrEgsNmbCpl;
	}

	public boolean isDsbEgsNmbBrk() {
		return dsbEgsNmbBrk;
	}

	public void setDsbEgsNmbBrk(boolean dsbEgsNmbBrk) {
		this.dsbEgsNmbBrk = dsbEgsNmbBrk;
	}

	public boolean isVsbEgsNmbBrk() {
		return vsbEgsNmbBrk;
	}

	public void setVsbEgsNmbBrk(boolean vsbEgsNmbBrk) {
		this.vsbEgsNmbBrk = vsbEgsNmbBrk;
	}

	public boolean isRqrEgsNmbBrk() {
		return rqrEgsNmbBrk;
	}

	public void setRqrEgsNmbBrk(boolean rqrEgsNmbBrk) {
		this.rqrEgsNmbBrk = rqrEgsNmbBrk;
	}

	public boolean isDsbEgsNmbVbl() {
		return dsbEgsNmbVbl;
	}

	public void setDsbEgsNmbVbl(boolean dsbEgsNmbVbl) {
		this.dsbEgsNmbVbl = dsbEgsNmbVbl;
	}

	public boolean isVsbEgsNmbVbl() {
		return vsbEgsNmbVbl;
	}

	public void setVsbEgsNmbVbl(boolean vsbEgsNmbVbl) {
		this.vsbEgsNmbVbl = vsbEgsNmbVbl;
	}

	public boolean isRqrEgsNmbVbl() {
		return rqrEgsNmbVbl;
	}

	public void setRqrEgsNmbVbl(boolean rqrEgsNmbVbl) {
		this.rqrEgsNmbVbl = rqrEgsNmbVbl;
	}

	public boolean isDsbEgsNmbVblNo() {
		return dsbEgsNmbVblNo;
	}

	public void setDsbEgsNmbVblNo(boolean dsbEgsNmbVblNo) {
		this.dsbEgsNmbVblNo = dsbEgsNmbVblNo;
	}

	public boolean isVsbEgsNmbVblNo() {
		return vsbEgsNmbVblNo;
	}

	public void setVsbEgsNmbVblNo(boolean vsbEgsNmbVblNo) {
		this.vsbEgsNmbVblNo = vsbEgsNmbVblNo;
	}

	public boolean isRqrEgsNmbVblNo() {
		return rqrEgsNmbVblNo;
	}

	public void setRqrEgsNmbVblNo(boolean rqrEgsNmbVblNo) {
		this.rqrEgsNmbVblNo = rqrEgsNmbVblNo;
	}

	public boolean isDsbEgsCmm() {
		return dsbEgsCmm;
	}

	public void setDsbEgsCmm(boolean dsbEgsCmm) {
		this.dsbEgsCmm = dsbEgsCmm;
	}

	public boolean isVsbEgsCmm() {
		return vsbEgsCmm;
	}

	public void setVsbEgsCmm(boolean vsbEgsCmm) {
		this.vsbEgsCmm = vsbEgsCmm;
	}

	public boolean isRqrEgsCmm() {
		return rqrEgsCmm;
	}

	public void setRqrEgsCmm(boolean rqrEgsCmm) {
		this.rqrEgsCmm = rqrEgsCmm;
	}

	public boolean isDsbLrvCmm() {
		return dsbLrvCmm;
	}

	public void setDsbLrvCmm(boolean dsbLrvCmm) {
		this.dsbLrvCmm = dsbLrvCmm;
	}

	public boolean isVsbLrvCmm() {
		return vsbLrvCmm;
	}

	public void setVsbLrvCmm(boolean vsbLrvCmm) {
		this.vsbLrvCmm = vsbLrvCmm;
	}

	public boolean isRqrLrvCmm() {
		return rqrLrvCmm;
	}

	public void setRqrLrvCmm(boolean rqrLrvCmm) {
		this.rqrLrvCmm = rqrLrvCmm;
	}

	public boolean isDsbAdlCmm() {
		return dsbAdlCmm;
	}

	public void setDsbAdlCmm(boolean dsbAdlCmm) {
		this.dsbAdlCmm = dsbAdlCmm;
	}

	public boolean isVsbAdlCmm() {
		return vsbAdlCmm;
	}

	public void setVsbAdlCmm(boolean vsbAdlCmm) {
		this.vsbAdlCmm = vsbAdlCmm;
	}

	public boolean isRqrAdlCmm() {
		return rqrAdlCmm;
	}

	public void setRqrAdlCmm(boolean rqrAdlCmm) {
		this.rqrAdlCmm = rqrAdlCmm;
	}

	public boolean isDsbLrvNmbLive() {
		return dsbLrvNmbLive;
	}

	public void setDsbLrvNmbLive(boolean dsbLrvNmbLive) {
		this.dsbLrvNmbLive = dsbLrvNmbLive;
	}

	public boolean isVsbLrvNmbLive() {
		return vsbLrvNmbLive;
	}

	public void setVsbLrvNmbLive(boolean vsbLrvNmbLive) {
		this.vsbLrvNmbLive = vsbLrvNmbLive;
	}

	public boolean isRqrLrvNmbLive() {
		return rqrLrvNmbLive;
	}

	public void setRqrLrvNmbLive(boolean rqrLrvNmbLive) {
		this.rqrLrvNmbLive = rqrLrvNmbLive;
	}

	public boolean isDsbLrvNmbDied() {
		return dsbLrvNmbDied;
	}

	public void setDsbLrvNmbDied(boolean dsbLrvNmbDied) {
		this.dsbLrvNmbDied = dsbLrvNmbDied;
	}

	public boolean isVsbLrvNmbDied() {
		return vsbLrvNmbDied;
	}

	public void setVsbLrvNmbDied(boolean vsbLrvNmbDied) {
		this.vsbLrvNmbDied = vsbLrvNmbDied;
	}

	public boolean isRqrLrvNmbDied() {
		return rqrLrvNmbDied;
	}

	public void setRqrLrvNmbDied(boolean rqrLrvNmbDied) {
		this.rqrLrvNmbDied = rqrLrvNmbDied;
	}

	public boolean isDsbLrvBtnAdd() {
		return dsbLrvBtnAdd;
	}

	public void setDsbLrvBtnAdd(boolean dsbLrvBtnAdd) {
		this.dsbLrvBtnAdd = dsbLrvBtnAdd;
	}

	public boolean isVsbLrvBtnAdd() {
		return vsbLrvBtnAdd;
	}

	public void setVsbLrvBtnAdd(boolean vsbLrvBtnAdd) {
		this.vsbLrvBtnAdd = vsbLrvBtnAdd;
	}

	public boolean isDsbLrvBtnNew() {
		return dsbLrvBtnNew;
	}

	public void setDsbLrvBtnNew(boolean dsbLrvBtnNew) {
		this.dsbLrvBtnNew = dsbLrvBtnNew;
	}

	public boolean isVsbLrvBtnNew() {
		return vsbLrvBtnNew;
	}

	public void setVsbLrvBtnNew(boolean vsbLrvBtnNew) {
		this.vsbLrvBtnNew = vsbLrvBtnNew;
	}

	public boolean isDsbLrvBtnRst() {
		return dsbLrvBtnRst;
	}

	public void setDsbLrvBtnRst(boolean dsbLrvBtnRst) {
		this.dsbLrvBtnRst = dsbLrvBtnRst;
	}

	public boolean isVsbLrvBtnRst() {
		return vsbLrvBtnRst;
	}

	public void setVsbLrvBtnRst(boolean vsbLrvBtnRst) {
		this.vsbLrvBtnRst = vsbLrvBtnRst;
	}

	public boolean isDsbAdlPrc() {
		return dsbAdlPrc;
	}

	public void setDsbAdlPrc(boolean dsbAdlPrc) {
		this.dsbAdlPrc = dsbAdlPrc;
	}

	public boolean isVsbAdlPrc() {
		return vsbAdlPrc;
	}

	public void setVsbAdlPrc(boolean vsbAdlPrc) {
		this.vsbAdlPrc = vsbAdlPrc;
	}

	public boolean isRqrAdlPrc() {
		return rqrAdlPrc;
	}

	public void setRqrAdlPrc(boolean rqrAdlPrc) {
		this.rqrAdlPrc = rqrAdlPrc;
	}

	public boolean isDsbAdlPrcDte() {
		return dsbAdlPrcDte;
	}

	public void setDsbAdlPrcDte(boolean dsbAdlPrcDte) {
		this.dsbAdlPrcDte = dsbAdlPrcDte;
	}

	public boolean isVsbAdlPrcDte() {
		return vsbAdlPrcDte;
	}

	public void setVsbAdlPrcDte(boolean vsbAdlPrcDte) {
		this.vsbAdlPrcDte = vsbAdlPrcDte;
	}

	public boolean isRqrAdlPrcDte() {
		return rqrAdlPrcDte;
	}

	public void setRqrAdlPrcDte(boolean rqrAdlPrcDte) {
		this.rqrAdlPrcDte = rqrAdlPrcDte;
	}

	public boolean isDsbBtnRstPrfAgn() {
		return dsbBtnRstPrfAgn;
	}

	public void setDsbBtnRstPrfAgn(boolean dsbBtnRstPrfAgn) {
		this.dsbBtnRstPrfAgn = dsbBtnRstPrfAgn;
	}

	public boolean isVsbBtnRstPrfAgn() {
		return vsbBtnRstPrfAgn;
	}

	public void setVsbBtnRstPrfAgn(boolean vsbBtnRstPrfAgn) {
		this.vsbBtnRstPrfAgn = vsbBtnRstPrfAgn;
	}

	public boolean isDsbBtnSrc() {
		return dsbBtnSrc;
	}

	public void setDsbBtnSrc(boolean dsbBtnSrc) {
		this.dsbBtnSrc = dsbBtnSrc;
	}

	public boolean isVsbBtnSrc() {
		return vsbBtnSrc;
	}

	public void setVsbBtnSrc(boolean vsbBtnSrc) {
		this.vsbBtnSrc = vsbBtnSrc;
	}

	public boolean isDsbSrcSte() {
		return dsbSrcSte;
	}

	public void setDsbSrcSte(boolean dsbSrcSte) {
		this.dsbSrcSte = dsbSrcSte;
	}

	public boolean isVsbSrcSte() {
		return vsbSrcSte;
	}

	public void setVsbSrcSte(boolean vsbSrcSte) {
		this.vsbSrcSte = vsbSrcSte;
	}

	public boolean isRqrSrcSte() {
		return rqrSrcSte;
	}

	public void setRqrSrcSte(boolean rqrSrcSte) {
		this.rqrSrcSte = rqrSrcSte;
	}

	public int getISrcSteId() {
		return ISrcSteId;
	}

	public void setISrcSteId(int iSrcSteId) {
		ISrcSteId = iSrcSteId;
	}

	public boolean isDsbSrcPrc() {
		return dsbSrcPrc;
	}

	public void setDsbSrcPrc(boolean dsbSrcPrc) {
		this.dsbSrcPrc = dsbSrcPrc;
	}

	public boolean isVsbSrcPrc() {
		return vsbSrcPrc;
	}

	public void setVsbSrcPrc(boolean vsbSrcPrc) {
		this.vsbSrcPrc = vsbSrcPrc;
	}

	public boolean isRqrSrcPrc() {
		return rqrSrcPrc;
	}

	public void setRqrSrcPrc(boolean rqrSrcPrc) {
		this.rqrSrcPrc = rqrSrcPrc;
	}

	public int getISrcPrcId() {
		return ISrcPrcId;
	}

	public void setISrcPrcId(int iSrcPrcId) {
		ISrcPrcId = iSrcPrcId;
	}

	public boolean isDsbSrcPrm() {
		return dsbSrcPrm;
	}

	public void setDsbSrcPrm(boolean dsbSrcPrm) {
		this.dsbSrcPrm = dsbSrcPrm;
	}

	public boolean isVsbSrcPrm() {
		return vsbSrcPrm;
	}

	public void setVsbSrcPrm(boolean vsbSrcPrm) {
		this.vsbSrcPrm = vsbSrcPrm;
	}

	public boolean isRqrSrcPrm() {
		return rqrSrcPrm;
	}

	public void setRqrSrcPrm(boolean rqrSrcPrm) {
		this.rqrSrcPrm = rqrSrcPrm;
	}

	public int getISrcPrmId() {
		return ISrcPrmId;
	}

	public void setISrcPrmId(int iSrcPrmId) {
		ISrcPrmId = iSrcPrmId;
	}

	public Date getDSrcDteStr() {
		return DSrcDteStr;
	}

	public void setDSrcDteStr(Date dSrcDteStr) {
		DSrcDteStr = dSrcDteStr;
	}

	public Date getDSrcDteEnd() {
		return DSrcDteEnd;
	}

	public void setDSrcDteEnd(Date dSrcDteEnd) {
		DSrcDteEnd = dSrcDteEnd;
	}

	public boolean isDsbSrcDteStr() {
		return dsbSrcDteStr;
	}

	public void setDsbSrcDteStr(boolean dsbSrcDteStr) {
		this.dsbSrcDteStr = dsbSrcDteStr;
	}

	public boolean isVsbSrcDteStr() {
		return vsbSrcDteStr;
	}

	public void setVsbSrcDteStr(boolean vsbSrcDteStr) {
		this.vsbSrcDteStr = vsbSrcDteStr;
	}

	public boolean isRqrSrcDteStr() {
		return rqrSrcDteStr;
	}

	public void setRqrSrcDteStr(boolean rqrSrcDteStr) {
		this.rqrSrcDteStr = rqrSrcDteStr;
	}

	public boolean isDsbSrcDteEnd() {
		return dsbSrcDteEnd;
	}

	public void setDsbSrcDteEnd(boolean dsbSrcDteEnd) {
		this.dsbSrcDteEnd = dsbSrcDteEnd;
	}

	public boolean isVsbSrcDteEnd() {
		return vsbSrcDteEnd;
	}

	public void setVsbSrcDteEnd(boolean vsbSrcDteEnd) {
		this.vsbSrcDteEnd = vsbSrcDteEnd;
	}

	public boolean isRqrSrcDteEnd() {
		return rqrSrcDteEnd;
	}

	public void setRqrSrcDteEnd(boolean rqrSrcDteEnd) {
		this.rqrSrcDteEnd = rqrSrcDteEnd;
	}

	public boolean isDsbBtnSrcPrm() {
		return dsbBtnSrcPrm;
	}

	public void setDsbBtnSrcPrm(boolean dsbBtnSrcPrm) {
		this.dsbBtnSrcPrm = dsbBtnSrcPrm;
	}

	public boolean isVsbBtnSrcPrm() {
		return vsbBtnSrcPrm;
	}

	public void setVsbBtnSrcPrm(boolean vsbBtnSrcPrm) {
		this.vsbBtnSrcPrm = vsbBtnSrcPrm;
	}

	public boolean isDsbBtnDwn() {
		return dsbBtnDwn;
	}

	public void setDsbBtnDwn(boolean dsbBtnDwn) {
		this.dsbBtnDwn = dsbBtnDwn;
	}

	public boolean isVsbBtnDwn() {
		return vsbBtnDwn;
	}

	public void setVsbBtnDwn(boolean vsbBtnDwn) {
		this.vsbBtnDwn = vsbBtnDwn;
	}

}
