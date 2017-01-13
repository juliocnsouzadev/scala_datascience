package week3

import week3.intsets._

object IntSetsTesting {
  val set1 = new NonEmpty(3,  Empty,  Empty)      //> set1  : week3.NonEmpty = {.3.}
  val set2 = set1 add 5                           //> set2  : week3.IntSet = {.3{.5.}}
}