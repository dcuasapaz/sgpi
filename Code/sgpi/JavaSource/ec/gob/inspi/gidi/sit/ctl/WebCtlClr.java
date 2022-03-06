package ec.gob.inspi.gidi.sit.ctl;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import ec.gob.inspi.gidi.sit.cmm.Print;
import ec.gob.inspi.gidi.sit.enm.Color;
import ec.gob.inspi.gidi.sit.enm.Package;
import ec.gob.inspi.gidi.sit.ent.WebTblClr;
import ec.gob.inspi.gidi.sit.srv.WebSrvClr;

/**
 * Controller proccess in WebTblClr
 *
 * @author Diego Cuasapaz
 * @version 1.0
 * @since 2022-03-05
 */
@ManagedBean
public class WebCtlClr {

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	// AUTOR | DATE | METHOD | DESCRIPTION
	// --------------------------------------------------------------
	// Diego Cuasapaz | 2022-03-05 | rtrClr | Return colors buttons, panels
	// --------------------------------------------------------------

	private static Logger LOG;

	public WebCtlClr() {
		LOG = Logger.getLogger(this.getClass().getName());
	}

	@EJB
	protected WebSrvClr sclr;

	/**
	 * This method is used for search register in entity.
	 * 
	 * @param IClrId
	 *            This ID color return properties
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr entClr(int IClrId) {
		try {
			return sclr.entClr(IClrId, true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color button primary.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_BTN_PRIMARY() {
		try {
			return sclr.entClr(Color.PRIMARY.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color button secondary.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_BTN_SECONDARY() {
		try {
			return sclr.entClr(Color.SECONDARY.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color button success.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */

	public WebTblClr CLR_BTN_SUCCESS() {
		try {
			return sclr.entClr(Color.SUCCESS.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color button danger.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_BTN_DANGER() {
		try {
			return sclr.entClr(Color.DANGER.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color button warning.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_BTN_WARNING() {
		try {
			return sclr.entClr(Color.WARNING.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color button info.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_BTN_INFO() {
		try {
			return sclr.entClr(Color.INFO.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color button light.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_BTN_LIGHT() {
		try {
			return sclr.entClr(Color.LIGHT.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color button dark.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_BTN_DARK() {
		try {
			return sclr.entClr(Color.DARK.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color panel project.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_PNL_PROJECT() {
		try {
			return sclr.entClr(Color.PROJECT.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color panel audit.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_PNL_AUDIT() {
		try {
			return sclr.entClr(Color.AUDIT.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color panel process.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_PNL_PROCESS() {
		try {
			return sclr.entClr(Color.PROCESS.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color panel trap.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_PNL_TRAP() {
		try {
			return sclr.entClr(Color.TRAP.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color panel eggs.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_PNL_EGGS() {
		try {
			return sclr.entClr(Color.EGGS.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color panel larvae.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_PNL_LARVAE() {
		try {
			return sclr.entClr(Color.LARVAE.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color panel adults.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_PNL_ADULTS() {
		try {
			return sclr.entClr(Color.ADULTS.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color panel search.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_PNL_SEARCH() {
		try {
			return sclr.entClr(Color.SEARCH.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

	/**
	 * This method return color panel title.
	 * 
	 * @return WebTblClr This returns Entity for database.
	 */
	public WebTblClr CLR_PNL_TITLE() {
		try {
			return sclr.entClr(Color.TITLE.getIClrId(), true);
		} catch (Exception e) {
			LOG.log(Level.WARNING, Package.CONTROLLER + Print.S_OBJ_SEPARATE + e.getMessage());
			return null;
		}
	}

}
