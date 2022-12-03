
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

	@Test fun `test add with mc`() {
		assertEquals(KBigDecimal("-1.150268E+9"), KBigDecimal("-675844085.4233485").add(KBigDecimal("-474423814.94483757"), KMathContext(7, UP)))
		assertEquals(KBigDecimal("-4.02E+8"), KBigDecimal("759876622.173756").add(KBigDecimal("-1161332847.470284"), KMathContext(3, UP)))
		assertEquals(KBigDecimal("1.0627530E+9"), KBigDecimal("924565987.3278322").add(KBigDecimal("138187048.76235235"), KMathContext(8, HALF_EVEN)))
		assertEquals(KBigDecimal("-9.9401E+8"), KBigDecimal("-1406996614.7088475").add(KBigDecimal("412990833.2978394"), KMathContext(5, HALF_EVEN)))
		assertEquals(KBigDecimal("373407336"), KBigDecimal("728625410.9706949").add(KBigDecimal("-355218074.3232708"), KMathContext(9, FLOOR)))
		assertEquals(KBigDecimal("9.9613069E+8"), KBigDecimal("-379804388.84803605").add(KBigDecimal("1375935074.0174305"), KMathContext(8, CEILING)))
		assertEquals(KBigDecimal("4E+8"), KBigDecimal("199199851.7758977").add(KBigDecimal("157505219.99844605"), KMathContext(1, HALF_DOWN)))
		assertEquals(KBigDecimal("-7.7595186E+8"), KBigDecimal("-1128584244.777766").add(KBigDecimal("352632385.3791467"), KMathContext(8, FLOOR)))
		assertEquals(KBigDecimal("1.1463995E+9"), KBigDecimal("354109522.14027476").add(KBigDecimal("792289997.9249882"), KMathContext(8, HALF_UP)))
		assertEquals(KBigDecimal("-1.2332E+8"), KBigDecimal("-244105627.82623768").add(KBigDecimal("120793866.86782597"), KMathContext(5, FLOOR)))
		assertEquals(KBigDecimal("-9.9467E+8"), KBigDecimal("-522341963.14925516").add(KBigDecimal("-472325589.02161324"), KMathContext(5, UP)))
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
		assertEquals(KBigDecimal("6.767746"), KBigDecimal("1480823056.843158").divide(KBigDecimal("218805968.26770258"), CEILING))
		assertEquals(KBigDecimal("6.32869147"), KBigDecimal("-114075683.93385269").divide(KBigDecimal("-18025161.200536225"), CEILING))
		assertEquals(KBigDecimal("22.6244499"), KBigDecimal("909140873.6147215").divide(KBigDecimal("40183999.0187007"), FLOOR))
		assertEquals(KBigDecimal("1.7820177"), KBigDecimal("1298872479.0962298").divide(KBigDecimal("728877430.1486664"), HALF_EVEN))
		assertEquals(KBigDecimal("-0.33476562"), KBigDecimal("18147998.73683848").divide(KBigDecimal("-54211060.0672527"), FLOOR))
		assertEquals(KBigDecimal("0.46328125"), KBigDecimal("-254964721.59129804").divide(KBigDecimal("-550345435.2300467"), DOWN))
		assertEquals(KBigDecimal("1.06437207"), KBigDecimal("-294148612.06468046").divide(KBigDecimal("-276358823.690559"), HALF_UP))
		assertEquals(KBigDecimal("-1.4676573"), KBigDecimal("-292353598.6409018").divide(KBigDecimal("199197463.1572587"), FLOOR))
		assertEquals(KBigDecimal("-5.1666804"), KBigDecimal("778374847.6050745").divide(KBigDecimal("-150652795.90001202"), FLOOR))
		assertEquals(KBigDecimal("-0.3961430"), KBigDecimal("-571228995.7521011").divide(KBigDecimal("1441976860.8424008"), UP))
		assertEquals(KBigDecimal("-3.1837349"), KBigDecimal("-235813042.5722397").divide(KBigDecimal("74068051.56425187"), HALF_DOWN))
	}

	@Test fun `test divide with math context`() {
		assertEquals(KBigDecimal("-0.161586"), KBigDecimal("67292179.71385333").divide(KBigDecimal("-416447777.4133185"), KMathContext(6, HALF_EVEN)))
		assertEquals(KBigDecimal("-0.677715"), KBigDecimal("-785212155.7348468").divide(KBigDecimal("1158616935.3838212"), KMathContext(6, CEILING)))
		assertEquals(KBigDecimal("-1.1145"), KBigDecimal("-1160812480.4163346").divide(KBigDecimal("1041558883.1254534"), KMathContext(5, HALF_DOWN)))
		assertEquals(KBigDecimal("0.091638"), KBigDecimal("-28852079.859152712").divide(KBigDecimal("-314848860.1390203"), KMathContext(5, CEILING)))
		assertEquals(KBigDecimal("-0.0967808860"), KBigDecimal("-33341244.8754943").divide(KBigDecimal("344502372.5551315"), KMathContext(9, CEILING)))
		assertEquals(KBigDecimal("0.510"), KBigDecimal("152796620.5265021").divide(KBigDecimal("299086193.5363742"), KMathContext(3, DOWN)))
		assertEquals(KBigDecimal("0.322690113"), KBigDecimal("251835260.28429908").divide(KBigDecimal("780424471.6630119"), KMathContext(9, CEILING)))
		assertEquals(KBigDecimal("0.60429"), KBigDecimal("321943312.85114264").divide(KBigDecimal("532764659.1024282"), KMathContext(5, CEILING)))
		assertEquals(KBigDecimal("-2.5"), KBigDecimal("1598230603.4288957").divide(KBigDecimal("-640537007.7833391"), KMathContext(2, FLOOR)))
		assertEquals(KBigDecimal("-0.66368"), KBigDecimal("28655590.948701665").divide(KBigDecimal("-43176888.62237175"), KMathContext(5, HALF_EVEN)))
		assertEquals(KBigDecimal("0.57"), KBigDecimal("-740028390.0913398").divide(KBigDecimal("-1298525333.7510824"), KMathContext(2, HALF_DOWN)))
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

	@Test fun `test divideAndRemainder with math context`() {
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("42717969.40366649")), KBigDecimal("42717969.40366649").divideAndRemainder(KBigDecimal("-1590727659.9535892"), KMathContext(3, CEILING)).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("-324530096.98066115")), KBigDecimal("-324530096.98066115").divideAndRemainder(KBigDecimal("447661384.4024426"), KMathContext(5, DOWN)).asList())
		assertEquals(listOf(KBigDecimal("0.00"), KBigDecimal("25553502.832766782")), KBigDecimal("25553502.832766782").divideAndRemainder(KBigDecimal("648425442.8635095"), KMathContext(1, HALF_DOWN)).asList())
		assertEquals(listOf(KBigDecimal("-1.0"), KBigDecimal("-427926592.8390291")), KBigDecimal("-1007909352.8882061").divideAndRemainder(KBigDecimal("579982760.049177"), KMathContext(5, FLOOR)).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("212299470.94247726")), KBigDecimal("212299470.94247726").divideAndRemainder(KBigDecimal("1018749155.5705159"), KMathContext(7, FLOOR)).asList())
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("185739914.30591717")), KBigDecimal("185739914.30591717").divideAndRemainder(KBigDecimal("454240870.06959987"), KMathContext(4, HALF_EVEN)).asList())
		assertEquals(listOf(KBigDecimal("2"), KBigDecimal("-75753770.2429225")), KBigDecimal("-829736041.1504835").divideAndRemainder(KBigDecimal("-376991135.4537805"), KMathContext(2, CEILING)).asList())
		assertEquals(listOf(KBigDecimal("-4"), KBigDecimal("-204400783.88747332")), KBigDecimal("-1498939511.9978392").divideAndRemainder(KBigDecimal("323634682.02759147"), KMathContext(5, HALF_DOWN)).asList())
		assertEquals(listOf(KBigDecimal("-7"), KBigDecimal("154209408.17746801")), KBigDecimal("1464574829.3096583").divideAndRemainder(KBigDecimal("-187195060.16174147"), KMathContext(7, UP)).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("-120187432.93513387")), KBigDecimal("-120187432.93513387").divideAndRemainder(KBigDecimal("1672685224.8150556"), KMathContext(8, UP)).asList())
		assertEquals(listOf(KBigDecimal("2"), KBigDecimal("151577208.2079671")), KBigDecimal("1446128993.4640043").divideAndRemainder(KBigDecimal("647275892.6280186"), KMathContext(5, HALF_EVEN)).asList())
	}


}
