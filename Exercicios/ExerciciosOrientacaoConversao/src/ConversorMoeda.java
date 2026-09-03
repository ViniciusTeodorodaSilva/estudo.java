public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.14;
        double valorReal = cotacaoDolar * valorDolar;
        System.out.println("O valor em reais é: "+ valorReal);
    }
}
