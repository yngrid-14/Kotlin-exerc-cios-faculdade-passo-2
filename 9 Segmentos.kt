fun main() {
    print("Digite o tamanho do primeiro segmento: ")
    val segmento1 = readln().toDouble()
    print("Digite o tamanho do segundo segmento: ")
    val segmento2 = readln().toDouble()
    print("Digite o tamanho do terceiro segmento: ")
    val segmento3 = readln().toDouble()

    if (segmento1 < segmento2 + segmento3 &&
        segmento2 < segmento1 + segmento3 &&
        segmento3 < segmento1 + segmento2) {
        println("Os segmentos podem formar um triângulo!")
    } else {
        println("Os segmentos NÃO podem formar um triângulo.")
    }
}