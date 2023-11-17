fun main() {
    println("Введите количество строк")
    val rows = readln().toInt() - 1
    println("Введите количество столбцов")
    val cols = readln().toInt() - 1
    println("Введите массив")
    var arr = arrayOf<Array<String>>()
    for (i in 0..rows) {
        var array = arrayOf<String>()
        for (j in 0..cols) {
            array += readln()
        }
        arr += array
    }

    val countNumber = mutableSetOf<Char>()

    for (i in 0..rows) {
        for (j in 0..cols) {
            val number = arr[i][j].toCharArray()
            for (l in 0..number.size - 1)
                countNumber.add(number[l])
        }
    }
    println("Ваш массив")
    for (i in 0..rows) {
        for (j in 0..cols) {
            print(arr[i][j] + " ")
        }
        println("\n")
    }
    val numberCount = countNumber.size
    println("\n В массиве использовано $numberCount различных цифр")
}