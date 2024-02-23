package review.ExerciceRoots;


import lombok.Data;

@Data
public class Roots {
    private double a, b, c;

    public Roots(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        double b2 = Math.pow(b,2);
        return b2 - (4*a*c);
    }
    public boolean haveRoot(){
        return getDiscriminant() == 0;
    }
    public boolean haveRoots(){
        return getDiscriminant() > 0;
    }
    public Solutions getRoot(){
        double root = -b/2*a;
        return new Solutions(root, 0, false);
    }
    public Solutions getRoots(){
        double discriminantRoot = Math.sqrt(getDiscriminant());
        double positiveDiscriminantRoot = ( -b + discriminantRoot )/2*a;
        double negativeDiscriminantRoot = ( -b - discriminantRoot )/2*a;
        return new Solutions(positiveDiscriminantRoot, negativeDiscriminantRoot, true);
    }
    public Solutions calculate() {
        if(haveRoot()) {
            return getRoot();
        } else if (haveRoots()) {
            return getRoots();
        }else {
           throw  new IllegalArgumentException("The equation has no real solution");
        }
    }

    //getDiscriminante(): devuelve el valor del discriminante (double),

    //tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra,
    //tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,

    //obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible
    //obtenerRaices(): imprime las 2 posibles soluciones

    // el discriminante tiene la siguiente formula, (b^2)-4*a*c
    // el discriminante debe ser mayor o igual que 0.
    // el discriminante debe ser igual que 0.

    //calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación,
    // en caso de no existir solución, mostrarlo también.

}
