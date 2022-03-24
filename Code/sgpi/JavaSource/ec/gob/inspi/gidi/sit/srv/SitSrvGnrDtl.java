package ec.gob.inspi.gidi.sit.srv;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import ec.gob.inspi.gidi.sit.cmm.Default;
import ec.gob.inspi.gidi.sit.cmm.Print;
import ec.gob.inspi.gidi.sit.cmm.SrvDb;
import ec.gob.inspi.gidi.sit.enm.Process;
import ec.gob.inspi.gidi.sit.ent.ScrTblPrsRol;
import ec.gob.inspi.gidi.sit.ent.SitTblGnr;
import ec.gob.inspi.gidi.sit.ent.SitTblGnrDtl;

@Stateless
public class SitSrvGnrDtl extends SrvDb<SitTblGnrDtl> {

	public SitSrvGnrDtl() {
		super(SitTblGnrDtl.class, SitSrvGnrDtl.class);

	}

	public boolean sve(ScrTblPrsRol prl, SitTblGnrDtl gnrDtl, SitTblGnr gnr) {
		try {
			gnrDtl.setDGnrDtlDteRgs(Default.D_CURRENT_DATE());
			gnrDtl.setSGnrDtlTmeRgs(Default.S_CURRENT_TIME());
			gnrDtl.setScrTblPrsRol(prl);
			gnrDtl.setSitTblGnr(gnr);
			gnrDtl.setBGnrDtlStt(true);
			this.insert(gnrDtl);
			return true;
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SAVE, e.getMessage());
			return false;
		}
	}

	public boolean dltLgc(SitTblGnrDtl gnrDtl) {
		try {
			gnrDtl.setBGnrDtlStt(false);
			this.update(gnrDtl);
			return true;
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.UPDATE, e.getMessage());
			return false;
		}
	}

	public List<SitTblGnrDtl> lstGnrDtl(SitTblGnr gnr, int ITpeDtl, boolean BGnrDtlStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnrDtl gnr WHERE gnr.sitTblGnr = :param1 AND gnr.iTpeDtl = :param2 AND gnr.BGnrDtlStt = :param3";
			Query q = em.createQuery(sql);
			q.setParameter("param1", gnr);
			q.setParameter("param2", ITpeDtl);
			q.setParameter("param3", BGnrDtlStt);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public List<SitTblGnrDtl> lstGnrDtlPrc(SitTblGnr gnr, int ITpeDtl, int IPrcId, boolean BGnrDtlStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnrDtl gnr WHERE gnr.sitTblGnr = :param1 AND gnr.iTpeDtl = :param2 AND gnr.BGnrDtlStt = :param3 AND gnr.IPrcId = :param4";
			Query q = em.createQuery(sql);
			q.setParameter("param1", gnr);
			q.setParameter("param2", ITpeDtl);
			q.setParameter("param3", BGnrDtlStt);
			q.setParameter("param4", IPrcId);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}
}
