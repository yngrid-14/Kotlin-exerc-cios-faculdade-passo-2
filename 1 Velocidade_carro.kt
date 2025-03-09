fun main(){
    println("Qual a valocidade do carro? ")
    val valocidadadeveiculo = multa()
}
fun multa(){
    val velocidade = readln().toInt()
    if (velocidade > 80){
        val multa = ((velocidade - 80) * 5)
        println("você foi multado no valor de R$$multa por ultrapassar o limite")
    }
    else{
        println("Você esta no limite permitido")
    }
}