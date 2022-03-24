package ec.gob.inspi.gidi.sit.cmm;

import java.util.logging.Level;
import java.util.logging.Logger;

import ec.gob.inspi.gidi.sit.enm.Package;
import ec.gob.inspi.gidi.sit.enm.Process;

public class Print {

	private static Logger LOG;
	public static String S_OBJ_SEPARATE = " --> ";
	public static String S_OBJ_PNT_TWO = ": ";
	public static String S_OBJ_CRC_OPEN = "[";
	public static String S_OBJ_CRC_CLOSE = "]";

	public Print() {
		LOG = Logger.getLogger(this.getClass().getName());
	}

	public static String UNION(String vle) {
		return Print.S_OBJ_CRC_OPEN + vle + Print.S_OBJ_CRC_CLOSE + Print.S_OBJ_PNT_TWO;
	}

	public static void LOG_INFO_CONTROLLER(String ClsNme, Process prc, String MsgE) {
		LOG = Logger.getLogger(Print.class.getSimpleName());
		LOG.log(Level.INFO,
				Print.UNION(ClsNme) + Package.CONTROLLER + Print.UNION(prc.getSNme()) + Print.S_OBJ_SEPARATE + MsgE);
	}
	
	public static void LOG_SEVERE_CONTROLLER(String ClsNme, Process prc, String MsgE) {
		LOG = Logger.getLogger(Print.class.getSimpleName());
		LOG.log(Level.SEVERE,
				Print.UNION(ClsNme) + Package.CONTROLLER + Print.UNION(prc.getSNme()) + Print.S_OBJ_SEPARATE + MsgE);
	}

	public static void LOG_INFO_SERVICE(String ClsNme, Process prc, String MsgE) {
		LOG = Logger.getLogger(Print.class.getSimpleName());
		LOG.log(Level.INFO,
				Print.UNION(ClsNme) + Package.SERVICE + Print.UNION(prc.getSNme()) + Print.S_OBJ_SEPARATE + MsgE);
	}
	
	public static void LOG_SEVERE_SERVICE(String ClsNme, Process prc, String MsgE) {
		LOG = Logger.getLogger(Print.class.getSimpleName());
		LOG.log(Level.SEVERE,
				Print.UNION(ClsNme) + Package.SERVICE + Print.UNION(prc.getSNme()) + Print.S_OBJ_SEPARATE + MsgE);
	}

}
