class Pilha(capacidadeMaxima: Int) : Empilhavel {
    private val capacidade: Int
    private val dados: Array<Any?>
    private var topoIndice: Int

    init {
        require(capacidadeMaxima > 0) { "Capacidade máxima deve ser maior que zero." }
        capacidade = capacidadeMaxima
        dados = arrayOfNulls(capacidadeMaxima)
        topoIndice = -1 // Pilha vazia
    }

    override fun empilhar(dado: Any?) {
        require(!estaCheia()) { "A pilha está cheia." }
        topoIndice++
        dados[topoIndice] = dado
    }

    override fun desempilhar(): Any? {
        require(!estaVazia()) { "A pilha está vazia." }
        val topoDado = dados[topoIndice]
        dados[topoIndice] = null // Limpa a referência para ajudar na coleta de lixo
        topoIndice--
        return topoDado
    }

    override fun topo(): Any? {
        return if (!estaVazia()) {
            dados[topoIndice]
        } else {
            null
        }
    }

    override fun imprimir(): String {
        val builder = StringBuilder()
        builder.append("Pilha: [")
        for (i in 0..topoIndice) {
            builder.append(dados[i])
            if (i != topoIndice) {
                builder.append(", ")
            }
        }
        builder.append("]")
        return builder.toString()
    }

    override fun estaCheia(): Boolean {
        return topoIndice == capacidade - 1
    }

    override fun estaVazia(): Boolean {
        return topoIndice == -1
    }
}
