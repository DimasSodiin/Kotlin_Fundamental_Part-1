fun main(){
    val user = setUser (  name =  "Dimas", hobby= "Main Game", age= 16 )
    println(user)
}
fun setUser(name:String, hobby: String, age: Int) = "Hai! Namaku $name, hobiku $hobby dan sekarang umurku $age"