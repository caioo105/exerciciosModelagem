public enum Moeda {
    DOLAR(5.75),
    EURO(6.23),
    REAL(1.00);

    private double cotacao;

    Moeda(double cotacao){
        this.cotacao = cotacao;
    }

    public double converterPara(double valorEmReais){
        return valorEmReais / cotacao;
    }
}
