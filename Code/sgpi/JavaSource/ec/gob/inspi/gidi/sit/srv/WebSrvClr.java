package ec.gob.inspi.gidi.sit.srv;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.Query;

import ec.gob.inspi.gidi.sit.cmm.Print;
import ec.gob.inspi.gidi.sit.cmm.SrvDb;
import ec.gob.inspi.gidi.sit.enm.Package;
import ec.gob.inspi.gidi.sit.ent.WebTblClr;

/**
 * Service proccess in WebTblClr
 *
 * @author Diego Cuasapaz
 * @version 1.0
 * @since 2022-03-05
 */
@Stateless
public class WebSrvClr extends SrvDb<WebTblClr> {

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | METHOD | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-03-05 | entClr | Service return entity
	// --------------------------------------------------------------

	private static Logger LOG;

	public WebSrvClr() {
		super(WebTblClr.class, WebSrvClr.class);
		LOG = Logger.getLogger(this.getClass().getName());
	}

	/**
	 * This method is used for search register in entity.
	 * 
	 * @param IClrId
	 *            This ID color return properties
	 * @param BClrStt
	 *            This ID color return properties is Active/No active
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr entClr(int IClrId, boolean BClrStt) {
		try {
			String sql = "SELECT clr FROM WebTblClr clr WHERE clr.iClrId = :param1 AND  clr.bClrStt = :param2";
			Query q = em.createQuery(sql);
			q.setParameter("param1", IClrId);
			q.setParameter("param2", BClrStt);
			return (WebTblClr) q.getSingleResult();
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.SERVICE + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}

	}

}
