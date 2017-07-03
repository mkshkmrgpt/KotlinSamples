package sample

fun main(args: Array<String>) {
	var meetings = listOf(Meeting(1, "Basics of Kotlin"), Meeting(2, "Advance kotlin"))

	val titles = meetings.filter { it -> it.title.startsWith("Basics") }.map { m -> m.title }
	for (title in titles)
		println(title)
}

class Meeting(val id: Int, val title: String) {

	var people = listOf(Person("Mukesh"), Person("Kumar"))
}

class Person(var name: String) {
}