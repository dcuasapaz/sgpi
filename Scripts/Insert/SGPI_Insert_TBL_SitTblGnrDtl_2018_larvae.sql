DELETE FROM sit_tbl_gnr_dtl;
ALTER SEQUENCE sit_sqn_gnr_dtl RESTART 1;
INSERT INTO sit_tbl_gnr_dtl
			(i_gnr_dtl_id
			, i_gnr_dtl_nmb
			, i_tpe_dtl
			, i_stg_id
			, i_sex_id
			, i_gns_id
			, i_gnr_id
			, i_gnr_dtl_nmb_dd
			, i_ctn_id
			, i_prc_id
			, d_gnr_dtl_dte_prc
			, b_gnr_dtl_stt)
VALUES
(1,5,301,602,-99,-99,3,5,904,701,current_date,true),
(2,19,301,602,-99,-99,6,19,904,701,current_date,true),
(3,3,301,602,-99,-99,7,3,904,701,current_date,true),
(4,10,301,602,-99,-99,9,10,904,701,current_date,true),
(5,7,301,602,-99,-99,10,7,904,701,current_date,true),
(6,37,301,602,-99,-99,12,37,904,701,current_date,true),
(7,44,301,602,-99,-99,19,44,904,701,current_date,true),
(8,80,301,602,-99,-99,21,80,904,701,current_date,true),
(9,20,301,602,-99,-99,23,20,904,701,current_date,true),
(10,15,301,602,-99,-99,24,15,904,701,current_date,true),
(11,1,301,602,-99,-99,28,1,904,701,current_date,true),
(12,19,301,602,-99,-99,35,19,904,701,current_date,true),
(13,10,301,602,-99,-99,36,10,904,701,current_date,true),
(14,6,301,602,-99,-99,37,6,904,701,current_date,true),
(15,2,301,602,-99,-99,40,2,904,701,current_date,true),
(16,1,301,602,-99,-99,41,1,904,701,current_date,true),
(17,1,301,602,-99,-99,43,1,904,701,current_date,true),
(18,79,301,602,-99,-99,46,79,904,701,current_date,true),
(19,20,301,602,-99,-99,52,20,904,701,current_date,true),
(20,19,301,602,-99,-99,53,19,904,701,current_date,true),
(21,202,301,602,-99,-99,57,202,904,701,current_date,true),
(22,5,301,602,-99,-99,58,5,904,701,current_date,true),
(23,21,301,602,-99,-99,61,21,904,701,current_date,true),
(24,4,301,602,-99,-99,62,4,904,701,current_date,true),
(25,7,301,602,-99,-99,65,7,904,701,current_date,true),
(26,1,301,602,-99,-99,70,1,904,701,current_date,true),
(27,16,301,602,-99,-99,71,16,904,701,current_date,true),
(28,159,301,602,-99,-99,73,159,904,701,current_date,true),
(29,11,301,602,-99,-99,74,11,904,701,current_date,true),
(30,3,301,602,-99,-99,75,3,904,701,current_date,true),
(31,57,301,602,-99,-99,77,57,904,701,current_date,true),
(32,3,301,602,-99,-99,80,3,904,701,current_date,true),
(33,34,301,602,-99,-99,82,34,904,701,current_date,true),
(34,98,301,602,-99,-99,83,98,904,701,current_date,true),
(35,13,301,602,-99,-99,84,13,904,701,current_date,true),
(36,50,301,602,-99,-99,85,50,904,701,current_date,true),
(37,1,301,602,-99,-99,87,1,904,701,current_date,true),
(38,8,301,602,-99,-99,88,8,904,701,current_date,true),
(39,12,301,602,-99,-99,90,12,904,701,current_date,true),
(40,6,301,602,-99,-99,91,6,904,701,current_date,true),
(41,39,301,602,-99,-99,93,39,904,701,current_date,true),
(42,23,301,602,-99,-99,96,23,904,701,current_date,true),
(43,33,301,602,-99,-99,100,33,904,701,current_date,true),
(44,18,301,602,-99,-99,102,18,904,701,current_date,true),
(45,116,301,602,-99,-99,104,116,904,701,current_date,true),
(46,37,301,602,-99,-99,105,37,904,701,current_date,true),
(47,10,301,602,-99,-99,111,10,904,701,current_date,true),
(48,18,301,602,-99,-99,119,18,904,701,current_date,true),
(49,69,301,602,-99,-99,120,69,904,701,current_date,true),
(50,79,301,602,-99,-99,121,79,904,701,current_date,true),
(51,2,301,602,-99,-99,122,2,904,701,current_date,true),
(52,41,301,602,-99,-99,127,41,904,701,current_date,true),
(53,1,301,602,-99,-99,129,1,904,701,current_date,true),
(54,2,301,602,-99,-99,130,2,904,701,current_date,true),
(55,1,301,602,-99,-99,132,1,904,701,current_date,true),
(56,45,301,602,-99,-99,134,45,904,701,current_date,true),
(57,7,301,602,-99,-99,140,7,904,701,current_date,true),
(58,72,301,602,-99,-99,150,72,904,701,current_date,true),
(59,45,301,602,-99,-99,152,45,904,701,current_date,true),
(60,24,301,602,-99,-99,169,24,904,701,current_date,true),
(61,3,301,602,-99,-99,172,3,904,701,current_date,true),
(62,13,301,602,-99,-99,180,13,904,701,current_date,true),
(63,8,301,602,-99,-99,182,8,904,701,current_date,true),
(64,7,301,602,-99,-99,184,7,904,701,current_date,true),
(65,14,301,602,-99,-99,188,14,904,701,current_date,true),
(66,16,301,602,-99,-99,193,16,904,701,current_date,true),
(67,10,301,602,-99,-99,200,10,904,701,current_date,true),
(68,72,301,602,-99,-99,204,72,904,701,current_date,true),
(69,105,301,602,-99,-99,205,105,904,701,current_date,true),
(70,15,301,602,-99,-99,211,15,904,701,current_date,true),
(71,31,301,602,-99,-99,217,31,904,701,current_date,true),
(72,72,301,602,-99,-99,219,72,904,701,current_date,true),
(73,1,301,602,-99,-99,221,1,904,701,current_date,true),
(74,31,301,602,-99,-99,224,31,904,701,current_date,true),
(75,261,301,602,-99,-99,227,261,904,701,current_date,true),
(76,17,301,602,-99,-99,232,17,904,701,current_date,true),
(77,7,301,602,-99,-99,238,7,904,701,current_date,true),
(78,4,301,602,-99,-99,239,4,904,701,current_date,true),
(79,3,301,602,-99,-99,240,3,904,701,current_date,true),
(80,83,301,602,-99,-99,243,83,904,701,current_date,true),
(81,17,301,602,-99,-99,245,17,904,701,current_date,true),
(82,41,301,602,-99,-99,250,41,904,701,current_date,true),
(83,13,301,602,-99,-99,252,13,904,701,current_date,true),
(84,254,301,602,-99,-99,254,254,904,701,current_date,true),
(85,102,301,602,-99,-99,255,102,904,701,current_date,true),
(86,1,301,602,-99,-99,256,1,904,701,current_date,true),
(87,3,301,602,-99,-99,259,3,904,701,current_date,true),
(88,2,301,602,-99,-99,260,2,904,701,current_date,true),
(89,34,301,602,-99,-99,261,34,904,701,current_date,true),
(90,31,301,602,-99,-99,262,31,904,701,current_date,true),
(91,112,301,602,-99,-99,269,112,904,701,current_date,true),
(92,34,301,602,-99,-99,271,34,904,701,current_date,true),
(93,9,301,602,-99,-99,275,9,904,701,current_date,true),
(94,1,301,602,-99,-99,276,1,904,701,current_date,true),
(95,98,301,602,-99,-99,277,98,904,701,current_date,true),
(96,10,301,602,-99,-99,278,10,904,701,current_date,true),
(97,1,301,602,-99,-99,285,1,904,701,current_date,true),
(98,9,301,602,-99,-99,286,9,904,701,current_date,true),
(99,1,301,602,-99,-99,287,1,904,701,current_date,true),
(100,2,301,602,-99,-99,288,2,904,701,current_date,true),
(101,54,301,602,-99,-99,290,54,904,701,current_date,true),
(102,2,301,602,-99,-99,292,2,904,701,current_date,true),
(103,46,301,602,-99,-99,293,46,904,701,current_date,true),
(104,4,301,602,-99,-99,296,4,904,701,current_date,true),
(105,9,301,602,-99,-99,300,9,904,701,current_date,true),
(106,233,301,602,-99,-99,304,233,904,701,current_date,true),
(107,129,301,602,-99,-99,305,129,904,701,current_date,true),
(108,14,301,602,-99,-99,316,14,904,701,current_date,true),
(109,1,301,602,-99,-99,318,1,904,701,current_date,true),
(110,47,301,602,-99,-99,319,47,904,701,current_date,true),
(111,65,301,602,-99,-99,320,65,904,701,current_date,true),
(112,1,301,602,-99,-99,323,1,904,701,current_date,true),
(113,85,301,602,-99,-99,324,85,904,701,current_date,true),
(114,2,301,602,-99,-99,325,2,904,701,current_date,true),
(115,5,301,602,-99,-99,330,5,904,701,current_date,true),
(116,8,301,602,-99,-99,333,8,904,701,current_date,true),
(117,4,301,602,-99,-99,336,4,904,701,current_date,true),
(118,3,301,602,-99,-99,340,3,904,701,current_date,true),
(119,2,301,602,-99,-99,343,2,904,701,current_date,true),
(120,9,301,602,-99,-99,349,9,904,701,current_date,true),
(121,70,301,602,-99,-99,350,70,904,701,current_date,true),
(122,1,301,602,-99,-99,354,1,904,701,current_date,true),
(123,4,301,602,-99,-99,355,4,904,701,current_date,true),
(124,1,301,602,-99,-99,356,1,904,701,current_date,true),
(125,12,301,602,-99,-99,358,12,904,701,current_date,true),
(126,2,301,602,-99,-99,362,2,904,701,current_date,true),
(127,13,301,602,-99,-99,367,13,904,701,current_date,true),
(128,43,301,602,-99,-99,369,43,904,701,current_date,true),
(129,7,301,602,-99,-99,371,7,904,701,current_date,true),
(130,40,301,602,-99,-99,377,40,904,701,current_date,true),
(131,32,301,602,-99,-99,380,32,904,701,current_date,true),
(132,179,301,602,-99,-99,383,179,904,701,current_date,true),
(133,32,301,602,-99,-99,384,32,904,701,current_date,true),
(134,3,301,602,-99,-99,385,3,904,701,current_date,true),
(135,8,301,602,-99,-99,388,8,904,701,current_date,true),
(136,2,301,602,-99,-99,389,2,904,701,current_date,true),
(137,5,301,602,-99,-99,391,5,904,701,current_date,true),
(138,94,301,602,-99,-99,393,94,904,701,current_date,true),
(139,51,301,602,-99,-99,404,51,904,701,current_date,true),
(140,96,301,602,-99,-99,405,96,904,701,current_date,true),
(141,2,301,602,-99,-99,408,2,904,701,current_date,true),
(142,20,301,602,-99,-99,409,20,904,701,current_date,true),
(143,44,301,602,-99,-99,418,44,904,701,current_date,true),
(144,230,301,602,-99,-99,419,230,904,701,current_date,true),
(145,6,301,602,-99,-99,425,6,904,701,current_date,true),
(146,49,301,602,-99,-99,427,49,904,701,current_date,true),
(147,18,301,602,-99,-99,434,18,904,701,current_date,true),
(148,7,301,602,-99,-99,435,7,904,701,current_date,true),
(149,1,301,602,-99,-99,436,1,904,701,current_date,true),
(150,4,301,602,-99,-99,438,4,904,701,current_date,true),
(151,2,301,602,-99,-99,439,2,904,701,current_date,true),
(152,21,301,602,-99,-99,450,21,904,701,current_date,true),
(153,122,301,602,-99,-99,454,122,904,701,current_date,true),
(154,24,301,602,-99,-99,455,24,904,701,current_date,true),
(155,2,301,602,-99,-99,457,2,904,701,current_date,true),
(156,7,301,602,-99,-99,459,7,904,701,current_date,true),
(157,4,301,602,-99,-99,467,4,904,701,current_date,true),
(158,78,301,602,-99,-99,469,78,904,701,current_date,true),
(159,48,301,602,-99,-99,470,48,904,701,current_date,true),
(160,4,301,602,-99,-99,471,4,904,701,current_date,true),
(161,8,301,602,-99,-99,477,8,904,701,current_date,true),
(162,4,301,602,-99,-99,480,4,904,701,current_date,true),
(163,19,301,602,-99,-99,483,19,904,701,current_date,true),
(164,2,301,602,-99,-99,484,2,904,701,current_date,true),
(165,4,301,602,-99,-99,488,4,904,701,current_date,true),
(166,5,301,602,-99,-99,490,5,904,701,current_date,true),
(167,8,301,602,-99,-99,491,8,904,701,current_date,true),
(168,22,301,602,-99,-99,493,22,904,701,current_date,true),
(169,44,301,602,-99,-99,500,44,904,701,current_date,true),
(170,5,301,602,-99,-99,503,5,904,701,current_date,true),
(171,24,301,602,-99,-99,504,24,904,701,current_date,true),
(172,28,301,602,-99,-99,509,28,904,701,current_date,true),
(173,23,301,602,-99,-99,511,23,904,701,current_date,true),
(174,534,301,602,-99,-99,517,534,904,701,current_date,true),
(175,154,301,602,-99,-99,519,154,904,701,current_date,true),
(176,22,301,602,-99,-99,520,22,904,701,current_date,true),
(177,52,301,602,-99,-99,527,52,904,701,current_date,true),
(178,2,301,602,-99,-99,530,2,904,701,current_date,true),
(179,32,301,602,-99,-99,533,32,904,701,current_date,true),
(180,18,301,602,-99,-99,541,18,904,701,current_date,true),
(181,1,301,602,-99,-99,559,1,904,701,current_date,true),
(182,10,301,602,-99,-99,561,10,904,701,current_date,true),
(183,142,301,602,-99,-99,567,142,904,701,current_date,true),
(184,143,301,602,-99,-99,569,143,904,701,current_date,true),
(185,28,301,602,-99,-99,570,28,904,701,current_date,true),
(186,53,301,602,-99,-99,577,53,904,701,current_date,true),
(187,33,301,602,-99,-99,580,33,904,701,current_date,true),
(188,3,301,602,-99,-99,583,3,904,701,current_date,true),
(189,2,301,602,-99,-99,585,2,904,701,current_date,true),
(190,11,301,602,-99,-99,591,11,904,701,current_date,true),
(191,15,301,602,-99,-99,592,15,904,701,current_date,true),
(192,3,301,602,-99,-99,593,3,904,701,current_date,true),
(193,7,301,602,-99,-99,595,7,904,701,current_date,true),
(194,17,301,602,-99,-99,597,17,904,701,current_date,true),
(195,7,301,602,-99,-99,600,7,904,701,current_date,true),
(196,13,301,602,-99,-99,604,13,904,701,current_date,true),
(197,3,301,602,-99,-99,605,3,904,701,current_date,true),
(198,1,301,602,-99,-99,610,1,904,701,current_date,true),
(199,27,301,602,-99,-99,611,27,904,701,current_date,true),
(200,152,301,602,-99,-99,619,152,904,701,current_date,true),
(201,63,301,602,-99,-99,620,63,904,701,current_date,true),
(202,7,301,602,-99,-99,627,7,904,701,current_date,true),
(203,11,301,602,-99,-99,630,11,904,701,current_date,true),
(204,2,301,602,-99,-99,632,2,904,701,current_date,true),
(205,24,301,602,-99,-99,642,24,904,701,current_date,true),
(206,3,301,602,-99,-99,643,3,904,701,current_date,true),
(207,36,301,602,-99,-99,650,36,904,701,current_date,true),
(208,1,301,602,-99,-99,657,1,904,701,current_date,true),
(209,9,301,602,-99,-99,659,9,904,701,current_date,true),
(210,45,301,602,-99,-99,669,45,904,701,current_date,true),
(211,46,301,602,-99,-99,671,46,904,701,current_date,true),
(212,1,301,602,-99,-99,672,1,904,701,current_date,true),
(213,19,301,602,-99,-99,677,19,904,701,current_date,true),
(214,21,301,602,-99,-99,678,21,904,701,current_date,true),
(215,44,301,602,-99,-99,681,44,904,701,current_date,true),
(216,4,301,602,-99,-99,685,4,904,701,current_date,true),
(217,5,301,602,-99,-99,691,5,904,701,current_date,true),
(218,21,301,602,-99,-99,695,21,904,701,current_date,true),
(219,9,301,602,-99,-99,696,9,904,701,current_date,true),
(220,9,301,602,-99,-99,698,9,904,701,current_date,true),
(221,9,301,602,-99,-99,704,9,904,701,current_date,true),
(222,179,301,602,-99,-99,706,179,904,701,current_date,true),
(223,8,301,602,-99,-99,711,8,904,701,current_date,true),
(224,1,301,602,-99,-99,718,1,904,701,current_date,true),
(225,70,301,602,-99,-99,719,70,904,701,current_date,true),
(226,73,301,602,-99,-99,721,73,904,701,current_date,true),
(227,10,301,602,-99,-99,722,10,904,701,current_date,true),
(228,26,301,602,-99,-99,726,26,904,701,current_date,true),
(229,50,301,602,-99,-99,729,50,904,701,current_date,true),
(230,8,301,602,-99,-99,732,8,904,701,current_date,true),
(231,15,301,602,-99,-99,741,15,904,701,current_date,true),
(232,3,301,602,-99,-99,742,3,904,701,current_date,true),
(233,9,301,602,-99,-99,745,9,904,701,current_date,true),
(234,2,301,602,-99,-99,747,2,904,701,current_date,true),
(235,1,301,602,-99,-99,748,1,904,701,current_date,true),
(236,4,301,602,-99,-99,754,4,904,701,current_date,true),
(237,86,301,602,-99,-99,758,86,904,701,current_date,true),
(238,10,301,602,-99,-99,763,10,904,701,current_date,true),
(239,27,301,602,-99,-99,765,27,904,701,current_date,true),
(240,5,301,602,-99,-99,772,5,904,701,current_date,true),
(241,106,301,602,-99,-99,773,106,904,701,current_date,true),
(242,113,301,602,-99,-99,778,113,904,701,current_date,true),
(243,61,301,602,-99,-99,786,61,904,701,current_date,true),
(244,3,301,602,-99,-99,787,3,904,701,current_date,true),
(245,1,301,602,-99,-99,788,1,904,701,current_date,true),
(246,1,301,602,-99,-99,794,1,904,701,current_date,true),
(247,18,301,602,-99,-99,797,18,904,701,current_date,true),
(248,51,301,602,-99,-99,806,51,904,701,current_date,true),
(249,23,301,602,-99,-99,810,23,904,701,current_date,true),
(250,2,301,602,-99,-99,815,2,904,701,current_date,true),
(251,1,301,602,-99,-99,817,1,904,701,current_date,true),
(252,2,301,602,-99,-99,823,2,904,701,current_date,true),
(253,102,301,602,-99,-99,825,102,904,701,current_date,true),
(254,113,301,602,-99,-99,830,113,904,701,current_date,true),
(255,5,301,602,-99,-99,831,5,904,701,current_date,true),
(256,23,301,602,-99,-99,833,23,904,701,current_date,true),
(257,10,301,602,-99,-99,836,10,904,701,current_date,true),
(258,2,301,602,-99,-99,838,2,904,701,current_date,true),
(259,7,301,602,-99,-99,840,7,904,701,current_date,true),
(260,18,301,602,-99,-99,846,18,904,701,current_date,true),
(261,63,301,602,-99,-99,848,63,904,701,current_date,true),
(262,4,301,602,-99,-99,849,4,904,701,current_date,true),
(263,1,301,602,-99,-99,853,1,904,701,current_date,true),
(264,21,301,602,-99,-99,858,21,904,701,current_date,true),
(265,3,301,602,-99,-99,859,3,904,701,current_date,true),
(266,2,301,602,-99,-99,867,2,904,701,current_date,true),
(267,12,301,602,-99,-99,869,12,904,701,current_date,true),
(268,1,301,602,-99,-99,876,1,904,701,current_date,true),
(269,77,301,602,-99,-99,877,77,904,701,current_date,true),
(270,10,301,602,-99,-99,878,10,904,701,current_date,true),
(271,73,301,602,-99,-99,882,73,904,701,current_date,true),
(272,8,301,602,-99,-99,885,8,904,701,current_date,true),
(273,36,301,602,-99,-99,888,36,904,701,current_date,true),
(274,10,301,602,-99,-99,891,10,904,701,current_date,true),
(275,12,301,602,-99,-99,892,12,904,701,current_date,true),
(276,9,301,602,-99,-99,898,9,904,701,current_date,true),
(277,26,301,602,-99,-99,900,26,904,701,current_date,true),
(278,4,301,602,-99,-99,901,4,904,701,current_date,true),
(279,1,301,602,-99,-99,903,1,904,701,current_date,true),
(280,11,301,602,-99,-99,907,11,904,701,current_date,true),
(281,28,301,602,-99,-99,910,28,904,701,current_date,true),
(282,70,301,602,-99,-99,914,70,904,701,current_date,true),
(283,1,301,602,-99,-99,915,1,904,701,current_date,true),
(284,13,301,602,-99,-99,919,13,904,701,current_date,true),
(285,34,301,602,-99,-99,921,34,904,701,current_date,true),
(286,3,301,602,-99,-99,926,3,904,701,current_date,true),
(287,18,301,602,-99,-99,927,18,904,701,current_date,true),
(288,38,301,602,-99,-99,934,38,904,701,current_date,true),
(289,46,301,602,-99,-99,937,46,904,701,current_date,true),
(290,1,301,602,-99,-99,941,1,904,701,current_date,true),
(291,4,301,602,-99,-99,943,4,904,701,current_date,true),
(292,6,301,602,-99,-99,946,6,904,701,current_date,true),
(293,6,301,602,-99,-99,947,6,904,701,current_date,true),
(294,3,301,602,-99,-99,949,3,904,701,current_date,true),
(295,5,301,602,-99,-99,950,5,904,701,current_date,true),
(296,26,301,602,-99,-99,953,26,904,701,current_date,true),
(297,67,301,602,-99,-99,955,67,904,701,current_date,true),
(298,16,301,602,-99,-99,959,16,904,701,current_date,true),
(299,43,301,602,-99,-99,962,43,904,701,current_date,true),
(300,73,301,602,-99,-99,966,73,904,701,current_date,true),
(301,23,301,602,-99,-99,971,23,904,701,current_date,true),
(302,48,301,602,-99,-99,973,48,904,701,current_date,true),
(303,14,301,602,-99,-99,979,14,904,701,current_date,true),
(304,5,301,602,-99,-99,980,5,904,701,current_date,true),
(305,2,301,602,-99,-99,983,2,904,701,current_date,true),
(306,1,301,602,-99,-99,984,1,904,701,current_date,true),
(307,4,301,602,-99,-99,987,4,904,701,current_date,true),
(308,25,301,602,-99,-99,992,25,904,701,current_date,true),
(309,2,301,602,-99,-99,995,2,904,701,current_date,true),
(310,4,301,602,-99,-99,1002,4,904,701,current_date,true),
(311,1,301,602,-99,-99,1006,1,904,701,current_date,true),
(312,19,301,602,-99,-99,1007,19,904,701,current_date,true),
(313,5,301,602,-99,-99,1009,5,904,701,current_date,true),
(314,1,301,602,-99,-99,1020,1,904,701,current_date,true),
(315,2,301,602,-99,-99,1024,2,904,701,current_date,true),
(316,163,301,602,-99,-99,1033,163,904,701,current_date,true),
(317,33,301,602,-99,-99,1034,33,904,701,current_date,true),
(318,17,301,602,-99,-99,1035,17,904,701,current_date,true),
(319,5,301,602,-99,-99,1039,5,904,701,current_date,true),
(320,4,301,602,-99,-99,1041,4,904,701,current_date,true),
(321,5,301,602,-99,-99,1045,5,904,701,current_date,true),
(322,4,301,602,-99,-99,1046,4,904,701,current_date,true),
(323,4,301,602,-99,-99,1048,4,904,701,current_date,true),
(324,4,301,602,-99,-99,1049,4,904,701,current_date,true),
(325,2,301,602,-99,-99,1050,2,904,701,current_date,true),
(326,1,301,602,-99,-99,1051,1,904,701,current_date,true),
(327,6,301,602,-99,-99,1052,6,904,701,current_date,true),
(328,4,301,602,-99,-99,1053,4,904,701,current_date,true),
(329,5,301,602,-99,-99,1055,5,904,701,current_date,true),
(330,8,301,602,-99,-99,1057,8,904,701,current_date,true),
(331,1,301,602,-99,-99,1058,1,904,701,current_date,true),
(332,16,301,602,-99,-99,1067,16,904,701,current_date,true),
(333,1,301,602,-99,-99,1072,1,904,701,current_date,true),
(334,2,301,602,-99,-99,1074,2,904,701,current_date,true),
(335,4,301,602,-99,-99,1078,4,904,701,current_date,true),
(336,1,301,602,-99,-99,1079,1,904,701,current_date,true),
(337,1,301,602,-99,-99,1081,1,904,701,current_date,true),
(338,1,301,602,-99,-99,1082,1,904,701,current_date,true),
(339,22,301,602,-99,-99,1084,22,904,701,current_date,true),
(340,3,301,602,-99,-99,1085,3,904,701,current_date,true),
(341,143,301,602,-99,-99,1088,143,904,701,current_date,true),
(342,2,301,602,-99,-99,1089,2,904,701,current_date,true),
(343,3,301,602,-99,-99,1091,3,904,701,current_date,true),
(344,18,301,602,-99,-99,1094,18,904,701,current_date,true),
(345,2,301,602,-99,-99,1095,2,904,701,current_date,true),
(346,8,301,602,-99,-99,1098,8,904,701,current_date,true),
(347,25,301,602,-99,-99,1101,25,904,701,current_date,true),
(348,5,301,602,-99,-99,1102,5,904,701,current_date,true),
(349,1,301,602,-99,-99,1106,1,904,701,current_date,true),
(350,1,301,602,-99,-99,1119,1,904,701,current_date,true),
(351,17,301,602,-99,-99,1132,17,904,701,current_date,true),
(352,80,301,602,-99,-99,1133,80,904,701,current_date,true),
(353,27,301,602,-99,-99,1135,27,904,701,current_date,true),
(354,1,301,602,-99,-99,1136,1,904,701,current_date,true),
(355,1,301,602,-99,-99,1141,1,904,701,current_date,true),
(356,17,301,602,-99,-99,1144,17,904,701,current_date,true),
(357,1,301,602,-99,-99,1150,1,904,701,current_date,true),
(358,4,301,602,-99,-99,1153,4,904,701,current_date,true),
(359,1,301,602,-99,-99,1154,1,904,701,current_date,true),
(360,11,301,602,-99,-99,1155,11,904,701,current_date,true),
(361,18,301,602,-99,-99,1157,18,904,701,current_date,true),
(362,1,301,602,-99,-99,1168,1,904,701,current_date,true),
(363,65,301,602,-99,-99,1172,65,904,701,current_date,true),
(364,3,301,602,-99,-99,1173,3,904,701,current_date,true),
(365,2,301,602,-99,-99,1176,2,904,701,current_date,true),
(366,11,301,602,-99,-99,1181,11,904,701,current_date,true),
(367,7,301,602,-99,-99,1182,7,904,701,current_date,true),
(368,63,301,602,-99,-99,1183,63,904,701,current_date,true),
(369,19,301,602,-99,-99,1184,19,904,701,current_date,true),
(370,12,301,602,-99,-99,1185,12,904,701,current_date,true),
(371,5,301,602,-99,-99,1191,5,904,701,current_date,true),
(372,5,301,602,-99,-99,1194,5,904,701,current_date,true),
(373,3,301,602,-99,-99,1198,3,904,701,current_date,true),
(374,1,301,602,-99,-99,1200,1,904,701,current_date,true),
(375,3,301,602,-99,-99,1202,3,904,701,current_date,true),
(376,1,301,602,-99,-99,1203,1,904,701,current_date,true),
(377,4,301,602,-99,-99,1205,4,904,701,current_date,true),
(378,5,301,602,-99,-99,1206,5,904,701,current_date,true),
(379,42,301,602,-99,-99,1207,42,904,701,current_date,true),
(380,7,301,602,-99,-99,1218,7,904,701,current_date,true),
(381,36,301,602,-99,-99,1219,36,904,701,current_date,true),
(382,11,301,602,-99,-99,1222,11,904,701,current_date,true),
(383,2,301,602,-99,-99,1223,2,904,701,current_date,true),
(384,7,301,602,-99,-99,1231,7,904,701,current_date,true),
(385,146,301,602,-99,-99,1233,146,904,701,current_date,true),
(386,19,301,602,-99,-99,1234,19,904,701,current_date,true),
(387,2,301,602,-99,-99,1237,2,904,701,current_date,true),
(388,80,301,602,-99,-99,1238,80,904,701,current_date,true),
(389,10,301,602,-99,-99,1239,10,904,701,current_date,true),
(390,16,301,602,-99,-99,1241,16,904,701,current_date,true),
(391,4,301,602,-99,-99,1244,4,904,701,current_date,true),
(392,22,301,602,-99,-99,1248,22,904,701,current_date,true),
(393,6,301,602,-99,-99,1250,6,904,701,current_date,true),
(394,1,301,602,-99,-99,1252,1,904,701,current_date,true),
(395,30,301,602,-99,-99,1255,30,904,701,current_date,true),
(396,6,301,602,-99,-99,1256,6,904,701,current_date,true),
(397,4,301,602,-99,-99,1262,4,904,701,current_date,true),
(398,11,301,602,-99,-99,1268,11,904,701,current_date,true),
(399,3,301,602,-99,-99,1271,3,904,701,current_date,true),
(400,1,301,602,-99,-99,1273,1,904,701,current_date,true),
(401,35,301,602,-99,-99,1275,35,904,701,current_date,true),
(402,7,301,602,-99,-99,1276,7,904,701,current_date,true),
(403,4,301,602,-99,-99,1281,4,904,701,current_date,true),
(404,36,301,602,-99,-99,1283,36,904,701,current_date,true),
(405,28,301,602,-99,-99,1284,28,904,701,current_date,true),
(406,6,301,602,-99,-99,1285,6,904,701,current_date,true),
(407,50,301,602,-99,-99,1288,50,904,701,current_date,true),
(408,22,301,602,-99,-99,1291,22,904,701,current_date,true),
(409,15,301,602,-99,-99,1294,15,904,701,current_date,true),
(410,17,301,602,-99,-99,1296,17,904,701,current_date,true),
(411,82,301,602,-99,-99,1298,82,904,701,current_date,true),
(412,23,301,602,-99,-99,1299,23,904,701,current_date,true),
(413,21,301,602,-99,-99,1300,21,904,701,current_date,true),
(414,13,301,602,-99,-99,1301,13,904,701,current_date,true),
(415,4,301,602,-99,-99,1303,4,904,701,current_date,true),
(416,4,301,602,-99,-99,1304,4,904,701,current_date,true),
(417,2,301,602,-99,-99,1306,2,904,701,current_date,true),
(418,4,301,602,-99,-99,1307,4,904,701,current_date,true),
(419,5,301,602,-99,-99,1319,5,904,701,current_date,true),
(420,1,301,602,-99,-99,1322,1,904,701,current_date,true),
(421,19,301,602,-99,-99,1324,19,904,701,current_date,true),
(422,9,301,602,-99,-99,1327,9,904,701,current_date,true),
(423,348,301,602,-99,-99,1333,348,904,701,current_date,true),
(424,4,301,602,-99,-99,1335,4,904,701,current_date,true),
(425,11,301,602,-99,-99,1339,11,904,701,current_date,true),
(426,33,301,602,-99,-99,1341,33,904,701,current_date,true),
(427,1,301,602,-99,-99,1344,1,904,701,current_date,true),
(428,33,301,602,-99,-99,1347,33,904,701,current_date,true),
(429,10,301,602,-99,-99,1350,10,904,701,current_date,true),
(430,18,301,602,-99,-99,1352,18,904,701,current_date,true),
(431,1,301,602,-99,-99,1353,1,904,701,current_date,true),
(432,13,301,602,-99,-99,1355,13,904,701,current_date,true),
(433,3,301,602,-99,-99,1356,3,904,701,current_date,true),
(434,3,301,602,-99,-99,1358,3,904,701,current_date,true),
(435,42,301,602,-99,-99,1368,42,904,701,current_date,true),
(436,1,301,602,-99,-99,1369,1,904,701,current_date,true),
(437,9,301,602,-99,-99,1373,9,904,701,current_date,true),
(438,3,301,602,-99,-99,1375,3,904,701,current_date,true),
(439,50,301,602,-99,-99,1383,50,904,701,current_date,true),
(440,2,301,602,-99,-99,1385,2,904,701,current_date,true),
(441,20,301,602,-99,-99,1387,20,904,701,current_date,true),
(442,20,301,602,-99,-99,1388,20,904,701,current_date,true),
(443,42,301,602,-99,-99,1394,42,904,701,current_date,true),
(444,15,301,602,-99,-99,1397,15,904,701,current_date,true),
(445,75,301,602,-99,-99,1399,75,904,701,current_date,true),
(446,20,301,602,-99,-99,1400,20,904,701,current_date,true),
(447,9,301,602,-99,-99,1402,9,904,701,current_date,true),
(448,3,301,602,-99,-99,1403,3,904,701,current_date,true),
(449,6,301,602,-99,-99,1405,6,904,701,current_date,true),
(450,13,301,602,-99,-99,1418,13,904,701,current_date,true),
(451,15,301,602,-99,-99,1419,15,904,701,current_date,true),
(452,6,301,602,-99,-99,1430,6,904,701,current_date,true),
(453,14,301,602,-99,-99,1433,14,904,701,current_date,true),
(454,34,301,602,-99,-99,1434,34,904,701,current_date,true),
(455,152,301,602,-99,-99,1438,152,904,701,current_date,true);
SELECT  * FROM sit_tbl_gnr AS stg ORDER by 1; 
