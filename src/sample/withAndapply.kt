package sample

import java.util.*;
class Song{
	
	var title : String =""
	var year : Date = Date();
	
	fun play(){
		println("playing song $title")
	}
}

fun main(args: Array<String>){

	var song = Song()
	with(song){
		title = "my first song"
		year = Date()
	}
	song.play()
	
	song.apply {
		title = "my second song"
		year = Date()
	}.play()
		
}