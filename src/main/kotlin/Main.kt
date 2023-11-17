import kotlin.collections.ArrayList
fun main() {
    val words: ArrayList<String> = ArrayList()
    println("Введите массив слов. Чтобы окончить ввод, введите пустую строку")
    while (true) {
        val enteredString = readln()
        if (enteredString == "") break
        words.add(enteredString)
    }
    val groupedWords = mutableMapOf<String, MutableList<String>>()
    for (word in words) {
        val key = word.toCharArray().sorted().joinToString(",")
        if (!groupedWords.containsKey(key)) {
            groupedWords[key] = mutableListOf()
        }
        groupedWords[key]?.add(word)
    }
    println("Слова, которые состоят из одинаковых букв:")
    for (group in groupedWords) {
        println(group)
    }
}

