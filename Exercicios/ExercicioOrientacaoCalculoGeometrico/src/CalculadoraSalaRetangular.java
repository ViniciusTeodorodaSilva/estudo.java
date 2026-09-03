public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área dessa sala é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro dessa sala é: " + perimetro);
    }
}
