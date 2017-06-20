package sample

interface Vehicle{
	fun setWheels()
	
	//default method
	fun setMirrors(){
		println("two mirrors")
	}
}

class Car:Vehicle{
	override fun setWheels(){
		println("Four wheels")
	}
}

fun main(args: Array<String>){
	val car = Car()
	car.setMirrors()
	car.setWheels()
}