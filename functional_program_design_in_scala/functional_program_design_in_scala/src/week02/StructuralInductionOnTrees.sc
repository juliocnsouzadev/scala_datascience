package week02

object StructuralInductionOnTrees {
  
  val x = 10                                      //> x  : Int = 10
  val y = 5                                       //> y  : Int = 5
  val s = Empty                                   //> s  : week02.Empty.type = week02.Empty$@6e8dacdf
  s contains x                                    //> res0: Boolean = false
  (s include x) contains x                        //> res1: Boolean = true
	(s include x) contains y                  //> res2: Boolean = false
	
	val l = Empty                             //> l  : week02.Empty.type = week02.Empty$@6e8dacdf
	val r = Empty                             //> r  : week02.Empty.type = week02.Empty$@6e8dacdf
	
	(NonEmpty(x, l, r)include x)contains x    //> res3: Boolean = true
	(NonEmpty(y, l, r )include x)contains x   //> res4: Boolean = true
	
	(Empty include y) contains x              //> res5: Boolean = false
	
	
	val xs = Empty                            //> xs  : week02.Empty.type = week02.Empty$@6e8dacdf
	val ys = Empty                            //> ys  : week02.Empty.type = week02.Empty$@6e8dacdf
	
	(xs union ys)contains x                   //> res6: Boolean = false
	xs contains x                             //> res7: Boolean = false
	ys contains x                             //> res8: Boolean = false
}