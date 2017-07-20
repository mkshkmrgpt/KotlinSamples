package sample

/**
 * Created by mukesh on 7/20/2017.
 */
fun main(args: Array<String>) {
    val names = listOf<String>("mukesh", "kumar")
    println(names.itemAt(0))

    val name:Node<String> = Node("kumar")
    println(name.value())
}

fun <T>List<T>.itemAt(index : Int):T{
    return this[index]
}

class Node<T : String>(private val name:T){
    fun value():T{
        return name
    }
}