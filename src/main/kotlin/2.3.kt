fun main() {
    val alphabet = mapOf(
        21 to 'А', 13 to 'Б', 4 to 'В',
        20 to 'Г', 22 to 'Д', 1 to 'Е',
        25 to 'Ё', 12 to 'Ж', 24 to 'З',
        14 to 'И', 2 to 'Й', 28 to 'К',
        9 to 'Л', 23 to 'М', 3 to 'Н',
        29 to 'О', 6 to 'П', 16 to 'Р',
        15 to 'С', 11 to 'Т', 26 to 'У',
        5 to 'Ф', 30 to 'Х', 27 to 'Ц',
        8 to 'Ч', 18 to 'Ш', 10 to 'Щ',
        33 to 'Ь', 31 to 'Ы', 32 to 'Ъ',
        19 to 'Э', 7 to 'Ю', 17 to 'Я',
    )
    println("Введите ключевое слово")
    val keyword = readln().uppercase()
    val keywordChar = keyword.toCharArray()
    val numberKeyword = mutableListOf<Int>()
    for (i in 0..keywordChar.lastIndex) {
        for (j in 0 until alphabet.size) {
            if (keywordChar[i] == alphabet[j]) {
                numberKeyword.add(j)
                break
            }
        }
    }
    println("Зашийфровать напишите 1, Расшифровать напишите число 2")
    val choice = readln().toInt()
    when (choice) {
        1 -> {
            println("Введите текст")
            val text = readln().uppercase()
            val textChar = text.toCharArray()
            var newText = ""
            var i = 0
            var iKeyword = 0
            var numberChar: Int
            while (i < text.length) {
                for (j in 0 until alphabet.size) {
                    if (textChar[i] == alphabet[j]) {
                        numberChar = j + numberKeyword[iKeyword]
                        if (numberChar > 33) numberChar -= 33
                        newText += alphabet[numberChar].toString()
                    }
                }
                i++
                iKeyword++
                if (iKeyword >= numberKeyword.size) iKeyword = 0
            }
            println(newText)
        }

        2 -> {
            println("Введите текст")
            val text = readln().uppercase()
            val textChar = text.toCharArray()
            var newText = ""
            var i = 0
            var iKeyword = 0
            var numberChar: Int
            while (i < text.length) {
                for (j in 0 until alphabet.size) {
                    if (textChar[i] == alphabet[j]) {
                        numberChar = j - numberKeyword[iKeyword]
                        if (numberChar <= 0) numberChar += 33
                        newText += alphabet[numberChar].toString()
                    }
                }
                i++
                iKeyword++
                if (iKeyword >= numberKeyword.size) iKeyword = 0
            }
            println(newText)
        }

        else -> println("Вы ввели не то число")
    }
}
