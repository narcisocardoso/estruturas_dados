interface Empilhavel {
    //metodos/procedures
    fun empilhar(dados: Any?)
    fun desempilhar(): Any?
    fun topo(): Any?

    //metodos aux.
    fun imprimir(): String
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
}