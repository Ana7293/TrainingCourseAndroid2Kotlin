fun main(args: Array<String>) {
// ФУНКЦИИ
  /* val result: Int = multiplay(9, 6)
    println(result)
    fun multiplay (a: Int, b: Int) : Int {
     return a * b
    }
   - в одно строку можно так - fun multiplay (a: Int, b: Int) = a * b
    */

    val anna = 10000         //создадим функцию для расчета накоплений
    val nata = 20000
    val lena = 50000

    var sum =  bankCalculate(anna, 0.25, 6) +
            bankCalculate(nata, 0.5, 3) +
            bankCalculate(lena, 0.75, 2)

   println("Все вместе могут накопить: $sum")

}

fun bankCalculate (salary: Int, rate: Double, mounth: Int): Double {
    var result = salary * 0.87 * rate * mounth
    println("С зарплатой $salary за $mounth месяцев при откладывании $rate % накопится $result")
    return result


}
