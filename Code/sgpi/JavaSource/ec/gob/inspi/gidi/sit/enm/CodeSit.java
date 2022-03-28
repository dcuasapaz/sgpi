package ec.gob.inspi.gidi.sit.enm;

public enum CodeSit {

	PROCESS_STATUS(100)
	, PROCESS_STATUS_OPEN(1001)
	, PROCESS_STATUS_CLOSE(1002)
	, PROCESS(7)
	, PROCESS_FIELD(701)
	, PROCESS_FIELD_EGS(702)
	, PROCESS_FIELD_LRV(703)
	, LARVAE(301)
	, ADULT(302)
	, TCH_FIELD(103)
	, TCH_LAB(104)
	, DATE_FILTER(20)
	, DATE_FILTER_PRC(2001)
	, DATE_FILTER_SET(2002)
	, DATE_FILTER_CLC(2003)
	, RLA5074(101)
	, ECU5032(102)
	, AE(501)
	, ALB(502)
	, CLX(512)
	, CLX_SP(503)
	, CLX_SP_CS(513)
	, LMT(514)
	, LMT_DRH(507)
	, LMT_FLV(505)
	, LMT_SP(504)
	, ONR(510)
	, ONR_SP(515)
	, SP(516)
	, WYM_SP(506)
	, WYM_SP_CS(517)
	, FEMALE(401)
	, MALE(402);

	private int ICdeVle;

	private CodeSit(int ICdeVle) {
		this.ICdeVle = ICdeVle;
	}

	public int getICdeVle() {
		return ICdeVle;
	}
}
