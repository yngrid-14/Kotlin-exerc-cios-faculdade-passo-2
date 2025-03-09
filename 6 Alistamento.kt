fun main(){
    print("Insira seu ano de nascimento: ")
    val ano = readln().toInt()
    val idade = 2025 - ano
    if(idade < 18){
        print("Ainda faltam ${18 - idade} ano(s) para se alistar.")
    }
    else{
        print("Já se passaram ${idade - 18} ano(s) do seu alistamento")
    }
}