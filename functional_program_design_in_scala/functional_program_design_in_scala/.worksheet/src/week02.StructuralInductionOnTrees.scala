package week02

object StructuralInductionOnTrees {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
  
  val x = 10;System.out.println("""x  : Int = """ + $show(x ));$skip(12); 
  val y = 5;System.out.println("""y  : Int = """ + $show(y ));$skip(16); 
  val s = Empty;System.out.println("""s  : week02.Empty.type = """ + $show(s ));$skip(15); val res$0 = 
  s contains x;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(27); val res$1 = 
  (s include x) contains x;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(26); val res$2 = 
	(s include x) contains y;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(17); 
	
	val l = Empty;System.out.println("""l  : week02.Empty.type = """ + $show(l ));$skip(15); 
	val r = Empty;System.out.println("""r  : week02.Empty.type = """ + $show(r ));$skip(42); val res$3 = 
	
	(NonEmpty(x, l, r)include x)contains x;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(41); val res$4 = 
	(NonEmpty(y, l, r )include x)contains x;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(32); val res$5 = 
	
	(Empty include y) contains x;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(20); 
	
	
	val xs = Empty;System.out.println("""xs  : week02.Empty.type = """ + $show(xs ));$skip(16); 
	val ys = Empty;System.out.println("""ys  : week02.Empty.type = """ + $show(ys ));$skip(27); val res$6 = 
	
	(xs union ys)contains x;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(15); val res$7 = 
	xs contains x;System.out.println("""res7: Boolean = """ + $show(res$7));$skip(15); val res$8 = 
	ys contains x;System.out.println("""res8: Boolean = """ + $show(res$8))}
}
