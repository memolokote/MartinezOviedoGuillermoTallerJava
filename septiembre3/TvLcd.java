package septiembre3;

public class TvLcd extends Electronico {
    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() { return pulgadas; }

    @Override
    public double getPrecioVenta() {
        return precio * 1.20; // ejemplo: margen del 20%
    }
}

