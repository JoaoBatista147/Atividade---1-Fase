package Produto;

class ProdutoNaoEncontradoException extends Exception {
    public ProdutoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
