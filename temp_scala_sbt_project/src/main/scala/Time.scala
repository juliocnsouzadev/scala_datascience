
case class Time(hour: Int = Time.defaultHour, minute: Int = Time.defaultMinute) {

  override def toString: String = hour + ":" + minute;
}

case object Time {
  private val defaultHour: Int = 0;
  private val defaultMinute: Int = 0;
}
