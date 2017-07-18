package sample

/**
 * Created by mukesh on 7/18/2017.
 */
fun main(args: Array<String>) {
    var people = listOf<Person>(Person("Mukesh"), Person("kumar"))
    //unmodifiable list can't add
    //people.add()
    people.forEach { person-> println(person.name) }

    people = mutableListOf(Person("Gupta"),Person("Mukesh"))
    people.add(Person("Kumar"))

    people.forEach({person->
        println(person.name)
    })

    val numbers = intArrayOf(1,2,3,4)
    numbers.forEachIndexed { index, number ->
        println("$index is : $number")
    }
}