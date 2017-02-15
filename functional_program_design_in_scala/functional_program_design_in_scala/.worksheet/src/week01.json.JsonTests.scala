package week01.json

object JsonTests {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(553); 

	val data = JObj(
		Map(
			"firstName" -> JStr("Julio"),
			"lastName" -> JStr("Souza"),
			"address" -> JObj(
				Map(
					"streetAddress" -> JStr("21 2nd Street"),
					"state" -> JStr("NY"),
					"postalCode" -> JNum(10021)
				)
			),
			"phoneNumbers" -> JSeq(
				List(
					JObj(
						Map(
							"type" -> JStr("home"),
							"number" -> JStr("212 55 1234")
						)
					),
					JObj(
						Map(
							"type" -> JStr("mobile"),
							"number" -> JStr("555 55 1234")
						)
					)
				)
			)
		)
	);System.out.println("""data  : week01.json.JObj = """ + $show(data ));$skip(30); 
	
	
	
	println(data.toString);$skip(51); 

	val f: String => String ={case "ping" => "pong"};System.out.println("""f  : String => String = """ + $show(f ));$skip(11); val res$0 = 
	f("ping");System.out.println("""res0: String = """ + $show(res$0));$skip(100); 
	//f("other") //gives an error
	
	val f2: PartialFunction[String, String] = {case "ping" => "pong"};System.out.println("""f2  : PartialFunction[String,String] = """ + $show(f2 ));$skip(24); val res$1 = 
	f2.isDefinedAt("ping");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(25); val res$2 = 
	f2.isDefinedAt("other");System.out.println("""res2: Boolean = """ + $show(res$2))}

}
