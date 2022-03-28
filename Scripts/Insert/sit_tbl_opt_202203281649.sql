INSERT INTO public.sit_tbl_opt (i_opt_id,i_opt_fth,s_opt_nme,s_opt_acr,s_opt_dsc,b_opt_stt,d_opt_rgs_dte,s_opt_rgs_tme,i_opt_rgs_prs_rol_id,i_opt_ctg) VALUES
	 (1,0,'Project','cirev_tbl_prj','CIREV Projects',false,'2022-02-08','12:53:4',1,-99),
	 (2,0,'Trap','cirev_tbl_trp','CIREV Trap',false,'2022-02-08','12:53:4',1,-99),
	 (3,0,'Record type','cirev_tbl_tpe_rcd','Larvae, adult',false,'2022-02-08','12:53:4',1,-99),
	 (301,3,'Larvae','lrv','Larves',false,'2022-02-08','12:53:4',1,-99),
	 (302,3,'Adult','adl','Adults',false,'2022-02-08','12:53:4',1,-99),
	 (-99,-99,'No data','No data','No data',false,'2022-02-08','12:53:4',1,-99),
	 (8,0,'Search','sit_tbl_src_itm','Item search',false,'2022-02-08','12:53:4',1,-99),
	 (802,8,'Location','Location','Location',true,'2022-02-08','12:53:4',1,-99),
	 (803,8,'Date ovitrap colected','Date ovitrap colected','Date ovitrap colected',true,'2022-02-08','12:53:4',1,-99),
	 (804,8,'All','All','All',true,'2022-02-08','12:53:4',1,-99);
INSERT INTO public.sit_tbl_opt (i_opt_id,i_opt_fth,s_opt_nme,s_opt_acr,s_opt_dsc,b_opt_stt,d_opt_rgs_dte,s_opt_rgs_tme,i_opt_rgs_prs_rol_id,i_opt_ctg) VALUES
	 (901,9,'Tanque','T','T',true,'2022-02-08','12:53:4',1,-99),
	 (902,9,'Piscina','P','P',true,'2022-02-08','12:53:4',1,-99),
	 (903,9,'Llanta','L','L',true,'2022-02-08','12:53:4',1,-99),
	 (9,0,'Contain','sit_tbl_ctn','Contenedor',false,'2022-02-08','12:53:4',1,-99),
	 (701,7,'Field','Field','Field',true,'2022-02-08','12:53:4',1,-99),
	 (202,2,'Ovi','Ovi','Example',true,'2022-02-08','12:53:4',1,-99),
	 (201,2,'CDC','CDC','Example',false,'2022-02-08','12:53:4',1,-99),
	 (203,2,'BG','BG','Example',false,'2022-02-08','12:53:4',1,-99),
	 (605,6,'(1-2) dead','Stage','Stage',false,'2022-02-08','12:53:4',1,-99),
	 (606,6,'(3) dead','Stage','Stage',false,'2022-02-08','12:53:4',1,-99);
INSERT INTO public.sit_tbl_opt (i_opt_id,i_opt_fth,s_opt_nme,s_opt_acr,s_opt_dsc,b_opt_stt,d_opt_rgs_dte,s_opt_rgs_tme,i_opt_rgs_prs_rol_id,i_opt_ctg) VALUES
	 (607,6,'(4) dead','Stage','Stage',false,'2022-02-08','12:53:4',1,-99),
	 (608,6,'Pupe (dead)','Stage','Stage',false,'2022-02-08','12:53:4',1,-99),
	 (401,4,'Female','F','Female',true,'2022-02-08','12:53:4',1,-99),
	 (402,4,'Male','M','Male',true,'2022-02-08','12:53:4',1,-99),
	 (503,5,'Culex sp.','','',true,'2022-02-08','12:53:4',1,-99),
	 (504,5,'Limatus sp.','','',true,'2022-02-08','12:53:4',1,-99),
	 (506,5,'Wyeomyia sp.','','',true,'2022-02-08','12:53:4',1,-99),
	 (507,5,'Limatus Durhamii','','',true,'2022-02-08','12:53:4',1,-99),
	 (505,5,'Limatus flavisetosus','','',true,'2022-02-08','12:53:4',1,-99),
	 (508,5,'Culex Quinquefasciatus','CQ','Culex Quinquefasciatus',true,'2022-02-08','12:53:4',1,-99);
INSERT INTO public.sit_tbl_opt (i_opt_id,i_opt_fth,s_opt_nme,s_opt_acr,s_opt_dsc,b_opt_stt,d_opt_rgs_dte,s_opt_rgs_tme,i_opt_rgs_prs_rol_id,i_opt_ctg) VALUES
	 (501,5,'Aedes Aegypti','','',true,'2022-02-08','12:53:4',1,-99),
	 (502,5,'Aedes Albopictus','','',true,'2022-02-08','12:53:4',1,-99),
	 (403,4,'Female dead','Dead Female','FD',false,'2022-02-08','12:53:4',1,-99),
	 (404,4,'Male dead','Dead Male','MD',false,'2022-02-08','12:53:4',1,-99),
	 (601,6,'[1-2]','','',true,'2022-02-08','12:53:4',1,1),
	 (602,6,'[3]','','',true,'2022-02-08','12:53:4',1,2),
	 (603,6,'[4]','','',true,'2022-02-08','12:53:4',1,3),
	 (604,6,'Pupae','','',true,'2022-02-08','12:53:4',1,4),
	 (904,9,'Ovi trap','Ovi','Ovi trap',true,'2022-02-22','23:34:46',1,-99),
	 (1001,100,'Open','Open','Open ovi trap',true,'2022-03-06','15:21:24',1,1);
INSERT INTO public.sit_tbl_opt (i_opt_id,i_opt_fth,s_opt_nme,s_opt_acr,s_opt_dsc,b_opt_stt,d_opt_rgs_dte,s_opt_rgs_tme,i_opt_rgs_prs_rol_id,i_opt_ctg) VALUES
	 (1002,100,'Close','Close','Close ovi trap',true,'2022-03-06','15:21:24',1,2),
	 (4,0,'Sex','sit_tbl_sex','Sex',false,'2022-02-08','12:53:4',1,-99),
	 (5,0,'Species','sit_tbl_spc','Species',false,'2022-02-08','12:53:4',1,-99),
	 (6,0,'Stage','sit_tbl_stg','Stage',false,'2022-02-08','12:53:4',1,-99),
	 (100,0,'Status process','sit_tbl_prc_sts','Status ovi trap',false,'2022-03-06','15:21:24',1,-99),
	 (702,7,'Tracing [eggs]','TEGS','Tracing eggs',true,'2022-02-08','12:53:4',1,-99),
	 (703,7,'Tracing [larvae]','TLRV','Tracing larvae',true,'2022-02-08','12:53:4',1,-99),
	 (7,0,'Process','sit_tbl_prc','Process ovi trap',false,'2022-02-08','12:53:4',1,-99),
	 (20,0,'Date filter','DF','Filter data',false,'2022-03-23','1:54:24',1,-99),
	 (512,5,'Culex','Culex','Culex',true,'2022-03-28','12:28:52',1,-99);
INSERT INTO public.sit_tbl_opt (i_opt_id,i_opt_fth,s_opt_nme,s_opt_acr,s_opt_dsc,b_opt_stt,d_opt_rgs_dte,s_opt_rgs_tme,i_opt_rgs_prs_rol_id,i_opt_ctg) VALUES
	 (513,5,'Culex sp. C.S. ','Culex sp. C.S. ','Culex sp. C.S. ',true,'2022-03-28','12:29:48',1,-99),
	 (514,5,'Limatus','Limatus','Limatus',true,'2022-03-28','12:30:25',1,-99),
	 (2001,20,'Date Process','PRC','Date process',true,'2022-03-23','1:56:36',1,1),
	 (2002,20,'Date Set','SET','Date set',true,'2022-03-23','1:56:36',1,2),
	 (2003,20,'Date Collected','CLC','Date colected',true,'2022-03-23','1:56:36',1,3),
	 (101,1,'Estudio Piloto para la implementación de la técnica del mosquito estéril (SIT) en Aedes aegypty Zona1, Distrito 10D01-Lita Provinvia de Imbabura','RLA5074','SIT',true,'2022-02-08','12:53:4',1,-99),
	 (102,1,'Building Capacity for Mass Rearing, Sterilization and Pilot Release of Aedes aegypti and Philornis downsi Males','ECU5032','SIT',true,'2022-02-08','12:53:4',1,-99),
	 (103,1,'Manager system','MANAGER','SIT',true,'2022-02-08','12:53:4',1,-99),
	 (405,4,'Unique','U','Unique',true,'2022-03-28','11:0:2.8',1,-99),
	 (509,5,'Chironomidae','Chironomidae','Chironomidae',true,'2022-03-28','11:4:29',1,-99);
INSERT INTO public.sit_tbl_opt (i_opt_id,i_opt_fth,s_opt_nme,s_opt_acr,s_opt_dsc,b_opt_stt,d_opt_rgs_dte,s_opt_rgs_tme,i_opt_rgs_prs_rol_id,i_opt_ctg) VALUES
	 (510,5,'Onirion','Onirion','Onirion',true,'2022-03-28','11:10:46',1,-99),
	 (511,5,'Wyeomyia','Wyeomyia','Wyeomyia',true,'2022-03-28','11:10:46',1,-99),
	 (515,5,'Onirion sp.','Onirion sp.','Onirion sp.',true,'2022-03-28','12:31:42',1,-99),
	 (516,5,'Sp.','Sp.','Sp.',true,'2022-03-28','12:32:23',1,-99),
	 (517,5,'Wyeomyia sp. C.S.','Wyeomyia sp. C.S.','Wyeomyia sp. C.S.',true,'2022-03-28','12:33:16',1,-99);