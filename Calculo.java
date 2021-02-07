/**
 * 
 * @author Fredy Velasquez <macacoloco696gmail.com>
 */

public class Calculo implements calculadora{ //Se implementa la interface calculadora desarrollada por los estudiantes

    
    
    
    
    
    
    /**
    * Opera una suma con los parametros 'x' y 'y'
    * @params: 'x' y 'y' operandos
    * @return: Resultado de la suma.
    */

    @Override
    public int suma(int x, int y) {
        return x + y;
    }

    /**
    * Opera una resta con los parametros 'x' y 'y'
    * @params: 'x' y 'y' operandos
    * @return: Resultado de la resta.
    */
    
    @Override
    public int resta(int x, int y) {
        return x - y;
    }

    /**
    * Opera una multiplicacion con los parametros 'x' y 'y'
    * @params: 'x' y 'y' operandos
    * @return: Resultado de la suma.
    */
    @Override
    public int multiplicacion(int x, int y) {
        return x * y;
    }

    /**
    * Opera una division con los parametros 'x' y 'y'
    * @params: 'x' y 'y' operandos
    * @return: Resultado de la division.
    */
    @Override
    public int division(int x, int y) {
        return x / y;
    }

    @Override
    public int operar(Stack x) {
        return 0;
    }

    @Override
    public String decode(String a) {
        return null;
    }

}
