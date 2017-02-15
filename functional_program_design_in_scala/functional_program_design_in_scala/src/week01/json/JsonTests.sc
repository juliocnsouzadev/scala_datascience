package week01.json

object JsonTests {

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
	)                                         //> data  : week01.json.JObj = {"firstName": "Julio", "lastName": "Souza", "addr
                                                  //| ess": {"streetAddress": "21 2nd Street", "state": "NY", "postalCode": 10021.
                                                  //| 0}, "phoneNumbers": [{"type": "home", "number": "212 55 1234"}, {"type": "mo
                                                  //| bile", "number": "555 55 1234"}]}
	
	
	
	println(data.toString)                    //> {"firstName": "Julio", "lastName": "Souza", "address": {"streetAddress": "21
                                                  //|  2nd Street", "state": "NY", "postalCode": 10021.0}, "phoneNumbers": [{"type
                                                  //| ": "home", "number": "212 55 1234"}, {"type": "mobile", "number": "555 55 12
                                                  //| 34"}]}

	val f: String => String ={case "ping" => "pong"}
                                                  //> f  : String => String = <function1>
	f("ping")                                 //> res0: String = pong
	//f("other") //gives an error
	
	val f2: PartialFunction[String, String] = {case "ping" => "pong"}
                                                  //> f2  : PartialFunction[String,String] = <function1>
	f2.isDefinedAt("ping")                    //> res1: Boolean = true
	f2.isDefinedAt("other")                   //> res2: Boolean = false

}