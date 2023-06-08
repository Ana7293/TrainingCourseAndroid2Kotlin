fun main(args: Array<String>) {

    val firstName: String = "Анастасия"
    val lastName: String  = "Николаева"
    var height: Double = 1.23
    var weight: Float = 34F
    val isChild: Boolean = height < 150 && weight < 40

    var info = "$firstName $lastName, $height, $weight, $isChild"
    println(info)


}