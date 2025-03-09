fun main(){
    print("Insira um ano: ")
    val ano = readln().toInt()
    if(ano%4 == 0 && ano % 100 != 0){
        println("O ano é bissexto")
    }
    else{
        println("O ano não é bissexto")
    }
}