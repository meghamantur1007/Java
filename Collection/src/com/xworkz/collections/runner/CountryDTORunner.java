package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;

import com.xworkz.collections.DTO.CountryDTO;
import com.xworkz.collections.constants.Code;
import com.xworkz.collections.constants.Continent;

public class CountryDTORunner {

	public static void main(String[] args) {

		Collection<CountryDTO> countries = new LinkedList<CountryDTO>();

		countries.add(new CountryDTO<String, Long>("Afghanistan", Code.AFGHANISTAN, 39835428L, "Mohammad Ashraf Ghani",
				Continent.ASIA));
		countries
				.add(new CountryDTO<String, Long>("Albania", Code.ALBANIA, 2877797L, "Bajram Begaj", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Algeria", Code.ALGERIA, 44700000L, "Abdelmadjid Tebboune",
				Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Andorra", Code.ANDORRA, 77543L, "Xavier Espot Zamora", Continent.EUROPE));
		countries
				.add(new CountryDTO<String, Long>("Angola", Code.ANGOLA, 35000000L, "João Lourenço", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Antigua and Barbuda", Code.ANTIGUA_AND_BARBUDA, 98947L,
				"Gaston Browne", Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Argentina", Code.ARGENTINA, 45376763L, "Alberto Fernández",
				Continent.SOUTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Armenia", Code.ARMENIA, 2963243L, "Vahagn Khachaturyan", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Australia", Code.AUSTRALIA, 25687041L, "Anthony Albanese",
				Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Austria", Code.AUSTRIA, 8917205L, "Alexander Van der Bellen",
				Continent.EUROPE));
		countries.add(
				new CountryDTO<String, Long>("Azerbaijan", Code.AZERBAIJAN, 10139177L, "Ilham Aliyev", Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Bahamas", Code.BAHAMAS, 393248L, "Philip Davis", Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Bahrain", Code.BAHRAIN, 1701575L, "Hamad bin Isa Al Khalifa",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Bangladesh", Code.BANGLADESH, 165158616L, "Mohammad Shahabuddin",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Barbados", Code.BARBADOS, 287371L, "Sandra Mason",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Belarus", Code.BELARUS, 9408400L, "Alexander Lukashenko",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Belgium", Code.BELGIUM, 11589623L, "Philippe of Belgium",
				Continent.EUROPE));
		countries.add(
				new CountryDTO<String, Long>("Belize", Code.BELIZE, 419199L, "John Briceño", Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Benin", Code.BENIN, 12721718L, "Patrice Talon", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Bhutan", Code.BHUTAN, 777486L, "Jigme Khesar Namgyel Wangchuck",
				Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Bolivia", Code.BOLIVIA, 11832084L, "Luis Arce", Continent.SOUTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Bosnia and Herzegovina", Code.BOSNIA_AND_HERZEGOVINA, 3280819L,
				"Denis Bećirović", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Botswana", Code.BOTSWANA, 2351627L, "Mokgweetsi Masisi",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Brazil", Code.BRAZIL, 214326223L, "Luiz Inácio Lula da Silva",
				Continent.SOUTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Brunei", Code.BRUNEI, 445431L, "Hassanal Bolkiah", Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Bulgaria", Code.BULGARIA, 6927288L, "Rumen Radev", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Burkina Faso", Code.BURKINA_FASO, 21929000L, "Ibrahim Traoré",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Burundi", Code.BURUNDI, 12592000L, "Évariste Ndayishimiye",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Cabo Verde", Code.CABO_VERDE, 555987L, "José Maria Neves",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Cambodia", Code.CAMBODIA, 17118000L, "Hun Sen", Continent.ASIA));
		countries
				.add(new CountryDTO<String, Long>("Cameroon", Code.CAMEROON, 27745000L, "Paul Biya", Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Canada", Code.CANADA, 38008005L, "Mary Simon", Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Central African Republic", Code.CENTRAL_AFRICAN_REPUBLIC, 4829767L,
				"Faustin-Archange Touadéra", Continent.AFRICA));
		countries
				.add(new CountryDTO<String, Long>("Chad", Code.CHAD, 17351672L, "Mahamat Déby Itno", Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Chile", Code.CHILE, 19116201L, "Gabriel Boric", Continent.SOUTHAMERICA));
		countries.add(new CountryDTO<String, Long>("China", Code.CHINA, 1411778724L, "Xi Jinping", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Colombia", Code.COLOMBIA, 51874000L, "Gustavo Petro",
				Continent.SOUTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Comoros", Code.COMOROS, 869595L, "Azali Assoumani", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Congo - Brazzaville", Code.CONGO_BRAZZAVILLE, 5615000L,
				"Denis Sassou Nguesso", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Congo - Kinshasa", Code.CONGO_KINSHASA, 92378000L,
				"Félix Tshisekedi", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Costa Rica", Code.COSTA_RICA, 5058007L, "Rodrigo Chaves Robles",
				Continent.NORTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Croatia", Code.CROATIA, 3885736L, "Zoran Milanović", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Cuba", Code.CUBA, 11209628L, "Miguel Díaz-Canel",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Cyprus", Code.CYPRUS, 1193200L, "Nikos Christodoulides",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Czech Republic", Code.CZECH_REPUBLIC, 10578820L, "Petr Pavel",
				Continent.EUROPE));
		countries.add(
				new CountryDTO<String, Long>("Denmark", Code.DENMARK, 5896000L, "Mette Frederiksen", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Djibouti", Code.DJIBOUTI, 1078373L, "Ismaïl Omar Guelleh",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Dominica", Code.DOMINICA, 71991L, "Roosevelt Skerrit",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Dominican Republic", Code.DOMINICAN_REPUBLIC, 10907400L,
				"Luis Abinader", Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Ecuador", Code.ECUADOR, 18258748L, "Daniel Noboa",
				Continent.SOUTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Egypt", Code.EGYPT, 109262178L, "Abdel Fattah el-Sisi",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("El Salvador", Code.EL_SALVADOR, 6520675L, "Nayib Bukele",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Equatorial Guinea", Code.EQUATORIAL_GUINEA, 1598700L,
				"Teodoro Obiang Nguema Mbasogo", Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Eritrea", Code.ERITREA, 3600000L, "Isaias Afwerki", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Estonia", Code.ESTONIA, 1331057L, "Alar Karis", Continent.EUROPE));
		countries
				.add(new CountryDTO<String, Long>("Eswatini", Code.ESWATINI, 1160164L, "Mswati III", Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Ethiopia", Code.ETHIOPIA, 126527060L, "Abiy Ahmed", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Fiji", Code.FIJI, 909024L, "Sitiveni Rabuka", Continent.AUSTRALIA));
		countries.add(
				new CountryDTO<String, Long>("Finland", Code.FINLAND, 5540718L, "Sauli Niinistö", Continent.EUROPE));
		countries.add(
				new CountryDTO<String, Long>("France", Code.FRANCE, 67564251L, "Emmanuel Macron", Continent.EUROPE));
		countries.add(
				new CountryDTO<String, Long>("Gabon", Code.GABON, 2267528L, "Brice Oligui Nguema", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Gambia", Code.GAMBIA, 2416668L, "Adama Barrow", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Georgia", Code.GEORGIA, 3982600L, "Salome Zourabichvili",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Germany", Code.GERMANY, 83900471L, "Frank-Walter Steinmeier",
				Continent.EUROPE));
		countries
				.add(new CountryDTO<String, Long>("Ghana", Code.GHANA, 32353000L, "Nana Akufo-Addo", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Greece", Code.GREECE, 10423054L, "Katerina Sakellaropoulou",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Grenada", Code.GRENADA, 113000L, "Dickon Mitchell",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Guatemala", Code.GUATEMALA, 19550000L, "Alejandro Giammattei",
				Continent.NORTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Guinea", Code.GUINEA, 13603777L, "Mamady Doumbouya", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Guinea-Bissau", Code.GUINEA_BISSAU, 2151253L,
				"Umaro Sissoco Embaló", Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Guyana", Code.GUYANA, 808726L, "Irfaan Ali", Continent.SOUTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Haiti", Code.HAITI, 11402533L, "Ariel Henry", Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Honduras", Code.HONDURAS, 10254656L, "Xiomara Castro",
				Continent.NORTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Hungary", Code.HUNGARY, 9660351L, "Katalin Novák", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Iceland", Code.ICELAND, 376248L, "Guðni Th. Jóhannesson",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("India", Code.INDIA, 1417173173L, "Droupadi Murmu", Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Indonesia", Code.INDONESIA, 273753191L, "Joko Widodo", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Iran", Code.IRAN, 85759000L, "Ebrahim Raisi", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Iraq", Code.IRAQ, 44615000L, "Abdul Latif Rashid", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Ireland", Code.IRELAND, 5231970L, "Michael D. Higgins",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Israel", Code.ISRAEL, 9580000L, "Isaac Herzog", Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Italy", Code.ITALY, 59729081L, "Sergio Mattarella", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Jamaica", Code.JAMAICA, 2726667L, "Patrick Allen",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Japan", Code.JAPAN, 124214766L, "Fumio Kishida", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Jordan", Code.JORDAN, 10319673L, "Abdullah II", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Kazakhstan", Code.KAZAKHSTAN, 19265325L, "Kassym-Jomart Tokayev",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Kenya", Code.KENYA, 54637651L, "William Ruto", Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Kiribati", Code.KIRIBATI, 122300L, "Taneti Maamau", Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Kuwait", Code.KUWAIT, 4649702L, "Nawaf Al-Ahmad Al-Jaber Al-Sabah",
				Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Kyrgyzstan", Code.KYRGYZSTAN, 6776000L, "Sadyr Japarov", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Laos", Code.LAOS, 7316000L, "Thongloun Sisoulith", Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Latvia", Code.LATVIA, 1850737L, "Edgars Rinkēvi�?s", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Lebanon", Code.LEBANON, 5615000L, "Vacant", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Lesotho", Code.LESOTHO, 2142249L, "Letsie III", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Liberia", Code.LIBERIA, 5376000L, "George Weah", Continent.AFRICA));
		countries
				.add(new CountryDTO<String, Long>("Libya", Code.LIBYA, 6944866L, "Mohamed al-Menfi", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Liechtenstein", Code.LIECHTENSTEIN, 38749L,
				"Alois, Hereditary Prince of Liechtenstein", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Lithuania", Code.LITHUANIA, 2722000L, "Gitanas Nausėda",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Luxembourg", Code.LUXEMBOURG, 634730L,
				"Henri, Grand Duke of Luxembourg", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Madagascar", Code.MADAGASCAR, 29808000L, "Andry Rajoelina",
				Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Malawi", Code.MALAWI, 20043000L, "Lazarus Chakwera", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Malaysia", Code.MALAYSIA, 33232000L, "Abdullah of Pahang",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Maldives", Code.MALDIVES, 515696L, "Ibrahim Mohamed Solih",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Mali", Code.MALI, 22777000L, "Assimi Goïta", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Malta", Code.MALTA, 514564L, "George Vella", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Marshall Islands", Code.MARSHALL_ISLANDS, 59300L, "David Kabua",
				Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Mauritania", Code.MAURITANIA, 4679500L, "Mohamed Ould Ghazouani",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Mauritius", Code.MAURITIUS, 1271368L, "Prithvirajsing Roopun",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Mexico", Code.MEXICO, 126577691L, "Andrés Manuel López Obrador",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Micronesia", Code.MICRONESIA, 115000L, "Wesley Simina",
				Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Moldova", Code.MOLDOVA, 2654000L, "Maia Sandu", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Monaco", Code.MONACO, 39242L, "Albert 11", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Mongolia", Code.MONGOLIA, 3391400L, "Ukhnaagiin Khürelsükh",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Montenegro", Code.MONTENEGRO, 616294L, "Jakov Milatović",
				Continent.EUROPE));
		countries
				.add(new CountryDTO<String, Long>("Morocco", Code.MOROCCO, 37500000L, "Mohammed VI", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Mozambique", Code.MOZAMBIQUE, 32482640L, "Filipe Nyusi",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Myanmar", Code.MYANMAR, 54770000L, "Myint Swe", Continent.ASIA));
		countries
				.add(new CountryDTO<String, Long>("Namibia", Code.NAMIBIA, 2563200L, "Hage Geingob", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Nauru", Code.NAURU, 10600L, "Russ Kun", Continent.AUSTRALIA));
		countries.add(
				new CountryDTO<String, Long>("Nepal", Code.NEPAL, 30223000L, "Ram Chandra Poudel", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Netherlands", Code.NETHERLANDS, 17459731L, "Willem-Alexander",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("New Zealand", Code.NEW_ZEALAND, 5133000L, "Cindy Kiro",
				Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Nicaragua", Code.NICARAGUA, 6978315L, "Daniel Ortega",
				Continent.NORTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Niger", Code.NIGER, 26040000L, "Abdourahamane Tiani", Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Nigeria", Code.NIGERIA, 223804632L, "Bola Tinubu", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("North Korea", Code.NORTH_KOREA, 26101384L, "Kim Jong-un",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("North Macedonia", Code.NORTH_MACEDONIA, 2077132L,
				"Stevo Pendarovski", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Norway", Code.NORWAY, 5456320L, "Harald V", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Oman", Code.OMAN, 4800000L, "Haitham bin Tariq", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Pakistan", Code.PAKISTAN, 241491960L, "Arif Alvi", Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Palau", Code.PALAU, 18092L, "Surangel Whipps Jr.", Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Panama", Code.PANAMA, 4314767L, "Laurentino Cortizo",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Papua New Guinea", Code.PAPUA_NEW_GUINEA, 9006347L, "Bob Dadae",
				Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Paraguay", Code.PARAGUAY, 7132530L, "Santiago Peña",
				Continent.SOUTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Peru", Code.PERU, 33933108L, "Dina Boluarte", Continent.SOUTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Philippines", Code.PHILIPPINES, 113900000L, "Ferdinand Marcos Jr.",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Poland", Code.POLAND, 37973352L, "Andrzej Duda", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Portugal", Code.PORTUGAL, 10295909L, "Marcelo Rebelo de Sousa",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Qatar", Code.QATAR, 2930526L, "Tamim bin Hamad Al Thani",
				Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Romania", Code.ROMANIA, 19098175L, "Klaus Iohannis", Continent.EUROPE));
		countries.add(
				new CountryDTO<String, Long>("Russia", Code.RUSSIA, 146440000L, "Vladimir Putin", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Rwanda", Code.RWANDA, 13963000L, "Paul Kagame", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Saint Kitts and Nevis", Code.SAINT_KITTS_AND_NEVIS, 53192L,
				"Terrance Drew", Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Saint Lucia", Code.SAINT_LUCIA, 185113L, "Philip J. Pierre",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Saint Vincent and the Grenadines",
				Code.SAINT_VINCENT_AND_THE_GRENADINES, 110696L, "Ralph Gonsalves", Continent.NORTHAMERICA));
		countries
				.add(new CountryDTO<String, Long>("Samoa", Code.SAMOA, 221000L, "Naomi Mata'afa", Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("San Marino", Code.SAN_MARINO, 33832L, "Alessandro Scarano",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Sao Tome and Principe", Code.SAO_TOME_AND_PRINCIPE, 223364L,
				"Carlos Vila Nova", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Saudi Arabia", Code.SAUDI_ARABIA, 35123400L,
				"Salman of Saudi Arabia", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Senegal", Code.SENEGAL, 17454800L, "Macky Sall", Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Serbia", Code.SERBIA, 6641000L, "Aleksandar Vu�?ić", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Seychelles", Code.SEYCHELLES, 107120L, "Wavel Ramkalawan",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Sierra Leone", Code.SIERRA_LEONE, 8600000L, "Julius Maada Bio",
				Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Singapore", Code.SINGAPORE, 5685807L, "Halimah Yacob", Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Slovakia", Code.SLOVAKIA, 5435690L, "Zuzana Čaputová", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Slovenia", Code.SLOVENIA, 2100126L, "Nataša Pirc Musar",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Solomon Islands", Code.SOLOMON_ISLANDS, 739000L,
				"Manasseh Sogavare", Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Somalia", Code.SOMALIA, 16900000L, "Hassan Sheikh Mohamud",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("South Africa", Code.SOUTH_AFRICA, 60302154L, "Cyril Ramaphosa",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("South Korea", Code.SOUTH_KOREA, 51780579L, "Yoon Suk-yeol",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("South Sudan", Code.SOUTH_SUDAN, 13790000L, "Salva Kiir Mayardit",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Spain", Code.SPAIN, 47332614L, "Felipe VI", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Sri Lanka", Code.SRI_LANKA, 22180000L, "Ranil Wickremesinghe",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Sudan", Code.SUDAN, 46104000L, "Abdel Fattah al-Burhan",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Suriname", Code.SURINAME, 632638L, "Chandrikapersad Santokhi",
				Continent.SOUTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Sweden", Code.SWEDEN, 10512720L, "Carl XVI Gustaf", Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Switzerland", Code.SWITZERLAND, 8761489L, "Alain Berset",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Syria", Code.SYRIA, 21334000L, "Bashar al-Assad", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Tajikistan", Code.TAJIKISTAN, 10182000L, "Emomali Rahmon",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Tanzania", Code.TANZANIA, 67139000L, "Samia Suluhu Hassan",
				Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Thailand", Code.THAILAND, 71136531L, "Maha Vajiralongkorn",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Timor-Leste", Code.TIMOR_LESTE, 1387149L, "José Ramos-Horta",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Togo", Code.TOGO, 8900000L, "Faure Gnassingbé", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Tonga", Code.TONGA, 100209L, "Tupou VI", Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Trinidad and Tobago", Code.TRINIDAD_AND_TOBAGO, 1399491L,
				"Paula-Mae Weekes", Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Tunisia", Code.TUNISIA, 12047000L, "Kais Saied", Continent.AFRICA));
		countries.add(
				new CountryDTO<String, Long>("Turkey", Code.TURKEY, 86530000L, "Recep Tayyip Erdoğan", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Turkmenistan", Code.TURKMENISTAN, 6212000L, "Serdar Berdimuhamedow",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Tuvalu", Code.TUVALU, 11200L, "Tofiga Vaevalu Falani",
				Continent.AUSTRALIA));
		countries.add(
				new CountryDTO<String, Long>("Uganda", Code.UGANDA, 48385000L, "Yoweri Museveni", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Ukraine", Code.UKRAINE, 39958000L, "Volodymyr Zelenskyy",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("United Arab Emirates", Code.UNITED_ARAB_EMIRATES, 9856000L,
				"Mohammed bin Zayed Al Nahyan", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("United Kingdom", Code.UNITED_KINGDOM, 67215293L, "Charles III",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("United States", Code.UNITED_STATES, 333287557L, "Joe Biden",
				Continent.NORTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Uruguay", Code.URUGUAY, 3494382L, "Luis Lacalle Pou",
				Continent.SOUTHAMERICA));
		countries.add(new CountryDTO<String, Long>("Uzbekistan", Code.UZBEKISTAN, 35628000L, "Shavkat Mirziyoyev",
				Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Vanuatu", Code.VANUATU, 319505L, "Nikenike Vurobaravu",
				Continent.AUSTRALIA));
		countries.add(new CountryDTO<String, Long>("Vatican City", Code.VATICAN_CITY, 825L, "Pope Francis",
				Continent.EUROPE));
		countries.add(new CountryDTO<String, Long>("Venezuela", Code.VENEZUELA, 33262000L, "Nicolás Maduro",
				Continent.SOUTHAMERICA));
		countries.add(
				new CountryDTO<String, Long>("Vietnam", Code.VIETNAM, 100450000L, "Võ Văn Thưởng", Continent.ASIA));
		countries.add(new CountryDTO<String, Long>("Yemen", Code.YEMEN, 33697000L, "Mahdi al-Mashat", Continent.ASIA));
		countries.add(
				new CountryDTO<String, Long>("Zambia", Code.ZAMBIA, 20534200L, "Hakainde Hichilema", Continent.AFRICA));
		countries.add(new CountryDTO<String, Long>("Zimbabwe", Code.ZIMBABWE, 16026000L, "Emmerson Mnangagwa",
				Continent.AFRICA));

		Iterator<CountryDTO> iterator = countries.iterator();

		for (CountryDTO<String, Long> country : countries) {
			if (country.getPopulation() > 250000000L) {
				System.out.println(country);
			}
		}

		System.out.println(
				"===============================================================================================");

		while (iterator.hasNext()) {
			CountryDTO ref = iterator.next();
			System.out.println(ref.getName() + ":" + ref.getPresidentName());
		}

		System.out.println(
				"===============================================================================================");

		Iterator<CountryDTO> iterator1 = countries.iterator();
		while (iterator1.hasNext()) {
			CountryDTO ref = iterator1.next();
			int code1 = ref.getCode().getCode();
			if (code1 < 50) {
				System.out.println(ref.getName());
			}
		}

		System.out.println(
				"===============================================================================================");

		for (CountryDTO<String, Long> country : countries) {
			if (country.getCode().getCode() < 50 && country.getName().startsWith("A")) {
				System.out.println(country.getName());
			}
		}

		for (CountryDTO<String, Long> country : countries) {
			if (country.getName().contains("i") || country.getName().contains("I")) {
				System.out.println(country.getName());
			}
		}

	}

}