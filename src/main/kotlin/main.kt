import java.lang.StringBuilder

fun main() {
    println(removeVowels("Bradouyai Akpos Innocent"))
}

fun removeVowels(k: String): String {

    val re =  StringBuilder()
    for ( x in k) {

        if (x != 'A' && x != 'a'
            && x != 'E' && x != 'e'
            && x != 'I' && x != 'i'
            && x != 'O' && x != 'o'
            && x != 'U' && x != 'u')
        {

            re.append(x)
        }
    }
    return re.toString()

}


