public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void MostrarTabuada(int numero) {
        for (int i = 0; i < 11; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }
    }
}
