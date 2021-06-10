package datos;

import javax.swing.JOptionPane;


public class Rectangulo extends Figura {


    private Calcular newAtt = null;

    public Rectangulo() {
        super();
    }

    
    public Float resultado(){
        
        Float a= this.getAltura();
        Float b= this.getBase();
        
        newAtt =  new Calcular(){


            @Override
            public Float calcular(Float a, Float b) {
                // TODO Implement this method
               // JOptionPane.showMessageDialog(null, "Hola " + a );
                return a * b;
            }

        };
        
        return newAtt.calcular(a, b) ;
    }
    
      
}
