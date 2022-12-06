
package com.papacekb.kbignum

import com.papacekb.kbignum.KRoundingMode.*
import kotlin.test.Test
import kotlin.test.assertEquals

class KBigDecimalTest {

	@Test fun `test abs`() {
		assertEquals(KBigDecimal("393919585.30622816"), KBigDecimal("393919585.30622816").abs())
		assertEquals(KBigDecimal("30531286.34009196"), KBigDecimal("-30531286.34009196").abs())
		assertEquals(KBigDecimal("123913027.61034068"), KBigDecimal("-123913027.61034068").abs())
		assertEquals(KBigDecimal("162753143.34959796"), KBigDecimal("162753143.34959796").abs())
		assertEquals(KBigDecimal("921590768.1686195"), KBigDecimal("921590768.1686195").abs())
		assertEquals(KBigDecimal("145745779.6790626"), KBigDecimal("-145745779.6790626").abs())
		assertEquals(KBigDecimal("70317764.87285122"), KBigDecimal("70317764.87285122").abs())
		assertEquals(KBigDecimal("1661038841.101269"), KBigDecimal("1661038841.101269").abs())
		assertEquals(KBigDecimal("760465917.2898978"), KBigDecimal("760465917.2898978").abs())
		assertEquals(KBigDecimal("469984441.8983958"), KBigDecimal("-469984441.8983958").abs())
		assertEquals(KBigDecimal("867741650.7651018"), KBigDecimal("867741650.7651018").abs())
	}

	@Test fun `test add`() {
		assertEquals(KBigDecimal("53773381.975441814"), KBigDecimal("32044793.83639586").add(KBigDecimal("21728588.139045954")))
		assertEquals(KBigDecimal("654725712.51630475"), KBigDecimal("915468457.5287482").add(KBigDecimal("-260742745.01244345")))
		assertEquals(KBigDecimal("-1101873527.110565595"), KBigDecimal("-58441531.832493395").add(KBigDecimal("-1043431995.2780722")))
		assertEquals(KBigDecimal("-239781758.915133321"), KBigDecimal("-13877414.238908881").add(KBigDecimal("-225904344.67622444")))
		assertEquals(KBigDecimal("76847430.72036617"), KBigDecimal("154790954.31896952").add(KBigDecimal("-77943523.59860335")))
		assertEquals(KBigDecimal("-1047105080.08333136"), KBigDecimal("373483849.24186164").add(KBigDecimal("-1420588929.325193")))
		assertEquals(KBigDecimal("-772974322.0491940"), KBigDecimal("-218286674.9931462").add(KBigDecimal("-554687647.0560478")))
		assertEquals(KBigDecimal("-985911397.2391039"), KBigDecimal("358827641.9897183").add(KBigDecimal("-1344739039.2288222")))
		assertEquals(KBigDecimal("-961251045.02051196"), KBigDecimal("-693912725.4492887").add(KBigDecimal("-267338319.57122326")))
		assertEquals(KBigDecimal("-272907693.42767717"), KBigDecimal("77511252.15684597").add(KBigDecimal("-350418945.58452314")))
		assertEquals(KBigDecimal("-810844208.87220888"), KBigDecimal("-102705200.27920488").add(KBigDecimal("-708139008.593004")))
	}

	@Test fun `test add with MathContext`() {
		assertEquals(KBigDecimal("-1.150267E+9"), KBigDecimal("-675844085.4233485").add(KBigDecimal("-474423814.94483757"), KMathContext(7, CEILING)))
		assertEquals(KBigDecimal("-4.02E+8"), KBigDecimal("759876622.173756").add(KBigDecimal("-1161332847.470284"), KMathContext(3, FLOOR)))
		assertEquals(KBigDecimal("1.0627530E+9"), KBigDecimal("924565987.3278322").add(KBigDecimal("138187048.76235235"), KMathContext(8, HALF_UP)))
		assertEquals(KBigDecimal("-9.9401E+8"), KBigDecimal("-1406996614.7088475").add(KBigDecimal("412990833.2978394"), KMathContext(5, HALF_UP)))
		assertEquals(KBigDecimal("373407336"), KBigDecimal("728625410.9706949").add(KBigDecimal("-355218074.3232708"), KMathContext(9, DOWN)))
		assertEquals(KBigDecimal("9.9613069E+8"), KBigDecimal("-379804388.84803605").add(KBigDecimal("1375935074.0174305"), KMathContext(8, CEILING)))
		assertEquals(KBigDecimal("4E+8"), KBigDecimal("199199851.7758977").add(KBigDecimal("157505219.99844605"), KMathContext(1, HALF_UP)))
		assertEquals(KBigDecimal("-7.7595186E+8"), KBigDecimal("-1128584244.777766").add(KBigDecimal("352632385.3791467"), KMathContext(8, FLOOR)))
		assertEquals(KBigDecimal("1.1463995E+9"), KBigDecimal("354109522.14027476").add(KBigDecimal("792289997.9249882"), KMathContext(8, FLOOR)))
		assertEquals(KBigDecimal("-1.2332E+8"), KBigDecimal("-244105627.82623768").add(KBigDecimal("120793866.86782597"), KMathContext(5, UP)))
		assertEquals(KBigDecimal("-9.9467E+8"), KBigDecimal("-522341963.14925516").add(KBigDecimal("-472325589.02161324"), KMathContext(5, HALF_UP)))
	}

	@Test fun `test byteValueExact`() {
		assertEquals(72, KBigDecimal("72").byteValueExact())
		assertEquals(59, KBigDecimal("59").byteValueExact())
		assertEquals(29, KBigDecimal("29").byteValueExact())
		assertEquals(18, KBigDecimal("18").byteValueExact())
		assertEquals(51, KBigDecimal("51").byteValueExact())
		assertEquals(106, KBigDecimal("106").byteValueExact())
		assertEquals(65, KBigDecimal("65").byteValueExact())
		assertEquals(62, KBigDecimal("62").byteValueExact())
		assertEquals(20, KBigDecimal("20").byteValueExact())
		assertEquals(120, KBigDecimal("120").byteValueExact())
		assertEquals(102, KBigDecimal("102").byteValueExact())
	}

	@Test fun `test compareTo`() {
		assertEquals(-1, KBigDecimal("-1987366745.735004").compareTo(KBigDecimal("1532720383.0334692")))
		assertEquals(-1, KBigDecimal("48459854.89932831").compareTo(KBigDecimal("321083998.9309351")))
		assertEquals(1, KBigDecimal("225962754.02090982").compareTo(KBigDecimal("-1266423576.2920516")))
		assertEquals(-1, KBigDecimal("-1480092603.164552").compareTo(KBigDecimal("-301815131.6093003")))
		assertEquals(1, KBigDecimal("1248142295.7913146").compareTo(KBigDecimal("-65050221.219195716")))
		assertEquals(1, KBigDecimal("-62123668.29174668").compareTo(KBigDecimal("-85915376.8071935")))
		assertEquals(1, KBigDecimal("-43275132.53834329").compareTo(KBigDecimal("-899174023.5905468")))
		assertEquals(-1, KBigDecimal("265351784.69772485").compareTo(KBigDecimal("485928848.38122064")))
		assertEquals(-1, KBigDecimal("-221951697.29020488").compareTo(KBigDecimal("-43716713.966554575")))
		assertEquals(1, KBigDecimal("1173948479.8083522").compareTo(KBigDecimal("810866827.7721366")))
		assertEquals(1, KBigDecimal("671265804.2521101").compareTo(KBigDecimal("484266794.03624797")))
	}

	@Test fun `test divide`() {
		assertEquals(KBigDecimal("-234389111.613789"), KBigDecimal("-15704070478.123863").divide(KBigDecimal("67")))
		assertEquals(KBigDecimal("294249715.81120044"), KBigDecimal("6473493747.84640968").divide(KBigDecimal("22")))
		assertEquals(KBigDecimal("-256114251.21327978"), KBigDecimal("-22025825604.34206108").divide(KBigDecimal("86")))
		assertEquals(KBigDecimal("-785784224.1794043"), KBigDecimal("-75435285521.2228128").divide(KBigDecimal("96")))
		assertEquals(KBigDecimal("-174262417.4431698"), KBigDecimal("-5402134940.7382638").divide(KBigDecimal("31")))
		assertEquals(KBigDecimal("-46815745.613711484"), KBigDecimal("-1170393640.342787100").divide(KBigDecimal("25")))
		assertEquals(KBigDecimal("-48733354.515817225"), KBigDecimal("-1754400762.569420100").divide(KBigDecimal("36")))
		assertEquals(KBigDecimal("263461231.08073908"), KBigDecimal("16598057558.08656204").divide(KBigDecimal("63")))
		assertEquals(KBigDecimal("-115632612.5938839"), KBigDecimal("-2081387026.6899102").divide(KBigDecimal("18")))
		assertEquals(KBigDecimal("73960425.33809933"), KBigDecimal("7100200832.45753568").divide(KBigDecimal("96")))
		assertEquals(KBigDecimal("881418551.859444"), KBigDecimal("48478020352.269420").divide(KBigDecimal("55")))
	}

	@Test fun `test divide with rounding mode`() {
		assertEquals(KBigDecimal("6.767745"), KBigDecimal("1480823056.843158").divide(KBigDecimal("218805968.26770258"), HALF_DOWN))
		assertEquals(KBigDecimal("6.32869147"), KBigDecimal("-114075683.93385269").divide(KBigDecimal("-18025161.200536225"), HALF_DOWN))
		assertEquals(KBigDecimal("22.6244499"), KBigDecimal("909140873.6147215").divide(KBigDecimal("40183999.0187007"), FLOOR))
		assertEquals(KBigDecimal("1.7820177"), KBigDecimal("1298872479.0962298").divide(KBigDecimal("728877430.1486664"), HALF_DOWN))
		assertEquals(KBigDecimal("-0.33476562"), KBigDecimal("18147998.73683848").divide(KBigDecimal("-54211060.0672527"), FLOOR))
		assertEquals(KBigDecimal("0.46328125"), KBigDecimal("-254964721.59129804").divide(KBigDecimal("-550345435.2300467"), HALF_UP))
		assertEquals(KBigDecimal("1.06437206"), KBigDecimal("-294148612.06468046").divide(KBigDecimal("-276358823.690559"), DOWN))
		assertEquals(KBigDecimal("-1.4676572"), KBigDecimal("-292353598.6409018").divide(KBigDecimal("199197463.1572587"), HALF_UP))
		assertEquals(KBigDecimal("-5.1666803"), KBigDecimal("778374847.6050745").divide(KBigDecimal("-150652795.90001202"), CEILING))
		assertEquals(KBigDecimal("-0.3961429"), KBigDecimal("-571228995.7521011").divide(KBigDecimal("1441976860.8424008"), DOWN))
		assertEquals(KBigDecimal("-3.1837349"), KBigDecimal("-235813042.5722397").divide(KBigDecimal("74068051.56425187"), HALF_EVEN))
	}

	@Test fun `test divide with MathContext`() {
		assertEquals(KBigDecimal("-0.161586"), KBigDecimal("67292179.71385333").divide(KBigDecimal("-416447777.4133185"), KMathContext(6, HALF_UP)))
		assertEquals(KBigDecimal("-0.677715"), KBigDecimal("-785212155.7348468").divide(KBigDecimal("1158616935.3838212"), KMathContext(6, HALF_EVEN)))
		assertEquals(KBigDecimal("-1.1145"), KBigDecimal("-1160812480.4163346").divide(KBigDecimal("1041558883.1254534"), KMathContext(5, HALF_EVEN)))
		assertEquals(KBigDecimal("0.091638"), KBigDecimal("-28852079.859152712").divide(KBigDecimal("-314848860.1390203"), KMathContext(5, HALF_DOWN)))
		assertEquals(KBigDecimal("-0.0967808861"), KBigDecimal("-33341244.8754943").divide(KBigDecimal("344502372.5551315"), KMathContext(9, HALF_UP)))
		assertEquals(KBigDecimal("0.511"), KBigDecimal("152796620.5265021").divide(KBigDecimal("299086193.5363742"), KMathContext(3, HALF_EVEN)))
		assertEquals(KBigDecimal("0.322690112"), KBigDecimal("251835260.28429908").divide(KBigDecimal("780424471.6630119"), KMathContext(9, DOWN)))
		assertEquals(KBigDecimal("0.60429"), KBigDecimal("321943312.85114264").divide(KBigDecimal("532764659.1024282"), KMathContext(5, HALF_UP)))
		assertEquals(KBigDecimal("-2.4"), KBigDecimal("1598230603.4288957").divide(KBigDecimal("-640537007.7833391"), KMathContext(2, CEILING)))
		assertEquals(KBigDecimal("-0.66368"), KBigDecimal("28655590.948701665").divide(KBigDecimal("-43176888.62237175"), KMathContext(5, HALF_DOWN)))
		assertEquals(KBigDecimal("0.57"), KBigDecimal("-740028390.0913398").divide(KBigDecimal("-1298525333.7510824"), KMathContext(2, UP)))
	}

	@Test fun `test divideAndRemainder`() {
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("-616411711.6696488")), KBigDecimal("-616411711.6696488").divideAndRemainder(KBigDecimal("-983414101.7316797")).asList())
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("-1100382354.8894994")), KBigDecimal("-1100382354.8894994").divideAndRemainder(KBigDecimal("-1691669429.3073933")).asList())
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("-618912081.2111459")), KBigDecimal("-618912081.2111459").divideAndRemainder(KBigDecimal("-1204122938.0918758")).asList())
		assertEquals(listOf(KBigDecimal("4"), KBigDecimal("-85532108.80477764")), KBigDecimal("-804913114.2039962").divideAndRemainder(KBigDecimal("-179845251.34980464")).asList())
		assertEquals(listOf(KBigDecimal("55"), KBigDecimal("-4679364.234959165")), KBigDecimal("-283174860.9817285").divideAndRemainder(KBigDecimal("-5063554.486304897")).asList())
		assertEquals(listOf(KBigDecimal("-12"), KBigDecimal("32923126.3673095")), KBigDecimal("740691742.7480755").divideAndRemainder(KBigDecimal("-58980718.0317305")).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("-339687472.78843176")), KBigDecimal("-339687472.78843176").divideAndRemainder(KBigDecimal("-751658598.0478812")).asList())
		assertEquals(listOf(KBigDecimal("32"), KBigDecimal("-33617502.702848880")), KBigDecimal("-1544090175.4625332").divideAndRemainder(KBigDecimal("-47202271.023740135")).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("-5052669.751661858")), KBigDecimal("-5052669.751661858").divideAndRemainder(KBigDecimal("-482809798.95607054")).asList())
		assertEquals(listOf(KBigDecimal("-9"), KBigDecimal("-54070931.59720385")), KBigDecimal("-1036817068.4974607").divideAndRemainder(KBigDecimal("109194015.21113965")).asList())
		assertEquals(listOf(KBigDecimal("2"), KBigDecimal("29357715.32680318")), KBigDecimal("938520396.9244549").divideAndRemainder(KBigDecimal("454581340.79882586")).asList())
	}

	@Test fun `test divideAndRemainder with MathContext`() {
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("42717969.40366649")), KBigDecimal("42717969.40366649").divideAndRemainder(KBigDecimal("-1590727659.9535892"), KMathContext(3, UP)).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("-324530096.98066115")), KBigDecimal("-324530096.98066115").divideAndRemainder(KBigDecimal("447661384.4024426"), KMathContext(5, HALF_EVEN)).asList())
		assertEquals(listOf(KBigDecimal("0.00"), KBigDecimal("25553502.832766782")), KBigDecimal("25553502.832766782").divideAndRemainder(KBigDecimal("648425442.8635095"), KMathContext(1, CEILING)).asList())
		assertEquals(listOf(KBigDecimal("-1.0"), KBigDecimal("-427926592.8390291")), KBigDecimal("-1007909352.8882061").divideAndRemainder(KBigDecimal("579982760.049177"), KMathContext(5, HALF_UP)).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("212299470.94247726")), KBigDecimal("212299470.94247726").divideAndRemainder(KBigDecimal("1018749155.5705159"), KMathContext(7, FLOOR)).asList())
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("185739914.30591717")), KBigDecimal("185739914.30591717").divideAndRemainder(KBigDecimal("454240870.06959987"), KMathContext(4, HALF_DOWN)).asList())
		assertEquals(listOf(KBigDecimal("2"), KBigDecimal("-75753770.2429225")), KBigDecimal("-829736041.1504835").divideAndRemainder(KBigDecimal("-376991135.4537805"), KMathContext(2, HALF_DOWN)).asList())
		assertEquals(listOf(KBigDecimal("-4"), KBigDecimal("-204400783.88747332")), KBigDecimal("-1498939511.9978392").divideAndRemainder(KBigDecimal("323634682.02759147"), KMathContext(5, HALF_UP)).asList())
		assertEquals(listOf(KBigDecimal("-7"), KBigDecimal("154209408.17746801")), KBigDecimal("1464574829.3096583").divideAndRemainder(KBigDecimal("-187195060.16174147"), KMathContext(7, CEILING)).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("-120187432.93513387")), KBigDecimal("-120187432.93513387").divideAndRemainder(KBigDecimal("1672685224.8150556"), KMathContext(8, HALF_UP)).asList())
		assertEquals(listOf(KBigDecimal("2"), KBigDecimal("151577208.2079671")), KBigDecimal("1446128993.4640043").divideAndRemainder(KBigDecimal("647275892.6280186"), KMathContext(5, UP)).asList())
	}

	@Test fun `test divideToIntegralValue`() {
		assertEquals(KBigDecimal("-2"), KBigDecimal("784102538.4058294").divideToIntegralValue(KBigDecimal("-312845952.79308087")))
		assertEquals(KBigDecimal("-2"), KBigDecimal("365965834.8138188").divideToIntegralValue(KBigDecimal("-153685584.27716056")))
		assertEquals(KBigDecimal("-6"), KBigDecimal("-1309812580.3667805").divideToIntegralValue(KBigDecimal("204382596.25089645")))
		assertEquals(KBigDecimal("0.0"), KBigDecimal("90239497.67196426").divideToIntegralValue(KBigDecimal("999477561.0824475")))
		assertEquals(KBigDecimal("9"), KBigDecimal("312427903.48579687").divideToIntegralValue(KBigDecimal("32145267.92746859")))
		assertEquals(KBigDecimal("-5"), KBigDecimal("467302324.9134836").divideToIntegralValue(KBigDecimal("-92805287.45404696")))
		assertEquals(KBigDecimal("0.0"), KBigDecimal("-777742187.4544085").divideToIntegralValue(KBigDecimal("794629113.271847")))
		assertEquals(KBigDecimal("-1"), KBigDecimal("-187774338.1068777").divideToIntegralValue(KBigDecimal("184127214.49721962")))
		assertEquals(KBigDecimal("0.00"), KBigDecimal("104016565.31400327").divideToIntegralValue(KBigDecimal("1272931911.694565")))
		assertEquals(KBigDecimal("5"), KBigDecimal("-799118863.4963624").divideToIntegralValue(KBigDecimal("-140063310.9501388")))
		assertEquals(KBigDecimal("-1.0"), KBigDecimal("471057104.25907904").divideToIntegralValue(KBigDecimal("-414893188.7499126")))
	}

	@Test fun `test divideToIntegralValue with MathContext`() {
		assertEquals(KBigDecimal("0.0"), KBigDecimal("91702153.45007044").divideToIntegralValue(KBigDecimal("-709061441.3675947"), KMathContext(8, HALF_DOWN)))
		assertEquals(KBigDecimal("-1"), KBigDecimal("249841354.43697646").divideToIntegralValue(KBigDecimal("-182726748.76372012"), KMathContext(5, FLOOR)))
		assertEquals(KBigDecimal("1"), KBigDecimal("890471624.3624302").divideToIntegralValue(KBigDecimal("814179731.8786556"), KMathContext(7, FLOOR)))
		assertEquals(KBigDecimal("1"), KBigDecimal("-212775941.3541713").divideToIntegralValue(KBigDecimal("-188571704.9722901"), KMathContext(3, FLOOR)))
		assertEquals(KBigDecimal("0.00"), KBigDecimal("124875163.09732443").divideToIntegralValue(KBigDecimal("-1079043613.873884"), KMathContext(3, UP)))
		assertEquals(KBigDecimal("9"), KBigDecimal("-764171538.7885159").divideToIntegralValue(KBigDecimal("-80169218.02207339"), KMathContext(7, HALF_EVEN)))
		assertEquals(KBigDecimal("0.0"), KBigDecimal("124773245.69994995").divideToIntegralValue(KBigDecimal("-1194771990.4861174"), KMathContext(8, HALF_UP)))
		assertEquals(KBigDecimal("0E+1"), KBigDecimal("-93602301.2782669").divideToIntegralValue(KBigDecimal("-116901767.36363001"), KMathContext(1, CEILING)))
		assertEquals(KBigDecimal("-7"), KBigDecimal("610607180.0892429").divideToIntegralValue(KBigDecimal("-81795581.14152132"), KMathContext(1, HALF_UP)))
		assertEquals(KBigDecimal("-1"), KBigDecimal("341559423.7394248").divideToIntegralValue(KBigDecimal("-280140622.5574952"), KMathContext(9, UP)))
		assertEquals(KBigDecimal("1"), KBigDecimal("-47260343.89308903").divideToIntegralValue(KBigDecimal("-25204377.979744814"), KMathContext(8, HALF_DOWN)))
	}

	@Test fun `test doubleValue`() {
		assertEquals(-1.1988641607618518E9, KBigDecimal("-1198864160.7618518").doubleValue())
		assertEquals(2.6824020670175325E7, KBigDecimal("26824020.670175325").doubleValue())
		assertEquals(-2.761593796237286E8, KBigDecimal("-276159379.6237286").doubleValue())
		assertEquals(-1.1786490609430628E8, KBigDecimal("-117864906.09430628").doubleValue())
		assertEquals(1.418988538313132E8, KBigDecimal("141898853.8313132").doubleValue())
		assertEquals(-6.746115029361194E7, KBigDecimal("-67461150.29361194").doubleValue())
		assertEquals(4.8949476955172473E8, KBigDecimal("489494769.55172473").doubleValue())
		assertEquals(1.2414495056529505E7, KBigDecimal("12414495.056529505").doubleValue())
		assertEquals(4.1727998554931617E8, KBigDecimal("417279985.54931617").doubleValue())
		assertEquals(4.294556989738006E7, KBigDecimal("42945569.89738006").doubleValue())
		assertEquals(-1.0259529477792579E9, KBigDecimal("-1025952947.7792579").doubleValue())
	}

	@Test fun `test floatValue`() {
		assertEquals(5.6754189E8f, KBigDecimal("567541893.6106328").floatValue())
		assertEquals(-4.85985984E8f, KBigDecimal("-485985990.6264915").floatValue())
		assertEquals(-6.7553594E8f, KBigDecimal("-675535923.9401965").floatValue())
		assertEquals(-1.81828464E8f, KBigDecimal("-181828463.17288023").floatValue())
		assertEquals(-1.9241494E7f, KBigDecimal("-19241494.865283635").floatValue())
		assertEquals(1.3544861E7f, KBigDecimal("13544861.278251892").floatValue())
		assertEquals(-2.3305688E8f, KBigDecimal("-233056872.83998445").floatValue())
		assertEquals(1.12145037E9f, KBigDecimal("1121450332.5963585").floatValue())
		assertEquals(1.32347738E9f, KBigDecimal("1323477416.9655805").floatValue())
		assertEquals(2.573794E7f, KBigDecimal("25737939.878376868").floatValue())
		assertEquals(-8.7036112E7f, KBigDecimal("-87036108.80272934").floatValue())
	}

	@Test fun `test intValue`() {
		assertEquals(1310073264, KBigDecimal("1310073264.8528352").intValue())
		assertEquals(-1675443756, KBigDecimal("-1675443756.7767766").intValue())
		assertEquals(-35536203, KBigDecimal("-35536203.3628307").intValue())
		assertEquals(716001617, KBigDecimal("716001617.7774258").intValue())
		assertEquals(1075401237, KBigDecimal("1075401237.4756756").intValue())
		assertEquals(-322180137, KBigDecimal("-322180137.54503626").intValue())
		assertEquals(-251112441, KBigDecimal("-251112441.2005114").intValue())
		assertEquals(1102323375, KBigDecimal("1102323375.111723").intValue())
		assertEquals(221287913, KBigDecimal("221287913.6990621").intValue())
		assertEquals(62398813, KBigDecimal("62398813.36693443").intValue())
		assertEquals(-436873380, KBigDecimal("-436873380.51883847").intValue())
	}

	@Test fun `test intValueExact`() {
		assertEquals(1859573353, KBigDecimal("1859573353").intValueExact())
		assertEquals(-1694615830, KBigDecimal("-1694615830").intValueExact())
		assertEquals(51978922, KBigDecimal("51978922").intValueExact())
		assertEquals(319412641, KBigDecimal("319412641").intValueExact())
		assertEquals(1174851047, KBigDecimal("1174851047").intValueExact())
		assertEquals(-508448506, KBigDecimal("-508448506").intValueExact())
		assertEquals(-730333810, KBigDecimal("-730333810").intValueExact())
		assertEquals(-1072163838, KBigDecimal("-1072163838").intValueExact())
		assertEquals(982890403, KBigDecimal("982890403").intValueExact())
		assertEquals(727388909, KBigDecimal("727388909").intValueExact())
		assertEquals(-2101079319, KBigDecimal("-2101079319").intValueExact())
	}

	@Test fun `test longValue`() {
		assertEquals(-1117306832, KBigDecimal("-1117306832.8138993").longValue())
		assertEquals(835046489, KBigDecimal("835046489.5452883").longValue())
		assertEquals(509758034, KBigDecimal("509758034.5778309").longValue())
		assertEquals(199855049, KBigDecimal("199855049.22292608").longValue())
		assertEquals(49816559, KBigDecimal("49816559.662481904").longValue())
		assertEquals(-766304909, KBigDecimal("-766304909.0225414").longValue())
		assertEquals(-1292070374, KBigDecimal("-1292070374.1544256").longValue())
		assertEquals(-340622742, KBigDecimal("-340622742.51717633").longValue())
		assertEquals(-262710809, KBigDecimal("-262710809.1219705").longValue())
		assertEquals(673875616, KBigDecimal("673875616.4682208").longValue())
		assertEquals(-1309550262, KBigDecimal("-1309550262.7285955").longValue())
	}

	@Test fun `test longValueExact`() {
		assertEquals(3585487512440944819, KBigDecimal("3585487512440944819").longValueExact())
		assertEquals(-6638945961802373110, KBigDecimal("-6638945961802373110").longValueExact())
		assertEquals(-31608195400384841, KBigDecimal("-31608195400384841").longValueExact())
		assertEquals(-6783422970034091456, KBigDecimal("-6783422970034091456").longValueExact())
		assertEquals(2102800384700014982, KBigDecimal("2102800384700014982").longValueExact())
		assertEquals(5057382690136058969, KBigDecimal("5057382690136058969").longValueExact())
		assertEquals(-5314394870317366536, KBigDecimal("-5314394870317366536").longValueExact())
		assertEquals(-1059481010354075520, KBigDecimal("-1059481010354075520").longValueExact())
		assertEquals(3521764049070421876, KBigDecimal("3521764049070421876").longValueExact())
		assertEquals(54556393246617952, KBigDecimal("54556393246617952").longValueExact())
		assertEquals(-389700599129057232, KBigDecimal("-389700599129057232").longValueExact())
	}

	@Test fun `test max`() {
		assertEquals(KBigDecimal("756598579.6565222"), KBigDecimal("756598579.6565222").max(KBigDecimal("280388829.71874106")))
		assertEquals(KBigDecimal("-22534050.9731478"), KBigDecimal("-22534050.9731478").max(KBigDecimal("-861868885.1574968")))
		assertEquals(KBigDecimal("345142751.4040957"), KBigDecimal("23425135.243386205").max(KBigDecimal("345142751.4040957")))
		assertEquals(KBigDecimal("94251453.70909832"), KBigDecimal("-963228573.9182137").max(KBigDecimal("94251453.70909832")))
		assertEquals(KBigDecimal("1791271969.2164266"), KBigDecimal("-860106940.7664403").max(KBigDecimal("1791271969.2164266")))
		assertEquals(KBigDecimal("487413090.635914"), KBigDecimal("487413090.635914").max(KBigDecimal("135672529.37053317")))
		assertEquals(KBigDecimal("689775815.1977128"), KBigDecimal("689775815.1977128").max(KBigDecimal("-100295177.65677808")))
		assertEquals(KBigDecimal("28007327.430685934"), KBigDecimal("28007327.430685934").max(KBigDecimal("-805817574.039618")))
		assertEquals(KBigDecimal("346214786.74910176"), KBigDecimal("-54479603.179433").max(KBigDecimal("346214786.74910176")))
		assertEquals(KBigDecimal("1039652821.3972363"), KBigDecimal("1039652821.3972363").max(KBigDecimal("-1225208095.7917082")))
		assertEquals(KBigDecimal("662688449.5001161"), KBigDecimal("662688449.5001161").max(KBigDecimal("-506412205.5179493")))
	}

	@Test fun `test min`() {
		assertEquals(KBigDecimal("602720814.5064672"), KBigDecimal("1389492174.1518571").min(KBigDecimal("602720814.5064672")))
		assertEquals(KBigDecimal("-144076795.34462163"), KBigDecimal("-130863511.86406925").min(KBigDecimal("-144076795.34462163")))
		assertEquals(KBigDecimal("-684938007.5648143"), KBigDecimal("14522569.277869914").min(KBigDecimal("-684938007.5648143")))
		assertEquals(KBigDecimal("-633011848.6799306"), KBigDecimal("-633011848.6799306").min(KBigDecimal("210423464.60234785")))
		assertEquals(KBigDecimal("-798381627.2633504"), KBigDecimal("-798381627.2633504").min(KBigDecimal("-767526982.8165677")))
		assertEquals(KBigDecimal("-279210652.26829547"), KBigDecimal("902627624.3723117").min(KBigDecimal("-279210652.26829547")))
		assertEquals(KBigDecimal("-1622147276.5525663"), KBigDecimal("1659784812.6535263").min(KBigDecimal("-1622147276.5525663")))
		assertEquals(KBigDecimal("343535058.784462"), KBigDecimal("844608699.2233607").min(KBigDecimal("343535058.784462")))
		assertEquals(KBigDecimal("-210066017.51051947"), KBigDecimal("1805094317.8350916").min(KBigDecimal("-210066017.51051947")))
		assertEquals(KBigDecimal("-344433997.47323155"), KBigDecimal("-344433997.47323155").min(KBigDecimal("772400635.6408095")))
		assertEquals(KBigDecimal("-251700904.6258093"), KBigDecimal("-251700904.6258093").min(KBigDecimal("1316712290.9156342")))
	}

	@Test fun `test movePointLeft`() {
		assertEquals(KBigDecimal("7.588324712944103E-80"), KBigDecimal("758832471.2944103").movePointLeft(88))
		assertEquals(KBigDecimal("-8.59300393500664E-67"), KBigDecimal("-859300393.500664").movePointLeft(75))
		assertEquals(KBigDecimal("-2.6489868392375976E-38"), KBigDecimal("-26489868.392375976").movePointLeft(45))
		assertEquals(KBigDecimal("1.5344286525502875E-31"), KBigDecimal("153442865.25502875").movePointLeft(39))
		assertEquals(KBigDecimal("0.000008713432205009212"), KBigDecimal("871343220.5009212").movePointLeft(14))
		assertEquals(KBigDecimal("9.381056023209738E-19"), KBigDecimal("9381056.023209738").movePointLeft(25))
		assertEquals(KBigDecimal("-1.569794430714161E-77"), KBigDecimal("-156979443.0714161").movePointLeft(85))
		assertEquals(KBigDecimal("6.731196142790358E-87"), KBigDecimal("67311961.42790358").movePointLeft(94))
		assertEquals(KBigDecimal("9.821118564890484E-13"), KBigDecimal("982111856.4890484").movePointLeft(21))
		assertEquals(KBigDecimal("-0.046588803765977764"), KBigDecimal("-465888037.65977764").movePointLeft(10))
		assertEquals(KBigDecimal("1.8381445111477597E-33"), KBigDecimal("1838144511.1477597").movePointLeft(42))
	}

	@Test fun `test movePointRight`() {
		assertEquals(KBigDecimal("64846023364420210000000000000000000000000000000000000000000000000000000000000000000000000000000"), KBigDecimal("648460233.6442021").movePointRight(86))
		assertEquals(KBigDecimal("-107108018031966010000000000000000000000000"), KBigDecimal("-1071080180.3196601").movePointRight(32))
		assertEquals(KBigDecimal("42787249093625690000000000000000000000000000000000000000000"), KBigDecimal("427872490.9362569").movePointRight(50))
		assertEquals(KBigDecimal("-23664818211681545000000000000000000000000000000000000000000000000000000000000000000000000000000"), KBigDecimal("-236648182.11681545").movePointRight(86))
		assertEquals(KBigDecimal("-75265212716711220000000000000000000000000000000000000000000000000000000000000000000000000000000000000"), KBigDecimal("-752652127.1671122").movePointRight(92))
		assertEquals(KBigDecimal("2129586720968948000000000000000000000"), KBigDecimal("21295867.20968948").movePointRight(29))
		assertEquals(KBigDecimal("449377731818522400000"), KBigDecimal("449377731.8185224").movePointRight(12))
		assertEquals(KBigDecimal("-1439945312688698800000000000000000000000000000000000000000000"), KBigDecimal("-1439945312.6886988").movePointRight(51))
		assertEquals(KBigDecimal("-37644497338219136000000000000000000000000000000000000000000000000000000000000000000000000000000000"), KBigDecimal("-376444973.38219136").movePointRight(89))
		assertEquals(KBigDecimal("-77094311044812310000000000000000000000000000000000000000000000000000000000000"), KBigDecimal("-770943110.4481231").movePointRight(68))
		assertEquals(KBigDecimal("114772363570857120000000000000000000000000000"), KBigDecimal("114772363.57085712").movePointRight(36))
	}

	@Test fun `test multiply`() {
		assertEquals(KBigDecimal("92069984550962439.746641354649085"), KBigDecimal("399070476.25418967").multiply(KBigDecimal("230711089.9687755")))
		assertEquals(KBigDecimal("1331398572891769.141205646318955"), KBigDecimal("-32479307.7174331").multiply(KBigDecimal("-40992209.08508305")))
		assertEquals(KBigDecimal("102605837159701745.967321936726688"), KBigDecimal("-201407436.76277596").multiply(KBigDecimal("-509444133.7861528")))
		assertEquals(KBigDecimal("23781080431944854.06915400816978176"), KBigDecimal("61349964.582318656").multiply(KBigDecimal("387629896.67313796")))
		assertEquals(KBigDecimal("-607404356770428136.48397426532820"), KBigDecimal("583974681.0428804").multiply(KBigDecimal("-1040121047.1757205")))
		assertEquals(KBigDecimal("-582147902212502459.319490522866124"), KBigDecimal("1579282758.4473274").multiply(KBigDecimal("-368615372.45226526")))
		assertEquals(KBigDecimal("-166403966900155028.3366985789750"), KBigDecimal("206142059.1487125").multiply(KBigDecimal("-807229575.504094")))
		assertEquals(KBigDecimal("-21061750267765096.3379118272623455"), KBigDecimal("120493346.12289785").multiply(KBigDecimal("-174795961.31626263")))
		assertEquals(KBigDecimal("221520051419825517.462019752361634"), KBigDecimal("-262734958.82789627").multiply(KBigDecimal("-843131239.2079942")))
		assertEquals(KBigDecimal("258358238973407093.344078745276396"), KBigDecimal("373825181.68534267").multiply(KBigDecimal("691120479.9222788")))
		assertEquals(KBigDecimal("205923039598007086.777722028332630"), KBigDecimal("199414930.76872614").multiply(KBigDecimal("1032636015.7897545")))
	}

	@Test fun `test multiply with MathContext`() {
		assertEquals(KBigDecimal("-1.4E+18"), KBigDecimal("1552004369.113524").multiply(KBigDecimal("-845554587.7225612"), KMathContext(2, FLOOR)))
		assertEquals(KBigDecimal("-2.406879E+17"), KBigDecimal("-312632905.9817693").multiply(KBigDecimal("769873737.8710886"), KMathContext(7, FLOOR)))
		assertEquals(KBigDecimal("-4.01081E+15"), KBigDecimal("5074394.151309067").multiply(KBigDecimal("-790401403.0390793"), KMathContext(6, HALF_DOWN)))
		assertEquals(KBigDecimal("-3.8E+16"), KBigDecimal("-104997477.91898417").multiply(KBigDecimal("362934494.8507764"), KMathContext(2, HALF_DOWN)))
		assertEquals(KBigDecimal("2.12321E+17"), KBigDecimal("161287202.0406359").multiply(KBigDecimal("1316415062.3059795"), KMathContext(6, HALF_UP)))
		assertEquals(KBigDecimal("4.0508E+17"), KBigDecimal("1494728737.043842").multiply(KBigDecimal("271006807.947566"), KMathContext(5, HALF_DOWN)))
		assertEquals(KBigDecimal("1.24E+16"), KBigDecimal("-21462982.564345945").multiply(KBigDecimal("-581664448.6549187"), KMathContext(3, FLOOR)))
		assertEquals(KBigDecimal("-3.494E+16"), KBigDecimal("22898318.59442229").multiply(KBigDecimal("-1525776660.9125824"), KMathContext(4, FLOOR)))
		assertEquals(KBigDecimal("9.44E+16"), KBigDecimal("339414715.116919").multiply(KBigDecimal("278219128.58862877"), KMathContext(3, HALF_UP)))
		assertEquals(KBigDecimal("-7.9677E+15"), KBigDecimal("-1355388277.4945245").multiply(KBigDecimal("5878556.677593906"), KMathContext(5, HALF_UP)))
		assertEquals(KBigDecimal("-2.85E+17"), KBigDecimal("250365018.95575392").multiply(KBigDecimal("-1139249701.3509748"), KMathContext(3, HALF_UP)))
	}

	@Test fun `test negate`() {
		assertEquals(KBigDecimal("-138785450.76730657"), KBigDecimal("138785450.76730657").negate())
		assertEquals(KBigDecimal("-33980269.214483455"), KBigDecimal("33980269.214483455").negate())
		assertEquals(KBigDecimal("-1221779142.1218464"), KBigDecimal("1221779142.1218464").negate())
		assertEquals(KBigDecimal("-872087111.7535549"), KBigDecimal("872087111.7535549").negate())
		assertEquals(KBigDecimal("155777929.65272215"), KBigDecimal("-155777929.65272215").negate())
		assertEquals(KBigDecimal("187839334.65680027"), KBigDecimal("-187839334.65680027").negate())
		assertEquals(KBigDecimal("-456015874.7393331"), KBigDecimal("456015874.7393331").negate())
		assertEquals(KBigDecimal("-62462356.76197226"), KBigDecimal("62462356.76197226").negate())
		assertEquals(KBigDecimal("-418031578.44665635"), KBigDecimal("418031578.44665635").negate())
		assertEquals(KBigDecimal("-699243839.4591985"), KBigDecimal("699243839.4591985").negate())
		assertEquals(KBigDecimal("-148742909.71387634"), KBigDecimal("148742909.71387634").negate())
	}

	@Test fun `test negate with MathContext`() {
		assertEquals(KBigDecimal("1.57930496E+9"), KBigDecimal("-1579304961.8936327").negate(KMathContext(9, DOWN)))
		assertEquals(KBigDecimal("1.91286143E+9"), KBigDecimal("-1912861421.5576437").negate(KMathContext(9, UP)))
		assertEquals(KBigDecimal("5.476E+8"), KBigDecimal("-547568481.1496061").negate(KMathContext(4, HALF_EVEN)))
		assertEquals(KBigDecimal("6.865847E+8"), KBigDecimal("-686584734.2037921").negate(KMathContext(7, DOWN)))
		assertEquals(KBigDecimal("-3.973E+8"), KBigDecimal("397323692.46985966").negate(KMathContext(4, CEILING)))
		assertEquals(KBigDecimal("-2.27576E+8"), KBigDecimal("227576045.92140654").negate(KMathContext(6, CEILING)))
		assertEquals(KBigDecimal("2.1495257E+8"), KBigDecimal("-214952573.1256012").negate(KMathContext(8, DOWN)))
		assertEquals(KBigDecimal("1.4E+6"), KBigDecimal("-1444484.7791822378").negate(KMathContext(2, DOWN)))
		assertEquals(KBigDecimal("7.16E+8"), KBigDecimal("-715785424.571375").negate(KMathContext(3, UP)))
		assertEquals(KBigDecimal("-2.124E+9"), KBigDecimal("2123612601.1700618").negate(KMathContext(4, FLOOR)))
		assertEquals(KBigDecimal("2.67E+7"), KBigDecimal("-26726902.496628").negate(KMathContext(3, HALF_DOWN)))
	}

	@Test fun `test plus`() {
		assertEquals(KBigDecimal("475459499.4982168"), KBigDecimal("475459499.4982168").plus())
		assertEquals(KBigDecimal("37589890.25100581"), KBigDecimal("37589890.25100581").plus())
		assertEquals(KBigDecimal("-33746086.333008006"), KBigDecimal("-33746086.333008006").plus())
		assertEquals(KBigDecimal("-629581485.5964962"), KBigDecimal("-629581485.5964962").plus())
		assertEquals(KBigDecimal("36137227.76985916"), KBigDecimal("36137227.76985916").plus())
		assertEquals(KBigDecimal("1745124199.9348705"), KBigDecimal("1745124199.9348705").plus())
		assertEquals(KBigDecimal("233764702.4675132"), KBigDecimal("233764702.4675132").plus())
		assertEquals(KBigDecimal("292868458.0652451"), KBigDecimal("292868458.0652451").plus())
		assertEquals(KBigDecimal("-282958101.4640961"), KBigDecimal("-282958101.4640961").plus())
		assertEquals(KBigDecimal("189119569.03188342"), KBigDecimal("189119569.03188342").plus())
		assertEquals(KBigDecimal("-1036136127.8600606"), KBigDecimal("-1036136127.8600606").plus())
	}

	@Test fun `test plus with MathContext`() {
		assertEquals(KBigDecimal("4.7E+7"), KBigDecimal("47147750.901092924").plus(KMathContext(2, DOWN)))
		assertEquals(KBigDecimal("5.9120E+8"), KBigDecimal("591207416.1523802").plus(KMathContext(5, DOWN)))
		assertEquals(KBigDecimal("-2E+8"), KBigDecimal("-161352178.86205718").plus(KMathContext(1, HALF_DOWN)))
		assertEquals(KBigDecimal("6E+8"), KBigDecimal("600299685.2166178").plus(KMathContext(1, HALF_DOWN)))
		assertEquals(KBigDecimal("-3.0706E+8"), KBigDecimal("-307055867.6874869").plus(KMathContext(5, HALF_EVEN)))
		assertEquals(KBigDecimal("-686336476"), KBigDecimal("-686336476.4830868").plus(KMathContext(9, HALF_UP)))
		assertEquals(KBigDecimal("-1.4E+8"), KBigDecimal("-146842984.0801519").plus(KMathContext(2, DOWN)))
		assertEquals(KBigDecimal("3.861880E+8"), KBigDecimal("386187927.5778432").plus(KMathContext(7, CEILING)))
		assertEquals(KBigDecimal("3.879484E+8"), KBigDecimal("387948318.63333046").plus(KMathContext(7, UP)))
		assertEquals(KBigDecimal("-3.511E+7"), KBigDecimal("-35118459.79924367").plus(KMathContext(4, DOWN)))
		assertEquals(KBigDecimal("-3E+8"), KBigDecimal("-295332778.1627533").plus(KMathContext(1, HALF_DOWN)))
	}

	@Test fun `test pow`() {
		assertEquals(KBigDecimal("-8743131885091879654973151098680289502142686098701843624828984566.6384036789857005519094572087286921775763467495337"), KBigDecimal("-1363087896.0318553").pow(7))
		assertEquals(KBigDecimal("14601373066835685758705970826152381555521893606179.143628126980995206165753311370708271112916293184"), KBigDecimal("-156338383.16982138").pow(6))
		assertEquals(KBigDecimal("19169536813214906868498.468087596990749934768375"), KBigDecimal("26763148.65891815").pow(3))
		assertEquals(KBigDecimal("1938419096286493833.69464238341209"), KBigDecimal("-1392271200.6956453").pow(2))
		assertEquals(KBigDecimal("2104111679821073259288441928489692551439922694.11024423133318560980842530090138976"), KBigDecimal("1160416131.2744246").pow(5))
		assertEquals(KBigDecimal("-16709788875840730282726964.765831423895694906821416"), KBigDecimal("-255656587.44518906").pow(3))
		assertEquals(KBigDecimal("982186321068587602958420620251056602.6760878968716648497880075536"), KBigDecimal("995516517.8733766").pow(4))
		assertEquals(KBigDecimal("102245404891799144.7611699966791056"), KBigDecimal("-319758353.90463084").pow(2))
		assertEquals(KBigDecimal("49038829583291192842740466824795703.1704433584420402729787563761"), KBigDecimal("-470581688.9036709").pow(4))
		assertEquals(KBigDecimal("-130459574268235267211504924824312831630674241.11285718357629025944548903205946368"), KBigDecimal("-665418990.9276228").pow(5))
		assertEquals(KBigDecimal("-229110741904102967043681070919310900436986731065788373935811009.949193303278303043282621557518759454734208"), KBigDecimal("-810173290.956062").pow(7))
	}

	@Test fun `test pow with MathContext`() {
		assertEquals(KBigDecimal("-5.22792676E+45"), KBigDecimal("-1392085464.525319").pow(5, KMathContext(9, UP)))
		assertEquals(KBigDecimal("1.4202568E+54"), KBigDecimal("1060216299.7914757").pow(6, KMathContext(8, CEILING)))
		assertEquals(KBigDecimal("2.0622E+66"), KBigDecimal("194666415.5684076").pow(8, KMathContext(5, CEILING)))
		assertEquals(KBigDecimal("-3.14129E+59"), KBigDecimal("-315927036.2608376").pow(7, KMathContext(6, FLOOR)))
		assertEquals(KBigDecimal("5.237571E+67"), KBigDecimal("291669643.4464508").pow(8, KMathContext(7, UP)))
		assertEquals(KBigDecimal("2.4E+17"), KBigDecimal("-481626763.77048576").pow(2, KMathContext(2, UP)))
		assertEquals(KBigDecimal("-3.7560286E+8"), KBigDecimal("-375602861.90993035").pow(1, KMathContext(8, DOWN)))
		assertEquals(KBigDecimal("3.2E+48"), KBigDecimal("121164969.11516964").pow(6, KMathContext(2, HALF_UP)))
		assertEquals(KBigDecimal("-1.0075E+27"), KBigDecimal("-1002501104.4653683").pow(3, KMathContext(5, DOWN)))
		assertEquals(KBigDecimal("5.45E+16"), KBigDecimal("-233386510.48661953").pow(2, KMathContext(3, UP)))
		assertEquals(KBigDecimal("1.569E+8"), KBigDecimal("156929284.38674468").pow(1, KMathContext(4, FLOOR)))
	}

	@Test fun `test precision`() {
		assertEquals(16, KBigDecimal("-672886319.0753009").precision())
		assertEquals(17, KBigDecimal("-1652589494.3322754").precision())
		assertEquals(15, KBigDecimal("712986359.500885").precision())
		assertEquals(17, KBigDecimal("-1778264281.9044127").precision())
		assertEquals(17, KBigDecimal("61114948.615878806").precision())
		assertEquals(14, KBigDecimal("531399124.58333").precision())
		assertEquals(17, KBigDecimal("-169966163.48983622").precision())
		assertEquals(17, KBigDecimal("-197328738.59107652").precision())
		assertEquals(16, KBigDecimal("-55549376.29125784").precision())
		assertEquals(16, KBigDecimal("-572410822.2538162").precision())
		assertEquals(16, KBigDecimal("-94615781.59697817").precision())
	}

	@Test fun `test remainder`() {
		assertEquals(KBigDecimal("150520638.21843964"), KBigDecimal("641902682.7026192").remainder(KBigDecimal("-491382044.48417956")))
		assertEquals(KBigDecimal("44583130.0577049"), KBigDecimal("1375378179.0296571").remainder(KBigDecimal("221799174.8286587")))
		assertEquals(KBigDecimal("-711582123.1038314"), KBigDecimal("-711582123.1038314").remainder(KBigDecimal("786618001.3094004")))
		assertEquals(KBigDecimal("-30814900.928391695"), KBigDecimal("-30814900.928391695").remainder(KBigDecimal("233904719.3938091")))
		assertEquals(KBigDecimal("-42602848.06585713"), KBigDecimal("-42602848.06585713").remainder(KBigDecimal("-445078743.79265547")))
		assertEquals(KBigDecimal("-301988664.0839641"), KBigDecimal("-1400094273.4433918").remainder(KBigDecimal("1098105609.3594277")))
		assertEquals(KBigDecimal("16101867.6550659"), KBigDecimal("16101867.6550659").remainder(KBigDecimal("458933198.4462082")))
		assertEquals(KBigDecimal("-50283669.94895325"), KBigDecimal("-50283669.94895325").remainder(KBigDecimal("706841370.3032023")))
		assertEquals(KBigDecimal("-10627353.230981776"), KBigDecimal("-10627353.230981776").remainder(KBigDecimal("1740247972.4538546")))
		assertEquals(KBigDecimal("-103329458.27398628"), KBigDecimal("-103329458.27398628").remainder(KBigDecimal("-455969342.87796277")))
		assertEquals(KBigDecimal("-344686500.369077"), KBigDecimal("-1107408669.62987").remainder(KBigDecimal("-762722169.260793")))
	}

	@Test fun `test remainder with MathContext`() {
		assertEquals(KBigDecimal("208884584.18110409"), KBigDecimal("443935280.39048123").remainder(KBigDecimal("-235050696.20937714"), KMathContext(4, DOWN)))
		assertEquals(KBigDecimal("347927372.4696814"), KBigDecimal("347927372.4696814").remainder(KBigDecimal("-1065435973.9607487"), KMathContext(1, CEILING)))
		assertEquals(KBigDecimal("-70395982.03009415"), KBigDecimal("-328450380.2945951").remainder(KBigDecimal("258054398.26450095"), KMathContext(5, HALF_EVEN)))
		assertEquals(KBigDecimal("-309146741.77785563"), KBigDecimal("-309146741.77785563").remainder(KBigDecimal("-717247029.9862523"), KMathContext(7, FLOOR)))
		assertEquals(KBigDecimal("-490968950.8085852"), KBigDecimal("-991748349.39069").remainder(KBigDecimal("500779398.5821048"), KMathContext(8, HALF_EVEN)))
		assertEquals(KBigDecimal("-466260257.60986793"), KBigDecimal("-466260257.60986793").remainder(KBigDecimal("897398507.9366156"), KMathContext(8, UP)))
		assertEquals(KBigDecimal("-73467548.67952897"), KBigDecimal("-73467548.67952897").remainder(KBigDecimal("-362691106.60820425"), KMathContext(4, FLOOR)))
		assertEquals(KBigDecimal("26773295.83693558"), KBigDecimal("1351169588.202942").remainder(KBigDecimal("-120399662.94236422"), KMathContext(2, UP)))
		assertEquals(KBigDecimal("81297337.5436005"), KBigDecimal("81297337.5436005").remainder(KBigDecimal("-123961268.3387437"), KMathContext(5, HALF_EVEN)))
		assertEquals(KBigDecimal("18807219.112907585"), KBigDecimal("18807219.112907585").remainder(KBigDecimal("-1825489678.0926976"), KMathContext(5, HALF_UP)))
		assertEquals(KBigDecimal("6211211.493714499"), KBigDecimal("162830827.26237187").remainder(KBigDecimal("-14238146.888059761"), KMathContext(8, UP)))
	}

	@Test fun `test round`() {
		assertEquals(KBigDecimal("-37331655.9"), KBigDecimal("-37331655.88062559").round(KMathContext(9, FLOOR)))
		assertEquals(KBigDecimal("4.859E+8"), KBigDecimal("485891628.72543734").round(KMathContext(4, UP)))
		assertEquals(KBigDecimal("104829487"), KBigDecimal("104829486.55194569").round(KMathContext(9, HALF_EVEN)))
		assertEquals(KBigDecimal("-7.5549243E+8"), KBigDecimal("-755492426.6378136").round(KMathContext(8, UP)))
		assertEquals(KBigDecimal("3.41588E+8"), KBigDecimal("341588074.01591843").round(KMathContext(6, HALF_DOWN)))
		assertEquals(KBigDecimal("-7.169843E+8"), KBigDecimal("-716984345.9559166").round(KMathContext(7, HALF_DOWN)))
		assertEquals(KBigDecimal("-4.662E+8"), KBigDecimal("-466207037.2693689").round(KMathContext(4, HALF_EVEN)))
		assertEquals(KBigDecimal("1.2E+8"), KBigDecimal("122032633.31107284").round(KMathContext(2, HALF_EVEN)))
		assertEquals(KBigDecimal("1.19826E+8"), KBigDecimal("119826971.27903296").round(KMathContext(6, DOWN)))
		assertEquals(KBigDecimal("1.1265319E+9"), KBigDecimal("1126531900.110136").round(KMathContext(8, FLOOR)))
		assertEquals(KBigDecimal("1.610927E+9"), KBigDecimal("1610926722.7968287").round(KMathContext(7, UP)))
	}

	@Test fun `test scale`() {
		assertEquals(7, KBigDecimal("-859511203.8892654").scale())
		assertEquals(7, KBigDecimal("-744078921.8124642").scale())
		assertEquals(7, KBigDecimal("-1858143539.8250318").scale())
		assertEquals(8, KBigDecimal("-387906674.77480525").scale())
		assertEquals(7, KBigDecimal("591275049.3133761").scale())
		assertEquals(7, KBigDecimal("1052143518.9573425").scale())
		assertEquals(7, KBigDecimal("-1045226734.3674383").scale())
		assertEquals(8, KBigDecimal("-255334442.55022335").scale())
		assertEquals(7, KBigDecimal("-59944055.6775618").scale())
		assertEquals(9, KBigDecimal("-4592594.143308242").scale())
		assertEquals(7, KBigDecimal("482256328.0494319").scale())
	}

	@Test fun `test scaleByPowerOfTen`() {
		assertEquals(KBigDecimal("1668033506369.608"), KBigDecimal("166803350.6369608").scaleByPowerOfTen(4))
		assertEquals(KBigDecimal("-6.725846885757928E+26"), KBigDecimal("-672584688.5757928").scaleByPowerOfTen(18))
		assertEquals(KBigDecimal("-711730754459.0054"), KBigDecimal("-711730754.4590054").scaleByPowerOfTen(3))
		assertEquals(KBigDecimal("-24383994258.032125"), KBigDecimal("-243839942.58032125").scaleByPowerOfTen(2))
		assertEquals(KBigDecimal("8472133462.523754"), KBigDecimal("84721334.62523754").scaleByPowerOfTen(2))
		assertEquals(KBigDecimal("-1.4213313206717445E+26"), KBigDecimal("-14213313.206717445").scaleByPowerOfTen(19))
		assertEquals(KBigDecimal("2.721651791660745E+19"), KBigDecimal("272165179.1660745").scaleByPowerOfTen(11))
		assertEquals(KBigDecimal("36661012601664555"), KBigDecimal("366610126.01664555").scaleByPowerOfTen(8))
		assertEquals(KBigDecimal("-7.850063063814738E+19"), KBigDecimal("-785006306.3814738").scaleByPowerOfTen(11))
		assertEquals(KBigDecimal("-1.832053291646301E+27"), KBigDecimal("-183205329.1646301").scaleByPowerOfTen(19))
		assertEquals(KBigDecimal("-2.8630402050412846E+21"), KBigDecimal("-286304020.50412846").scaleByPowerOfTen(13))
	}

	@Test fun `test setScale`() {
		assertEquals(KBigDecimal("735478864.1080536000000000"), KBigDecimal("735478864.1080536").setScale(16))
		assertEquals(KBigDecimal("251471859.7450698300000000"), KBigDecimal("251471859.74506983").setScale(16))
		assertEquals(KBigDecimal("-379797097.1666218600000000000"), KBigDecimal("-379797097.16662186").setScale(19))
		assertEquals(KBigDecimal("-375786062.6985250"), KBigDecimal("-375786062.698525").setScale(7))
		assertEquals(KBigDecimal("-598959534.5868990"), KBigDecimal("-598959534.586899").setScale(7))
		assertEquals(KBigDecimal("275902356.8563006500000000000"), KBigDecimal("275902356.85630065").setScale(19))
		assertEquals(KBigDecimal("34258754.89336459000"), KBigDecimal("34258754.89336459").setScale(11))
		assertEquals(KBigDecimal("-8234036.2929595880000000000"), KBigDecimal("-8234036.292959588").setScale(19))
		assertEquals(KBigDecimal("657680798.89939820000"), KBigDecimal("657680798.8993982").setScale(11))
		assertEquals(KBigDecimal("-111573161.664025920000000000"), KBigDecimal("-111573161.66402592").setScale(18))
		assertEquals(KBigDecimal("1453568496.0530560000000"), KBigDecimal("1453568496.053056").setScale(13))
	}

	@Test fun `test setScale with RoundingMode`() {
		assertEquals(KBigDecimal("516183722.3275196000000000"), KBigDecimal("516183722.3275196").setScale(16, CEILING))
		assertEquals(KBigDecimal("1250086130.07759000000"), KBigDecimal("1250086130.07759").setScale(11, DOWN))
		assertEquals(KBigDecimal("25877634.5556069460000000"), KBigDecimal("25877634.555606946").setScale(16, FLOOR))
		assertEquals(KBigDecimal("735407514.19195830000"), KBigDecimal("735407514.1919583").setScale(11, DOWN))
		assertEquals(KBigDecimal("-1564064366.411755800000"), KBigDecimal("-1564064366.4117558").setScale(12, CEILING))
		assertEquals(KBigDecimal("1143262146.0295851000"), KBigDecimal("1143262146.0295851").setScale(10, UP))
		assertEquals(KBigDecimal("34249707.2047069700000000"), KBigDecimal("34249707.20470697").setScale(16, HALF_EVEN))
		assertEquals(KBigDecimal("-41520153.550263"), KBigDecimal("-41520153.55026322").setScale(6, HALF_DOWN))
		assertEquals(KBigDecimal("-196672147.07885683"), KBigDecimal("-196672147.07885683").setScale(8, HALF_DOWN))
		assertEquals(KBigDecimal("338795793.895994660000"), KBigDecimal("338795793.89599466").setScale(12, FLOOR))
		assertEquals(KBigDecimal("-309692440.233354"), KBigDecimal("-309692440.23335445").setScale(6, HALF_EVEN))
	}

	@Test fun `test shortValueExact`() {
		assertEquals(13211, KBigDecimal("13211").shortValueExact())
		assertEquals(-13113, KBigDecimal("-13113").shortValueExact())
		assertEquals(15616, KBigDecimal("15616").shortValueExact())
		assertEquals(-6943, KBigDecimal("-6943").shortValueExact())
		assertEquals(31772, KBigDecimal("31772").shortValueExact())
		assertEquals(-14386, KBigDecimal("-14386").shortValueExact())
		assertEquals(12953, KBigDecimal("12953").shortValueExact())
		assertEquals(-5803, KBigDecimal("-5803").shortValueExact())
		assertEquals(17121, KBigDecimal("17121").shortValueExact())
		assertEquals(-12382, KBigDecimal("-12382").shortValueExact())
		assertEquals(-23525, KBigDecimal("-23525").shortValueExact())
	}

	@Test fun `test signum`() {
		assertEquals(1, KBigDecimal("144868779.13886184").signum())
		assertEquals(-1, KBigDecimal("-53418329.22606322").signum())
		assertEquals(1, KBigDecimal("491922775.15571076").signum())
		assertEquals(1, KBigDecimal("327283689.1880334").signum())
		assertEquals(1, KBigDecimal("235720855.61153132").signum())
		assertEquals(-1, KBigDecimal("-40480027.447660565").signum())
		assertEquals(1, KBigDecimal("79495664.18222089").signum())
		assertEquals(1, KBigDecimal("4447048.206109895").signum())
		assertEquals(-1, KBigDecimal("-237870848.0012691").signum())
		assertEquals(-1, KBigDecimal("-140636577.44844034").signum())
		assertEquals(-1, KBigDecimal("-10477170.352912283").signum())
	}

	@Test fun `test stripTrailingZeros`() {
		assertEquals(KBigDecimal("-9.842387453396865E+18"), KBigDecimal("-9842387453396865000").stripTrailingZeros())
		assertEquals(KBigDecimal("-1966968314020125"), KBigDecimal("-1966968314020125").stripTrailingZeros())
		assertEquals(KBigDecimal("-1.9096216903957006E+27"), KBigDecimal("-1909621690395700600000000000").stripTrailingZeros())
		assertEquals(KBigDecimal("-8.790432959506173E+18"), KBigDecimal("-8790432959506173000").stripTrailingZeros())
		assertEquals(KBigDecimal("1.412667712498972E+27"), KBigDecimal("1412667712498972000000000000").stripTrailingZeros())
		assertEquals(KBigDecimal("4.806061305344882E+24"), KBigDecimal("4806061305344882000000000").stripTrailingZeros())
		assertEquals(KBigDecimal("1.8120867159380996E+20"), KBigDecimal("181208671593809960000").stripTrailingZeros())
		assertEquals(KBigDecimal("1.251285237562161E+25"), KBigDecimal("12512852375621610000000000").stripTrailingZeros())
		assertEquals(KBigDecimal("2.222056519773168E+22"), KBigDecimal("22220565197731680000000").stripTrailingZeros())
		assertEquals(KBigDecimal("3.399083427587246E+19"), KBigDecimal("33990834275872460000").stripTrailingZeros())
		assertEquals(KBigDecimal("7.623375405948114E+20"), KBigDecimal("762337540594811400000").stripTrailingZeros())
	}

	@Test fun `test subtract`() {
		assertEquals(KBigDecimal("261711307.82919158"), KBigDecimal("222372237.22626758").subtract(KBigDecimal("-39339070.602924")))
		assertEquals(KBigDecimal("739036496.39776462"), KBigDecimal("665056726.8306923").subtract(KBigDecimal("-73979769.56707232")))
		assertEquals(KBigDecimal("1921514253.5918539"), KBigDecimal("1679784457.5891228").subtract(KBigDecimal("-241729796.0027311")))
		assertEquals(KBigDecimal("-468371118.291538669"), KBigDecimal("5072146.724489331").subtract(KBigDecimal("473443265.016028")))
		assertEquals(KBigDecimal("131147536.78359098"), KBigDecimal("-90494724.07496372").subtract(KBigDecimal("-221642260.8585547")))
		assertEquals(KBigDecimal("-576812861.09918350"), KBigDecimal("-240473065.93390614").subtract(KBigDecimal("336339795.16527736")))
		assertEquals(KBigDecimal("108914359.97488223"), KBigDecimal("-99295650.04304487").subtract(KBigDecimal("-208210010.0179271")))
		assertEquals(KBigDecimal("-521762737.9550820"), KBigDecimal("-1412969072.2858152").subtract(KBigDecimal("-891206334.3307332")))
		assertEquals(KBigDecimal("274745513.30492426"), KBigDecimal("77641846.12925336").subtract(KBigDecimal("-197103667.1756709")))
		assertEquals(KBigDecimal("-1372917278.1632184"), KBigDecimal("-255357264.8179976").subtract(KBigDecimal("1117560013.3452208")))
		assertEquals(KBigDecimal("612253029.89343834"), KBigDecimal("542499524.7903343").subtract(KBigDecimal("-69753505.10310404")))
	}

	@Test fun `test subtract with MathContext`() {
		assertEquals(KBigDecimal("-8.15225E+8"), KBigDecimal("11058922.472262679").subtract(KBigDecimal("826284644.9143876"), KMathContext(6, CEILING)))
		assertEquals(KBigDecimal("-3.7926E+8"), KBigDecimal("-417989498.51785177").subtract(KBigDecimal("-38726294.7357319"), KMathContext(5, CEILING)))
		assertEquals(KBigDecimal("-4.3015E+8"), KBigDecimal("-1004945089.9629071").subtract(KBigDecimal("-574798500.8175668"), KMathContext(5, HALF_DOWN)))
		assertEquals(KBigDecimal("-1.91E+8"), KBigDecimal("990148054.5378615").subtract(KBigDecimal("1181774495.1542127"), KMathContext(3, CEILING)))
		assertEquals(KBigDecimal("-1.03E+9"), KBigDecimal("-858042899.801002").subtract(KBigDecimal("166552214.47063136"), KMathContext(3, UP)))
		assertEquals(KBigDecimal("-1.47985E+9"), KBigDecimal("-190865208.2865886").subtract(KBigDecimal("1288980785.5932713"), KMathContext(6, FLOOR)))
		assertEquals(KBigDecimal("4.3078836E+8"), KBigDecimal("58703420.686390124").subtract(KBigDecimal("-372084943.42130166"), KMathContext(8, HALF_UP)))
		assertEquals(KBigDecimal("-5.3397E+8"), KBigDecimal("-649563289.5651178").subtract(KBigDecimal("-115601709.01630388"), KMathContext(5, UP)))
		assertEquals(KBigDecimal("4.0E+8"), KBigDecimal("10702264.672663562").subtract(KBigDecimal("-398389156.20785594"), KMathContext(2, DOWN)))
		assertEquals(KBigDecimal("-1.5389E+8"), KBigDecimal("-94619897.68574816").subtract(KBigDecimal("59268142.33080544"), KMathContext(5, UP)))
		assertEquals(KBigDecimal("-1.4E+9"), KBigDecimal("111252865.97332014").subtract(KBigDecimal("1524628520.2205942"), KMathContext(2, DOWN)))
	}

	@Test fun `test toBigInteger`() {
		assertEquals(KBigInteger("-457288077"), KBigDecimal("-457288077.7981733").toBigInteger())
		assertEquals(KBigInteger("1102775765"), KBigDecimal("1102775765.2848942").toBigInteger())
		assertEquals(KBigInteger("750980090"), KBigDecimal("750980090.7474704").toBigInteger())
		assertEquals(KBigInteger("-11290589"), KBigDecimal("-11290589.690746836").toBigInteger())
		assertEquals(KBigInteger("-25040193"), KBigDecimal("-25040193.512144122").toBigInteger())
		assertEquals(KBigInteger("157425060"), KBigDecimal("157425060.6396946").toBigInteger())
		assertEquals(KBigInteger("-1856181852"), KBigDecimal("-1856181852.8526142").toBigInteger())
		assertEquals(KBigInteger("31686041"), KBigDecimal("31686041.537348296").toBigInteger())
		assertEquals(KBigInteger("931310727"), KBigDecimal("931310727.6048284").toBigInteger())
		assertEquals(KBigInteger("-1021067097"), KBigDecimal("-1021067097.1354055").toBigInteger())
		assertEquals(KBigInteger("11318988"), KBigDecimal("11318988.741596323").toBigInteger())
	}

	@Test fun `test toBigIntegerExact`() {
		assertEquals(KBigInteger("8674907554835502382"), KBigDecimal("8674907554835502382").toBigIntegerExact())
		assertEquals(KBigInteger("8132842956545958730"), KBigDecimal("8132842956545958730").toBigIntegerExact())
		assertEquals(KBigInteger("-4412302956915914991"), KBigDecimal("-4412302956915914991").toBigIntegerExact())
		assertEquals(KBigInteger("-8615008931702554232"), KBigDecimal("-8615008931702554232").toBigIntegerExact())
		assertEquals(KBigInteger("-5068360407880694664"), KBigDecimal("-5068360407880694664").toBigIntegerExact())
		assertEquals(KBigInteger("-6623019182534513666"), KBigDecimal("-6623019182534513666").toBigIntegerExact())
		assertEquals(KBigInteger("8384380896162516618"), KBigDecimal("8384380896162516618").toBigIntegerExact())
		assertEquals(KBigInteger("-4181343705797620246"), KBigDecimal("-4181343705797620246").toBigIntegerExact())
		assertEquals(KBigInteger("-4737262672395037186"), KBigDecimal("-4737262672395037186").toBigIntegerExact())
		assertEquals(KBigInteger("-6020171648055179511"), KBigDecimal("-6020171648055179511").toBigIntegerExact())
		assertEquals(KBigInteger("-733397742392070044"), KBigDecimal("-733397742392070044").toBigIntegerExact())
	}

	@Test fun `test toEngineeringString`() {
		assertEquals("-266275924.0537523", KBigDecimal("-266275924.0537523").toEngineeringString())
		assertEquals("-871971644.9944252", KBigDecimal("-871971644.9944252").toEngineeringString())
		assertEquals("-357976768.76415426", KBigDecimal("-357976768.76415426").toEngineeringString())
		assertEquals("-293572672.89819294", KBigDecimal("-293572672.89819294").toEngineeringString())
		assertEquals("1118697565.646938", KBigDecimal("1118697565.646938").toEngineeringString())
		assertEquals("1207301810.7329664", KBigDecimal("1207301810.7329664").toEngineeringString())
		assertEquals("-897628572.9385114", KBigDecimal("-897628572.9385114").toEngineeringString())
		assertEquals("-19929016.285751954", KBigDecimal("-19929016.285751954").toEngineeringString())
		assertEquals("-333560209.4244687", KBigDecimal("-333560209.4244687").toEngineeringString())
		assertEquals("1448845219.6286798", KBigDecimal("1448845219.6286798").toEngineeringString())
		assertEquals("-113363554.22474106", KBigDecimal("-113363554.22474106").toEngineeringString())
	}

	@Test fun `test toPlainString`() {
		assertEquals("-371745567.0420838", KBigDecimal("-371745567.0420838").toPlainString())
		assertEquals("-440168311.730597", KBigDecimal("-440168311.730597").toPlainString())
		assertEquals("-1037125758.9028625", KBigDecimal("-1037125758.9028625").toPlainString())
		assertEquals("95955868.99804358", KBigDecimal("95955868.99804358").toPlainString())
		assertEquals("364197134.81338674", KBigDecimal("364197134.81338674").toPlainString())
		assertEquals("294378634.8014544", KBigDecimal("294378634.8014544").toPlainString())
		assertEquals("-483635891.1658803", KBigDecimal("-483635891.1658803").toPlainString())
		assertEquals("-17109797.366144903", KBigDecimal("-17109797.366144903").toPlainString())
		assertEquals("-855809.786950302", KBigDecimal("-855809.786950302").toPlainString())
		assertEquals("50824746.08772517", KBigDecimal("50824746.08772517").toPlainString())
		assertEquals("51421640.132966034", KBigDecimal("51421640.132966034").toPlainString())
	}

	@Test fun `test ulp`() {
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("-1729490207.2600007").ulp())
		assertEquals(KBigDecimal("1E-8"), KBigDecimal("126173547.44889235").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("1586752024.6216505").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("-822779130.7101643").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("916848926.0542014").ulp())
		assertEquals(KBigDecimal("1E-8"), KBigDecimal("-193151493.67801207").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("1091400365.4118214").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("-345467420.5481452").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("-549202884.0497727").ulp())
		assertEquals(KBigDecimal("1E-9"), KBigDecimal("-12772512.424138514").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("-439930790.6521111").ulp())
	}

	@Test fun `test unscaledValue`() {
		assertEquals(KBigInteger("12694082705829043"), KBigDecimal("1269408270.5829043").unscaledValue())
		assertEquals(KBigInteger("-8453427280666454"), KBigDecimal("-845342728.0666454").unscaledValue())
		assertEquals(KBigInteger("32182095068149626"), KBigDecimal("321820950.68149626").unscaledValue())
		assertEquals(KBigInteger("-11174187495563192"), KBigDecimal("-1117418749.5563192").unscaledValue())
		assertEquals(KBigInteger("4566735426445826"), KBigDecimal("456673542.6445826").unscaledValue())
		assertEquals(KBigInteger("16205046060996542"), KBigDecimal("1620504606.0996542").unscaledValue())
		assertEquals(KBigInteger("18741358546990448"), KBigDecimal("187413585.46990448").unscaledValue())
		assertEquals(KBigInteger("-9184199506388006"), KBigDecimal("-91841995.06388006").unscaledValue())
		assertEquals(KBigInteger("7000314149007224"), KBigDecimal("70003141.49007224").unscaledValue())
		assertEquals(KBigInteger("-4081454458885568"), KBigDecimal("-408145445.8885568").unscaledValue())
		assertEquals(KBigInteger("33093976463200855"), KBigDecimal("330939764.63200855").unscaledValue())
	}


}
