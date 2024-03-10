fun main() {
    val capacidadeMaxima = 5
    val pilha = Pilha(capacidadeMaxima)

    println("A pilha está vazia: ${pilha.estaVazia()}") // Deve imprimir true

    // Empilhando alguns elementos
    pilha.empilhar(10)
    pilha.empilhar(20)
    pilha.empilhar(30)

    println(pilha.imprimir()) // Deve imprimir [10, 20, 30]

    println("O topo da pilha é: ${pilha.topo()}") // Deve imprimir 30

    println("Desempilhando elemento: ${pilha.desempilhar()}") // Deve imprimir 30
    println(pilha.imprimir()) // Deve imprimir [10, 20]

    println("A pilha está cheia: ${pilha.estaCheia()}") // Deve imprimir false

    // Testando desempilhar até esvaziar a pilha
    while (!pilha.estaVazia()) {
        println("Desempilhando elemento: ${pilha.desempilhar()}")
    }

    println("A pilha está vazia: ${pilha.estaVazia()}") // Deve imprimir true
}
