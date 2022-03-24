/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
/* AUTOR | DATE | MODULE | OBJECT | DESCRIPTION
* --------------------------------------------------------------
* Diego Cuasapaz | 2022-03-06 | SIT | Register | Status process
*/
----------------------------------------------------------------------------------- 
SELECT * FROM sit_tbl_opt AS sto ORDER BY 1;

INSERT INTO sit_tbl_opt(i_opt_id
						, i_opt_fth
						, s_opt_nme
						, s_opt_acr
						, s_opt_dsc)
VALUES(100, 0, 'Status process', 'sit_tbl_prc_sts', 'Status ovi trap');

INSERT INTO sit_tbl_opt(i_opt_id
						, i_opt_fth
						, s_opt_nme
						, s_opt_acr
						, s_opt_dsc
						, i_opt_ctg)
VALUES(1001, 100, 'Open', 'Open', 'Open ovi trap', 1),
	  (1002, 100, 'Close', 'Close', 'Close ovi trap', 2);


