package datos;


public class Triangulo extends Figura  {


    private Calcular newAtt = new Calcular() {

        @Override
        public Float calcular(Float a, Float b) {
            // TODO Implement this method
            return (a * b) /2;
        }
    };

    public Triangulo() {
        super();
    }
    
    public Float resultado(){
        
        Float a=this.getAltura();
        Float b=this.getBase();
        Float r = newAtt.calcular(a, b);
        
        return r;
    }
    
   
    
}
