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
	
}

