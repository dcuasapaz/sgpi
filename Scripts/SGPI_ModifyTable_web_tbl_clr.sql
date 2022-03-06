/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
/* AUTOR | DATE | MODULE | OBJECT | DESCRIPTION
* --------------------------------------------------------------
* Diego Cuasapaz | 2022-03-04 | WEB| Attribute | Add column auditoria
*/
----------------------------------------------------------------------------------- 
ALTER TABLE web_tbl_clr ADD COLUMN d_clr_rgs_dte date NOT NULL DEFAULT current_date;
ALTER TABLE web_tbl_clr ADD COLUMN s_clr_rgs_tme text NOT NULL DEFAULT btrim(btrim("left"((((date_part('hour'::text, 'now'::text::time with time zone)::text || ':'::text) || date_part('minute'::text, 'now'::text::time with time zone)) || ':'::text) || date_part('second'::text, 'now'::text::time with time zone)::text, 8), '.'::text), ' '::text);
ALTER TABLE web_tbl_clr ADD COLUMN i_clr_rgs_prs_rol_id integer NOT NULL DEFAULT 1;
ALTER TABLE web_tbl_clr ADD CONSTRAINT i_fk_scr_prs_rol_web_clr_id FOREIGN KEY(i_clr_rgs_prs_rol_id) REFERENCES scr_tbl_prs_rol(i_prs_rol_id);
ALTER TABLE web_tbl_clr ADD COLUMN b_clr_stt boolean NOT NULL DEFAULT TRUE ;
ALTER TABLE web_tbl_clr ADD COLUMN s_clr_tpe text NOT NULL DEFAULT '';
ALTER TABLE web_tbl_clr ADD COLUMN s_clr_stl text NOT NULL DEFAULT '';


COMMENT ON COLUMN web_tbl_clr.d_clr_rgs_dte IS 'Fecha registro';
COMMENT ON COLUMN web_tbl_clr.s_clr_rgs_tme IS 'Hora registro';
COMMENT ON COLUMN web_tbl_clr.b_clr_stt IS 'Activo/No activo';
COMMENT ON COLUMN web_tbl_clr.i_clr_rgs_prs_rol_id IS 'FK --> Usuario que registra';
COMMENT ON COLUMN web_tbl_clr.s_clr_tpe IS 'Tipo de objeto';
COMMENT ON COLUMN web_tbl_clr.s_clr_stl IS 'Estilo de objeto';

CREATE INDEX CONCURRENTLY b_idx_web_clr_stt_t ON web_tbl_clr USING btree(b_clr_stt) WHERE b_clr_stt IS TRUE;
CREATE INDEX CONCURRENTLY b_idx_web_clr_stt_f ON web_tbl_clr USING btree(b_clr_stt) WHERE b_clr_stt IS FALSE;
CREATE INDEX CONCURRENTLY s_idx_web_clr_tpe_btn ON web_tbl_clr USING btree(s_clr_tpe) WHERE s_clr_tpe = 'button';
CREATE INDEX CONCURRENTLY s_idx_web_clr_stl_btn_prm ON web_tbl_clr USING btree(s_clr_stl) WHERE s_clr_stl = 'btn-primary';
CREATE INDEX CONCURRENTLY s_idx_web_clr_stl_btn_scn ON web_tbl_clr USING btree(s_clr_stl) WHERE s_clr_stl = 'btn-secondary';
CREATE INDEX CONCURRENTLY s_idx_web_clr_stl_btn_scs ON web_tbl_clr USING btree(s_clr_stl) WHERE s_clr_stl = 'btn-success';
CREATE INDEX CONCURRENTLY s_idx_web_clr_stl_btn_dng ON web_tbl_clr USING btree(s_clr_stl) WHERE s_clr_stl = 'btn-danger';
CREATE INDEX CONCURRENTLY s_idx_web_clr_stl_btn_wrn ON web_tbl_clr USING btree(s_clr_stl) WHERE s_clr_stl = 'btn-warning';
CREATE INDEX CONCURRENTLY s_idx_web_clr_stl_btn_inf ON web_tbl_clr USING btree(s_clr_stl) WHERE s_clr_stl = 'btn-info';
CREATE INDEX CONCURRENTLY s_idx_web_clr_stl_btn_lgh ON web_tbl_clr USING btree(s_clr_stl) WHERE s_clr_stl = 'btn-light';
CREATE INDEX CONCURRENTLY s_idx_web_clr_stl_btn_drk ON web_tbl_clr USING btree(s_clr_stl) WHERE s_clr_stl = 'btn-dark';



SELECT * FROM web_tbl_clr ORDER BY 1;

-- Delete register error 
--DELETE FROM web_tbl_clr WHERE i_clr_id BETWEEN 101 AND 902;




