fun main() {
    println("Digite seu nome e suas notas: ")
    val media = med()
}
fun med(){
    val nome = readln()
    val nota1 = readln().toInt()
    val nota2 = readln().toInt()

    val med = (nota1+nota2)/2
    if(med >= 7){
        println("A média do aluno $nome é $med.Aprovado")
    }
    else{
        println("A média do aluno $nome é $med.Reprovado")
    }

}