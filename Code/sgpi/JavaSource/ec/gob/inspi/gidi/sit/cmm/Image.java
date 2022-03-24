package ec.gob.inspi.gidi.sit.cmm;

import javax.faces.bean.ManagedBean;

import ec.gob.inspi.gidi.sit.enm.Path;

@ManagedBean
public class Image {
	public Image() {

	}

	public static String PNL_IMG_ADT() {
		return Path.PATH_IMG.getSPthNme() + "audit.png";
	}

	public static String PNL_STL_ADT() {
		return Path.PATH_IMG.getSPthStl();
	}

	public static String PNL_IMG_PRC() {
		return Path.PATH_IMG.getSPthNme() + "process.png";
	}

	public static String PNL_STL_PRC() {
		return Path.PATH_IMG.getSPthStl();
	}

	public static String PNL_IMG_MSQ() {
		return Path.PATH_IMG.getSPthNme() + "mosquito.png";
	}

	public static String PNL_STL_msq() {
		return Path.PATH_IMG.getSPthStl();
	}

	public String Bnr() {
		return "/img/Bnr.jpg";
	}

	public String loading() {
		return "/img/loading.gif";
	}

}
