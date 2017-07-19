package sample

/**
 * Created by mukesh on 7/19/2017.
 */
var action = { println("Hello World") }

fun main(args: Array<String>) {
    doAction(action)
}

fun doAction(func:() -> Unit) {
    func()
}