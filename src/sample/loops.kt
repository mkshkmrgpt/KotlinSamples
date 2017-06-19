package sample

fun main(args: Array<String>) {
	
	var num = 10
	while(num<15){
		print("$num ")
		num++
	}
	println()
	
	do{
	  print("$num ")
		num++
	}while(num<20)
	println()
	
	for (i in 1..10)
		print("$i ")
	println()
  
	for (i in 1..10 step 2)
	  print("$i ")
	println()
	
	for (i in 10 downTo 1 )
		print("$i ")
	println()
	
	//iterating over list
	var numbers = listOf(2,4,6,8)
	for(i in numbers){
		print("$i ")
	}
	println()
	
	for((index, element) in numbers.withIndex())
		println("$element at index $index")
	
	for(letter in 'a'..'z')
	  print("$letter ")
	println()
	
	//iterating over map
	var names = LinkedHashMap<String, String>()
	names["fName"] = "mukesh"
	names["mName"] = "kumar"
	names["lName"] = "gupta"
	
	for((name, value) in names){
		println("$name : $value")
	}
	
}

