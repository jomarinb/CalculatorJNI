/**
 *
 * @author jomarin
 */
public class Arithmetics {
        static {
            System.load("/Users/jomarin/tesr/libarithmetics.so");
        }
        
        // Native methods
        public native double addValues(double addendOne, double addendTwo);
        public native double substractValues(double minuend, double subtrahend);
        public native double multiplyValues(double multiplier, double multiplicand);
        public native double divideValues(double dividend, double divisor);
        public native double complimentValue(double value);
        
        // Methods
        public double doOperation(double pX, double pY, String pOperation){
            double result;
            switch (pOperation) {
                case "+":
                    result = addValues(pX, pY);
                    break;
                case "-":
                    result = substractValues(pX, pY);
                    break;
                case "/":
                    result = divideValues(pX, pY);
                    break;
                case "*":
                    result = multiplyValues(pX, pY);
                    break;
                default:
                    result = 0;
                    break;
            } 
            return result;
        }
        
        public Arithmetics(){};
        
    
}
