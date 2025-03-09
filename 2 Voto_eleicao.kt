fun main(){
    println("Qual seu ano de nascimento? ")
    val ano = readln().toInt()
    val idade = 2025 - ano

    if(idade >= 16){
        println("Você pode votar")
    }
    else {
        println("Você não poderá votar")
    }
}
