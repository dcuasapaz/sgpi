package ec.gob.inspi.gidi.sit.ctl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.gob.inspi.gidi.sit.cmm.Code;
import ec.gob.inspi.gidi.sit.cmm.Default;
import ec.gob.inspi.gidi.sit.cmm.Print;
import ec.gob.inspi.gidi.sit.enm.Process;
import ec.gob.inspi.gidi.sit.ent.ScrTblPrsRol;
import ec.gob.inspi.gidi.sit.ent.SitTblGnr;
import ec.gob.inspi.gidi.sit.ent.SitTblSte;
import ec.gob.inspi.gidi.sit.itf.TplItfFrm;
import ec.gob.inspi.gidi.sit.srv.SitSrvGnr;
import ec.gob.inspi.gidi.sit.srv.SitSrvSte;

/*********************************************************************************
 * @Class: Parental
 * @Type: Controlador
 * @Acronim: Prt
 * @Function: Adults for parental
 * @author DC
 * @version 1.0
 * @since 2022-03-24
 *********************************************************************************/
@ManagedBean
@ViewScoped
public class SitCtlPrt implements TplItfFrm {

	private ScrTblPrsRol prl;
	protected ScrCtlSss sss;
	private SitTblGnr gnr;
	private List<SitTblGnr> lstGnr;
	@EJB
	protected SitSrvGnr SGnr;
	@EJB
	protected SitSrvSte SSte;

	public SitCtlPrt() {
		prl = new ScrTblPrsRol();
		sss = new ScrCtlSss();
		gnr = new SitTblGnr();
		ISrcSteId = Default.I_DFL_VLE();
		ISrcPrcId = Default.I_DFL_VLE();
		ISrcPrmId = Default.I_DFL_VLE();
		DSrcDteStr = new Date();
		DSrcDteEnd = new Date();
	}

	@Override
	@PostConstruct
	public void init() {
		this.cptInit();
		this.loadPrl();
		Print.LOG_INFO_CONTROLLER(this.getClass().getSimpleName(), Process.LOAD, "PRL: " + prl.getDtaTblPr().getSPrsEml());
	}

	@Override
	public void cptInit() {

		this.actBtnHme(false, true);
		this.actBtnAdd(false, true);
		this.actBtnSve(true, true);
		this.actBtnUpd(true, true);
		this.actBtnSrc(false, true);
		this.actBtnRtr(false, true);
		this.actTblBtnEdt(true, true);
		this.actTblBtnDlt(false, true);

		try {
			this.actSrcSte(false, true, true); // Location
			this.actSrcPrc(false, true, true); // Process
			this.actSrcPrm(false, true, true); // Parameter
			this.actSrcDteSrt(false, true, true); // Date start
			this.actSrcDteEnd(false, true, true); // Date end
			this.actBtnSrcPrm(false, true); // Button search
			this.actFrm(true, true);
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.LOAD, e.getMessage());
		}

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cptAdd() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sve() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cptSve() {
		// TODO Auto-generated method stub

	}

	@Override
	public void upd() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cptUpd() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cptShw() {
		// TODO Auto-generated method stub

	}

	public void src() {

	}

	@Override
	public void edt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cptEdt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dlt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cptDlt() {
		// TODO Auto-generated method stub

	}

	public void loadPrl() {
		try {
			prl = sss.getPrl();
		} catch (Exception e) {
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.LOAD, e.getMessage());
		}
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
	 * @since 2022-03-24
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

	private void newGnr() {
		lstGnr = new ArrayList<SitTblGnr>();
	}

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
		} catch (Exception e) {
			e.printStackTrace();
			Print.LOG_SEVERE_CONTROLLER(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
		}
	}

	// BOTONES DE PANELES DE FORMULARIO
	private boolean vsbPgrTbl;
	private boolean vsbPgrDta;

	// BOTONES DEL FORMULARIO
	private boolean vsbBtnHme;
	private boolean dsbBtnHme;

	private boolean vsbBtnAdd;
	private boolean dsbBtnAdd;

	private boolean vsbBtnSve;
	private boolean dsbBtnSve;

	private boolean vsbBtnUpd;
	private boolean dsbBtnUpd;

	private boolean vsbBtnSrc;
	private boolean dsbBtnSrc;

	private boolean vsbBtnRtr;
	private boolean dsbBtnRtr;

	// BOTONES DE TABLA
	private boolean dsbTblBtnEdt;
	private boolean vsbTblBtnEdt;

	private boolean dsbTblBtnDlt;
	private boolean vsbTblBtnDlt;

	@Override
	public void actFrm(boolean vsbTbl, boolean vsbDta) {
		vsbPgrDta = vsbDta;
		vsbPgrTbl = vsbTbl;
	}

	@Override
	public void actBtnHme(boolean dsb, boolean vsb) {
		vsbBtnHme = vsb;
		dsbBtnHme = dsb;

	}

	@Override
	public void actBtnAdd(boolean dsb, boolean vsb) {
		vsbBtnAdd = vsb;
		dsbBtnAdd = dsb;
	}

	@Override
	public void actBtnSve(boolean dsb, boolean vsb) {
		vsbBtnSve = vsb;
		dsbBtnSve = dsb;

	}

	@Override
	public void actBtnUpd(boolean dsb, boolean vsb) {
		vsbBtnUpd = vsb;
		dsbBtnUpd = dsb;

	}

	public void actBtnSrc(boolean dsb, boolean vsb) {
		vsbBtnSrc = vsb;
		dsbBtnSrc = dsb;
	}

	@Override
	public void actBtnRtr(boolean dsb, boolean vsb) {
		vsbBtnRtr = vsb;
		dsbBtnRtr = dsb;

	}

	@Override
	public void actTblBtnShw(boolean dsb, boolean vsb) {

	}

	@Override
	public void actTblBtnEdt(boolean dsb, boolean vsb) {
		dsbTblBtnEdt = dsb;
		vsbTblBtnEdt = vsb;

	}

	@Override
	public void actTblBtnDlt(boolean dsb, boolean vsb) {
		dsbTblBtnDlt = dsb;
		vsbTblBtnDlt = vsb;

	}

	public boolean isVsbPgrTbl() {
		return vsbPgrTbl;
	}

	public boolean isVsbPgrDta() {
		return vsbPgrDta;
	}

	public boolean isVsbBtnHme() {
		return vsbBtnHme;
	}

	public boolean isDsbBtnHme() {
		return dsbBtnHme;
	}

	public boolean isVsbBtnAdd() {
		return vsbBtnAdd;
	}

	public boolean isDsbBtnAdd() {
		return dsbBtnAdd;
	}

	public boolean isVsbBtnSve() {
		return vsbBtnSve;
	}

	public boolean isDsbBtnSve() {
		return dsbBtnSve;
	}

	public boolean isVsbBtnUpd() {
		return vsbBtnUpd;
	}

	public boolean isDsbBtnUpd() {
		return dsbBtnUpd;
	}

	public boolean isVsbBtnSrc() {
		return vsbBtnSrc;
	}

	public boolean isDsbBtnSrc() {
		return dsbBtnSrc;
	}

	public boolean isVsbBtnRtr() {
		return vsbBtnRtr;
	}

	public boolean isDsbBtnRtr() {
		return dsbBtnRtr;
	}

	public boolean isDsbTblBtnEdt() {
		return dsbTblBtnEdt;
	}

	public boolean isVsbTblBtnEdt() {
		return vsbTblBtnEdt;
	}

	public boolean isDsbTblBtnDlt() {
		return dsbTblBtnDlt;
	}

	public boolean isVsbTblBtnDlt() {
		return vsbTblBtnDlt;
	}

	public void setVsbPgrTbl(boolean vsbPgrTbl) {
		this.vsbPgrTbl = vsbPgrTbl;
	}

	public void setVsbPgrDta(boolean vsbPgrDta) {
		this.vsbPgrDta = vsbPgrDta;
	}

	public void setVsbBtnHme(boolean vsbBtnHme) {
		this.vsbBtnHme = vsbBtnHme;
	}

	public void setDsbBtnHme(boolean dsbBtnHme) {
		this.dsbBtnHme = dsbBtnHme;
	}

	public void setVsbBtnAdd(boolean vsbBtnAdd) {
		this.vsbBtnAdd = vsbBtnAdd;
	}

	public void setDsbBtnAdd(boolean dsbBtnAdd) {
		this.dsbBtnAdd = dsbBtnAdd;
	}

	public void setVsbBtnSve(boolean vsbBtnSve) {
		this.vsbBtnSve = vsbBtnSve;
	}

	public void setDsbBtnSve(boolean dsbBtnSve) {
		this.dsbBtnSve = dsbBtnSve;
	}

	public void setVsbBtnUpd(boolean vsbBtnUpd) {
		this.vsbBtnUpd = vsbBtnUpd;
	}

	public void setDsbBtnUpd(boolean dsbBtnUpd) {
		this.dsbBtnUpd = dsbBtnUpd;
	}

	public void setVsbBtnSrc(boolean vsbBtnSrc) {
		this.vsbBtnSrc = vsbBtnSrc;
	}

	public void setDsbBtnSrc(boolean dsbBtnSrc) {
		this.dsbBtnSrc = dsbBtnSrc;
	}

	public void setVsbBtnRtr(boolean vsbBtnRtr) {
		this.vsbBtnRtr = vsbBtnRtr;
	}

	public void setDsbBtnRtr(boolean dsbBtnRtr) {
		this.dsbBtnRtr = dsbBtnRtr;
	}

	public void setDsbTblBtnEdt(boolean dsbTblBtnEdt) {
		this.dsbTblBtnEdt = dsbTblBtnEdt;
	}

	public void setVsbTblBtnEdt(boolean vsbTblBtnEdt) {
		this.vsbTblBtnEdt = vsbTblBtnEdt;
	}

	public void setDsbTblBtnDlt(boolean dsbTblBtnDlt) {
		this.dsbTblBtnDlt = dsbTblBtnDlt;
	}

	public void setVsbTblBtnDlt(boolean vsbTblBtnDlt) {
		this.vsbTblBtnDlt = vsbTblBtnDlt;
	}

	public SitTblGnr getGnr() {
		return gnr;
	}

	public List<SitTblGnr> getLstGnr() {
		return lstGnr;
	}

	public boolean isDsbSrcSte() {
		return dsbSrcSte;
	}

	public boolean isVsbSrcSte() {
		return vsbSrcSte;
	}

	public boolean isRqrSrcSte() {
		return rqrSrcSte;
	}

	public int getISrcSteId() {
		return ISrcSteId;
	}

	public boolean isDsbSrcPrc() {
		return dsbSrcPrc;
	}

	public boolean isVsbSrcPrc() {
		return vsbSrcPrc;
	}

	public boolean isRqrSrcPrc() {
		return rqrSrcPrc;
	}

	public int getISrcPrcId() {
		return ISrcPrcId;
	}

	public boolean isDsbSrcPrm() {
		return dsbSrcPrm;
	}

	public boolean isVsbSrcPrm() {
		return vsbSrcPrm;
	}

	public boolean isRqrSrcPrm() {
		return rqrSrcPrm;
	}

	public int getISrcPrmId() {
		return ISrcPrmId;
	}

	public Date getDSrcDteStr() {
		return DSrcDteStr;
	}

	public Date getDSrcDteEnd() {
		return DSrcDteEnd;
	}

	public boolean isDsbSrcDteStr() {
		return dsbSrcDteStr;
	}

	public boolean isVsbSrcDteStr() {
		return vsbSrcDteStr;
	}

	public boolean isRqrSrcDteStr() {
		return rqrSrcDteStr;
	}

	public boolean isDsbSrcDteEnd() {
		return dsbSrcDteEnd;
	}

	public boolean isVsbSrcDteEnd() {
		return vsbSrcDteEnd;
	}

	public boolean isRqrSrcDteEnd() {
		return rqrSrcDteEnd;
	}

	public boolean isDsbBtnSrcPrm() {
		return dsbBtnSrcPrm;
	}

	public boolean isVsbBtnSrcPrm() {
		return vsbBtnSrcPrm;
	}

	public void setGnr(SitTblGnr gnr) {
		this.gnr = gnr;
	}

	public void setLstGnr(List<SitTblGnr> lstGnr) {
		this.lstGnr = lstGnr;
	}

	public void setDsbSrcSte(boolean dsbSrcSte) {
		this.dsbSrcSte = dsbSrcSte;
	}

	public void setVsbSrcSte(boolean vsbSrcSte) {
		this.vsbSrcSte = vsbSrcSte;
	}

	public void setRqrSrcSte(boolean rqrSrcSte) {
		this.rqrSrcSte = rqrSrcSte;
	}

	public void setISrcSteId(int iSrcSteId) {
		ISrcSteId = iSrcSteId;
	}

	public void setDsbSrcPrc(boolean dsbSrcPrc) {
		this.dsbSrcPrc = dsbSrcPrc;
	}

	public void setVsbSrcPrc(boolean vsbSrcPrc) {
		this.vsbSrcPrc = vsbSrcPrc;
	}

	public void setRqrSrcPrc(boolean rqrSrcPrc) {
		this.rqrSrcPrc = rqrSrcPrc;
	}

	public void setISrcPrcId(int iSrcPrcId) {
		ISrcPrcId = iSrcPrcId;
	}

	public void setDsbSrcPrm(boolean dsbSrcPrm) {
		this.dsbSrcPrm = dsbSrcPrm;
	}

	public void setVsbSrcPrm(boolean vsbSrcPrm) {
		this.vsbSrcPrm = vsbSrcPrm;
	}

	public void setRqrSrcPrm(boolean rqrSrcPrm) {
		this.rqrSrcPrm = rqrSrcPrm;
	}

	public void setISrcPrmId(int iSrcPrmId) {
		ISrcPrmId = iSrcPrmId;
	}

	public void setDSrcDteStr(Date dSrcDteStr) {
		DSrcDteStr = dSrcDteStr;
	}

	public void setDSrcDteEnd(Date dSrcDteEnd) {
		DSrcDteEnd = dSrcDteEnd;
	}

	public void setDsbSrcDteStr(boolean dsbSrcDteStr) {
		this.dsbSrcDteStr = dsbSrcDteStr;
	}

	public void setVsbSrcDteStr(boolean vsbSrcDteStr) {
		this.vsbSrcDteStr = vsbSrcDteStr;
	}

	public void setRqrSrcDteStr(boolean rqrSrcDteStr) {
		this.rqrSrcDteStr = rqrSrcDteStr;
	}

	public void setDsbSrcDteEnd(boolean dsbSrcDteEnd) {
		this.dsbSrcDteEnd = dsbSrcDteEnd;
	}

	public void setVsbSrcDteEnd(boolean vsbSrcDteEnd) {
		this.vsbSrcDteEnd = vsbSrcDteEnd;
	}

	public void setRqrSrcDteEnd(boolean rqrSrcDteEnd) {
		this.rqrSrcDteEnd = rqrSrcDteEnd;
	}

	public void setDsbBtnSrcPrm(boolean dsbBtnSrcPrm) {
		this.dsbBtnSrcPrm = dsbBtnSrcPrm;
	}

	public void setVsbBtnSrcPrm(boolean vsbBtnSrcPrm) {
		this.vsbBtnSrcPrm = vsbBtnSrcPrm;
	}

}
