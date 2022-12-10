
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
	}

	@Test fun `test add`() {
		assertEquals(KBigDecimal("899786444.60149766"), KBigDecimal("867741650.7651018").add(KBigDecimal("32044793.83639586")))
		assertEquals(KBigDecimal("937197045.667794154"), KBigDecimal("21728588.139045954").add(KBigDecimal("915468457.5287482")))
		assertEquals(KBigDecimal("-319184276.844936845"), KBigDecimal("-260742745.01244345").add(KBigDecimal("-58441531.832493395")))
		assertEquals(KBigDecimal("-1057309409.516981081"), KBigDecimal("-1043431995.2780722").add(KBigDecimal("-13877414.238908881")))
		assertEquals(KBigDecimal("-71113390.35725492"), KBigDecimal("-225904344.67622444").add(KBigDecimal("154790954.31896952")))
		assertEquals(KBigDecimal("295540325.64325829"), KBigDecimal("-77943523.59860335").add(KBigDecimal("373483849.24186164")))
		assertEquals(KBigDecimal("-1638875604.3183392"), KBigDecimal("-1420588929.325193").add(KBigDecimal("-218286674.9931462")))
		assertEquals(KBigDecimal("-195860005.0663295"), KBigDecimal("-554687647.0560478").add(KBigDecimal("358827641.9897183")))
		assertEquals(KBigDecimal("-2038651764.6781109"), KBigDecimal("-1344739039.2288222").add(KBigDecimal("-693912725.4492887")))
		assertEquals(KBigDecimal("-189827067.41437729"), KBigDecimal("-267338319.57122326").add(KBigDecimal("77511252.15684597")))
	}

	@Test fun `test add with MathContext`() {
		assertEquals(KBigDecimal("-4.5312415E+8"), KBigDecimal("-350418945.58452314").add(KBigDecimal("-102705200.27920488"), KMathContext(8, HALF_EVEN)))
		assertEquals(KBigDecimal("1.1E+9"), KBigDecimal("272066192.0373929").add(KBigDecimal("860330778.8553169"), KMathContext(2, FLOOR)))
		assertEquals(KBigDecimal("-6.30772E+8"), KBigDecimal("205029389.5172414").add(KBigDecimal("-835800992.8204648"), KMathContext(6, FLOOR)))
		assertEquals(KBigDecimal("-1.10200483E+9"), KBigDecimal("-1039942633.8051287").add(KBigDecimal("-62062196.33153094"), KMathContext(9, DOWN)))
		assertEquals(KBigDecimal("-1E+8"), KBigDecimal("-47705251.71442003").add(KBigDecimal("-95154373.98379374"), KMathContext(1, HALF_EVEN)))
		assertEquals(KBigDecimal("-2E+9"), KBigDecimal("-328949492.40261227").add(KBigDecimal("-678316908.4247005"), KMathContext(1, FLOOR)))
		assertEquals(KBigDecimal("8.205443E+8"), KBigDecimal("101010749.64335968").add(KBigDecimal("719533540.065523"), KMathContext(7, CEILING)))
		assertEquals(KBigDecimal("317806026"), KBigDecimal("1256844409.6841657").add(KBigDecimal("-939038384.4062179"), KMathContext(9, CEILING)))
		assertEquals(KBigDecimal("-1.0E+9"), KBigDecimal("39480716.18212621").add(KBigDecimal("-1092994600.7255685"), KMathContext(2, CEILING)))
		assertEquals(KBigDecimal("1.9581E+8"), KBigDecimal("25043557.71350461").add(KBigDecimal("170764697.70479262"), KMathContext(5, UP)))
	}

	@Test fun `test byteValueExact`() {
		assertEquals(48, KBigDecimal("48").byteValueExact())
		assertEquals(83, KBigDecimal("83").byteValueExact())
		assertEquals(103, KBigDecimal("103").byteValueExact())
		assertEquals(30, KBigDecimal("30").byteValueExact())
		assertEquals(48, KBigDecimal("48").byteValueExact())
		assertEquals(11, KBigDecimal("11").byteValueExact())
		assertEquals(106, KBigDecimal("106").byteValueExact())
		assertEquals(16, KBigDecimal("16").byteValueExact())
		assertEquals(57, KBigDecimal("57").byteValueExact())
		assertEquals(123, KBigDecimal("123").byteValueExact())
	}

	@Test fun `test compareTo`() {
		assertEquals(1, KBigDecimal("301379453.8820794").compareTo(KBigDecimal("232519770.26399696")))
		assertEquals(1, KBigDecimal("192412925.20430562").compareTo(KBigDecimal("100101389.30596967")))
		assertEquals(1, KBigDecimal("-116339035.62576436").compareTo(KBigDecimal("-1071441813.5951731")))
		assertEquals(1, KBigDecimal("-32554783.475242373").compareTo(KBigDecimal("-323449976.4523882")))
		assertEquals(1, KBigDecimal("147059254.55036294").compareTo(KBigDecimal("-774664463.980196")))
		assertEquals(1, KBigDecimal("1396803726.6878912").compareTo(KBigDecimal("-843656347.3911022")))
		assertEquals(1, KBigDecimal("-197239172.8617261").compareTo(KBigDecimal("-1055901458.6371557")))
		assertEquals(-1, KBigDecimal("-846822442.1256274").compareTo(KBigDecimal("9123339.151009666")))
		assertEquals(-1, KBigDecimal("180606333.94741395").compareTo(KBigDecimal("1040927379.5264063")))
		assertEquals(-1, KBigDecimal("186092363.69781786").compareTo(KBigDecimal("597661379.2125565")))
	}

	@Test fun `test divide`() {
		assertEquals(KBigDecimal("620294138.4507527"), KBigDecimal("22950883122.6778499").divide(KBigDecimal("37")))
		assertEquals(KBigDecimal("-221951697.29020488"), KBigDecimal("-6214647524.12573664").divide(KBigDecimal("28")))
		assertEquals(KBigDecimal("362117868.90925884"), KBigDecimal("13760479018.55183592").divide(KBigDecimal("38")))
		assertEquals(KBigDecimal("-135340952.12609074"), KBigDecimal("-5413638085.04362960").divide(KBigDecimal("40")))
		assertEquals(KBigDecimal("671265804.2521101"), KBigDecimal("30206961191.3449545").divide(KBigDecimal("45")))
		assertEquals(KBigDecimal("-266089789.76071358"), KBigDecimal("-14634938436.83924690").divide(KBigDecimal("55")))
		assertEquals(KBigDecimal("732833027.3155468"), KBigDecimal("24183489901.4130444").divide(KBigDecimal("33")))
		assertEquals(KBigDecimal("-55933010.49926584"), KBigDecimal("-3188181598.45815288").divide(KBigDecimal("57")))
		assertEquals(KBigDecimal("-1307227864.587651"), KBigDecimal("-115036052083.713288").divide(KBigDecimal("88")))
		assertEquals(KBigDecimal("580825172.291098"), KBigDecimal("10454853101.239764").divide(KBigDecimal("18")))
	}

	@Test fun `test divide with rounding mode`() {
		assertEquals(KBigDecimal("-0.5285212"), KBigDecimal("-174262417.4431698").divide(KBigDecimal("329717012.99129194"), HALF_EVEN))
		assertEquals(KBigDecimal("0.84102311"), KBigDecimal("378514416.72099936").divide(KBigDecimal("450064225.534157"), HALF_UP))
		assertEquals(KBigDecimal("-0.54356860"), KBigDecimal("263461231.08073908").divide(KBigDecimal("-484688093.03888416"), DOWN))
		assertEquals(KBigDecimal("5.88073197"), KBigDecimal("-462692769.16824037").divide(KBigDecimal("-78679451.9748791"), FLOOR))
		assertEquals(KBigDecimal("0.595223"), KBigDecimal("881418551.859444").divide(KBigDecimal("1480823056.843158"), UP))
		assertEquals(KBigDecimal("-1.91807720"), KBigDecimal("218805968.26770258").divide(KBigDecimal("-114075683.93385269"), HALF_EVEN))
		assertEquals(KBigDecimal("-0.019826587"), KBigDecimal("-18025161.200536225").divide(KBigDecimal("909140873.6147215"), DOWN))
		assertEquals(KBigDecimal("0.0309376"), KBigDecimal("40183999.0187007").divide(KBigDecimal("1298872479.0962298"), HALF_EVEN))
		assertEquals(KBigDecimal("40.1629646"), KBigDecimal("728877430.1486664").divide(KBigDecimal("18147998.73683848"), HALF_DOWN))
		assertEquals(KBigDecimal("0.2126218"), KBigDecimal("-54211060.0672527").divide(KBigDecimal("-254964721.59129804"), FLOOR))
	}

	@Test fun `test divide with MathContext`() {
		assertEquals(KBigDecimal("1.870"), KBigDecimal("-550345435.2300467").divide(KBigDecimal("-294148612.06468046"), KMathContext(4, DOWN)))
		assertEquals(KBigDecimal("1.3110284"), KBigDecimal("756152155.8461794").divide(KBigDecimal("576762590.1179792"), KMathContext(8, HALF_DOWN)))
		assertEquals(KBigDecimal("-0.1919"), KBigDecimal("93903353.73310472").divide(KBigDecimal("-489455533.05737334"), KMathContext(4, HALF_DOWN)))
		assertEquals(KBigDecimal("-0.40"), KBigDecimal("-571228995.7521011").divide(KBigDecimal("1441976860.8424008"), KMathContext(2, HALF_UP)))
		assertEquals(KBigDecimal("-0.6350746"), KBigDecimal("-592987734.8648772").divide(KBigDecimal("933729216.1146508"), KMathContext(7, DOWN)))
		assertEquals(KBigDecimal("-6.69"), KBigDecimal("509016929.74577534").divide(KBigDecimal("-76059335.28900984"), KMathContext(3, CEILING)))
		assertEquals(KBigDecimal("0.5"), KBigDecimal("-769496325.8436219").divide(KBigDecimal("-1425503079.1649961"), KMathContext(1, DOWN)))
		assertEquals(KBigDecimal("0.987561"), KBigDecimal("-593532451.6540307").divide(KBigDecimal("-601008328.036767"), KMathContext(6, DOWN)))
		assertEquals(KBigDecimal("8.031686"), KBigDecimal("90727629.62359783").divide(KBigDecimal("11296212.182309737"), KMathContext(7, HALF_UP)))
		assertEquals(KBigDecimal("-0.00742182"), KBigDecimal("7866507.033629755").divide(KBigDecimal("-1059916677.2172077"), KMathContext(6, HALF_UP)))
	}

	@Test fun `test divideAndRemainder`() {
		assertEquals(listOf(KBigDecimal("-1"), KBigDecimal("73192705.47083728")), KBigDecimal("168446590.37019315").divideAndRemainder(KBigDecimal("-95253884.89935587")).asList())
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("572106625.5601058")), KBigDecimal("572106625.5601058").divideAndRemainder(KBigDecimal("1035286423.8769199")).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("321943312.85114264")), KBigDecimal("321943312.85114264").divideAndRemainder(KBigDecimal("532764659.1024282")).asList())
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("783551635.3538465")), KBigDecimal("783551635.3538465").divideAndRemainder(KBigDecimal("1019052717.5406548")).asList())
		assertEquals(listOf(KBigDecimal("-8"), KBigDecimal("-96739923.31549026")), KBigDecimal("-1531512258.7836497").divideAndRemainder(KBigDecimal("179346541.93351993")).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("119017394.61332785")), KBigDecimal("119017394.61332785").divideAndRemainder(KBigDecimal("-740028390.0913398")).asList())
		assertEquals(listOf(KBigDecimal("1"), KBigDecimal("-75203451.6333861")), KBigDecimal("-1298525333.7510824").divideAndRemainder(KBigDecimal("-1223321882.1176963")).asList())
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("644861092.7820077")), KBigDecimal("644861092.7820077").divideAndRemainder(KBigDecimal("1292579249.2654858")).asList())
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("990980908.3750578")), KBigDecimal("990980908.3750578").divideAndRemainder(KBigDecimal("-1233458640.1045706")).asList())
		assertEquals(listOf(KBigDecimal("-1"), KBigDecimal("-88921670.326991")), KBigDecimal("-760758168.734448").divideAndRemainder(KBigDecimal("671836498.407457")).asList())
	}

	@Test fun `test divideAndRemainder with MathContext`() {
		assertEquals(listOf(KBigDecimal("1"), KBigDecimal("-101948961.2447718")), KBigDecimal("-747198191.6388943").divideAndRemainder(KBigDecimal("-645249230.3941225"), KMathContext(7, UP)).asList())
		assertEquals(listOf(KBigDecimal("0.00"), KBigDecimal("-5063554.486304897")), KBigDecimal("-5063554.486304897").divideAndRemainder(KBigDecimal("740691742.7480755"), KMathContext(8, HALF_UP)).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("50454150.51417261")), KBigDecimal("50454150.51417261").divideAndRemainder(KBigDecimal("-634143013.4982047"), KMathContext(6, HALF_DOWN)).asList())
		assertEquals(listOf(KBigDecimal("0E+1"), KBigDecimal("648024770.838023")), KBigDecimal("648024770.838023").divideAndRemainder(KBigDecimal("1261794210.3297958"), KMathContext(7, HALF_EVEN)).asList())
		assertEquals(listOf(KBigDecimal("0.0"), KBigDecimal("-5052669.751661858")), KBigDecimal("-5052669.751661858").divideAndRemainder(KBigDecimal("-482809798.95607054"), KMathContext(1, UP)).asList())
		assertEquals(listOf(KBigDecimal("-4"), KBigDecimal("-128336524.03233242")), KBigDecimal("-688920745.6987039").divideAndRemainder(KBigDecimal("140146055.41659287"), KMathContext(1, CEILING)).asList())
		assertEquals(listOf(KBigDecimal("9"), KBigDecimal("8493826.23939135")), KBigDecimal("190895282.8850397").divideAndRemainder(KBigDecimal("20266828.51618315"), KMathContext(5, HALF_EVEN)).asList())
		assertEquals(listOf(KBigDecimal("-3"), KBigDecimal("-15210312.64067249")), KBigDecimal("-1590727659.9535892").divideAndRemainder(KBigDecimal("525172449.10430557"), KMathContext(5, DOWN)).asList())
		assertEquals(listOf(KBigDecimal("13"), KBigDecimal("8183215.96831362")), KBigDecimal("447661384.4024426").divideAndRemainder(KBigDecimal("33806012.95647146"), KMathContext(2, HALF_EVEN)).asList())
		assertEquals(listOf(KBigDecimal("0"), KBigDecimal("648425442.8635095")), KBigDecimal("648425442.8635095").divideAndRemainder(KBigDecimal("-931789543.1605971"), KMathContext(4, HALF_EVEN)).asList())
	}

	@Test fun `test divideToIntegralValue`() {
		assertEquals(KBigDecimal("1"), KBigDecimal("579982760.049177").divideToIntegralValue(KBigDecimal("349315490.4464638")))
		assertEquals(KBigDecimal("-7"), KBigDecimal("-207149354.661582").divideToIntegralValue(KBigDecimal("28993029.16312942")))
		assertEquals(KBigDecimal("0"), KBigDecimal("71240618.39835088").divideToIntegralValue(KBigDecimal("521794216.13989204")))
		assertEquals(KBigDecimal("2"), KBigDecimal("-829736041.1504835").divideToIntegralValue(KBigDecimal("-376991135.4537805")))
		assertEquals(KBigDecimal("-21"), KBigDecimal("-1139566098.1262183").divideToIntegralValue(KBigDecimal("51885630.54081879")))
		assertEquals(KBigDecimal("71"), KBigDecimal("-758209071.4650937").divideToIntegralValue(KBigDecimal("-10673766.392312694")))
		assertEquals(KBigDecimal("-1"), KBigDecimal("187920755.387896").divideToIntegralValue(KBigDecimal("-120187432.93513387")))
		assertEquals(KBigDecimal("26"), KBigDecimal("1672685224.8150556").divideToIntegralValue(KBigDecimal("64261903.05361387")))
		assertEquals(KBigDecimal("4.0"), KBigDecimal("-169786152.30219588").divideToIntegralValue(KBigDecimal("-33967996.4946326")))
		assertEquals(KBigDecimal("-2"), KBigDecimal("1582851197.3139393").divideToIntegralValue(KBigDecimal("-542597288.2406185")))
	}

	@Test fun `test divideToIntegralValue with MathContext`() {
		assertEquals(KBigDecimal("0.0"), KBigDecimal("122198106.92167222").divideToIntegralValue(KBigDecimal("424114888.5688118"), KMathContext(7, CEILING)))
		assertEquals(KBigDecimal("0"), KBigDecimal("-108293503.94198851").divideToIntegralValue(KBigDecimal("-414833557.68295795"), KMathContext(2, HALF_DOWN)))
		assertEquals(KBigDecimal("3"), KBigDecimal("999477561.0824475").divideToIntegralValue(KBigDecimal("312427903.48579687"), KMathContext(3, DOWN)))
		assertEquals(KBigDecimal("0.0"), KBigDecimal("253504675.33159336").divideToIntegralValue(KBigDecimal("730411496.7040724"), KMathContext(3, HALF_DOWN)))
		assertEquals(KBigDecimal("4"), KBigDecimal("-1406053134.9340322").divideToIntegralValue(KBigDecimal("-302458242.60902274"), KMathContext(3, HALF_DOWN)))
		assertEquals(KBigDecimal("-1"), KBigDecimal("-187774338.1068777").divideToIntegralValue(KBigDecimal("184127214.49721962"), KMathContext(2, HALF_EVEN)))
		assertEquals(KBigDecimal("0E+1"), KBigDecimal("490796034.971423").divideToIntegralValue(KBigDecimal("-592606861.8082557"), KMathContext(5, HALF_EVEN)))
		assertEquals(KBigDecimal("3"), KBigDecimal("-1285947150.9361742").divideToIntegralValue(KBigDecimal("-425520482.0775743"), KMathContext(2, HALF_EVEN)))
		assertEquals(KBigDecimal("-4"), KBigDecimal("-414893188.7499126").divideToIntegralValue(KBigDecimal("91702153.45007044"), KMathContext(2, HALF_UP)))
		assertEquals(KBigDecimal("-2"), KBigDecimal("-533982509.91091305").divideToIntegralValue(KBigDecimal("249841354.43697646"), KMathContext(2, HALF_EVEN)))
	}

	@Test fun `test doubleValue`() {
		assertEquals(9.44895712068885E8, KBigDecimal("944895712.068885").doubleValue())
		assertEquals(8.904716243624302E8, KBigDecimal("890471624.3624302").doubleValue())
		assertEquals(8.141797318786556E8, KBigDecimal("814179731.8786556").doubleValue())
		assertEquals(3.1483807019111294E8, KBigDecimal("314838070.19111294").doubleValue())
		assertEquals(1.90875766283551E8, KBigDecimal("190875766.283551").doubleValue())
		assertEquals(-2.158350125142408E8, KBigDecimal("-215835012.5142408").doubleValue())
		assertEquals(1.0438758964151511E9, KBigDecimal("1043875896.4151511").doubleValue())
		assertEquals(-7.293264820001681E8, KBigDecimal("-729326482.0001681").doubleValue())
		assertEquals(-7.641715387885159E8, KBigDecimal("-764171538.7885159").doubleValue())
		assertEquals(-8.016921802207339E7, KBigDecimal("-80169218.02207339").doubleValue())
	}

	@Test fun `test floatValue`() {
		assertEquals(-8247098.5f, KBigDecimal("-8247098.7041499885").floatValue())
		assertEquals(3.08854144E8f, KBigDecimal("308854142.0561129").floatValue())
		assertEquals(1.91757408E8f, KBigDecimal("191757407.46906573").floatValue())
		assertEquals(-1.595632E8f, KBigDecimal("-159563193.44635776").floatValue())
		assertEquals(6.0300147E8f, KBigDecimal("603001451.2770748").floatValue())
		assertEquals(6.1060717E8f, KBigDecimal("610607180.0892429").floatValue())
		assertEquals(-8.1795584E7f, KBigDecimal("-81795581.14152132").floatValue())
		assertEquals(-2.1676614E7f, KBigDecimal("-21676613.629843365").floatValue())
		assertEquals(-7.2439584E8f, KBigDecimal("-724395812.1437535").floatValue())
		assertEquals(-1.71638502E9f, KBigDecimal("-1716385065.7141826").floatValue())
	}

	@Test fun `test intValue`() {
		assertEquals(276592491, KBigDecimal("276592491.0360513").intValue())
		assertEquals(80853162, KBigDecimal("80853162.22463766").intValue())
		assertEquals(-1198864160, KBigDecimal("-1198864160.7618518").intValue())
		assertEquals(26824020, KBigDecimal("26824020.670175325").intValue())
		assertEquals(-276159379, KBigDecimal("-276159379.6237286").intValue())
		assertEquals(-117864906, KBigDecimal("-117864906.09430628").intValue())
		assertEquals(141898853, KBigDecimal("141898853.8313132").intValue())
		assertEquals(-67461150, KBigDecimal("-67461150.29361194").intValue())
		assertEquals(489494769, KBigDecimal("489494769.55172473").intValue())
		assertEquals(12414495, KBigDecimal("12414495.056529505").intValue())
	}

	@Test fun `test intValueExact`() {
		assertEquals(1477304407, KBigDecimal("1477304407").intValueExact())
		assertEquals(1213158203, KBigDecimal("1213158203").intValueExact())
		assertEquals(849046340, KBigDecimal("849046340").intValueExact())
		assertEquals(113701740, KBigDecimal("113701740").intValueExact())
		assertEquals(1622225117, KBigDecimal("1622225117").intValueExact())
		assertEquals(1794309147, KBigDecimal("1794309147").intValueExact())
		assertEquals(-1723541867, KBigDecimal("-1723541867").intValueExact())
		assertEquals(-1738351546, KBigDecimal("-1738351546").intValueExact())
		assertEquals(-972454275, KBigDecimal("-972454275").intValueExact())
		assertEquals(694400921, KBigDecimal("694400921").intValueExact())
	}

	@Test fun `test longValue`() {
		assertEquals(-555065502, KBigDecimal("-555065502.0389318").longValue())
		assertEquals(85362716, KBigDecimal("85362716.88681039").longValue())
		assertEquals(-1310665388, KBigDecimal("-1310665388.5635993").longValue())
		assertEquals(697491972, KBigDecimal("697491972.2730649").longValue())
		assertEquals(32619392, KBigDecimal("32619392.44569916").longValue())
		assertEquals(1554187663, KBigDecimal("1554187663.421269").longValue())
		assertEquals(-871197332, KBigDecimal("-871197332.6090508").longValue())
		assertEquals(-40786524, KBigDecimal("-40786524.927945256").longValue())
		assertEquals(-1912544, KBigDecimal("-1912544.5424693814").longValue())
		assertEquals(47189019, KBigDecimal("47189019.76217357").longValue())
	}

	@Test fun `test longValueExact`() {
		assertEquals(3766417646933728899, KBigDecimal("3766417646933728899").longValueExact())
		assertEquals(7530240028686522768, KBigDecimal("7530240028686522768").longValueExact())
		assertEquals(6254324219137685537, KBigDecimal("6254324219137685537").longValueExact())
		assertEquals(-2024590275205745491, KBigDecimal("-2024590275205745491").longValueExact())
		assertEquals(-2342348328279322866, KBigDecimal("-2342348328279322866").longValueExact())
		assertEquals(-3794378123711536653, KBigDecimal("-3794378123711536653").longValueExact())
		assertEquals(-2268338881732033213, KBigDecimal("-2268338881732033213").longValueExact())
		assertEquals(6364948605857766181, KBigDecimal("6364948605857766181").longValueExact())
		assertEquals(-447176684953324726, KBigDecimal("-447176684953324726").longValueExact())
		assertEquals(3597095253459770428, KBigDecimal("3597095253459770428").longValueExact())
	}

	@Test fun `test max`() {
		assertEquals(KBigDecimal("1102323375.111723"), KBigDecimal("-251112441.2005114").max(KBigDecimal("1102323375.111723")))
		assertEquals(KBigDecimal("221287913.6990621"), KBigDecimal("221287913.6990621").max(KBigDecimal("62398813.36693443")))
		assertEquals(KBigDecimal("1125862872.6811917"), KBigDecimal("-436873380.51883847").max(KBigDecimal("1125862872.6811917")))
		assertEquals(KBigDecimal("87372558.4869226"), KBigDecimal("87372558.4869226").max(KBigDecimal("-548018686.8454955")))
		assertEquals(KBigDecimal("371553418.41307116"), KBigDecimal("371553418.41307116").max(KBigDecimal("-666175875.1739659")))
		assertEquals(KBigDecimal("156470369.3543527"), KBigDecimal("-1045421554.2651622").max(KBigDecimal("156470369.3543527")))
		assertEquals(KBigDecimal("266838076.87346712"), KBigDecimal("266838076.87346712").max(KBigDecimal("107210103.12023102")))
		assertEquals(KBigDecimal("1537531790.6483767"), KBigDecimal("1537531790.6483767").max(KBigDecimal("-214149816.5094472")))
		assertEquals(KBigDecimal("-602142015.2418629"), KBigDecimal("-602142015.2418629").max(KBigDecimal("-1861864541.1431468")))
		assertEquals(KBigDecimal("-286563361.6011791"), KBigDecimal("-1585217224.1102066").max(KBigDecimal("-286563361.6011791")))
	}

	@Test fun `test min`() {
		assertEquals(KBigDecimal("-3828271.585965206"), KBigDecimal("919715086.1806375").min(KBigDecimal("-3828271.585965206")))
		assertEquals(KBigDecimal("-141729090.0268896"), KBigDecimal("-141729090.0268896").min(KBigDecimal("1116656598.902518")))
		assertEquals(KBigDecimal("-1161111508.2528741"), KBigDecimal("-1161111508.2528741").min(KBigDecimal("280533328.9425354")))
		assertEquals(KBigDecimal("651839782.8818607"), KBigDecimal("651839782.8818607").min(KBigDecimal("756598579.6565222")))
		assertEquals(KBigDecimal("-22534050.9731478"), KBigDecimal("280388829.71874106").min(KBigDecimal("-22534050.9731478")))
		assertEquals(KBigDecimal("-861868885.1574968"), KBigDecimal("-861868885.1574968").min(KBigDecimal("23425135.243386205")))
		assertEquals(KBigDecimal("-963228573.9182137"), KBigDecimal("345142751.4040957").min(KBigDecimal("-963228573.9182137")))
		assertEquals(KBigDecimal("-860106940.7664403"), KBigDecimal("94251453.70909832").min(KBigDecimal("-860106940.7664403")))
		assertEquals(KBigDecimal("487413090.635914"), KBigDecimal("1791271969.2164266").min(KBigDecimal("487413090.635914")))
		assertEquals(KBigDecimal("135672529.37053317"), KBigDecimal("135672529.37053317").min(KBigDecimal("689775815.1977128")))
	}

	@Test fun `test movePointLeft`() {
		assertEquals(KBigDecimal("-1.0029517765677808E-32"), KBigDecimal("-100295177.65677808").movePointLeft(40))
		assertEquals(KBigDecimal("8.56797871429209E-82"), KBigDecimal("8567978.71429209").movePointLeft(88))
		assertEquals(KBigDecimal("1.7697530508468497E-73"), KBigDecimal("176975305.08468497").movePointLeft(81))
		assertEquals(KBigDecimal("3.4621478674910176E-64"), KBigDecimal("346214786.74910176").movePointLeft(72))
		assertEquals(KBigDecimal("-9.556826815059768E-75"), KBigDecimal("-955682681.5059768").movePointLeft(83))
		assertEquals(KBigDecimal("-3.678766716992804E-19"), KBigDecimal("-367876671.6992804").movePointLeft(27))
		assertEquals(KBigDecimal("-5.064122055179493E-82"), KBigDecimal("-506412205.5179493").movePointLeft(90))
		assertEquals(KBigDecimal("-1.0758209458237638E-60"), KBigDecimal("-1075820945.8237638").movePointLeft(69))
		assertEquals(KBigDecimal("-9.408894074998066E-69"), KBigDecimal("-940889407.4998066").movePointLeft(77))
		assertEquals(KBigDecimal("-1.4407679534462163E-21"), KBigDecimal("-144076795.34462163").movePointLeft(29))
	}

	@Test fun `test movePointRight`() {
		assertEquals(KBigDecimal("1946667239837042400000000000000000000000000000000000000000000000000000000000000000000000000000000000000"), KBigDecimal("194666723.98370424").movePointRight(94))
		assertEquals(KBigDecimal("79884616709871040000000"), KBigDecimal("798846167.0987104").movePointRight(14))
		assertEquals(KBigDecimal("21042346460234785000000000000000000000000000000000000000000000000000000000000"), KBigDecimal("210423464.60234785").movePointRight(68))
		assertEquals(KBigDecimal("-846132896772356900000000000000000"), KBigDecimal("-846132896.7723569").movePointRight(24))
		assertEquals(KBigDecimal("3682054536272076400000000000000000000000000000000000000000000000000000000000000000000000000000"), KBigDecimal("368205453.62720764").movePointRight(85))
		assertEquals(KBigDecimal("-279210652268295470000"), KBigDecimal("-279210652.26829547").movePointRight(12))
		assertEquals(KBigDecimal("-16383003676235078000000000000000000000"), KBigDecimal("-16383003.676235078").movePointRight(30))
		assertEquals(KBigDecimal("-111816560676931190000000000000000000000000000000000000000000000000000000000000000000000000000000000"), KBigDecimal("-111816560.67693119").movePointRight(90))
		assertEquals(KBigDecimal("343535058784462000000000"), KBigDecimal("343535058.784462").movePointRight(15))
		assertEquals(KBigDecimal("-2147165960768844200000000000000000000000000000000000000000000000000000000"), KBigDecimal("-214716596.07688442").movePointRight(64))
	}

	@Test fun `test multiply`() {
		assertEquals(KBigDecimal("420501868866747256.356942211288912"), KBigDecimal("-1607476490.7518036").multiply(KBigDecimal("-261591302.44578692")))
		assertEquals(KBigDecimal("-264897372528253109.22704347058"), KBigDecimal("-458625207.117547").multiply(KBigDecimal("577590085.36214")))
		assertEquals(KBigDecimal("168372643694708823.54714807861564"), KBigDecimal("-126658989.3752748").multiply(KBigDecimal("-1329338284.8322093")))
		assertEquals(KBigDecimal("31656158564963893.9517669681225880"), KBigDecimal("-1195028910.5277255").multiply(KBigDecimal("-26489868.392375976")))
		assertEquals(KBigDecimal("274826031746466950.42879153169266"), KBigDecimal("386599948.0553827").multiply(KBigDecimal("710879639.6089958")))
		assertEquals(KBigDecimal("-66048687443233.61954992105245522"), KBigDecimal("-7040645.24077269").multiply(KBigDecimal("9381056.023209738")))
		assertEquals(KBigDecimal("12502272502668990.631258910942623"), KBigDecimal("-535429948.7788199").multiply(KBigDecimal("-23349968.62088777")))
		assertEquals(KBigDecimal("727474998800234512.68923590821276"), KBigDecimal("740725197.4341139").multiply(KBigDecimal("982111856.4890484")))
		assertEquals(KBigDecimal("-2006973936072914196.62319086200117"), KBigDecimal("1195092966.5888977").multiply(KBigDecimal("-1679345450.2550821")))
		assertEquals(KBigDecimal("-196965051370388120.341984559372154"), KBigDecimal("-303742683.28450674").multiply(KBigDecimal("648460233.6442021")))
	}

	@Test fun `test multiply with MathContext`() {
		assertEquals(KBigDecimal("3.0E+17"), KBigDecimal("-963860153.2765847").multiply(KBigDecimal("-312785931.3081178"), KMathContext(2, DOWN)))
		assertEquals(KBigDecimal("-5E+17"), KBigDecimal("-1478051976.3514524").multiply(KBigDecimal("345925257.39600086"), KMathContext(1, HALF_EVEN)))
		assertEquals(KBigDecimal("1.2E+15"), KBigDecimal("54439523.85686268").multiply(KBigDecimal("21295867.20968948"), KMathContext(2, HALF_UP)))
		assertEquals(KBigDecimal("-3.43033174E+17"), KBigDecimal("449377731.8185224").multiply(KBigDecimal("-763351518.8404049"), KMathContext(9, HALF_DOWN)))
		assertEquals(KBigDecimal("-2.2473E+16"), KBigDecimal("-215566293.27854517").multiply(KBigDecimal("104247983.21342374"), KMathContext(5, UP)))
		assertEquals(KBigDecimal("-1.3943E+17"), KBigDecimal("-1293219470.3928266").multiply(KBigDecimal("107817867.6855516"), KMathContext(5, HALF_DOWN)))
		assertEquals(KBigDecimal("8E+16"), KBigDecimal("-201222913.77589574").multiply(KBigDecimal("-399840056.94217545"), KMathContext(1, HALF_UP)))
		assertEquals(KBigDecimal("1.24495E+18"), KBigDecimal("-793174710.3814498").multiply(KBigDecimal("-1569571810.3765786"), KMathContext(6, CEILING)))
		assertEquals(KBigDecimal("-3.126E+16"), KBigDecimal("-509444133.7861528").multiply(KBigDecimal("61349964.582318656"), KMathContext(4, UP)))
		assertEquals(KBigDecimal("3E+15"), KBigDecimal("-61102492.79960554").multiply(KBigDecimal("-61816430.57176612"), KMathContext(1, DOWN)))
	}

	@Test fun `test negate`() {
		assertEquals(KBigDecimal("-231386527.62524673"), KBigDecimal("231386527.62524673").negate())
		assertEquals(KBigDecimal("1366281437.2973576"), KBigDecimal("-1366281437.2973576").negate())
		assertEquals(KBigDecimal("32723262.76800492"), KBigDecimal("-32723262.76800492").negate())
		assertEquals(KBigDecimal("-1428246996.6176815"), KBigDecimal("1428246996.6176815").negate())
		assertEquals(KBigDecimal("-160206287.7096701"), KBigDecimal("160206287.7096701").negate())
		assertEquals(KBigDecimal("-1222801442.0126922"), KBigDecimal("1222801442.0126922").negate())
		assertEquals(KBigDecimal("778685604.637556"), KBigDecimal("-778685604.637556").negate())
		assertEquals(KBigDecimal("707306512.319452"), KBigDecimal("-707306512.319452").negate())
		assertEquals(KBigDecimal("273896170.35084665"), KBigDecimal("-273896170.35084665").negate())
		assertEquals(KBigDecimal("150633394.42368194"), KBigDecimal("-150633394.42368194").negate())
	}

	@Test fun `test negate with MathContext`() {
		assertEquals(KBigDecimal("-8.064830E+7"), KBigDecimal("80648296.11151509").negate(KMathContext(7, FLOOR)))
		assertEquals(KBigDecimal("-1.03263602E+9"), KBigDecimal("1032636015.7897545").negate(KMathContext(9, HALF_DOWN)))
		assertEquals(KBigDecimal("9E+8"), KBigDecimal("-900229644.9594424").negate(KMathContext(1, HALF_DOWN)))
		assertEquals(KBigDecimal("10842555.2"), KBigDecimal("-10842555.134022672").negate(KMathContext(9, CEILING)))
		assertEquals(KBigDecimal("2.5675801E+8"), KBigDecimal("-256758010.71047643").negate(KMathContext(8, DOWN)))
		assertEquals(KBigDecimal("-90711516.7"), KBigDecimal("90711516.64384148").negate(KMathContext(9, FLOOR)))
		assertEquals(KBigDecimal("7.90401E+8"), KBigDecimal("-790401403.0390793").negate(KMathContext(6, HALF_DOWN)))
		assertEquals(KBigDecimal("1.050E+8"), KBigDecimal("-104997477.91898417").negate(KMathContext(4, HALF_EVEN)))
		assertEquals(KBigDecimal("3.096119E+7"), KBigDecimal("-30961194.616141964").negate(KMathContext(7, FLOOR)))
		assertEquals(KBigDecimal("-6.094E+7"), KBigDecimal("60945724.47751029").negate(KMathContext(4, DOWN)))
	}

	@Test fun `test plus`() {
		assertEquals(KBigDecimal("476804175.981527"), KBigDecimal("476804175.981527").plus())
		assertEquals(KBigDecimal("-108309141.23735867"), KBigDecimal("-108309141.23735867").plus())
		assertEquals(KBigDecimal("-26788307.229647964"), KBigDecimal("-26788307.229647964").plus())
		assertEquals(KBigDecimal("-21462982.564345945"), KBigDecimal("-21462982.564345945").plus())
		assertEquals(KBigDecimal("-581664448.6549187"), KBigDecimal("-581664448.6549187").plus())
		assertEquals(KBigDecimal("368530310.35569894"), KBigDecimal("368530310.35569894").plus())
		assertEquals(KBigDecimal("-301055925.36198974"), KBigDecimal("-301055925.36198974").plus())
		assertEquals(KBigDecimal("-1275539760.118839"), KBigDecimal("-1275539760.118839").plus())
		assertEquals(KBigDecimal("109414801.61928147"), KBigDecimal("109414801.61928147").plus())
		assertEquals(KBigDecimal("-779101054.4784884"), KBigDecimal("-779101054.4784884").plus())
	}

	@Test fun `test plus with MathContext`() {
		assertEquals(KBigDecimal("-1.36E+9"), KBigDecimal("-1355388277.4945245").plus(KMathContext(3, UP)))
		assertEquals(KBigDecimal("1.2381E+9"), KBigDecimal("1238081955.4790328").plus(KMathContext(5, HALF_UP)))
		assertEquals(KBigDecimal("2.53467E+8"), KBigDecimal("253467449.98482493").plus(KMathContext(6, HALF_DOWN)))
		assertEquals(KBigDecimal("1.351415E+8"), KBigDecimal("135141406.62297818").plus(KMathContext(7, CEILING)))
		assertEquals(KBigDecimal("5E+8"), KBigDecimal("563636052.6055559").plus(KMathContext(1, FLOOR)))
		assertEquals(KBigDecimal("1.22E+9"), KBigDecimal("1221779142.1218464").plus(KMathContext(3, DOWN)))
		assertEquals(KBigDecimal("-34563777.1"), KBigDecimal("-34563777.1768128").plus(KMathContext(9, CEILING)))
		assertEquals(KBigDecimal("1.27654936E+9"), KBigDecimal("1276549356.6444776").plus(KMathContext(9, UP)))
		assertEquals(KBigDecimal("5E+8"), KBigDecimal("456015874.7393331").plus(KMathContext(1, HALF_DOWN)))
		assertEquals(KBigDecimal("1.2E+9"), KBigDecimal("1292720798.8239608").plus(KMathContext(2, DOWN)))
	}

	@Test fun `test pow`() {
		assertEquals(KBigDecimal("-17310383814838984781866730718956440890708273.76834950606756115729427890174820357351127735188562005949"), KBigDecimal("-1502799.20543349").pow(7))
		assertEquals(KBigDecimal("239601859028391237706808294707573228028476348936968664241875257570.1465746255683587185614163773314410692988250468483047197812900096"), KBigDecimal("148742909.71387634").pow(8))
		assertEquals(KBigDecimal("-577691519056512398311364109340586784717884567.75860448137924858620746467160096768"), KBigDecimal("-896064348.2281808").pow(5))
		assertEquals(KBigDecimal("-3516117585021583970640906.858742025212252869048968"), KBigDecimal("-152062151.19110882").pow(3))
		assertEquals(KBigDecimal("-98383953905589302687682116.440636084363441371433096"), KBigDecimal("-461644951.73159266").pow(3))
		assertEquals(KBigDecimal("465765553823170075317566590286585035887525094022414072418880684.9041253372635401236481733474510926391127736197713"), KBigDecimal("896592988.1013297").pow(7))
		assertEquals(KBigDecimal("-3713140093024919109711101709865346565818686361588247914993780122200507693.017851670610205161302949560369663573071188326974836651840313114181640625"), KBigDecimal("-115692336.68422705").pow(9))
		assertEquals(KBigDecimal("663510206685076788755334005869593380571784481972077937689675084466773480410.254540910100302976624913070414191850134936130257149137906537004728275456"), KBigDecimal("205844194.57896146").pow(9))
		assertEquals(KBigDecimal("-104250996924295057231627894288402166667550427856430550449884667.1035155172377275851360077492098932884665224921875"), KBigDecimal("-723978626.8683195").pow(7))
		assertEquals(KBigDecimal("3216865820147529526815332148941383352832924649495092.941878733855081042843334930765333718079704662016"), KBigDecimal("384213090.60020816").pow(6))
	}

	@Test fun `test pow with MathContext`() {
		assertEquals(KBigDecimal("-1.1793E+27"), KBigDecimal("-1056498588.1047821").pow(3, KMathContext(5, HALF_EVEN)))
		assertEquals(KBigDecimal("4.4549786E+17"), KBigDecimal("667456260.9610695").pow(2, KMathContext(8, DOWN)))
		assertEquals(KBigDecimal("2.9117730E+50"), KBigDecimal("-257450014.34554258").pow(6, KMathContext(8, FLOOR)))
		assertEquals(KBigDecimal("1E+23"), KBigDecimal("58217673.612847865").pow(3, KMathContext(1, DOWN)))
		assertEquals(KBigDecimal("-3.920700E+61"), KBigDecimal("-629581485.5964962").pow(7, KMathContext(7, DOWN)))
		assertEquals(KBigDecimal("6.80E+32"), KBigDecimal("-161516798.18941286").pow(4, KMathContext(3, DOWN)))
		assertEquals(KBigDecimal("1.0322402E+62"), KBigDecimal("722955454.7630209").pow(7, KMathContext(8, HALF_UP)))
		assertEquals(KBigDecimal("5.13254537E+50"), KBigDecimal("-282958101.4640961").pow(6, KMathContext(9, HALF_UP)))
		assertEquals(KBigDecimal("4.672298E+55"), KBigDecimal("89699512.43842669").pow(7, KMathContext(7, FLOOR)))
		assertEquals(KBigDecimal("9.6E+55"), KBigDecimal("99349806.46685864").pow(7, KMathContext(2, HALF_EVEN)))
	}

	@Test fun `test precision`() {
		assertEquals(16, KBigDecimal("603578080.4382751").precision())
		assertEquals(15, KBigDecimal("724175484.721666").precision())
		assertEquals(16, KBigDecimal("600299685.2166178").precision())
		assertEquals(17, KBigDecimal("-1110068724.1662905").precision())
		assertEquals(17, KBigDecimal("273836390.73467785").precision())
		assertEquals(16, KBigDecimal("-853167803.3441383").precision())
		assertEquals(16, KBigDecimal("-146842984.0801519").precision())
		assertEquals(16, KBigDecimal("-477248681.5262434").precision())
		assertEquals(16, KBigDecimal("-478055145.0889731").precision())
		assertEquals(16, KBigDecimal("557968926.8808215").precision())
	}

	@Test fun `test remainder`() {
		assertEquals(KBigDecimal("-35118459.79924367"), KBigDecimal("-35118459.79924367").remainder(KBigDecimal("-1167250392.6007953")))
		assertEquals(KBigDecimal("141376159.48204297"), KBigDecimal("141376159.48204297").remainder(KBigDecimal("-499367430.0464931")))
		assertEquals(KBigDecimal("-7085083.638002120"), KBigDecimal("-156338383.16982138").remainder(KBigDecimal("-29850659.906363852")))
		assertEquals(KBigDecimal("-26249593.22334435"), KBigDecimal("-90398287.18826644").remainder(KBigDecimal("-64148693.96492209")))
		assertEquals(KBigDecimal("14729340.8513623"), KBigDecimal("1160416131.2744246").remainder(KBigDecimal("1145686790.4230623")))
		assertEquals(KBigDecimal("26312814.50326866"), KBigDecimal("304386532.3465512").remainder(KBigDecimal("-92691239.28109418")))
		assertEquals(KBigDecimal("-319758353.90463084"), KBigDecimal("-319758353.90463084").remainder(KBigDecimal("1138058684.8850965")))
		assertEquals(KBigDecimal("116741806.94825184"), KBigDecimal("301390594.1804673").remainder(KBigDecimal("184648787.23221546")))
		assertEquals(KBigDecimal("-810173290.956062"), KBigDecimal("-810173290.956062").remainder(KBigDecimal("888621166.1671886")))
		assertEquals(KBigDecimal("-285640086.2744358"), KBigDecimal("-285640086.2744358").remainder(KBigDecimal("1060216299.7914757")))
	}

	@Test fun `test remainder with MathContext`() {
		assertEquals(KBigDecimal("-673175047.604538"), KBigDecimal("-673175047.604538").remainder(KBigDecimal("868808944.349618"), KMathContext(5, FLOOR)))
		assertEquals(KBigDecimal("-143865323.39762275"), KBigDecimal("-315927036.2608376").remainder(KBigDecimal("-172061712.86321485"), KMathContext(6, HALF_DOWN)))
		assertEquals(KBigDecimal("-221456271.69939667"), KBigDecimal("-221456271.69939667").remainder(KBigDecimal("-481626763.77048576"), KMathContext(2, HALF_DOWN)))
		assertEquals(KBigDecimal("184092445.4202992"), KBigDecimal("1803083652.0798812").remainder(KBigDecimal("-269831867.776597"), KMathContext(2, CEILING)))
		assertEquals(KBigDecimal("107623089.74743453"), KBigDecimal("107623089.74743453").remainder(KBigDecimal("-442575350.3464175"), KMathContext(9, CEILING)))
		assertEquals(KBigDecimal("903468884.668528"), KBigDecimal("903468884.668528").remainder(KBigDecimal("-1002799305.3106719"), KMathContext(3, HALF_UP)))
		assertEquals(KBigDecimal("41900085.548228310"), KBigDecimal("156929284.38674468").remainder(KBigDecimal("57514599.419258185"), KMathContext(8, UP)))
		assertEquals(KBigDecimal("482409951.5106984"), KBigDecimal("1015459905.602451").remainder(KBigDecimal("-533049954.0917526"), KMathContext(5, HALF_UP)))
		assertEquals(KBigDecimal("-5930772.043927326"), KBigDecimal("-1778264281.9044127").remainder(KBigDecimal("61114948.615878806"), KMathContext(8, UP)))
		assertEquals(KBigDecimal("-307983527.855631"), KBigDecimal("-816969503.427254").remainder(KBigDecimal("508985975.571623"), KMathContext(9, DOWN)))
	}

	@Test fun `test round`() {
		assertEquals(KBigDecimal("-1.8970339E+8"), KBigDecimal("-189703391.61043876").round(KMathContext(8, HALF_DOWN)))
		assertEquals(KBigDecimal("-6E+8"), KBigDecimal("-572410822.2538162").round(KMathContext(1, HALF_EVEN)))
		assertEquals(KBigDecimal("8E+8"), KBigDecimal("762612356.1281936").round(KMathContext(1, UP)))
		assertEquals(KBigDecimal("-1.38E+9"), KBigDecimal("-1383777748.1066287").round(KMathContext(3, HALF_DOWN)))
		assertEquals(KBigDecimal("1.4E+9"), KBigDecimal("1375378179.0296571").round(KMathContext(2, CEILING)))
		assertEquals(KBigDecimal("197574506"), KBigDecimal("197574506.03558448").round(KMathContext(9, HALF_UP)))
		assertEquals(KBigDecimal("8.0154E+8"), KBigDecimal("801540681.7224945").round(KMathContext(5, HALF_DOWN)))
		assertEquals(KBigDecimal("-3.08149E+7"), KBigDecimal("-30814900.928391695").round(KMathContext(6, CEILING)))
		assertEquals(KBigDecimal("1E+9"), KBigDecimal("1058518557.0003458").round(KMathContext(1, HALF_EVEN)))
		assertEquals(KBigDecimal("421621433"), KBigDecimal("421621432.1254113").round(KMathContext(9, CEILING)))
	}

	@Test fun `test scale`() {
		assertEquals(7, KBigDecimal("-1400094273.4433918").scale())
		assertEquals(7, KBigDecimal("1098105609.3594277").scale())
		assertEquals(7, KBigDecimal("16101867.6550659").scale())
		assertEquals(7, KBigDecimal("458933198.4462082").scale())
		assertEquals(8, KBigDecimal("-50283669.94895325").scale())
		assertEquals(7, KBigDecimal("706841370.3032023").scale())
		assertEquals(9, KBigDecimal("-10627353.230981776").scale())
		assertEquals(7, KBigDecimal("1740247972.4538546").scale())
		assertEquals(8, KBigDecimal("-103329458.27398628").scale())
		assertEquals(8, KBigDecimal("-455969342.87796277").scale())
	}

	@Test fun `test scaleByPowerOfTen`() {
		assertEquals(KBigDecimal("-1.10740866962987E+15"), KBigDecimal("-1107408669.62987").scaleByPowerOfTen(6))
		assertEquals(KBigDecimal("-5033490398001.91"), KBigDecimal("-503349039.800191").scaleByPowerOfTen(4))
		assertEquals(KBigDecimal("1326861496639079.3"), KBigDecimal("1326861496.6390793").scaleByPowerOfTen(6))
		assertEquals(KBigDecimal("-8.886316078380762E+19"), KBigDecimal("-88863160.78380762").scaleByPowerOfTen(12))
		assertEquals(KBigDecimal("-1.0654359739607487E+27"), KBigDecimal("-1065435973.9607487").scaleByPowerOfTen(18))
		assertEquals(KBigDecimal("-3.284503802945951E+17"), KBigDecimal("-328450380.2945951").scaleByPowerOfTen(9))
		assertEquals(KBigDecimal("509383800951.67094"), KBigDecimal("509383800.95167094").scaleByPowerOfTen(3))
		assertEquals(KBigDecimal("3.7976805276259893E+27"), KBigDecimal("379768052.76259893").scaleByPowerOfTen(19))
		assertEquals(KBigDecimal("-126286866013.40887"), KBigDecimal("-1262868.6601340887").scaleByPowerOfTen(5))
		assertEquals(KBigDecimal("12437311911432572"), KBigDecimal("124373119.11432572").scaleByPowerOfTen(8))
	}

	@Test fun `test setScale`() {
		assertEquals(KBigDecimal("1075486016.5461793000"), KBigDecimal("1075486016.5461793").setScale(10))
		assertEquals(KBigDecimal("897398507.93661560000000000"), KBigDecimal("897398507.9366156").setScale(17))
		assertEquals(KBigDecimal("-73467548.679528970000000000"), KBigDecimal("-73467548.67952897").setScale(18))
		assertEquals(KBigDecimal("-36809345.0974306100000000000"), KBigDecimal("-36809345.09743061").setScale(19))
		assertEquals(KBigDecimal("-590707972.5275733000000"), KBigDecimal("-590707972.5275733").setScale(13))
		assertEquals(KBigDecimal("-491677372.793541800000000000"), KBigDecimal("-491677372.7935418").setScale(18))
		assertEquals(KBigDecimal("42832714.1089246050000000000"), KBigDecimal("42832714.108924605").setScale(19))
		assertEquals(KBigDecimal("-837360.2274570346000000000"), KBigDecimal("-837360.2274570346").setScale(19))
		assertEquals(KBigDecimal("-1825489678.09269760000000"), KBigDecimal("-1825489678.0926976").setScale(14))
		assertEquals(KBigDecimal("162830827.26237187000000000"), KBigDecimal("162830827.26237187").setScale(17))
	}

	@Test fun `test setScale with RoundingMode`() {
		assertEquals(KBigDecimal("152646880.9075822500000"), KBigDecimal("152646880.90758225").setScale(13, CEILING))
		assertEquals(KBigDecimal("-378020741.868862"), KBigDecimal("-378020741.86886245").setScale(6, CEILING))
		assertEquals(KBigDecimal("216303968.62302580"), KBigDecimal("216303968.6230258").setScale(8, UP))
		assertEquals(KBigDecimal("129968943.7406164600000000000"), KBigDecimal("129968943.74061646").setScale(19, HALF_UP))
		assertEquals(KBigDecimal("1416091077.618842400000000000"), KBigDecimal("1416091077.6188424").setScale(18, FLOOR))
		assertEquals(KBigDecimal("121663741.0429565900000000"), KBigDecimal("121663741.04295659").setScale(16, CEILING))
		assertEquals(KBigDecimal("-153903015.54059508"), KBigDecimal("-153903015.54059508").setScale(8, HALF_UP))
		assertEquals(KBigDecimal("749711452.3527424000000000000"), KBigDecimal("749711452.3527424").setScale(19, HALF_EVEN))
		assertEquals(KBigDecimal("164442187.959124920"), KBigDecimal("164442187.95912492").setScale(9, HALF_EVEN))
		assertEquals(KBigDecimal("-121186105.37412593"), KBigDecimal("-121186105.37412593").setScale(8, HALF_EVEN))
	}

	@Test fun `test shortValueExact`() {
		assertEquals(-31771, KBigDecimal("-31771").shortValueExact())
		assertEquals(-22894, KBigDecimal("-22894").shortValueExact())
		assertEquals(-29800, KBigDecimal("-29800").shortValueExact())
		assertEquals(9715, KBigDecimal("9715").shortValueExact())
		assertEquals(22715, KBigDecimal("22715").shortValueExact())
		assertEquals(-14215, KBigDecimal("-14215").shortValueExact())
		assertEquals(-25949, KBigDecimal("-25949").shortValueExact())
		assertEquals(-31991, KBigDecimal("-31991").shortValueExact())
		assertEquals(18252, KBigDecimal("18252").shortValueExact())
		assertEquals(31348, KBigDecimal("31348").shortValueExact())
	}

	@Test fun `test signum`() {
		assertEquals(-1, KBigDecimal("-329318984.168279").signum())
		assertEquals(-1, KBigDecimal("-231801492.61513343").signum())
		assertEquals(-1, KBigDecimal("-15386813.574470295").signum())
		assertEquals(-1, KBigDecimal("-387906674.77480525").signum())
		assertEquals(-1, KBigDecimal("-856125362.1111324").signum())
		assertEquals(-1, KBigDecimal("-1183336379.4247882").signum())
		assertEquals(-1, KBigDecimal("-93036646.96870027").signum())
		assertEquals(-1, KBigDecimal("-1045226734.3674383").signum())
		assertEquals(1, KBigDecimal("1013278119.5128376").signum())
		assertEquals(-1, KBigDecimal("-88659862.73824109").signum())
	}

	@Test fun `test stripTrailingZeros`() {
		assertEquals(KBigDecimal("-1.4710843075695473E+26"), KBigDecimal("-147108430756954730000000000").stripTrailingZeros())
		assertEquals(KBigDecimal("1.0208986414034456E+23"), KBigDecimal("102089864140344560000000").stripTrailingZeros())
		assertEquals(KBigDecimal("1.3228083902580113E+24"), KBigDecimal("1322808390258011300000000").stripTrailingZeros())
		assertEquals(KBigDecimal("6.06982368648373E+19"), KBigDecimal("60698236864837300000").stripTrailingZeros())
		assertEquals(KBigDecimal("-1.2311230873757954E+22"), KBigDecimal("-12311230873757954000000").stripTrailingZeros())
		assertEquals(KBigDecimal("-4.820896358559231E+22"), KBigDecimal("-48208963585592310000000").stripTrailingZeros())
		assertEquals(KBigDecimal("3.0330544733092822E+24"), KBigDecimal("3033054473309282200000000").stripTrailingZeros())
		assertEquals(KBigDecimal("-1.7110912433370104E+19"), KBigDecimal("-17110912433370104000").stripTrailingZeros())
		assertEquals(KBigDecimal("-1.3849421886530364E+24"), KBigDecimal("-1384942188653036400000000").stripTrailingZeros())
		assertEquals(KBigDecimal("8.114556901786209E+23"), KBigDecimal("811455690178620900000000").stripTrailingZeros())
	}

	@Test fun `test subtract`() {
		assertEquals(KBigDecimal("-547331811.1038635"), KBigDecimal("-1332338117.4853373").subtract(KBigDecimal("-785006306.3814738")))
		assertEquals(KBigDecimal("250093869.45224652"), KBigDecimal("227761246.09935224").subtract(KBigDecimal("-22332623.35289428")))
		assertEquals(KBigDecimal("550372062.0917068"), KBigDecimal("1285850926.1997604").subtract(KBigDecimal("735478864.1080536")))
		assertEquals(KBigDecimal("1312988324.00698966"), KBigDecimal("-197330409.29140714").subtract(KBigDecimal("-1510318733.2983968")))
		assertEquals(KBigDecimal("-821079949.6776957"), KBigDecimal("-1196866012.3762207").subtract(KBigDecimal("-375786062.698525")))
		assertEquals(KBigDecimal("728005665.40385425"), KBigDecimal("496519539.95774907").subtract(KBigDecimal("-231486125.44610518")))
		assertEquals(KBigDecimal("-1485862452.80848209"), KBigDecimal("-1451603697.9151175").subtract(KBigDecimal("34258754.89336459")))
		assertEquals(KBigDecimal("127438440.02825794"), KBigDecimal("179136829.5377146").subtract(KBigDecimal("51698389.50945666")))
		assertEquals(KBigDecimal("-869065848.72541928"), KBigDecimal("-980639010.3894452").subtract(KBigDecimal("-111573161.66402592")))
		assertEquals(KBigDecimal("579911933.32950437"), KBigDecimal("237057905.51044807").subtract(KBigDecimal("-342854027.8190563")))
	}

	@Test fun `test subtract with MathContext`() {
		assertEquals(KBigDecimal("-1.5700547E+9"), KBigDecimal("-319968668.0356948").subtract(KBigDecimal("1250086130.07759"), KMathContext(8, DOWN)))
		assertEquals(KBigDecimal("2.5985E+8"), KBigDecimal("25877634.555606946").subtract(KBigDecimal("-233982341.9915687"), KMathContext(5, DOWN)))
		assertEquals(KBigDecimal("355444725"), KBigDecimal("614267926.0238584").subtract(KBigDecimal("258823200.77623704"), KMathContext(9, HALF_DOWN)))
		assertEquals(KBigDecimal("3.603122E+8"), KBigDecimal("363515373.6511587").subtract(KBigDecimal("3203202.5968734734"), KMathContext(7, HALF_EVEN)))
		assertEquals(KBigDecimal("6.4749556E+8"), KBigDecimal("450823412.0126558").subtract(KBigDecimal("-196672147.07885683"), KMathContext(8, HALF_DOWN)))
		assertEquals(KBigDecimal("-8.4E+8"), KBigDecimal("338795793.89599466").subtract(KBigDecimal("1179735911.5023003"), KMathContext(2, DOWN)))
		assertEquals(KBigDecimal("-4.0259786E+8"), KBigDecimal("-60355393.992866725").subtract(KBigDecimal("342242461.33119446"), KMathContext(8, HALF_DOWN)))
		assertEquals(KBigDecimal("-1.500432E+9"), KBigDecimal("-52986951.872996986").subtract(KBigDecimal("1447445200.0647705"), KMathContext(7, HALF_EVEN)))
		assertEquals(KBigDecimal("-4.4443039E+8"), KBigDecimal("241613347.90206498").subtract(KBigDecimal("686043739.4267917"), KMathContext(8, DOWN)))
		assertEquals(KBigDecimal("9.1563E+7"), KBigDecimal("327283689.1880334").subtract(KBigDecimal("235720855.61153132"), KMathContext(5, UP)))
	}

	@Test fun `test toBigInteger`() {
		assertEquals(KBigInteger("94180604"), KBigDecimal("94180604.33893295").toBigInteger())
		assertEquals(KBigInteger("284278561"), KBigDecimal("284278561.0484817").toBigInteger())
		assertEquals(KBigInteger("175420178"), KBigDecimal("175420178.66145238").toBigInteger())
		assertEquals(KBigInteger("299615935"), KBigDecimal("299615935.6184654").toBigInteger())
		assertEquals(KBigInteger("104896286"), KBigDecimal("104896286.92978825").toBigInteger())
		assertEquals(KBigInteger("72456806"), KBigDecimal("72456806.83681482").toBigInteger())
		assertEquals(KBigInteger("-1016973247"), KBigDecimal("-1016973247.3285899").toBigInteger())
		assertEquals(KBigInteger("-196696"), KBigDecimal("-196696.8314020125").toBigInteger())
		assertEquals(KBigInteger("1771098956"), KBigDecimal("1771098956.0126064").toBigInteger())
		assertEquals(KBigInteger("-1144478533"), KBigDecimal("-1144478533.3062482").toBigInteger())
	}

	@Test fun `test toBigIntegerExact`() {
		assertEquals(KBigInteger("2024241542908562735"), KBigDecimal("2024241542908562735").toBigIntegerExact())
		assertEquals(KBigInteger("5355883932925292887"), KBigDecimal("5355883932925292887").toBigIntegerExact())
		assertEquals(KBigInteger("-4607422053559757855"), KBigDecimal("-4607422053559757855").toBigIntegerExact())
		assertEquals(KBigInteger("683313561563346207"), KBigDecimal("683313561563346207").toBigIntegerExact())
		assertEquals(KBigInteger("5794829338995083428"), KBigDecimal("5794829338995083428").toBigIntegerExact())
		assertEquals(KBigInteger("-8801333070672944555"), KBigDecimal("-8801333070672944555").toBigIntegerExact())
		assertEquals(KBigInteger("5437630794327172739"), KBigDecimal("5437630794327172739").toBigIntegerExact())
		assertEquals(KBigInteger("-1169373186435210939"), KBigDecimal("-1169373186435210939").toBigIntegerExact())
		assertEquals(KBigInteger("1625041620933761630"), KBigDecimal("1625041620933761630").toBigIntegerExact())
		assertEquals(KBigInteger("989852501738198056"), KBigDecimal("989852501738198056").toBigIntegerExact())
	}

	@Test fun `test toEngineeringString`() {
		assertEquals("-1392107447.0200295", KBigDecimal("-1392107447.0200295").toEngineeringString())
		assertEquals("339908342.7587246", KBigDecimal("339908342.7587246").toEngineeringString())
		assertEquals("186837084.86727622", KBigDecimal("186837084.86727622").toEngineeringString())
		assertEquals("-237897624.84217533", KBigDecimal("-237897624.84217533").toEngineeringString())
		assertEquals("1678360651.9150734", KBigDecimal("1678360651.9150734").toEngineeringString())
		assertEquals("199692.48786956797", KBigDecimal("199692.48786956797").toEngineeringString())
		assertEquals("-529790657.1481186", KBigDecimal("-529790657.1481186").toEngineeringString())
		assertEquals("340236734.65890855", KBigDecimal("340236734.65890855").toEngineeringString())
		assertEquals("-889595413.9481302", KBigDecimal("-889595413.9481302").toEngineeringString())
		assertEquals("-578940367.0716513", KBigDecimal("-578940367.0716513").toEngineeringString())
	}

	@Test fun `test toPlainString`() {
		assertEquals("5947686.1977358945", KBigDecimal("5947686.1977358945").toPlainString())
		assertEquals("-1798282925.921113", KBigDecimal("-1798282925.921113").toPlainString())
		assertEquals("41269828.53033352", KBigDecimal("41269828.53033352").toPlainString())
		assertEquals("522079781.63481295", KBigDecimal("522079781.63481295").toPlainString())
		assertEquals("-864329566.5803326", KBigDecimal("-864329566.5803326").toPlainString())
		assertEquals("-869869422.1653712", KBigDecimal("-869869422.1653712").toPlainString())
		assertEquals("-1862066543.4142194", KBigDecimal("-1862066543.4142194").toPlainString())
		assertEquals("204907570.71098828", KBigDecimal("204907570.71098828").toPlainString())
		assertEquals("-114939794.75884664", KBigDecimal("-114939794.75884664").toPlainString())
		assertEquals("-10388160.728535108", KBigDecimal("-10388160.728535108").toPlainString())
	}

	@Test fun `test ulp`() {
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("361719524.6234795").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("-811677653.9727509").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("768635991.2910455").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("-767017397.0393283").ulp())
		assertEquals(KBigDecimal("0.000001"), KBigDecimal("-1600098242.210848").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("787432665.2914296").ulp())
		assertEquals(KBigDecimal("1E-10"), KBigDecimal("4085042.9466985855").ulp())
		assertEquals(KBigDecimal("1E-8"), KBigDecimal("-141951162.64379802").ulp())
		assertEquals(KBigDecimal("1E-8"), KBigDecimal("-417989498.51785177").ulp())
		assertEquals(KBigDecimal("1E-7"), KBigDecimal("-38726294.7357319").ulp())
	}

	@Test fun `test unscaledValue`() {
		assertEquals(KBigInteger("11313689794338627"), KBigDecimal("1131368979.4338627").unscaledValue())
		assertEquals(KBigInteger("12505496101199844"), KBigDecimal("1250549610.1199844").unscaledValue())
		assertEquals(KBigInteger("-6765154012909183"), KBigDecimal("-67651540.12909183").unscaledValue())
		assertEquals(KBigInteger("756605448481194"), KBigDecimal("756605448.481194").unscaledValue())
		assertEquals(KBigInteger("-35812205737903166"), KBigDecimal("-358122057.37903166").unscaledValue())
		assertEquals(KBigInteger("-858042899801002"), KBigDecimal("-858042899.801002").unscaledValue())
		assertEquals(KBigInteger("16655221447063136"), KBigDecimal("166552214.47063136").unscaledValue())
		assertEquals(KBigInteger("-11352995061828482"), KBigDecimal("-1135299506.1828482").unscaledValue())
		assertEquals(KBigInteger("2961937604009948"), KBigDecimal("296193760.4009948").unscaledValue())
		assertEquals(KBigInteger("99478624659757"), KBigDecimal("994786246.59757").unscaledValue())
	}

	@Test fun `test operator plus`() {
		assertEquals(KBigDecimal("1474912317.8962836"), KBigDecimal("1074257460.6246898") + KBigDecimal("400654857.2715938"))
		assertEquals(KBigDecimal("-765164998.58142168"), KBigDecimal("-649563289.5651178") + KBigDecimal("-115601709.01630388"))
		assertEquals(KBigDecimal("691550232.958197175"), KBigDecimal("4608387.503533775") + KBigDecimal("686941845.4546634"))
		assertEquals(KBigDecimal("139526472.5364047"), KBigDecimal("394261182.0786405") + KBigDecimal("-254734709.5422358"))
		assertEquals(KBigDecimal("133891760.26933071"), KBigDecimal("22638894.29601057") + KBigDecimal("111252865.97332014"))
		assertEquals(KBigDecimal("-76447816.1154844"), KBigDecimal("1524628520.2205942") + KBigDecimal("-1601076336.3360786"))
		assertEquals(KBigDecimal("530521138.79685796"), KBigDecimal("356216852.15073836") + KBigDecimal("174304286.6461196"))
		assertEquals(KBigDecimal("801714382.7801354"), KBigDecimal("1622624738.5031424") + KBigDecimal("-820910355.723007"))
		assertEquals(KBigDecimal("-1158362403.1236580"), KBigDecimal("-705213029.5829401") + KBigDecimal("-453149373.5407179"))
		assertEquals(KBigDecimal("464052731.04411682"), KBigDecimal("-43854833.58029358") + KBigDecimal("507907564.6244104"))
	}

	@Test fun `test operator minus`() {
		assertEquals(KBigDecimal("251571350.606705774"), KBigDecimal("220581476.48867023") - KBigDecimal("-30989874.118035544"))
		assertEquals(KBigDecimal("112241261.0636702"), KBigDecimal("696287306.269398") - KBigDecimal("584046045.2057278"))
		assertEquals(KBigDecimal("96169605.3742678"), KBigDecimal("-1040648867.9258962") - KBigDecimal("-1136818473.300164"))
		assertEquals(KBigDecimal("230891700.22552485"), KBigDecimal("-393231992.97865695") - KBigDecimal("-624123693.2041818"))
		assertEquals(KBigDecimal("-395475330.16477818"), KBigDecimal("-495293224.986648") - KBigDecimal("-99817894.82186982"))
		assertEquals(KBigDecimal("511202632.2890734"), KBigDecimal("-494244463.0314792") - KBigDecimal("-1005447095.3205526"))
		assertEquals(KBigDecimal("960231873.00644095"), KBigDecimal("-183175190.91607565") - KBigDecimal("-1143407063.9225166"))
		assertEquals(KBigDecimal("-300413697.509759284"), KBigDecimal("-304439970.35858") - KBigDecimal("-4026272.848820716"))
		assertEquals(KBigDecimal("-450109704.00067957"), KBigDecimal("-373129741.74506605") - KBigDecimal("76979962.25561352"))
		assertEquals(KBigDecimal("-318400833.245618747"), KBigDecimal("-327032084.37702924") - KBigDecimal("-8631251.131410493"))
	}

	@Test fun `test operator times`() {
		assertEquals(KBigDecimal("-2211631142437844557.0759375014912"), KBigDecimal("1689970136.1610272") * KBigDecimal("-1308680606.310496"))
		assertEquals(KBigDecimal("15662150764908979.145187324758016"), KBigDecimal("-138630429.8837022") * KBigDecimal("-112977726.30473728"))
		assertEquals(KBigDecimal("-17597031792512127.4310212735428574"), KBigDecimal("186338640.88971946") * KBigDecimal("-94435763.34189619"))
		assertEquals(KBigDecimal("-2091569868114390.40474542193008525"), KBigDecimal("151107231.34707075") * KBigDecimal("-13841626.568554927"))
		assertEquals(KBigDecimal("21003497172188274.03823854349248"), KBigDecimal("383186556.808111") * KBigDecimal("54812719.28520768"))
		assertEquals(KBigDecimal("125829131919551327.436830984726424"), KBigDecimal("1088160684.3720186") * KBigDecimal("115634697.82237884"))
		assertEquals(KBigDecimal("-182591057228951897.410257013874025"), KBigDecimal("-112732088.36347835") * KBigDecimal("1619690186.5263915"))
		assertEquals(KBigDecimal("205308621559419797.229722852635904"), KBigDecimal("-251696822.73638144") * KBigDecimal("-815698105.8694291"))
		assertEquals(KBigDecimal("181502633242737508.056191593245216"), KBigDecimal("-247113321.47671416") * KBigDecimal("-734491496.2823676"))
		assertEquals(KBigDecimal("-318148459816960421.12839036509598"), KBigDecimal("-994599588.1881343") * KBigDecimal("319875921.5218786"))
	}

	@Test fun `test operator divide`() {
		assertEquals(KBigDecimal("-5.16893351"), KBigDecimal("-158322867.18018076") / KBigDecimal("30629697.010552634"))
		assertEquals(KBigDecimal("-1.888253"), KBigDecimal("711749311.767611") / KBigDecimal("-376935452.4554518"))
		assertEquals(KBigDecimal("-1.21468209"), KBigDecimal("-171916778.37308514") / KBigDecimal("141532323.23527187"))
		assertEquals(KBigDecimal("-13.85988923"), KBigDecimal("-114448806.80179898") / KBigDecimal("8257555.662265848"))
		assertEquals(KBigDecimal("-0.28660714"), KBigDecimal("-72213855.64096412") / KBigDecimal("251961122.94722074"))
		assertEquals(KBigDecimal("8.43711358"), KBigDecimal("367039740.97254354") / KBigDecimal("43502998.70584516"))
		assertEquals(KBigDecimal("0.403807716"), KBigDecimal("-51793609.770183094") / KBigDecimal("-128263051.28975922"))
		assertEquals(KBigDecimal("1.3319715"), KBigDecimal("-1433608638.9408092") / KBigDecimal("-1076305779.359942"))
		assertEquals(KBigDecimal("-1.4316366"), KBigDecimal("-1245899516.2103844") / KBigDecimal("870262415.5571792"))
		assertEquals(KBigDecimal("15.04860379"), KBigDecimal("197749692.49407288") / KBigDecimal("13140733.536931982"))
	}


}
