package sample.lamda.kotlin

import sample.lamda.java.Created
import sample.lamda.java.User

/**
 * Created by mukesh on 7/12/2017.
 */
fun main(args: Array<String>){
    var user = User("Mukesh")

    var event = Created{println("User $it creeated")}
    user.create(event)

}