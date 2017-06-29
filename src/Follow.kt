/**
 * Created by Administrator on 2017/6/29 0029.
 */
fun main(args: Array<String>) {
    //val表示常量var表示变量声明
    val name: String = "tutu"
//省略类型说明
    var age = "23"
    //fun表示函数
    fun getName(): String{
        return "tutu"
    }
    //类继承
    class UserList<E>(): ArrayList<E>() {
        //...
    }
    println("kotlin")
}