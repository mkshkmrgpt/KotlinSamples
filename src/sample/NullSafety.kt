package sample

/**
 * Created by mukesh on 7/12/2017.
 */
fun main(args: Array<String>) {

    var msg:Message = Message("I'm null safe")
    showMessage(msg)

    //passing null results in compile time error
    //showMessage(null)
}

fun showMessage(message: Message) {
    println(message.message)
}

data class Message(var message: String) {
}