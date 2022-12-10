
package com.papacekb.kbignum

import com.papacekb.kbignum.KRoundingMode.*
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalUnsignedTypes::class)
fun ByteArray.hex(): String = asUByteArray().joinToString("") { it.toString(radix = 16).padStart(2, '0') }

class KBigIntegerTest {

	@Test fun `test abs`() {
		assertEquals(KBigInteger("4174779793377534016"), KBigInteger("4174779793377534016").abs())
		assertEquals(KBigInteger("1753237493227507236"), KBigInteger("-1753237493227507236").abs())
		assertEquals(KBigInteger("4994053466947955232"), KBigInteger("4994053466947955232").abs())
		assertEquals(KBigInteger("544362425981858600"), KBigInteger("-544362425981858600").abs())
		assertEquals(KBigInteger("3386893265803317318"), KBigInteger("3386893265803317318").abs())
		assertEquals(KBigInteger("7514816623229987898"), KBigInteger("-7514816623229987898").abs())
		assertEquals(KBigInteger("5429863264083097375"), KBigInteger("5429863264083097375").abs())
		assertEquals(KBigInteger("2548390141569416052"), KBigInteger("2548390141569416052").abs())
		assertEquals(KBigInteger("7506389105227783071"), KBigInteger("-7506389105227783071").abs())
		assertEquals(KBigInteger("1576851085535480114"), KBigInteger("1576851085535480114").abs())
	}

	@Test fun `test add`() {
		assertEquals(KBigInteger("-10337901379563132251"), KBigInteger("-6725732201501230954").add(KBigInteger("-3612169178061901297")))
		assertEquals(KBigInteger("12605446367045608844"), KBigInteger("6747295273638962015").add(KBigInteger("5858151093406646829")))
		assertEquals(KBigInteger("14901780153429597459"), KBigInteger("6717133997967733505").add(KBigInteger("8184646155461863954")))
		assertEquals(KBigInteger("7441684229074959841"), KBigInteger("-829198351873176399").add(KBigInteger("8270882580948136240")))
		assertEquals(KBigInteger("8721353029710219859"), KBigInteger("4079129276620429933").add(KBigInteger("4642223753089789926")))
		assertEquals(KBigInteger("-16939764281817226794"), KBigInteger("-9021736757917772230").add(KBigInteger("-7918027523899454564")))
		assertEquals(KBigInteger("-13361380589546930405"), KBigInteger("-5892252181643033858").add(KBigInteger("-7469128407903896547")))
		assertEquals(KBigInteger("-6927709402484006965"), KBigInteger("-5685242773195976708").add(KBigInteger("-1242466629288030257")))
		assertEquals(KBigInteger("1420858770154773938"), KBigInteger("3824161405988826813").add(KBigInteger("-2403302635834052875")))
		assertEquals(KBigInteger("10734679988624786783"), KBigInteger("7176724957522934871").add(KBigInteger("3557955031101851912")))
	}

	@Test fun `test and`() {
		assertEquals(KBigInteger("3747070765434941444"), KBigInteger("-835754991463779659").and(KBigInteger("3963246502490420230")))
		assertEquals(KBigInteger("-9051601865609771805"), KBigInteger("-6457245767123267605").and(KBigInteger("-8473867053398002461")))
		assertEquals(KBigInteger("-8819942665794592767"), KBigInteger("-3604026565907225053").and(KBigInteger("-7522904868940355451")))
		assertEquals(KBigInteger("-8921304216656068194"), KBigInteger("-3120650301155084834").and(KBigInteger("-6381198700810255969")))
		assertEquals(KBigInteger("378374017348229128"), KBigInteger("7441177135702071870").and(KBigInteger("-8218575382808921783")))
		assertEquals(KBigInteger("-139169581514521600"), KBigInteger("-139167553951267800").and(KBigInteger("-73256049854006201")))
		assertEquals(KBigInteger("7215646350261110337"), KBigInteger("-1841003429142860205").and(KBigInteger("8476665812272830317")))
		assertEquals(KBigInteger("2306129587250206726"), KBigInteger("3019995487344606150").and(KBigInteger("-2299293602182752226")))
		assertEquals(KBigInteger("-8894378604650018654"), KBigInteger("-4048461346158389086").and(KBigInteger("-5422666220282615061")))
		assertEquals(KBigInteger("2486620476224323681"), KBigInteger("-6736440396910111373").and(KBigInteger("2588132683315636333")))
	}

	@Test fun `test andNot`() {
		assertEquals(KBigInteger("4725175205881914533"), KBigInteger("6022211941732411119").andNot(KBigInteger("-4746712439680871590")))
		assertEquals(KBigInteger("3550425026402721792"), KBigInteger("3552694659374657607").andNot(KBigInteger("5370640655302334311")))
		assertEquals(KBigInteger("4047328695071839496"), KBigInteger("9150087532381265672").andNot(KBigInteger("-4048458281537877452")))
		assertEquals(KBigInteger("4622047834284757028"), KBigInteger("8999583024835080230").andNot(KBigInteger("-4696368681473037246")))
		assertEquals(KBigInteger("144784828255248421"), KBigInteger("726879482702935095").andNot(KBigInteger("-1721055779395856558")))
		assertEquals(KBigInteger("2956068629751538048"), KBigInteger("-6224055198607892084").andNot(KBigInteger("-4397220682383368625")))
		assertEquals(KBigInteger("4648066705075121152"), KBigInteger("7626793603384389248").andNot(KBigInteger("4575263000346301174")))
		assertEquals(KBigInteger("2964705629685415936"), KBigInteger("-6239797136380747567").andNot(KBigInteger("-3289020059896274473")))
		assertEquals(KBigInteger("1225263412627383424"), KBigInteger("1234341265571194275").andNot(KBigInteger("-4439862714846770321")))
		assertEquals(KBigInteger("3472838653675313938"), KBigInteger("8411251168160865075").andNot(KBigInteger("-4283780158371143575")))
	}

	@Test fun `test bitCount`() {
		assertEquals(36, KBigInteger("-6576803190032340661").bitCount())
		assertEquals(41, KBigInteger("-7745203376923712756").bitCount())
		assertEquals(33, KBigInteger("4378077984742854570").bitCount())
		assertEquals(38, KBigInteger("3734882030125542105").bitCount())
		assertEquals(31, KBigInteger("-7258299529698069393").bitCount())
		assertEquals(37, KBigInteger("-4314749296185324188").bitCount())
		assertEquals(36, KBigInteger("-9216781559380403202").bitCount())
		assertEquals(34, KBigInteger("957423622228519473").bitCount())
		assertEquals(24, KBigInteger("7144163306851795497").bitCount())
		assertEquals(36, KBigInteger("7324393759782701978").bitCount())
	}

	@Test fun `test bitLength`() {
		assertEquals(61, KBigInteger("1929831071778975229").bitLength())
		assertEquals(63, KBigInteger("-5312540185395365221").bitLength())
		assertEquals(63, KBigInteger("5494036970193312310").bitLength())
		assertEquals(57, KBigInteger("-91462033841853383").bitLength())
		assertEquals(57, KBigInteger("-142219769320502822").bitLength())
		assertEquals(63, KBigInteger("5202816632030807885").bitLength())
		assertEquals(63, KBigInteger("-7723866706355119643").bitLength())
		assertEquals(62, KBigInteger("3802359613241076619").bitLength())
		assertEquals(63, KBigInteger("6962079594335908751").bitLength())
		assertEquals(62, KBigInteger("-2423352540641010966").bitLength())
	}

	@Test fun `test clearBit`() {
		assertEquals(KBigInteger("2648782310557399998"), KBigInteger("2648782310557531070").clearBit(17))
		assertEquals(KBigInteger("-83225951602317626"), KBigInteger("-83225951602252090").clearBit(16))
		assertEquals(KBigInteger("-4701873869813794118"), KBigInteger("-4701873869813793094").clearBit(10))
		assertEquals(KBigInteger("2693395017287567345"), KBigInteger("2693395017287567345").clearBit(13))
		assertEquals(KBigInteger("5135718354692912334"), KBigInteger("5135718354692912334").clearBit(8))
		assertEquals(KBigInteger("8292994950288056481"), KBigInteger("8292994950288056481").clearBit(2))
		assertEquals(KBigInteger("-2097332671498390960"), KBigInteger("-2097332671498390960").clearBit(10))
		assertEquals(KBigInteger("-2626285354074972957"), KBigInteger("-2626285354074972957").clearBit(2))
		assertEquals(KBigInteger("-5380254681314550895"), KBigInteger("-5380254681314518127").clearBit(15))
		assertEquals(KBigInteger("3135121431791234325"), KBigInteger("3135121431791234325").clearBit(9))
	}

	@Test fun `test divide`() {
		assertEquals(KBigInteger("2801640018"), KBigInteger("-4175956078188590430").divide(KBigInteger("-1490539845")))
		assertEquals(KBigInteger("-30495187709"), KBigInteger("-7966570186553610629").divide(KBigInteger("261240241")))
		assertEquals(KBigInteger("2806831803"), KBigInteger("644218941181616258").divide(KBigInteger("229518185")))
		assertEquals(KBigInteger("-2555227970"), KBigInteger("-3931123952122583706").divide(KBigInteger("1538463103")))
		assertEquals(KBigInteger("-15218565511"), KBigInteger("-5965638157901951369").divide(KBigInteger("391997403")))
		assertEquals(KBigInteger("4388937307"), KBigInteger("8757196215891937986").divide(KBigInteger("1995288518")))
		assertEquals(KBigInteger("2806634101"), KBigInteger("5525469847720375719").divide(KBigInteger("1968717563")))
		assertEquals(KBigInteger("5482578486"), KBigInteger("8038523297276105096").divide(KBigInteger("1466193930")))
		assertEquals(KBigInteger("7764891606"), KBigInteger("8732250445629198163").divide(KBigInteger("1124581113")))
		assertEquals(KBigInteger("1512244676"), KBigInteger("1837511241003311560").divide(KBigInteger("1215088583")))
	}

	@Test fun `test divideAndRemainder`() {
		assertEquals(listOf(KBigInteger("-9374005355"), KBigInteger("421977081")), KBigInteger("5497455670909846741").divideAndRemainder(KBigInteger("-586457492")).asList())
		assertEquals(listOf(KBigInteger("-716868606"), KBigInteger("-1393899734")), KBigInteger("-1488036742811293586").divideAndRemainder(KBigInteger("2075745442")).asList())
		assertEquals(listOf(KBigInteger("2823893397"), KBigInteger("-835608648")), KBigInteger("-3228168242769576591").divideAndRemainder(KBigInteger("-1143162219")).asList())
		assertEquals(listOf(KBigInteger("-2660233441"), KBigInteger("1391384620")), KBigInteger("4704521694403990918").divideAndRemainder(KBigInteger("-1768461978")).asList())
		assertEquals(listOf(KBigInteger("-3855828132"), KBigInteger("5017123")), KBigInteger("2775570303761896375").divideAndRemainder(KBigInteger("-719837661")).asList())
		assertEquals(listOf(KBigInteger("-4243234012"), KBigInteger("386076541")), KBigInteger("6006515197385489505").divideAndRemainder(KBigInteger("-1415551247")).asList())
		assertEquals(listOf(KBigInteger("3835132393"), KBigInteger("240325827")), KBigInteger("1478303428850112358").divideAndRemainder(KBigInteger("385463467")).asList())
		assertEquals(listOf(KBigInteger("-3072035964"), KBigInteger("117249016")), KBigInteger("6398559319790217808").divideAndRemainder(KBigInteger("-2082839978")).asList())
		assertEquals(listOf(KBigInteger("3804953019"), KBigInteger("-900617363")), KBigInteger("-6869235311079459488").divideAndRemainder(KBigInteger("-1805340375")).asList())
		assertEquals(listOf(KBigInteger("23532193056"), KBigInteger("139874344")), KBigInteger("8029045760358746728").divideAndRemainder(KBigInteger("341194114")).asList())
	}

	@Test fun `test doubleValue`() {
		assertEquals(-8.7047491240662554E17, KBigInteger("-870474912406625487").doubleValue())
		assertEquals(1.64578765971343795E18, KBigInteger("1645787659713437931").doubleValue())
		assertEquals(-7.441357519711447E18, KBigInteger("-7441357519711447187").doubleValue())
		assertEquals(3.1772721275100621E18, KBigInteger("3177272127510062329").doubleValue())
		assertEquals(-1.6050981048060457E18, KBigInteger("-1605098104806045653").doubleValue())
		assertEquals(-3.6232777949689994E18, KBigInteger("-3623277794968999622").doubleValue())
		assertEquals(4.4342778684665856E18, KBigInteger("4434277868466585452").doubleValue())
		assertEquals(-8.2689608892597412E18, KBigInteger("-8268960889259741364").doubleValue())
		assertEquals(-7.7723410825009152E18, KBigInteger("-7772341082500914883").doubleValue())
		assertEquals(-2.04339840564440499E18, KBigInteger("-2043398405644404940").doubleValue())
	}

	@Test fun `test flipBit`() {
		assertEquals(KBigInteger("353300186814770094"), KBigInteger("353300186814770158").flipBit(6))
		assertEquals(KBigInteger("9174224701954077519"), KBigInteger("9174224701954069327").flipBit(13))
		assertEquals(KBigInteger("-6895293417550063485"), KBigInteger("-6895293417550079869").flipBit(14))
		assertEquals(KBigInteger("-1332964010899780498"), KBigInteger("-1332964010899518354").flipBit(18))
		assertEquals(KBigInteger("5114719029831023784"), KBigInteger("5114719029831023786").flipBit(1))
		assertEquals(KBigInteger("3451288786177371564"), KBigInteger("3451288786177404332").flipBit(15))
		assertEquals(KBigInteger("6572605698747701657"), KBigInteger("6572605698747668889").flipBit(15))
		assertEquals(KBigInteger("-3516674975142478101"), KBigInteger("-3516674975142477845").flipBit(8))
		assertEquals(KBigInteger("-6095468424388810151"), KBigInteger("-6095468424388809127").flipBit(10))
		assertEquals(KBigInteger("-4013197438752535952"), KBigInteger("-4013197438752535948").flipBit(2))
	}

	@Test fun `test floatValue`() {
		assertEquals(-3.95280896E8f, KBigInteger("-395280893").floatValue())
		assertEquals(1.28088584E8f, KBigInteger("128088581").floatValue())
		assertEquals(6.0852467E8f, KBigInteger("608524643").floatValue())
		assertEquals(-3.54907008E8f, KBigInteger("-354907007").floatValue())
		assertEquals(-2.03082816E9f, KBigInteger("-2030828197").floatValue())
		assertEquals(1.1465016E8f, KBigInteger("114650159").floatValue())
		assertEquals(1.64668659E9f, KBigInteger("1646686641").floatValue())
		assertEquals(-2.991096E8f, KBigInteger("-299109595").floatValue())
		assertEquals(-6.3388403E8f, KBigInteger("-633884028").floatValue())
		assertEquals(1.90978214E9f, KBigInteger("1909782099").floatValue())
	}

	@Test fun `test gcd`() {
		assertEquals(KBigInteger("1"), KBigInteger("-4120764502342358299").gcd(KBigInteger("6076074290308814879")))
		assertEquals(KBigInteger("1"), KBigInteger("-5642803639620428363").gcd(KBigInteger("-2478667659309807934")))
		assertEquals(KBigInteger("3"), KBigInteger("6781943539637168127").gcd(KBigInteger("2840351585572512609")))
		assertEquals(KBigInteger("1"), KBigInteger("1154970202893577724").gcd(KBigInteger("1897638735515261065")))
		assertEquals(KBigInteger("2"), KBigInteger("-2717014810581110846").gcd(KBigInteger("-5682703071736095254")))
		assertEquals(KBigInteger("1"), KBigInteger("4986559804285013743").gcd(KBigInteger("-2069506321990950355")))
		assertEquals(KBigInteger("3"), KBigInteger("6370876168590899679").gcd(KBigInteger("5184382695473084115")))
		assertEquals(KBigInteger("1"), KBigInteger("-2869435477340411828").gcd(KBigInteger("1143657381603147793")))
		assertEquals(KBigInteger("1"), KBigInteger("-4029376317929818861").gcd(KBigInteger("775384847656670744")))
		assertEquals(KBigInteger("2"), KBigInteger("-4728075451521024046").gcd(KBigInteger("-817555196400214596")))
	}

	@Test fun `test getLowestSetBit`() {
		assertEquals(1, KBigInteger("-4307400441275146054").getLowestSetBit())
		assertEquals(0, KBigInteger("-7851696228168261537").getLowestSetBit())
		assertEquals(0, KBigInteger("-6624584591602874745").getLowestSetBit())
		assertEquals(1, KBigInteger("-3231977120708700782").getLowestSetBit())
		assertEquals(0, KBigInteger("-1206515663373661947").getLowestSetBit())
		assertEquals(0, KBigInteger("5291379255373839477").getLowestSetBit())
		assertEquals(0, KBigInteger("-5360579646783623573").getLowestSetBit())
		assertEquals(2, KBigInteger("-3437551571406521732").getLowestSetBit())
		assertEquals(0, KBigInteger("710103163201071697").getLowestSetBit())
		assertEquals(2, KBigInteger("2996739312602565204").getLowestSetBit())
	}

	@Test fun `test intValue`() {
		assertEquals(-359759814, KBigInteger("3011583749940740154").intValue())
		assertEquals(31877213, KBigInteger("1709577857797613661").intValue())
		assertEquals(1396016673, KBigInteger("4552199953974658593").intValue())
		assertEquals(-146563566, KBigInteger("-4713140980125819374").intValue())
		assertEquals(312351670, KBigInteger("9023804397483596726").intValue())
		assertEquals(362645900, KBigInteger("8568388042813704588").intValue())
		assertEquals(-204363913, KBigInteger("-3233097990171154569").intValue())
		assertEquals(840273950, KBigInteger("8598015294634823710").intValue())
		assertEquals(1908891959, KBigInteger("5528602392037646647").intValue())
		assertEquals(1708468054, KBigInteger("8426432279740753750").intValue())
	}

	@Test fun `test isProbablePrime`() {
		assertEquals(false, KBigInteger("4242064110226662055").isProbablePrime(1))
		assertEquals(false, KBigInteger("1598372276164565334").isProbablePrime(8))
		assertEquals(true, KBigInteger("1030808009936800810850333511403").isProbablePrime(9))
		assertEquals(true, KBigInteger("1046308229295478712950570733779").isProbablePrime(8))
		assertEquals(false, KBigInteger("6949460317257588177").isProbablePrime(1))
		assertEquals(true, KBigInteger("1265090181468875686933541040029").isProbablePrime(7))
		assertEquals(true, KBigInteger("994003042921801474108742542211").isProbablePrime(9))
		assertEquals(false, KBigInteger("4482894046083646835").isProbablePrime(4))
		assertEquals(false, KBigInteger("5710110696335430577").isProbablePrime(2))
		assertEquals(true, KBigInteger("868262241024477315231721700783").isProbablePrime(2))
	}

	@Test fun `test longValue`() {
		assertEquals(-7750061780996814699, KBigInteger("-7750061780996814699").longValue())
		assertEquals(-3571333719831844984, KBigInteger("-3571333719831844984").longValue())
		assertEquals(-7738310436017147551, KBigInteger("-7738310436017147551").longValue())
		assertEquals(942950601208482642, KBigInteger("942950601208482642").longValue())
		assertEquals(52748684597413735, KBigInteger("52748684597413735").longValue())
		assertEquals(-3521086074282538240, KBigInteger("-3521086074282538240").longValue())
		assertEquals(-6831913850259504541, KBigInteger("-6831913850259504541").longValue())
		assertEquals(-8258925688510581869, KBigInteger("-8258925688510581869").longValue())
		assertEquals(783592289325973431, KBigInteger("783592289325973431").longValue())
		assertEquals(-316120337187078923, KBigInteger("-316120337187078923").longValue())
	}

	@Test fun `test max`() {
		assertEquals(KBigInteger("3736333870911410526"), KBigInteger("2472548029550722861").max(KBigInteger("3736333870911410526")))
		assertEquals(KBigInteger("8745183424710607634"), KBigInteger("8745183424710607634").max(KBigInteger("4666620846756281393")))
		assertEquals(KBigInteger("6933946028710472429"), KBigInteger("6933946028710472429").max(KBigInteger("6273765923408534941")))
		assertEquals(KBigInteger("-4063116620413810994"), KBigInteger("-4063116620413810994").max(KBigInteger("-7511964832290771173")))
		assertEquals(KBigInteger("-3006554812474479051"), KBigInteger("-6144339729321000948").max(KBigInteger("-3006554812474479051")))
		assertEquals(KBigInteger("8463391267589330128"), KBigInteger("8463391267589330128").max(KBigInteger("4835073624131307490")))
		assertEquals(KBigInteger("-1703820176720544094"), KBigInteger("-2124585680082482872").max(KBigInteger("-1703820176720544094")))
		assertEquals(KBigInteger("5293167195469798207"), KBigInteger("-5286815602994769382").max(KBigInteger("5293167195469798207")))
		assertEquals(KBigInteger("1573907506367577594"), KBigInteger("1573907506367577594").max(KBigInteger("-4549353954210220971")))
		assertEquals(KBigInteger("1506315360812386401"), KBigInteger("-6023236885941626733").max(KBigInteger("1506315360812386401")))
	}

	@Test fun `test min`() {
		assertEquals(KBigInteger("3306243779993051972"), KBigInteger("6900691157127568205").min(KBigInteger("3306243779993051972")))
		assertEquals(KBigInteger("-6980068752096962181"), KBigInteger("2887626949897948389").min(KBigInteger("-6980068752096962181")))
		assertEquals(KBigInteger("678262209821486356"), KBigInteger("3322329797467142445").min(KBigInteger("678262209821486356")))
		assertEquals(KBigInteger("490409782467972070"), KBigInteger("8134503833237669360").min(KBigInteger("490409782467972070")))
		assertEquals(KBigInteger("-2741544900518825341"), KBigInteger("5673827633654378324").min(KBigInteger("-2741544900518825341")))
		assertEquals(KBigInteger("-1352642506858152377"), KBigInteger("-283503371551474838").min(KBigInteger("-1352642506858152377")))
		assertEquals(KBigInteger("2109174413516359069"), KBigInteger("8878959307825370611").min(KBigInteger("2109174413516359069")))
		assertEquals(KBigInteger("-6660595927700764181"), KBigInteger("2162405931644514882").min(KBigInteger("-6660595927700764181")))
		assertEquals(KBigInteger("7645702952969519089"), KBigInteger("7645702952969519089").min(KBigInteger("8628276822507073476")))
		assertEquals(KBigInteger("-7594234431208689565"), KBigInteger("-23323969036231357").min(KBigInteger("-7594234431208689565")))
	}

	@Test fun `test mod`() {
		assertEquals(KBigInteger("439813719"), KBigInteger("7702125033631241065").mod(KBigInteger("495147706")))
		assertEquals(KBigInteger("1067664500"), KBigInteger("-8803874030760421480").mod(KBigInteger("1951898996")))
		assertEquals(KBigInteger("1594754591"), KBigInteger("6123945182326040466").mod(KBigInteger("1920489625")))
		assertEquals(KBigInteger("67673933"), KBigInteger("6178690228410272410").mod(KBigInteger("1802814437")))
		assertEquals(KBigInteger("971557831"), KBigInteger("-3793773597046390553").mod(KBigInteger("1783587486")))
		assertEquals(KBigInteger("875395179"), KBigInteger("-8350107336116261073").mod(KBigInteger("1269414316")))
		assertEquals(KBigInteger("630822683"), KBigInteger("-8099751438632067125").mod(KBigInteger("1857706582")))
		assertEquals(KBigInteger("16490399"), KBigInteger("3682394493083478669").mod(KBigInteger("260924066")))
		assertEquals(KBigInteger("370157239"), KBigInteger("8044557111195230803").mod(KBigInteger("587899103")))
		assertEquals(KBigInteger("461173786"), KBigInteger("-1745056428547143972").mod(KBigInteger("768629063")))
	}

	@Test fun `test modInverse`() {
		assertEquals(KBigInteger("141938"), KBigInteger("-4601564116259201911").modInverse(KBigInteger("652657")))
		assertEquals(KBigInteger("537193"), KBigInteger("7131629258707030118").modInverse(KBigInteger("989641")))
		assertEquals(KBigInteger("245833"), KBigInteger("-4533848024312093164").modInverse(KBigInteger("726091")))
		assertEquals(KBigInteger("512384"), KBigInteger("-1131320656538592416").modInverse(KBigInteger("787939")))
		assertEquals(KBigInteger("212409"), KBigInteger("-5236944188087406536").modInverse(KBigInteger("936713")))
		assertEquals(KBigInteger("636682"), KBigInteger("-8103936442465906874").modInverse(KBigInteger("1037129")))
		assertEquals(KBigInteger("258634"), KBigInteger("-1838597340593639986").modInverse(KBigInteger("569417")))
		assertEquals(KBigInteger("333307"), KBigInteger("-4789474379157173235").modInverse(KBigInteger("1028749")))
		assertEquals(KBigInteger("682688"), KBigInteger("7047535955612142674").modInverse(KBigInteger("766907")))
		assertEquals(KBigInteger("526255"), KBigInteger("1883371229083680215").modInverse(KBigInteger("826069")))
	}

	@Test fun `test modPow`() {
		assertEquals(KBigInteger("197"), KBigInteger("-3902376357342407552").modPow(KBigInteger("507"), KBigInteger("665")))
		assertEquals(KBigInteger("321"), KBigInteger("8325430624533210211").modPow(KBigInteger("493"), KBigInteger("733")))
		assertEquals(KBigInteger("207"), KBigInteger("-976872231277319672").modPow(KBigInteger("996"), KBigInteger("251")))
		assertEquals(KBigInteger("384"), KBigInteger("3691453710627417903").modPow(KBigInteger("873"), KBigInteger("997")))
		assertEquals(KBigInteger("52"), KBigInteger("-3744875390220330965").modPow(KBigInteger("298"), KBigInteger("953")))
		assertEquals(KBigInteger("8"), KBigInteger("9000861650806583552").modPow(KBigInteger("863"), KBigInteger("350")))
		assertEquals(KBigInteger("123"), KBigInteger("1366631124969637965").modPow(KBigInteger("989"), KBigInteger("249")))
		assertEquals(KBigInteger("241"), KBigInteger("6647852505465435158").modPow(KBigInteger("908"), KBigInteger("831")))
		assertEquals(KBigInteger("246"), KBigInteger("-5382376463204356773").modPow(KBigInteger("363"), KBigInteger("273")))
		assertEquals(KBigInteger("5"), KBigInteger("5372696629451671337").modPow(KBigInteger("192"), KBigInteger("716")))
	}

	@Test fun `test multiply`() {
		assertEquals(KBigInteger("-31427107915750152044760681801337068912"), KBigInteger("-5136512337997833708").multiply(KBigInteger("6118374851991527764")))
		assertEquals(KBigInteger("3598469503632915832882864305459840939"), KBigInteger("6074081785410664983").multiply(KBigInteger("592430202747035533")))
		assertEquals(KBigInteger("-29641851066391677003490884499078777125"), KBigInteger("-7605424005280432125").multiply(KBigInteger("3897462001567748681")))
		assertEquals(KBigInteger("-41723796309824314269885500120106863395"), KBigInteger("7013659762090480277").multiply(KBigInteger("-5948933613139538135")))
		assertEquals(KBigInteger("11613463848337016015541193311012006036"), KBigInteger("-1424356259326545249").multiply(KBigInteger("-8153482509936114964")))
		assertEquals(KBigInteger("382469644826758237604302702923773067"), KBigInteger("103624467402361761").multiply(KBigInteger("3690920247065522347")))
		assertEquals(KBigInteger("47109756551969538290659390483598774625"), KBigInteger("8528268475082848129").multiply(KBigInteger("5523953272532486625")))
		assertEquals(KBigInteger("-9653097820887429841616951336768696781"), KBigInteger("-8853406233506169363").multiply(KBigInteger("1090325866258659487")))
		assertEquals(KBigInteger("2842306321383852360846711664249215882"), KBigInteger("416476083660764337").multiply(KBigInteger("6824656763962031786")))
		assertEquals(KBigInteger("-3348176843730491045328683726863188067"), KBigInteger("794358704497094401").multiply(KBigInteger("-4214943230023783267")))
	}

	@Test fun `test negate`() {
		assertEquals(KBigInteger("8359150460755998978"), KBigInteger("-8359150460755998978").negate())
		assertEquals(KBigInteger("7373018155002845415"), KBigInteger("-7373018155002845415").negate())
		assertEquals(KBigInteger("-5116492460918000863"), KBigInteger("5116492460918000863").negate())
		assertEquals(KBigInteger("-2792345977596561188"), KBigInteger("2792345977596561188").negate())
		assertEquals(KBigInteger("6416080444419503873"), KBigInteger("-6416080444419503873").negate())
		assertEquals(KBigInteger("613831752032888812"), KBigInteger("-613831752032888812").negate())
		assertEquals(KBigInteger("3566232979391338220"), KBigInteger("-3566232979391338220").negate())
		assertEquals(KBigInteger("8964956199914987028"), KBigInteger("-8964956199914987028").negate())
		assertEquals(KBigInteger("-8533087835434573469"), KBigInteger("8533087835434573469").negate())
		assertEquals(KBigInteger("3428902922328568803"), KBigInteger("-3428902922328568803").negate())
	}

	@Test fun `test nextProbablePrime`() {
		assertEquals(KBigInteger("9218696266966735147"), KBigInteger("9218696266966735123").nextProbablePrime())
		assertEquals(KBigInteger("3734271386551916503"), KBigInteger("3734271386551916484").nextProbablePrime())
		assertEquals(KBigInteger("2488753022907772729"), KBigInteger("2488753022907772675").nextProbablePrime())
		assertEquals(KBigInteger("4563433630882898713"), KBigInteger("4563433630882898676").nextProbablePrime())
		assertEquals(KBigInteger("4719901768502387113"), KBigInteger("4719901768502387112").nextProbablePrime())
		assertEquals(KBigInteger("5927460970566100181"), KBigInteger("5927460970566100166").nextProbablePrime())
		assertEquals(KBigInteger("1203824772692064847"), KBigInteger("1203824772692064815").nextProbablePrime())
		assertEquals(KBigInteger("4337453777417751197"), KBigInteger("4337453777417751192").nextProbablePrime())
		assertEquals(KBigInteger("4066421478272979473"), KBigInteger("4066421478272979366").nextProbablePrime())
		assertEquals(KBigInteger("7017220558396818347"), KBigInteger("7017220558396818313").nextProbablePrime())
	}

	@Test fun `test not`() {
		assertEquals(KBigInteger("8615008931702554231"), KBigInteger("-8615008931702554232").not())
		assertEquals(KBigInteger("5068360407880694663"), KBigInteger("-5068360407880694664").not())
		assertEquals(KBigInteger("6623019182534513665"), KBigInteger("-6623019182534513666").not())
		assertEquals(KBigInteger("-8384380896162516619"), KBigInteger("8384380896162516618").not())
		assertEquals(KBigInteger("4181343705797620245"), KBigInteger("-4181343705797620246").not())
		assertEquals(KBigInteger("4737262672395037185"), KBigInteger("-4737262672395037186").not())
		assertEquals(KBigInteger("6020171648055179510"), KBigInteger("-6020171648055179511").not())
		assertEquals(KBigInteger("733397742392070043"), KBigInteger("-733397742392070044").not())
		assertEquals(KBigInteger("1751789334712757083"), KBigInteger("-1751789334712757084").not())
		assertEquals(KBigInteger("-6114738422408234539"), KBigInteger("6114738422408234538").not())
	}

	@Test fun `test or`() {
		assertEquals(KBigInteger("-288656301498650"), KBigInteger("-7288801730627907868").or(KBigInteger("-1729882363379869022")))
		assertEquals(KBigInteger("-1752747570927042817"), KBigInteger("7074153457836678782").or(KBigInteger("-6510907299210004251")))
		assertEquals(KBigInteger("8781829452728086427"), KBigInteger("7033218896725485851").or(KBigInteger("4126794911211818906")))
		assertEquals(KBigInteger("-741132444554822689"), KBigInteger("-5642265117601506405").or(KBigInteger("-4281002455077297716")))
		assertEquals(KBigInteger("-2326672312763482195"), KBigInteger("-2331233396241925595").or(KBigInteger("554353737853752744")))
		assertEquals(KBigInteger("-288425011296014622"), KBigInteger("-1572021480268698976").or(KBigInteger("-2606092454728790334")))
		assertEquals(KBigInteger("-293297151303255598"), KBigInteger("-357514679296493374").or(KBigInteger("-1014233774446792430")))
		assertEquals(KBigInteger("-2317287830587970049"), KBigInteger("-3327027357663622725").or(KBigInteger("-6948116535708226212")))
		assertEquals(KBigInteger("-160027346659770471"), KBigInteger("-2503026496422371440").or(KBigInteger("2433128456502800777")))
		assertEquals(KBigInteger("-1243070527065844231"), KBigInteger("-6721699752951742071").or(KBigInteger("5515924798043100400")))
	}

	@Test fun `test pow`() {
		assertEquals(KBigInteger("766917033037264459187390657168423661971039124298310441261957329957301051539728420970907442540179304846351632001941381522039371538089073843596844809342644415373631319296954638561020686106624"), KBigInteger("-7735258618234422268").pow(10))
		assertEquals(KBigInteger("28868679829063828374221538625815236337455865021828722181256850345367312681916134020264692607764340988466005073756566770207519375465536831675837529097529265058380363327804753159536618847884881653277191409237212715824563701726238964430503387092595585909450069340529766422756695359283210000000000000000"), KBigInteger("-4505849510362124790").pow(16))
		assertEquals(KBigInteger("627923389665547422560583336311874201977611869769593820040929321855160309490762337159228391217845761787870032348703149787920279353990349077290840237691747580679277888263028986995704893328945911743645327128452149730679601034690560000000000000"), KBigInteger("2792497673963296360").pow(13))
		assertEquals(KBigInteger("176523970822084870691397089948238466079603873999520974019314270346683596964820711565729275314665277749062815494960028422852219391380925190215412443248466079586148041330024776353108149520495456587927726606598865417998225427499503892744944360680739491850560385115630947763171059269450634058801391"), KBigInteger("177750970929023471").pow(17))
		assertEquals(KBigInteger("44549849182911602975083415871464790564"), KBigInteger("-6674567340503173242").pow(2))
		assertEquals(KBigInteger("276243641355424109363063644687832282645896529705807581956202496808482191345680310994525505961970049315022363229688324954936462298916770242132219784324137872561751466654916781452574543539400134512078994321138407810363542887940694016"), KBigInteger("532418641652187506").pow(13))
		assertEquals(KBigInteger("250062782555612261038699683956153311278042548837465277477524640746933234124568543122792156276162381698264413279372983688317516501997937056907813531217985116247997492329690413113766624715776"), KBigInteger("-6915202559465884566").pow(10))
		assertEquals(KBigInteger("106723793725113297553720855832869880849328088081702666690887540756918023941386973340590988046794212668459267883650136934926408201055909412182231403297496542622825063063831284686887851637644823122319589582311324675351772301684015230990917025076544978111820388635942599728058626907"), KBigInteger("3429394262952230803").pow(15))
		assertEquals(KBigInteger("513516394242070911137946600268989529212939101113304388562950321843316572985517426805090259899711540473353442637294853597014076565033383365605463070444819298799184904994076660320008535974538005255334486528449972677249579126424340381141022461599692081684668866102642506355741960550854366219402378498972409233811935582923449"), KBigInteger("-656527644034349493").pow(18))
		assertEquals(KBigInteger("25016849532041728244872954511280546530134802136178764617961371302794523608729187439150607828831601581016012910859898357569380918370181033659533680896"), KBigInteger("-3546329437324660938").pow(8))
	}

	@Test fun `test remainder`() {
		assertEquals(KBigInteger("865594672"), KBigInteger("4162921291357818604").remainder(KBigInteger("-1039800226")))
		assertEquals(KBigInteger("-342677560"), KBigInteger("-3975719725861615712").remainder(KBigInteger("-478800668")))
		assertEquals(KBigInteger("-464094371"), KBigInteger("-8926214154822477731").remainder(KBigInteger("-1054136640")))
		assertEquals(KBigInteger("-134644871"), KBigInteger("-5593593640492246556").remainder(KBigInteger("-1140616395")))
		assertEquals(KBigInteger("-650654395"), KBigInteger("-2361472852569789839").remainder(KBigInteger("1470300943")))
		assertEquals(KBigInteger("317764243"), KBigInteger("4013238881253622428").remainder(KBigInteger("-399453455")))
		assertEquals(KBigInteger("2849966"), KBigInteger("7311343304728745720").remainder(KBigInteger("33124083")))
		assertEquals(KBigInteger("-1016970550"), KBigInteger("-1389119259245215831").remainder(KBigInteger("1817518887")))
		assertEquals(KBigInteger("199608734"), KBigInteger("7223835406464709126").remainder(KBigInteger("-525841448")))
		assertEquals(KBigInteger("-247584302"), KBigInteger("-5223686517919128702").remainder(KBigInteger("-329047055")))
	}

	@Test fun `test setBit`() {
		assertEquals(KBigInteger("-8808897981182862177"), KBigInteger("-8808897981182894945").setBit(15))
		assertEquals(KBigInteger("1873780297497783972"), KBigInteger("1297319545194360484").setBit(59))
		assertEquals(KBigInteger("-863256620575082608"), KBigInteger("-863256620575082608").setBit(43))
		assertEquals(KBigInteger("131100721732987462"), KBigInteger("131099622221359686").setBit(40))
		assertEquals(KBigInteger("2785511172503923322"), KBigInteger("2785511172503923322").setBit(14))
		assertEquals(KBigInteger("4938517249223047263"), KBigInteger("4938517249222785119").setBit(18))
		assertEquals(KBigInteger("-5793926738691881704"), KBigInteger("-6082157114843593448").setBit(58))
		assertEquals(KBigInteger("1685190379979080570"), KBigInteger("1685190379979080570").setBit(43))
		assertEquals(KBigInteger("605877817168158862"), KBigInteger("605877817101049998").setBit(26))
		assertEquals(KBigInteger("1334248542235347694"), KBigInteger("1334248542235347694").setBit(39))
	}

	@Test fun `test shiftLeft`() {
		assertEquals(KBigInteger("-34363832262829873040"), KBigInteger("-2147739516426867065").shiftLeft(4))
		assertEquals(KBigInteger("-103955562226428124144"), KBigInteger("-6497222639151757759").shiftLeft(4))
		assertEquals(KBigInteger("-640832309905810600960"), KBigInteger("-1251625605284786330").shiftLeft(9))
		assertEquals(KBigInteger("-245486996854790126112"), KBigInteger("-7671468651712191441").shiftLeft(5))
		assertEquals(KBigInteger("5925586864772183705"), KBigInteger("5925586864772183705").shiftLeft(0))
		assertEquals(KBigInteger("499490796311522520064"), KBigInteger("3902271846183769688").shiftLeft(7))
		assertEquals(KBigInteger("37340076722705026752"), KBigInteger("583438698792266043").shiftLeft(6))
		assertEquals(KBigInteger("9051037583956745964"), KBigInteger("2262759395989186491").shiftLeft(2))
		assertEquals(KBigInteger("-5472848958062718312"), KBigInteger("-2736424479031359156").shiftLeft(1))
		assertEquals(KBigInteger("-2167016828882367365888"), KBigInteger("-8464909487821747523").shiftLeft(8))
	}

	@Test fun `test shiftRight`() {
		assertEquals(KBigInteger("3051041996535535"), KBigInteger("24408335972284286").shiftRight(3))
		assertEquals(KBigInteger("-40095740173443610"), KBigInteger("-80191480346887220").shiftRight(1))
		assertEquals(KBigInteger("-262478075319861641"), KBigInteger("-4199649205117786255").shiftRight(4))
		assertEquals(KBigInteger("244419858584894354"), KBigInteger("1955358868679154838").shiftRight(3))
		assertEquals(KBigInteger("56318632424799613"), KBigInteger("7208784950374350479").shiftRight(7))
		assertEquals(KBigInteger("1513623290407191458"), KBigInteger("6054493161628765834").shiftRight(2))
		assertEquals(KBigInteger("-170910504247549938"), KBigInteger("-5469136135921598002").shiftRight(5))
		assertEquals(KBigInteger("18489782064272528"), KBigInteger("4733384208453767220").shiftRight(8))
		assertEquals(KBigInteger("-73094326819300308"), KBigInteger("-4678036916435219712").shiftRight(6))
		assertEquals(KBigInteger("15482665917702055"), KBigInteger("495445309366465770").shiftRight(5))
	}

	@Test fun `test signum`() {
		assertEquals(1, KBigInteger("4465051666793524527").signum())
		assertEquals(-1, KBigInteger("-8230600950116647595").signum())
		assertEquals(1, KBigInteger("4462446937845182741").signum())
		assertEquals(1, KBigInteger("3044724811743685826").signum())
		assertEquals(-1, KBigInteger("-8038490296961322105").signum())
		assertEquals(1, KBigInteger("5460072443213410444").signum())
		assertEquals(1, KBigInteger("766093988911397860").signum())
		assertEquals(1, KBigInteger("8484108250090038149").signum())
		assertEquals(1, KBigInteger("1414071280034215170").signum())
		assertEquals(-1, KBigInteger("-7709493657220186506").signum())
	}

	@Test fun `test subtract`() {
		assertEquals(KBigInteger("2378050310594754577"), KBigInteger("-2165922962308865821").subtract(KBigInteger("-4543973272903620398")))
		assertEquals(KBigInteger("-1476761452555803947"), KBigInteger("-4298747154469064272").subtract(KBigInteger("-2821985701913260325")))
		assertEquals(KBigInteger("5798980666820778278"), KBigInteger("2967124196419068441").subtract(KBigInteger("-2831856470401709837")))
		assertEquals(KBigInteger("10903913126892105492"), KBigInteger("8974260526400200644").subtract(KBigInteger("-1929652600491904848")))
		assertEquals(KBigInteger("-3674548342874616518"), KBigInteger("-5781531672683259222").subtract(KBigInteger("-2106983329808642704")))
		assertEquals(KBigInteger("-309759865502438437"), KBigInteger("2509883444075797515").subtract(KBigInteger("2819643309578235952")))
		assertEquals(KBigInteger("-7676762625943083991"), KBigInteger("969721165123526388").subtract(KBigInteger("8646483791066610379")))
		assertEquals(KBigInteger("-3851292894057349146"), KBigInteger("2126863943507482048").subtract(KBigInteger("5978156837564831194")))
		assertEquals(KBigInteger("15236632669809980246"), KBigInteger("6523324882978450538").subtract(KBigInteger("-8713307786831529708")))
		assertEquals(KBigInteger("4414599852731263674"), KBigInteger("-43472411793093559").subtract(KBigInteger("-4458072264524357233")))
	}

	@Test fun `test testBit`() {
		assertEquals(true, KBigInteger("1311792462052978528").testBit(26))
		assertEquals(true, KBigInteger("1208879218111062369").testBit(5))
		assertEquals(false, KBigInteger("-5844733236008199742").testBit(21))
		assertEquals(true, KBigInteger("6937903621234699639").testBit(36))
		assertEquals(true, KBigInteger("5963635319195285265").testBit(48))
		assertEquals(true, KBigInteger("-8994664849756373281").testBit(20))
		assertEquals(false, KBigInteger("7004653486387134328").testBit(29))
		assertEquals(true, KBigInteger("-3229500354583738077").testBit(15))
		assertEquals(true, KBigInteger("-8837055284379392756").testBit(43))
		assertEquals(false, KBigInteger("8796269293260687584").testBit(35))
	}

	@Test fun `test toByteArray`() {
		assertEquals("7953eb05f4f68ffd", KBigInteger("8742589712473427965").toByteArray().hex())
		assertEquals("e25e734d6097a114", KBigInteger("-2135142397156810476").toByteArray().hex())
		assertEquals("ad6c7cf720aab2c5", KBigInteger("-5950243606816443707").toByteArray().hex())
		assertEquals("f7a81e7a8070cc51", KBigInteger("-601197038764241839").toByteArray().hex())
		assertEquals("f1414c76da2e5841", KBigInteger("-1062483963732404159").toByteArray().hex())
		assertEquals("1c308819dde0d3c6", KBigInteger("2031273076622152646").toByteArray().hex())
		assertEquals("5e5b099e25298559", KBigInteger("6799038637278856537").toByteArray().hex())
		assertEquals("ca13e56810834db2", KBigInteger("-3885509818374206030").toByteArray().hex())
		assertEquals("1491d9b4afce0096", KBigInteger("1482205122448457878").toByteArray().hex())
		assertEquals("c6f80791e5d38d8b", KBigInteger("-4109526336768078453").toByteArray().hex())
	}

	@Test fun `test xor`() {
		assertEquals(KBigInteger("-4684008531567470675"), KBigInteger("-5899168778142673314").xor(KBigInteger("1215688564352647667")))
		assertEquals(KBigInteger("-9147924480717726635"), KBigInteger("-5410278887334883935").xor(KBigInteger("3884037071649870324")))
		assertEquals(KBigInteger("-4111616687033779640"), KBigInteger("2170771726829049355").xor(KBigInteger("-2823551313951642557")))
		assertEquals(KBigInteger("-2768516192058369982"), KBigInteger("3089889919910193237").xor(KBigInteger("-903746108591755241")))
		assertEquals(KBigInteger("-2010341151546425707"), KBigInteger("7154944893983727031").xor(KBigInteger("-8695697546378697950")))
		assertEquals(KBigInteger("-3637064797443109225"), KBigInteger("-7357430425666259864").xor(KBigInteger("6080885154095676159")))
		assertEquals(KBigInteger("3834548679906940381"), KBigInteger("4827895438479129205").xor(KBigInteger("8518326591591100328")))
		assertEquals(KBigInteger("-6038619104289377052"), KBigInteger("3766933710199154720").xor(KBigInteger("-7461244487802757948")))
		assertEquals(KBigInteger("-912020824168684143"), KBigInteger("-330115559024136418").xor(KBigInteger("593604619228400271")))
		assertEquals(KBigInteger("7961464066490929763"), KBigInteger("-2437172917017095418").xor(KBigInteger("-5741630727636336283")))
	}

	@Test fun `test operator minus`() {
		assertEquals(KBigInteger("2584711029557433706"), KBigInteger("-5710865002703163898") - KBigInteger("-8295576032260597604"))
		assertEquals(KBigInteger("4772701841630102255"), KBigInteger("146854175549215902") - KBigInteger("-4625847666080886353"))
		assertEquals(KBigInteger("-13487675777958138514"), KBigInteger("-9000115787927328530") - KBigInteger("4487559990030809984"))
		assertEquals(KBigInteger("-4175303951550933038"), KBigInteger("3836306458868550175") - KBigInteger("8011610410419483213"))
		assertEquals(KBigInteger("3883724068864642774"), KBigInteger("-4586088988463707431") - KBigInteger("-8469813057328350205"))
		assertEquals(KBigInteger("5169467010035578928"), KBigInteger("3185819871993880100") - KBigInteger("-1983647138041698828"))
		assertEquals(KBigInteger("-9834674015940134641"), KBigInteger("-8116141048694625566") - KBigInteger("1718532967245509075"))
		assertEquals(KBigInteger("-13241621590231469601"), KBigInteger("-6191872841671508116") - KBigInteger("7049748748559961485"))
		assertEquals(KBigInteger("1466305593748114332"), KBigInteger("4287956332441123939") - KBigInteger("2821650738693009607"))
		assertEquals(KBigInteger("-6565932048842123453"), KBigInteger("-5409973572559765785") - KBigInteger("1155958476282357668"))
	}

	@Test fun `test operator plus`() {
		assertEquals(KBigInteger("-7532620446525822404"), KBigInteger("276533621053991295") + KBigInteger("-7809154067579813699"))
		assertEquals(KBigInteger("6301157834165742823"), KBigInteger("-1719883307246014094") + KBigInteger("8021041141411756917"))
		assertEquals(KBigInteger("-9112345041971773049"), KBigInteger("-1325359254438939839") + KBigInteger("-7786985787532833210"))
		assertEquals(KBigInteger("4301979162381015785"), KBigInteger("-4849000440557923501") + KBigInteger("9150979602938939286"))
		assertEquals(KBigInteger("-7143446555009342150"), KBigInteger("1105632254878753985") + KBigInteger("-8249078809888096135"))
		assertEquals(KBigInteger("-11605386525034326645"), KBigInteger("-8297298187230222791") + KBigInteger("-3308088337804103854"))
		assertEquals(KBigInteger("225632773701346695"), KBigInteger("-4991262001360928709") + KBigInteger("5216894775062275404"))
		assertEquals(KBigInteger("-11560400659374430"), KBigInteger("4332519878746597093") + KBigInteger("-4344080279405971523"))
		assertEquals(KBigInteger("-6625170338089372874"), KBigInteger("-4182622902146212410") + KBigInteger("-2442547435943160464"))
		assertEquals(KBigInteger("5653846194302615204"), KBigInteger("3159166494660470546") + KBigInteger("2494679699642144658"))
	}

	@Test fun `test operator times`() {
		assertEquals(KBigInteger("-25914239051484390923165574644229932748"), KBigInteger("2995502072064808446") * KBigInteger("-8651050284075293338"))
		assertEquals(KBigInteger("-14987611287358168831469366229018051840"), KBigInteger("5614876053365364480") * KBigInteger("-2669268412145110083"))
		assertEquals(KBigInteger("-10131316417575392377809886048567321560"), KBigInteger("2382629426277472193") * KBigInteger("-4252157849575528920"))
		assertEquals(KBigInteger("-11577423128337217311599109686724584376"), KBigInteger("-4981890844191109512") * KBigInteger("2323901404190038823"))
		assertEquals(KBigInteger("-67600779297166137282769772466950406000"), KBigInteger("7720221586329802000") * KBigInteger("-8756326297274530503"))
		assertEquals(KBigInteger("-5711172453616855177820331194024970741"), KBigInteger("-726035576119759659") * KBigInteger("7866243255102965599"))
		assertEquals(KBigInteger("-57084721564138392871462990089014343025"), KBigInteger("-6273241578643453265") * KBigInteger("9099716765009802785"))
		assertEquals(KBigInteger("2084166902363107222273084422651144630"), KBigInteger("-1180100260804471530") * KBigInteger("-1766093078347712271"))
		assertEquals(KBigInteger("13343279678089676649596436143560656148"), KBigInteger("-2240280889005540358") * KBigInteger("-5956074411728233006"))
		assertEquals(KBigInteger("-29280068457579822100470938908956720514"), KBigInteger("-6552537430065273383") * KBigInteger("4468508386267722158"))
	}

	@Test fun `test operator divide`() {
		assertEquals(KBigInteger("0"), KBigInteger("2760228365601934041") / KBigInteger("6642265348580871207"))
		assertEquals(KBigInteger("0"), KBigInteger("2645678715576552617") / KBigInteger("-7355589659763270817"))
		assertEquals(KBigInteger("0"), KBigInteger("-106414661876406368") / KBigInteger("-8165341852096535019"))
		assertEquals(KBigInteger("0"), KBigInteger("-4802582012077414124") / KBigInteger("-6718773750678898227"))
		assertEquals(KBigInteger("0"), KBigInteger("7309123493944391466") / KBigInteger("-9198582341139704815"))
		assertEquals(KBigInteger("2"), KBigInteger("3526600872322588230") / KBigInteger("1699968238376597419"))
		assertEquals(KBigInteger("1"), KBigInteger("-7328115200062535102") / KBigInteger("-4633353762379105840"))
		assertEquals(KBigInteger("-5"), KBigInteger("-6412391742367902012") / KBigInteger("1179393057451537370"))
		assertEquals(KBigInteger("-2"), KBigInteger("-5217443264889802059") / KBigInteger("2232361703128213856"))
		assertEquals(KBigInteger("0"), KBigInteger("1539612632114059487") / KBigInteger("-2767273678330527484"))
	}


}
