package ec.gob.inspi.gidi.sit.ent;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * The persistent class for the sit_tbl_gnr_prs_prf database table.
 * 
 */
@Entity
@Table(name = "sit_tbl_gnr_prs_prf")
@NamedQuery(name = "SitTblGnrPrsPrf.findAll", query = "SELECT s FROM SitTblGnrPrsPrf s")
public class SitTblGnrPrsPrf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_gnr_prs_prf_id")
	private Integer iGnrPrsPrfId;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_prs_prf_rgs_dte")
	private Date DPrsPrfRgsDte;

	@Column(name = "s_prs_prf_rgs_tme")
	private String SPrsPrfRgsTme;

	@Column(name = "b_prs_prf_stt")
	private Boolean BPrsPrfStt;
	// bi-directional many-to-one association to ScrTblPrsRol

	@ManyToOne
	@JoinColumn(name = "i_prs_prf_id")
	private ScrTblPrsRol scrTblPrsRol;

	// bi-directional many-to-one association to SitTblGnr
	@ManyToOne
	@JoinColumn(name = "i_gnr_id")
	private SitTblGnr sitTblGnr;

	@ManyToOne
	@JoinColumn(name = "i_prs_prf_rgs_prs_rol_id")
	private ScrTblPrsRol scrTblPrsRolPrf;

	public SitTblGnrPrsPrf() {
	}

	public Integer getIGnrPrsPrfId() {
		return this.iGnrPrsPrfId;
	}

	public void setIGnrPrsPrfId(Integer iGnrPrsPrfId) {
		this.iGnrPrsPrfId = iGnrPrsPrfId;
	}

	public ScrTblPrsRol getScrTblPrsRol() {
		return this.scrTblPrsRol;
	}

	public void setScrTblPrsRol(ScrTblPrsRol scrTblPrsRol) {
		this.scrTblPrsRol = scrTblPrsRol;
	}

	public SitTblGnr getSitTblGnr() {
		return this.sitTblGnr;
	}

	public void setSitTblGnr(SitTblGnr sitTblGnr) {
		this.sitTblGnr = sitTblGnr;
	}

	public Date getDPrsPrfRgsDte() {
		return DPrsPrfRgsDte;
	}

	public void setDPrsPrfRgsDte(Date dPrsPrfRgsDte) {
		DPrsPrfRgsDte = dPrsPrfRgsDte;
	}

	public String getSPrsPrfRgsTme() {
		return SPrsPrfRgsTme;
	}

	public void setSPrsPrfRgsTme(String sPrsPrfRgsTme) {
		SPrsPrfRgsTme = sPrsPrfRgsTme;
	}

	public Boolean getBPrsPrfStt() {
		return BPrsPrfStt;
	}

	public void setBPrsPrfStt(Boolean bPrsPrfStt) {
		BPrsPrfStt = bPrsPrfStt;
	}

	public ScrTblPrsRol getScrTblPrsRolPrf() {
		return scrTblPrsRolPrf;
	}

	public void setScrTblPrsRolPrf(ScrTblPrsRol scrTblPrsRolPrf) {
		this.scrTblPrsRolPrf = scrTblPrsRolPrf;
	}

}