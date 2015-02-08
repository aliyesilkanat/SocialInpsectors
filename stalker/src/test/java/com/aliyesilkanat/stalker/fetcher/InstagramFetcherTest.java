package com.aliyesilkanat.stalker.fetcher;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.aliyesilkanat.stalker.endpoint.EndpointLayer;
import com.aliyesilkanat.stalker.fetcher.instagram.InstagramFetcher;
import com.aliyesilkanat.stalker.util.FileUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class InstagramFetcherTest {
	private InstagramFetcher fetcher;

	@Before
	public void before() {
		fetcher = Mockito.spy(new InstagramFetcher());
	}

	@Test
	public void fetchFollowingsOfAUser() throws Exception {
		String file = FileUtil.readFile("testHtml/followings.json");
		Mockito.doReturn(new Gson().fromJson(file, JsonObject.class))
				.when(fetcher).getJsonFromApi(Mockito.anyString());

		String fetchFriends = fetcher.getJsonFromApi(
				EndpointLayer.getInstance().setUriForFetchingFollowings(
						"239984780")).toString();
		assertEquals(
				"{\"data\":[{\"username\":\"summervibing\",\"bio\":\"Australia. Things that inspire the wild at heart.\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10932498_2031817810292269_995097487_a.jpg\",\"full_name\":\"POSITIVE Vibes \u2728\uD83C\uDF1F\u2728\",\"id\":\"1481973879\"},{\"username\":\"michelle_lewin_\",\"bio\":\"BUSINESS ONLY: MichelleLewinManagement@gmail.com (not handled by me)\",\"website\":\"https://m.youtube.com/watch?v=8vOXSm9a4xU\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10950500_585916678175183_1517908897_a.jpg\",\"full_name\":\"Michelle Lewin #lacuerpa1\u20E3\",\"id\":\"775740654\"},{\"username\":\"hkn_uysl\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/anonymousUser.jpg\",\"full_name\":\"Hakan Uysal\",\"id\":\"50041523\"},{\"username\":\"onur.ray\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-g-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10914410_886011121430158_403021121_a.jpg\",\"full_name\":\"Onur Erdem\",\"id\":\"1659553709\"},{\"username\":\"kenan967\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-d-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10809562_724392290984131_536732330_a.jpg\",\"full_name\":\"Kenan B\u0131\u00E7ak\u00E7\u0131o\u011Flu\",\"id\":\"632275702\"},{\"username\":\"svizvizviz\",\"bio\":\"However hard it may be,at the end of the day LIFE IS GOOD #universit\u00E9demarmara#balance#GS kucuk defterlerim ve ayraclarimla mutlu bi dunya benimkisi\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xpf1/t51.2885-19/10809911_735256346550351_1639600099_a.jpg\",\"full_name\":\"sseennaa\",\"id\":\"389855003\"},{\"username\":\"aysesensurer\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_208005126_75sq_1344945715.jpg\",\"full_name\":\"\",\"id\":\"208005126\"},{\"username\":\"jessleebuchanan\",\"bio\":\"Mermaid living in Cape Town\u2022 22\u2022 Co owner of SALTY online clothing and accessories store - coming soon\uD83C\uDF34\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10802784_911011448919677_33289114_a.jpg\",\"full_name\":\"Jessica Lee\",\"id\":\"226519304\"},{\"username\":\"aydindognn\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-b-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10895033_1537633016494945_877512172_a.jpg\",\"full_name\":\"\",\"id\":\"1580742726\"},{\"username\":\"dursundogan07\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10899318_431496023664061_1162675749_a.jpg\",\"full_name\":\"Dursun Do\u011Fan\",\"id\":\"1632010474\"},{\"username\":\"selin_nurlu\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10724644_1517310198485722_1132332314_a.jpg\",\"full_name\":\"Selin Nurlu\",\"id\":\"1531409185\"},{\"username\":\"yyigitaydiin\",\"bio\":\"Ege \u00DCniversitesi\\nShit happens dude shit happens.\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10860023_747154032005274_2024843908_a.jpg\",\"full_name\":\"yigit\",\"id\":\"1591095046\"},{\"username\":\"birgul.ozlem\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-g-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10852666_1017577231592870_892739048_a.jpg\",\"full_name\":\"Birg\u00FCl \u00D6zlem\",\"id\":\"1608890788\"},{\"username\":\"izel_c\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xpf1/t51.2885-19/10617143_1515461835355616_725612089_a.jpg\",\"full_name\":\"\u0130zel\",\"id\":\"1360801906\"},{\"username\":\"ecekubilay\",\"bio\":\"Look like a girl, act like a lady, think like a man & work like a boss.\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10843834_1533783053546592_414503294_a.jpg\",\"full_name\":\"Ece Kubilay\",\"id\":\"43674287\"},{\"username\":\"handeikiz\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/1889340_360328537455720_1065451307_a.jpg\",\"full_name\":\"Hande \u0130kiz\",\"id\":\"643126568\"},{\"username\":\"tube_and_berger\",\"bio\":\"\",\"website\":\"http://www.tube-berger.com\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xpa1/t51.2885-19/10729415_385270204957176_1842472498_a.jpg\",\"full_name\":\"Tube & Berger\",\"id\":\"143914703\"},{\"username\":\"arzu_hstrk\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10890718_408334202662674_377251408_a.jpg\",\"full_name\":\"Arzu Hstrk\",\"id\":\"1482032107\"},{\"username\":\"akay_berkay\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10727668_1531539273724754_1921254321_a.jpg\",\"full_name\":\"Berkay Akay\",\"id\":\"1536422436\"},{\"username\":\"cagriyild\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xfp1/t51.2885-19/10693417_305350886317461_1157588259_a.jpg\",\"full_name\":\"\u00C7a\u011Fr\u0131 Y\u0131ld\u0131z\",\"id\":\"1515057479\"},{\"username\":\"gozdeesmeroglu\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_625641597_75sq_1398925760.jpg\",\"full_name\":\"G\u00F6zde\",\"id\":\"625641597\"},{\"username\":\"dilanbildikk\",\"bio\":\"Computer engineer\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/1799811_1407931362833896_286712905_a.jpg\",\"full_name\":\"Dilan Bildik\",\"id\":\"1516947309\"},{\"username\":\"entelmaganda_\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-e-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10817713_392728337551236_1909564091_a.jpg\",\"full_name\":\"Onur Dundar\",\"id\":\"1520403920\"},{\"username\":\"m_dilnora\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-b-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10903519_788662854551809_359635192_a.jpg\",\"full_name\":\"Dilnora Matniyazova\",\"id\":\"358078707\"},{\"username\":\"menwithclass\",\"bio\":\"MenWith - The fastest growing Instagram accounts about mens fashion.\\nAlso @MenWithStreetstyle\",\"website\":\"http://www.MenWith.co\",\"profile_picture\":\"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xpa1/t51.2885-19/927418_316914351839474_793557691_a.jpg\",\"full_name\":\"\",\"id\":\"208101486\"},{\"username\":\"mmnarsali\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10864965_398835106951157_1597574482_a.jpg\",\"full_name\":\"M\u00FCmin Arsal\u0131\",\"id\":\"1495046553\"},{\"username\":\"latifezeynepbilgic\",\"bio\":\"\u0130zmir.istanbul.milano - Yeditepe Mimarl\u0131k. Snapchat: latife-zeynep\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10838782_944214335590397_180638491_a.jpg\",\"full_name\":\"Latife Zeynep Bilgi\u00E7\",\"id\":\"1490660926\"},{\"username\":\"burcues\",\"bio\":\"welcome to my world \u2764\",\"website\":\"http://www.twitter.com/besmersoy\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_1811742_75sq_1368341007.jpg\",\"full_name\":\"burcu esmersoy\",\"id\":\"1811742\"},{\"username\":\"sedabakanerel\",\"bio\":\"CONTACT& ALL INFO : @semaerat\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_36285136_75sq_1397155487.jpg\",\"full_name\":\"Seda Bakan\",\"id\":\"36285136\"},{\"username\":\"denisozbirgul\",\"bio\":\"\u0130zmir\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-e-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10727736_374823726005420_1448104079_a.jpg\",\"full_name\":\"Denis\",\"id\":\"1187119154\"},{\"username\":\"ilkevarol\",\"bio\":\"izmir university\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xpf1/t51.2885-19/10611239_1487841648127557_1567054851_a.jpg\",\"full_name\":\"Ilke Varol\",\"id\":\"1466142349\"},{\"username\":\"tamer.bilgic\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-d-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10597461_481879111915747_1159058809_a.jpg\",\"full_name\":\"Tamer Bilgi\u00E7\",\"id\":\"1474149784\"},{\"username\":\"remour\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_47683391_75sq_1335430572.jpg\",\"full_name\":\"Berkay Akdal\",\"id\":\"47683391\"},{\"username\":\"irmates\",\"bio\":\"Will be a dentist\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10661068_612093945577983_1363517429_a.jpg\",\"full_name\":\"\u0130rem Ate\u015F\",\"id\":\"207094633\"},{\"username\":\"isikerhan\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xfp1/t51.2885-19/10554002_1442697989340527_240162674_a.jpg\",\"full_name\":\"I\u015F\u0131k\",\"id\":\"1431667276\"},{\"username\":\"dagtekinmelis\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xpa1/t51.2885-19/10005116_1465764153677312_1811525764_a.jpg\",\"full_name\":\"Melis Da\u011Ftekin\",\"id\":\"1431721389\"},{\"username\":\"bahtiyarerden\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xpa1/t51.2885-19/927125_389334791214413_1109020794_a.jpg\",\"full_name\":\"Bahtiyar Erden\",\"id\":\"1374288377\"},{\"username\":\"erkutguren\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_499411385_75sq_1379328696.jpg\",\"full_name\":\"Erkut G\u00FCren\",\"id\":\"499411385\"},{\"username\":\"tugceecal\",\"bio\":\"Ege University\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10584722_1455077458092967_1475618232_a.jpg\",\"full_name\":\"Tu\u011F\u00E7e\",\"id\":\"9052620\"},{\"username\":\"bihterikat\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_1137041139_75sq_1393693825.jpg\",\"full_name\":\"Bihter \u0130KAT\",\"id\":\"1137041139\"},{\"username\":\"eclkk\",\"bio\":\"METU Industrial Design\\nAnkara - \u0130zmir\u2661\u2665\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-d-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10932633_785409394830027_1946458033_a.jpg\",\"full_name\":\"Ece \u00C7elik\",\"id\":\"432197018\"},{\"username\":\"maddenmjelo\",\"bio\":\"Good man, honest man, a fun man, an adventurous man, a trusting man, and just a good ol' guy.\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_1112880951_75sq_1397781312.jpg\",\"full_name\":\"Matthew Madden\",\"id\":\"1112880951\"},{\"username\":\"tozhuseyin\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_467899247_75sq_1393008112.jpg\",\"full_name\":\"Huseyin\",\"id\":\"467899247\"},{\"username\":\"kocalper\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10903608_423888311093384_477849111_a.jpg\",\"full_name\":\"Alper Koc\",\"id\":\"300786756\"},{\"username\":\"esrasertsu\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_219462066_75sq_1392821846.jpg\",\"full_name\":\"\",\"id\":\"219462066\"},{\"username\":\"alexandrebergheau\",\"bio\":\"\",\"website\":\"https://www.facebook.com/AlexandreBergheauMusic\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10623819_1482484562024104_1153905341_a.jpg\",\"full_name\":\"Alexandre Bergheau\",\"id\":\"517445437\"}]}",
				fetchFriends);
	}

	@Test
	public void fetchFollowingsOfAUserWithSecondCursor() throws Exception {
		String fetchFollowings = fetcher.getJsonFromApi(
				EndpointLayer.getInstance().setUriForFetchingFollowings(
						"239984780")).toString();
		assertEquals(
				"{\"pagination\":{\"next_url\":\"https://api.instagram.com/v1/users/239984780/follows?access_token=239984780.fe09684.e9be582082be4858a9bdb170c9007774&cursor=1398087631922\",\"next_cursor\":\"1398087631922\"},\"meta\":{\"code\":200},\"data\":[{\"username\":\"sahara_ray\",\"bio\":\"ONE.1 management NY \\nsahara@kittenagency.com\\n@sahararayswim\",\"website\":\"http://www.sahararayswim.com\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10890693_1401134760183647_261151147_a.jpg\",\"full_name\":\"Sahara Ray\",\"id\":\"4154429\"},{\"username\":\"yavuzozturk\",\"bio\":\"\",\"website\":\"http://yavuzozturk.tumblr.com\",\"profile_picture\":\"https://igcdn-photos-g-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10809681_785204641541926_1283549945_a.jpg\",\"full_name\":\"yavuz ozturk\",\"id\":\"32515108\"},{\"username\":\"summervibing\",\"bio\":\"Australia. Things that inspire the wild at heart.\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10932498_2031817810292269_995097487_a.jpg\",\"full_name\":\"POSITIVE Vibes \u2728\uD83C\uDF1F\u2728\",\"id\":\"1481973879\"},{\"username\":\"michelle_lewin_\",\"bio\":\"BUSINESS ONLY: MichelleLewinManagement@gmail.com (not handled by me)\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10950500_585916678175183_1517908897_a.jpg\",\"full_name\":\"Michelle Lewin #lacuerpa1\u20E3\",\"id\":\"775740654\"},{\"username\":\"hkn_uysl\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/anonymousUser.jpg\",\"full_name\":\"Hakan Uysal\",\"id\":\"50041523\"},{\"username\":\"onur.ray\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-g-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10914410_886011121430158_403021121_a.jpg\",\"full_name\":\"Onur Erdem\",\"id\":\"1659553709\"},{\"username\":\"kenan967\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-d-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10809562_724392290984131_536732330_a.jpg\",\"full_name\":\"Kenan B\u0131\u00E7ak\u00E7\u0131o\u011Flu\",\"id\":\"632275702\"},{\"username\":\"svizvizviz\",\"bio\":\"However hard it may be,at the end of the day LIFE IS GOOD l'universit\u00E9 de marmara                    \u264E\uFE0F\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xpf1/t51.2885-19/10809911_735256346550351_1639600099_a.jpg\",\"full_name\":\"sseennaa\",\"id\":\"389855003\"},{\"username\":\"aysesensurer\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_208005126_75sq_1344945715.jpg\",\"full_name\":\"\",\"id\":\"208005126\"},{\"username\":\"jessleebuchanan\",\"bio\":\"Mermaid living in Cape Town\u2022 22\u2022 Co owner of SALTY online clothing and accessories store - coming soon\uD83C\uDF34\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10802784_911011448919677_33289114_a.jpg\",\"full_name\":\"Jessica Lee\",\"id\":\"226519304\"},{\"username\":\"aydindognn\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-b-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10895033_1537633016494945_877512172_a.jpg\",\"full_name\":\"\",\"id\":\"1580742726\"},{\"username\":\"dursundogan07\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10899318_431496023664061_1162675749_a.jpg\",\"full_name\":\"Dursun Do\u011Fan\",\"id\":\"1632010474\"},{\"username\":\"selin_nurlu\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10724644_1517310198485722_1132332314_a.jpg\",\"full_name\":\"Selin Nurlu\",\"id\":\"1531409185\"},{\"username\":\"yyigitaydiin\",\"bio\":\"Ege \u00DCniversitesi\\nShit happens dude shit happens.\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10860023_747154032005274_2024843908_a.jpg\",\"full_name\":\"yigit\",\"id\":\"1591095046\"},{\"username\":\"birgul.ozlem\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-g-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10852666_1017577231592870_892739048_a.jpg\",\"full_name\":\"Birg\u00FCl \u00D6zlem\",\"id\":\"1608890788\"},{\"username\":\"izel_c\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xpf1/t51.2885-19/10617143_1515461835355616_725612089_a.jpg\",\"full_name\":\"\u0130zel\",\"id\":\"1360801906\"},{\"username\":\"ecekubilay\",\"bio\":\"Look like a girl, act like a lady, think like a man & work like a boss.\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10843834_1533783053546592_414503294_a.jpg\",\"full_name\":\"Ece Kubilay\",\"id\":\"43674287\"},{\"username\":\"handeikiz\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10954748_831079560292488_1036649669_a.jpg\",\"full_name\":\"Hande \u0130kiz\",\"id\":\"643126568\"},{\"username\":\"tube_and_berger\",\"bio\":\"\",\"website\":\"http://www.tube-berger.com\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xpa1/t51.2885-19/10729415_385270204957176_1842472498_a.jpg\",\"full_name\":\"Tube & Berger\",\"id\":\"143914703\"},{\"username\":\"arzu_hstrk\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10890718_408334202662674_377251408_a.jpg\",\"full_name\":\"Arzu Hstrk\",\"id\":\"1482032107\"},{\"username\":\"akay_berkay\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-c-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10727668_1531539273724754_1921254321_a.jpg\",\"full_name\":\"Berkay Akay\",\"id\":\"1536422436\"},{\"username\":\"cagriyild\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xfp1/t51.2885-19/10693417_305350886317461_1157588259_a.jpg\",\"full_name\":\"\u00C7a\u011Fr\u0131 Y\u0131ld\u0131z\",\"id\":\"1515057479\"},{\"username\":\"gozdeesmeroglu\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_625641597_75sq_1398925760.jpg\",\"full_name\":\"G\u00F6zde\",\"id\":\"625641597\"},{\"username\":\"dilanbildikk\",\"bio\":\"Computer engineer\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/1799811_1407931362833896_286712905_a.jpg\",\"full_name\":\"Dilan Bildik\",\"id\":\"1516947309\"},{\"username\":\"entelmaganda_\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-e-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10817713_392728337551236_1909564091_a.jpg\",\"full_name\":\"Onur Dundar\",\"id\":\"1520403920\"},{\"username\":\"m_dilnora\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10952558_919049741462719_79762517_a.jpg\",\"full_name\":\"Dilnora Matniyazova\",\"id\":\"358078707\"},{\"username\":\"menwithclass\",\"bio\":\"MenWith - The fastest growing Instagram accounts about mens fashion.\\nAlso @MenWithStreetstyle\",\"website\":\"http://www.MenWith.co\",\"profile_picture\":\"https://igcdn-photos-g-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10843770_1618841305011094_308185276_a.jpg\",\"full_name\":\"\",\"id\":\"208101486\"},{\"username\":\"mmnarsali\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10864965_398835106951157_1597574482_a.jpg\",\"full_name\":\"M\u00FCmin Arsal\u0131\",\"id\":\"1495046553\"},{\"username\":\"latifezeynepbilgic\",\"bio\":\"\u0130zmir.istanbul.milano - Yeditepe Mimarl\u0131k. Snapchat: latife-zeynep\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10838782_944214335590397_180638491_a.jpg\",\"full_name\":\"Latife Zeynep Bilgi\u00E7\",\"id\":\"1490660926\"},{\"username\":\"burcues\",\"bio\":\"welcome to my world \u2764\",\"website\":\"http://www.twitter.com/besmersoy\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_1811742_75sq_1368341007.jpg\",\"full_name\":\"burcu esmersoy\",\"id\":\"1811742\"},{\"username\":\"sedabakanerel\",\"bio\":\"CONTACT& ALL INFO : @semaerat\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_36285136_75sq_1397155487.jpg\",\"full_name\":\"Seda Bakan\",\"id\":\"36285136\"},{\"username\":\"denisozbirgul\",\"bio\":\"\u0130zmir\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-e-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10727736_374823726005420_1448104079_a.jpg\",\"full_name\":\"Denis\",\"id\":\"1187119154\"},{\"username\":\"ilkevarol\",\"bio\":\"izmir university\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xpf1/t51.2885-19/10611239_1487841648127557_1567054851_a.jpg\",\"full_name\":\"Ilke Varol\",\"id\":\"1466142349\"},{\"username\":\"tamer.bilgic\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-d-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10597461_481879111915747_1159058809_a.jpg\",\"full_name\":\"Tamer Bilgi\u00E7\",\"id\":\"1474149784\"},{\"username\":\"remour\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_47683391_75sq_1335430572.jpg\",\"full_name\":\"Berkay Akdal\",\"id\":\"47683391\"},{\"username\":\"irmates\",\"bio\":\"Will be a dentist\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xap1/t51.2885-19/10661068_612093945577983_1363517429_a.jpg\",\"full_name\":\"\u0130rem Ate\u015F\",\"id\":\"207094633\"},{\"username\":\"isikerhan\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xfp1/t51.2885-19/10554002_1442697989340527_240162674_a.jpg\",\"full_name\":\"I\u015F\u0131k\",\"id\":\"1431667276\"},{\"username\":\"dagtekinmelis\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xpa1/t51.2885-19/10005116_1465764153677312_1811525764_a.jpg\",\"full_name\":\"Melis Da\u011Ftekin\",\"id\":\"1431721389\"},{\"username\":\"bahtiyarerden\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xpa1/t51.2885-19/927125_389334791214413_1109020794_a.jpg\",\"full_name\":\"Bahtiyar Erden\",\"id\":\"1374288377\"},{\"username\":\"erkutguren\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_499411385_75sq_1379328696.jpg\",\"full_name\":\"Erkut G\u00FCren\",\"id\":\"499411385\"},{\"username\":\"tugceecal\",\"bio\":\"Ege University\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-h-a.akamaihd.net/hphotos-ak-xfa1/t51.2885-19/10584722_1455077458092967_1475618232_a.jpg\",\"full_name\":\"Tu\u011F\u00E7e\",\"id\":\"9052620\"},{\"username\":\"bihterikat\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_1137041139_75sq_1393693825.jpg\",\"full_name\":\"Bihter \u0130KAT\",\"id\":\"1137041139\"},{\"username\":\"eclkk\",\"bio\":\"METU Industrial Design\\nAnkara - \u0130zmir\u2661\u2665\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-d-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10932633_785409394830027_1946458033_a.jpg\",\"full_name\":\"Ece \u00C7elik\",\"id\":\"432197018\"},{\"username\":\"maddenmjelo\",\"bio\":\"Good man, honest man, a fun man, an adventurous man, a trusting man, and just a good ol' guy.\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_1112880951_75sq_1397781312.jpg\",\"full_name\":\"Matthew Madden\",\"id\":\"1112880951\"},{\"username\":\"tozhuseyin\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://instagramimages-a.akamaihd.net/profiles/profile_467899247_75sq_1393008112.jpg\",\"full_name\":\"Huseyin\",\"id\":\"467899247\"},{\"username\":\"kocalper\",\"bio\":\"\",\"website\":\"\",\"profile_picture\":\"https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-19/10903608_423888311093384_477849111_a.jpg\",\"full_name\":\"Alper Koc\",\"id\":\"300786756\"}]}",
				fetchFollowings);
	}
}
