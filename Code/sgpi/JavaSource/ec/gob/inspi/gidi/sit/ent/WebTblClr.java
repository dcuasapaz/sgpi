package ec.gob.inspi.gidi.sit.ent;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * The persistent class for the web_tbl_clr database table.
 * 
 */
@Entity
@Table(name = "web_tbl_clr")
@NamedQuery(name = "WebTblClr.findAll", query = "SELECT w FROM WebTblClr w")
public class WebTblClr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_clr_id")
	private Integer iClrId;

	@Column(name = "s_clr_dsc")
	private String sClrDsc;

	@Column(name = "s_clr_hex")
	private String sClrHex;

	@Column(name = "s_clr_nme")
	private String sClrNme;

	@Column(name = "s_clr_rgb")
	private String sClrRgb;

	@Column(name = "s_clr_tpe")
	private String sClrTpe;

	@Column(name = "s_clr_stl")
	private String sClrStl;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_clr_rgs_dte")
	private Date dClrRgsDte;

	@Column(name = "s_clr_rgs_tme")
	private String sClrRgsTme;

	@Column(name = "b_clr_stt")
	private Boolean bClrStt;

	@ManyToOne
	@JoinColumn(name = "i_clr_rgs_prs_rol_id")
	private ScrTblPrsRol scrTblPrsRol;

	public WebTblClr() {
	}

	public Integer getIClrId() {
		return this.iClrId;
	}

	public void setIClrId(Integer iClrId) {
		this.iClrId = iClrId;
	}

	public String getSClrDsc() {
		return this.sClrDsc;
	}

	public void setSClrDsc(String sClrDsc) {
		this.sClrDsc = sClrDsc;
	}

	public String getSClrHex() {
		return this.sClrHex;
	}

	public void setSClrHex(String sClrHex) {
		this.sClrHex = sClrHex;
	}

	public String getSClrNme() {
		return this.sClrNme;
	}

	public void setSClrNme(String sClrNme) {
		this.sClrNme = sClrNme;
	}

	public String getSClrRgb() {
		return this.sClrRgb;
	}

	public void setSClrRgb(String sClrRgb) {
		this.sClrRgb = sClrRgb;
	}

	public Date getdClrRgsDte() {
		return dClrRgsDte;
	}

	public void setdClrRgsDte(Date dClrRgsDte) {
		this.dClrRgsDte = dClrRgsDte;
	}

	public String getsClrRgsTme() {
		return sClrRgsTme;
	}

	public void setsClrRgsTme(String sClrRgsTme) {
		this.sClrRgsTme = sClrRgsTme;
	}

	public Boolean getbClrStt() {
		return bClrStt;
	}

	public void setbClrStt(Boolean bClrStt) {
		this.bClrStt = bClrStt;
	}

	public ScrTblPrsRol getScrTblPrsRol() {
		return scrTblPrsRol;
	}

	public void setScrTblPrsRol(ScrTblPrsRol scrTblPrsRol) {
		this.scrTblPrsRol = scrTblPrsRol;
	}

	public String getsClrTpe() {
		return sClrTpe;
	}

	public void setsClrTpe(String sClrTpe) {
		this.sClrTpe = sClrTpe;
	}

	public String getsClrStl() {
		return sClrStl;
	}

	public void setsClrStl(String sClrStl) {
		this.sClrStl = sClrStl;
	}

}