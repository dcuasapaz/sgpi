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
import ec.gob.inspi.gidi.sit.ent.SitTblGnrPrsPrf;

@Stateless
public class SitSrvGnrPrsPrf extends SrvDb<SitTblGnrPrsPrf> {

	public SitSrvGnrPrsPrf() {
		super(SitTblGnrPrsPrf.class, SitSrvGnrPrsPrf.class);
	}

	public boolean sve(ScrTblPrsRol prsRol, ScrTblPrsRol prsPrf, SitTblGnr gnr) {
		try {
			SitTblGnrPrsPrf gnrPrsPrf = new SitTblGnrPrsPrf();
			gnrPrsPrf.setDPrsPrfRgsDte(Default.D_CURRENT_DATE());
			gnrPrsPrf.setSPrsPrfRgsTme(Default.S_CURRENT_TIME());
			gnrPrsPrf.setBPrsPrfStt(true);
			gnrPrsPrf.setScrTblPrsRolPrf(prsRol);
			gnrPrsPrf.setScrTblPrsRol(prsPrf);
			gnrPrsPrf.setSitTblGnr(gnr);
			this.insert(gnrPrsPrf);
			return true;
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SAVE, e.getMessage());
			return false;
		}
	}

	public boolean dltLgc(SitTblGnrPrsPrf gnrPrsPrf) {
		try {
			gnrPrsPrf.setBPrsPrfStt(false);
			this.update(gnrPrsPrf);
			return true;
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.UPDATE, e.getMessage());
			return false;
		}
	}

	public List<SitTblGnrPrsPrf> lstGnrPrsPrf(SitTblGnr gnr, int IRolId) {
		try {
			String sql = "SELECT gnr FROM SitTblGnrPrsPrf gnr WHERE gnr.sitTblGnr = :param AND gnr.scrTblPrsRol.iRolId = :param1 AND gnr.BPrsPrfStt = true";
			Query q = em.createQuery(sql);
			q.setParameter("param", gnr);
			q.setParameter("param1", IRolId);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

	public List<SitTblGnrPrsPrf> lstGnrPrsPrf(SitTblGnr gnr, boolean BPrsPrfStt) {
		try {
			String sql = "SELECT gnr FROM SitTblGnrPrsPrf gnr WHERE gnr.sitTblGnr = :param1 AND gnr.BPrsPrfStt = :param2";
			Query q = em.createQuery(sql);
			q.setParameter("param1", gnr);
			q.setParameter("param2", BPrsPrfStt);
			return q.getResultList();
		} catch (Exception e) {
			Print.LOG_SEVERE_SERVICE(this.getClass().getSimpleName(), Process.SELECT, e.getMessage());
			return null;
		}
	}

}
