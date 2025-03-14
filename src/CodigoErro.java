public enum CodigoErro {
    HTTP(404, "Resposta genérica para quando um recurso não é encontrado."),
    NOT_FOUND(404, " O recurso solicitado não existe no servidor."),
    BAD_REQUEST(400, "A solicitação do cliente contém erro ou está malformada."),
    INTERNAL_SERVER_ERROR(500, "Ocorreu um erro inesperado no servidor.");

    private int codigo;

    private String descricao;

    CodigoErro(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }
}
