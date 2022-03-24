package ec.gob.inspi.gidi.sit.srv;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.Query;

import ec.gob.inspi.gidi.sit.cmm.Code;
import ec.gob.inspi.gidi.sit.cmm.Default;
import ec.gob.inspi.gidi.sit.cmm.Print;
import ec.gob.inspi.gidi.sit.cmm.SrvDb;
import ec.gob.inspi.gidi.sit.enm.Package;
import ec.gob.inspi.gidi.sit.enm.Process;
import ec.gob.inspi.gidi.sit.ent.ScrTblPrsRol;
import ec.gob.inspi.gidi.sit.ent.SitTblGnr;
import ec.gob.inspi.gidi.sit.ent.SitTblNmb;
import ec.gob.inspi.gidi.sit.ent.SitTblSte;

@Stateless
public class SitSrvGnr extends SrvDb<SitTblGnr> {

	private static Logger LOG;

	public SitSrvGnr() {
		super(SitTblGnr.class, SitSrvGnr.class);
		LOG = Logger.getLogger(this.getClass().getName());
	}

	public boolean sve(SitTblGnr gnr, SitTblNmb nmb, int IDteSetYr, int IDteSetMth, int IDteSetDay, int IDteClcYr,
			int IDteClcMth, int IDteClcDay, boolean BGnrTrpRcv, boolean BGnrTrpSup, boolean BGnrEgs, boolean BGnrLrs,
			boolean BGnrAdl, int ITpeId) {
		try {
			gnr.setSitTblNmb(nmb);
			gnr.setBGnrTrpRcv(BGnrTrpRcv);
			gnr.setBGnrTrpSup(BGnrTrpSup);
			gnr.setBGnrEgs(BGnrEgs);
			gnr.setBGnrLrs(BGnrLrs);
			gnr.setBGnrAdl(BGnrAdl);
			gnr.setITpeId(ITpeId);
			gnr.setBGnrStt(true);
			this.insert(gnr);
			return true;
		} catch (Exception e) {
			LOG.log(Level.SEVERE, Package.SERVICE + Print.S_OBJ_SEPARATE + e.getMessage());
			return false;
		}
	}

	public boolean vldRgs(Date DPrc, int IPrcId, SitTblSte ste, int ITrpId, SitTblNmb nmb, Date DSet, Date DClc,
			boolean BRcv, boolean BSup) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param AND gnr.BGnrStt = true ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			// q.setParameter("prm1", IPrjId);
			return true;
		} catch (Exception e) {
			LOG.log(Level.SEVERE, Package.SERVICE + Print.S_OBJ_SEPARATE + e.getMessage());
			return false;
		}
	}

	public boolean sve(ScrTblPrsRol prsPrf, SitTblGnr gnr, SitTblNmb nmb, int ITrpId) {
		try {
			gnr.setDGnrDteRgs(Default.D_CURRENT_DATE());
			gnr.setSGnrTmeRgs(Default.S_CURRENT_TIME());
			gnr.setScrTblPrsRol(prsPrf);
			gnr.setSitTblNmb(nmb);
			gnr.setITrpId(ITrpId);
			gnr.setBGnrStt(true);
			this.insert(gnr);
			return true;
		} catch (Exception e) {
			LOG.log(Level.SEVERE, Package.SERVICE + Print.S_OBJ_SEPARATE + e.getMessage());
			return false;
		}
	}

	public List<SitTblGnr> lstPrsRol(int IPrjId) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param AND gnr.BGnrStt = true ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param", IPrjId);
			return q.getResultList();
		} catch (Exception e) {
			LOG.log(Level.SEVERE, Package.SERVICE + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	public boolean dltLgc(SitTblGnr gnr) {
		try {
			gnr.setBGnrStt(false);
			this.update(gnr);
			return true;
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.DELETE, e.getMessage());
			return false;
		}
	}

	/**
	 * <h1>METHOD --> lstGnrPrm. Site all !</h1> Search for parameter <br/>
	 * 
	 * @author DC
	 * @param Process,
	 *            Date start, Date end
	 * @return List<SitTblGnr>
	 * @version 1.0
	 * @since 2022-03-23
	 */
	public List<SitTblGnr> lstGnrPrmNoStePrc(int IPrjId, int ISrcPrcId, Date DDteStr, Date SDteEnd, boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param1 AND gnr.BGnrStt = :param5 AND gnr.ITpeId = :param2 AND gnr.dGnrRgsDte BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", IPrjId);
			q.setParameter("param2", ISrcPrcId);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public List<SitTblGnr> lstGnrPrmNoSteSet(int IPrjId, int ISrcPrcId, Date DDteStr, Date SDteEnd, boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param1 AND gnr.BGnrStt = :param5 AND gnr.ITpeId = :param2 AND gnr.dGnrDteSet BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", IPrjId);
			q.setParameter("param2", ISrcPrcId);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public List<SitTblGnr> lstGnrPrmNoSteClc(int IPrjId, int ISrcPrcId, Date DDteStr, Date SDteEnd, boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param1 AND gnr.BGnrStt = :param5 AND gnr.ITpeId = :param2 AND gnr.dGnrDteClc BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", IPrjId);
			q.setParameter("param2", ISrcPrcId);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	/**
	 * <h1>METHOD --> lstGnrPrm, Process All !</h1> Search for parameter <br/>
	 * 
	 * @author DC
	 * @param Site,
	 *            Process, Date start, Date end
	 * @return List<SitTblGnr>
	 * @version 1.0
	 * @since 2022-03-23
	 */
	public List<SitTblGnr> lstGnrPrmNoPrcPrc(int IPrjId, SitTblSte ste, Date DDteStr, Date SDteEnd, boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param6 AND gnr.BGnrStt = :param5 AND gnr.sitTblNmb.sitTblSte =:param1 AND gnr.dGnrRgsDte BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", ste);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			q.setParameter("param6", IPrjId);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public List<SitTblGnr> lstGnrPrmNoPrcSet(int IPrjId, SitTblSte ste, Date DDteStr, Date SDteEnd, boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param6 AND gnr.BGnrStt = :param5 AND gnr.sitTblNmb.sitTblSte =:param1 AND gnr.dGnrDteSet BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", ste);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			q.setParameter("param6", IPrjId);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public List<SitTblGnr> lstGnrPrmNoPrcClc(int IPrjId, SitTblSte ste, Date DDteStr, Date SDteEnd, boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param6 AND gnr.BGnrStt = :param5 AND gnr.sitTblNmb.sitTblSte =:param1 AND gnr.dGnrDteClc BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", ste);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			q.setParameter("param6", IPrjId);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	/**
	 * <h1>METHOD --> lstGnrPrm. Site, Process all !</h1> Search for parameter <br/>
	 * 
	 * @author DC
	 * @param Date
	 *            start, Date end
	 * @return List<SitTblGnr>
	 * @version 1.0
	 * @since 2022-03-23
	 */
	public List<SitTblGnr> lstGnrPrmNoStePrcPrc(int IPrjId, Date DDteStr, Date SDteEnd, boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param1 AND gnr.BGnrStt = :param5 AND gnr.dGnrRgsDte BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", IPrjId);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public List<SitTblGnr> lstGnrPrmNoStePrcSet(int IPrjId, Date DDteStr, Date SDteEnd, boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param1 AND gnr.BGnrStt = :param5 AND gnr.dGnrDteSet BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", IPrjId);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public List<SitTblGnr> lstGnrPrmNoStePrcClc(int IPrjId, Date DDteStr, Date SDteEnd, boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param1 AND gnr.BGnrStt = :param5 AND gnr.dGnrDteClc BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", IPrjId);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	/**
	 * <h1>METHOD --> lstGnrPrm. date process !</h1> Search for parameter <br/>
	 * 
	 * @author DC
	 * @param Site,
	 *            Process, Date start, Date end
	 * @return List<SitTblGnr>
	 * @version 1.0
	 * @since 2022-03-23
	 */
	public List<SitTblGnr> lstGnrPrmPrc(int IPrjId, SitTblSte ste, int ISrcPrcId, Date DDteStr, Date SDteEnd,
			boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param6 AND gnr.BGnrStt = :param5 AND gnr.sitTblNmb.sitTblSte =:param1 AND gnr.ITpeId = :param2 AND gnr.dGnrRgsDte BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", ste);
			q.setParameter("param2", ISrcPrcId);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			q.setParameter("param6", IPrjId);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	/**
	 * <h1>METHOD --> lstGnrPrm, date set !</h1> Search for parameter <br/>
	 * 
	 * @author DC
	 * @param Site,
	 *            Process, Date start, Date end
	 * @return List<SitTblGnr>
	 * @version 1.0
	 * @since 2022-03-23
	 */
	public List<SitTblGnr> lstGnrPrmSet(int IPrjId, SitTblSte ste, int ISrcPrcId, Date DDteStr, Date SDteEnd,
			boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param6  AND gnr.BGnrStt = :param5 AND gnr.sitTblNmb.sitTblSte =:param1 AND gnr.ITpeId = :param2 AND gnr.dGnrDteSet BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", ste);
			q.setParameter("param2", ISrcPrcId);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			q.setParameter("param6", IPrjId);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	/**
	 * <h1>METHOD --> lstGnrPrm, date collected !</h1> Search for parameter <br/>
	 * 
	 * @author DC
	 * @param Site,
	 *            Process, Date start, Date end
	 * @return List<SitTblGnr>
	 * @version 1.0
	 * @since 2022-03-23
	 */
	public List<SitTblGnr> lstGnrPrmClc(int IPrjId, SitTblSte ste, int ISrcPrcId, Date DDteStr, Date SDteEnd,
			boolean BGnrStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnr gnr WHERE gnr.scrTblPrsRol.IPrjId = :param6  AND gnr.BGnrStt = :param5 AND gnr.sitTblNmb.sitTblSte =:param1 AND gnr.ITpeId = :param2 AND gnr.dGnrDteClc BETWEEN :param3 AND :param4 ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap";
			Query q = em.createQuery(sql);
			q.setParameter("param1", ste);
			q.setParameter("param2", ISrcPrcId);
			q.setParameter("param3", DDteStr);
			q.setParameter("param4", SDteEnd);
			q.setParameter("param5", BGnrStt);
			q.setParameter("param6", IPrjId);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}
}
