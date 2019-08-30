object SpaceAge{
  def getAge(n: Double, age: Double): Double = math.round((age/n)*100)/100.0
  def onEarth(n: Double): Double = getAge(1.0, n/31557600.0)
  def onMercury(n: Double): Double = getAge(0.2408467, n/31557600.0)
  def onVenus(n: Double): Double = getAge(0.61519726, n/31557600.0)
  def onMars(n: Double): Double = getAge(1.8808158, n/31557600.0)
  def onJupiter(n: Double): Double = getAge(11.862615, n/31557600.0)
  def onSaturn(n: Double): Double = getAge(29.447498, n/31557600.0)
  def onUranus(n: Double): Double = getAge(84.016846, n/31557600.0)
  def onNeptune(n: Double): Double = getAge(164.79132, n/31557600.0)
}