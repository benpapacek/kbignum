
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
		assertEquals(KBigDecimal("-1E+9"), KBigDecimal("-675844085.4233485").add(KBigDecimal("-474423814.94483757"), KMathContext(1, DOWN)))
		assertEquals(KBigDecimal("-4.015E+8"), KBigDecimal("759876622.173756").add(KBigDecimal("-1161332847.470284"), KMathContext(4, HALF_EVEN)))
		assertEquals(KBigDecimal("2E+9"), KBigDecimal("924565987.3278322").add(KBigDecimal("138187048.76235235"), KMathContext(1, CEILING)))
		assertEquals(KBigDecimal("-9.941E+8"), KBigDecimal("-1406996614.7088475").add(KBigDecimal("412990833.2978394"), KMathContext(4, UP)))
		assertEquals(KBigDecimal("373407336"), KBigDecimal("728625410.9706949").add(KBigDecimal("-355218074.3232708"), KMathContext(9, FLOOR)))
		assertEquals(KBigDecimal("9.9613069E+8"), KBigDecimal("-379804388.84803605").add(KBigDecimal("1375935074.0174305"), KMathContext(8, HALF_UP)))
		assertEquals(KBigDecimal("3.56706E+8"), KBigDecimal("199199851.7758977").add(KBigDecimal("157505219.99844605"), KMathContext(6, CEILING)))
		assertEquals(KBigDecimal("-775951859"), KBigDecimal("-1128584244.777766").add(KBigDecimal("352632385.3791467"), KMathContext(9, DOWN)))
		assertEquals(KBigDecimal("1.146E+9"), KBigDecimal("354109522.14027476").add(KBigDecimal("792289997.9249882"), KMathContext(4, DOWN)))
		assertEquals(KBigDecimal("-1.2331176E+8"), KBigDecimal("-244105627.82623768").add(KBigDecimal("120793866.86782597"), KMathContext(8, CEILING)))
		assertEquals(KBigDecimal("-1E+9"), KBigDecimal("-522341963.14925516").add(KBigDecimal("-472325589.02161324"), KMathContext(1, HALF_EVEN)))
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


}
