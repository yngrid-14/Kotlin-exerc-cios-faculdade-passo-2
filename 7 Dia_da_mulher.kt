fun main(){
    desconto()
}

fun desconto(){
    print("Insira seu nome: ")
    val nome = readln()
    print("Insira seu sexo: ")
    val sexo = readln().uppercase()
    print("Valor total de compra: R$")
    val compra = readln().toFloat()
    val descontoM = compra - (0.05 * compra)
    val descontoF = compra - (1.3 * compra)

    if(sexo == "M"){
        print("O valor de sua compra com 5% de desconto será R$$descontoM,$nome")
    }
    if(sexo == "F"){
        print("O valor de sua compra com 5% de desconto será R$$descontoF,$nome")
    }
}