object Leap {
  def leapYear(year: Int): Boolean = {
    val isDivisibleby: (Int) => Boolean = year % _ == 0
    (isDivisibleby(4)&&(!isDivisibleby(100)||isDivisibleby(400)))
  }
}
