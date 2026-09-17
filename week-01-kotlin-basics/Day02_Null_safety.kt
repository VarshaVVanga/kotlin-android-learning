import kotlin.text.*

fun main() {
    println("Hello, world!!!")
    
    //null safety
    var middleName: String? = null //tells kotlin that this variable can be null
    middleName = "Vitthal" 
    println(middleName.length)
    
    middleName = null
   // println(middleName.length) //avoids nullPointerException by throwing error
    
    var surname: String? = null
    println(surname)
    
    //Safe call operator ?.

    var origName: String? = null
	  println(origName?.length) //outputs Null if string  is null
    origName = "Chaarvi Srikanth Gundeti"
    println(origName?.length) //otherwise the original length of the string
    
    //Elvis operator ?: 
    var defName: String? = null
	  var length = defName?.length ?: 0 // Sometimes you don't want null. You want a default value.
	  println(length)
    defName = "default"
    length = defName?.length ?: 0
    println(length)
    
    val elvis: String? = null 
    val displayName = elvis ?: "unknown"
    println(displayName)
    
    // !! Not null assertion operator : promising kotlin that variable is not null
    val believe: String? = null
    //println(believe!!.length) //throws NullPointerException
       
}
