package week01.json

abstract class JSON {

  override def toString(): String = {
    this match {

      case JSeq(elems) => "[" + (elems map {v => v.toString} mkString ", ") + "]"

      case JObj(bindings) =>
        val assocs = bindings map {
          case (key, value) => "\"" + key + "\": " + value toString
        }
        "{" + (assocs mkString ", ") + "}"

      case JNum(num) => num.toString

      case JStr(str) => "\"" + str + "\""

      case JBool(b)  => b.toString

      case JNull     => null

    }
  }

}