DROP FUNCTION sit.i_fnc_rtr_id_gnr(s_ste TEXT, s_trp TEXT, i_prj integer);
CREATE FUNCTION sit.i_fnc_rtr_id_gnr(s_ste TEXT, s_trp TEXT, i_prj integer) RETURNS integer AS $$ 
BEGIN 
RETURN (SELECT i_nmb_id 
		FROM sit_tbl_nmb nmb 
		INNER JOIN sit_tbl_ste ste ON ste.i_ste_id = nmb.i_ste_id 
		WHERE ste.i_prj_id = i_prj 
		AND upper(ste.s_ste_nme) = trim(s_ste)
		AND upper(nmb.s_nmb_trap) = trim(s_trp));
END; 
$$ LANGUAGE plpgsql;
COMMENT ON FUNCTION sit.i_fnc_rtr_id_gnr(s_ste TEXT, s_trp text, i_prj integer) IS 'Return Id of trap.';

SELECT * FROM sit_tbl_nmb AS stn ORDER BY 1;

SELECT *
FROM sit_tbl_nmb nmb 
INNER JOIN sit_tbl_ste ste ON ste.i_ste_id = nmb.i_ste_id 
WHERE ste.i_prj_id = 101 
	AND upper(ste.s_ste_nme) = 'GUADUAL'
	AND upper(nmb.s_nmb_trap) = '1';

SELECT sit.i_fnc_rtr_id_gnr('GUADUAL','1',101);



