package datos;

public class Figura {
    
    private Float altura = 4f;
    private Float base = 3f;
    private Float resultado = 0f;
    
    public Figura() {
        super();
    }


    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getAltura() {
        return altura;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getBase() {
        return base;
    }

    public void setResultado(Float resultado) {
        this.resultado = resultado;
    }

    public Float getResultado() {
        return resultado;
    }

}
