fun main(){
    print("Quanto deseja percorrer em KM: ")
    val perc = readln().toFloat()
    if(perc > 200){
      val preco = 0.45 * perc
        print("O valor do percurso será de R$${"%.2f".format(preco)}")
    }
    else{
        val preco = 0.50 * perc
        print("O valor do percurso será de R$${"%.2f".format(preco)}")
    }
}