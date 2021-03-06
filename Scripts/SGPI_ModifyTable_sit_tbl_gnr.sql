/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
/* AUTOR | DATE | MODULE | OBJECT | DESCRIPTION
* --------------------------------------------------------------
* Diego Cuasapaz | 2022-03-06 | SIT| Attribute | Add column status, date process close
*/
----------------------------------------------------------------------------------- 

/*-------------------------------------------------------------------------------------------------------------------------------------*/
/*
 * Module: SIT
 * Autor: DC
 * Date: 2022-02-09
 * Description: add column 
 * 
 * */
SELECT * FROM sit_tbl_gnr AS stg ORDER BY 1;SELECT * FROM sit_tbl_gnr AS stg ORDER BY 1;
ALTER TABLE sit_tbl_gnr ADD COLUMN i_gnr_nmb_egs_vlb_no integer;
/*-------------------------------------------------------------------------------------------------------------------------------------*/
/*
 * Module: SIT
 * Autor: DC
 * Date: 2022-02-23
 * Description: general modify 
 * 
 * */
DELETE FROM sit_tbl_gnr_prs_prf;
DELETE FROM sit_tbl_gnr_dtl;
DELETE FROM sit_tbl_gnr;
ALTER SEQUENCE sit_sqn_gnr_prs_prf RESTART 1;
ALTER SEQUENCE sit_sqn_gnr_dtl RESTART 1;
ALTER SEQUENCE sit_sqn_gnr RESTART 1;

DROP VIEW sit_qry_fld;
DROP VIEW sit.sit_qry_dta_egs ;
DROP VIEW sit.sit_qry_gnr_dtl_2021;
DROP VIEW sit.sit_qry_gnr_2021;

ALTER TABLE sit_tbl_gnr DROP COLUMN i_gnr_dte_set_yr;
ALTER TABLE sit_tbl_gnr DROP COLUMN i_gnr_dte_set_mth;
ALTER TABLE sit_tbl_gnr DROP COLUMN i_gnr_dte_set_day;
DROP VIEW sit.sit_qry_gnr_2018;
ALTER TABLE sit_tbl_gnr DROP COLUMN i_gnr_dte_clc_yr;
ALTER TABLE sit_tbl_gnr DROP COLUMN i_gnr_dte_clc_mth;
ALTER TABLE sit_tbl_gnr DROP COLUMN i_gnr_dte_clc_day;
ALTER TABLE sit_tbl_gnr DROP COLUMN i_epi_id;
ALTER TABLE sit_tbl_gnr DROP COLUMN i_epi_id;

SELECT * FROM sit_tbl_gnr AS stgd;
CREATE INDEX CONCURRENTLY b_idx_atr_sit_gnr_stt_t ON sit_tbl_gnr USING btree(b_gnr_stt) WHERE b_gnr_stt IS TRUE;
CREATE INDEX CONCURRENTLY b_idx_atr_sit_gnr_stt_f ON sit_tbl_gnr USING btree(b_gnr_stt) WHERE b_gnr_stt IS FALSE;


SELECT * FROM sit_tbl_gnr_dtl AS stgd;
ALTER TABLE sit_tbl_gnr_dtl ALTER COLUMN d_gnr_dtl_dte_rgs SET DEFAULT current_date;
ALTER TABLE sit_tbl_gnr_dtl ADD COLUMN b_gnr_dtl_stt boolean NOT NULL DEFAULT TRUE;
ALTER TABLE sit_tbl_gnr_dtl ADD COLUMN i_gnr_dtl_rgs_prs_rol_id integer NOT NULL DEFAULT 1;
ALTER TABLE sit_tbl_gnr_dtl ADD CONSTRAINT i_fk_scr_prs_rol_sit_gnr_dtl_id FOREIGN KEY(i_gnr_dtl_rgs_prs_rol_id) REFERENCES scr_tbl_prs_rol(i_prs_rol_id);
CREATE INDEX CONCURRENTLY b_idx_atr_sit_gnr_dtl_stt_t ON sit_tbl_gnr_dtl USING btree(b_gnr_dtl_stt) WHERE b_gnr_dtl_stt IS TRUE;
CREATE INDEX CONCURRENTLY b_idx_atr_sit_gnr_dtl_stt_f ON sit_tbl_gnr_dtl USING btree(b_gnr_dtl_stt) WHERE b_gnr_dtl_stt IS FALSE;
CREATE INDEX CONCURRENTLY i_idx_sit_gnr_dtl_rgs_prs_rol_id ON sit_tbl_gnr_dtl USING btree(i_gnr_dtl_rgs_prs_rol_id);
COMMENT ON COLUMN sit_tbl_gnr_dtl.b_gnr_dtl_stt IS 'Activo/No activo';
COMMENT ON COLUMN sit_tbl_gnr_dtl.i_gnr_dtl_rgs_prs_rol_id IS 'FK --> Usuario que registra';

SELECT * FROM sit_tbl_gnr_prs_prf;

ALTER TABLE sit_tbl_gnr ADD COLUMN d_gnr_dte_prc_cls date NOT NULL DEFAULT CURRENT_DATE;
ALTER TABLE sit_tbl_gnr ADD COLUMN i_prc_sts_id integer NOT NULL DEFAULT 1001;
ALTER TABLE sit_tbl_gnr ALTER COLUMN s_gnr_tme_rgs SET DEFAULT btrim(btrim("left"((((date_part('hour'::text, 'now'::text::time with time zone)::text || ':'::text) || date_part('minute'::text, 'now'::text::time with time zone)) || ':'::text) || date_part('second'::text, 'now'::text::time with time zone)::text, 8), '.'::text), ' '::text);

-- Date proccess
-- Proccess
-- LOCATION 
-- Status --> OPEN 
-- Number
-- d_gnr_dte_set 
-- d_gnr_dte_clc 
select * FROM sit_tbl_opt AS sto ORDER BY 1;
SELECT * FROM sit_tbl_gnr AS stg ORDER BY 1;


SELECT gnr FROM sit_tbl_gnr gnr 
WHERE gnr.b_gnr_stt  = TRUE   AND gnr.d_gnr_rgs_dte BETWEEN '2022-03-28' AND '2022-03-28' ORDER BY gnr.dGnrDteClc, gnr.sitTblNmb.sNmbTrap"
SELECT * FROM sit_tbl_ste AS sts;


