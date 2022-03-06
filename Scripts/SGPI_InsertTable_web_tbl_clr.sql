/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
/* AUTOR | DATE | MODULE | OBJECT | DESCRIPTION
* --------------------------------------------------------------
* Diego Cuasapaz | 2022-03-05 | WEB| Attribute | Insert colors buttons
* Diego Cuasapaz | 2022-03-06 | WEB| Attribute | Insert colors panels
*/
----------------------------------------------------------------------------------- 
INSERT INTO web_tbl_clr(i_clr_id
						, s_clr_nme
						, s_clr_dsc
						, s_clr_hex
						, s_clr_rgb
						, s_clr_tpe 
						, s_clr_stl)
VALUES
	(100, 'Primary', 'Boton primario', '#007bff', 'RGB(0,123,255)','button','btn-primary'),
	(101, 'Secondary', 'Boton secundario', '#6c757d', 'RGB(108,117,125)','button','btn-secondary'),
	(102, 'Success', 'Boton proceso exitoso', '#28a745', 'RGB(40,167,69)','button','btn-success'),
	(103, 'Danger', 'Boton proceso caido, eliminar', '#dc3545', 'RGB(220,53,69)','button','btn-danger'),
	(104, 'Warning', 'Boton advertencia', '#ffc107', 'RGB(255,193,7)','button','btn-warning'),
	(105, 'Info', 'Boton informativo', '#17a2b8', 'RGB(23,162,184)','button','btn-info'),
	(106, 'Light', 'Boton Light', '#f8f9fa', 'RGB(248,249,250)','button','btn-light'),
	(107, 'Dark', 'Boton Dark', '#343a40', 'RGB(52,58,64)','button','btn-dark');
	
INSERT INTO web_tbl_clr(i_clr_id
						, s_clr_nme
						, s_clr_dsc
						, s_clr_hex
						, s_clr_rgb
						, s_clr_tpe
						, s_clr_stl)
VALUES
	(200, 'Project', 'Panel info project', '#E6E6FA', 'RGB(230,230,250)','panel','pnl-project'),
	(201, 'Audit', 'Panel info audit ', '#CCFF00', 'RGB(204,255,0)','panel','pnl-audit'),
	(202, 'Process', 'Panel info process', '#7FFFD4', 'RGB(127,255,212)','panel','pnl-process'),
	(203, 'Trap', 'Panel info trap', '#FFFF00', 'RGB(255,255,0)','panel','pnl-trap'),
	(204, 'Eggs', 'Panel info eggs', '#AFEEEE', 'RGB(175,238,238)','panel','pnl-eggs'),
	(205, 'Larvae', 'Panel info larvae', '#A1A6D4', 'RGB(161,166,212)','panel','pnl-larvae'),
	(206, 'Adults', 'Panel info adults', '#FFAA66', 'RGB(255,170,102)','panel','pnl-adults'),
	(207, 'Search', 'Panel search', '#cad9dd', 'RGB(202,217,221)','panel','pnl-search'),
	(208, 'Title panel', 'Panel title', '#0E2F44', 'RGB(14,47,68)','panel','pnl-title');
	

