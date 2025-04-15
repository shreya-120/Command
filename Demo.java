class Calculator
{
    int add(int n1, int n2){
        return n1+n2;
    }
    int sub(int n1, int n2){
        return n1-n2;
    }
    int mul(int n1, int n2){
        return n1*n2;
    }
    int div(int n1, int n2){
        return n1/n2;
    }
    int mod(int n1, int n2){
        return n1%n2;
    }
}
public class Demo{
    public static void main(String[] args){
        Calculator C = new Calculator();
        System.out.println("Addition: " + C.add(3,4));
        System.out.println("Substraction: " + C.sub(5,4));
        System.out.println("Multipication: " + C.mul(4,4));
        System.out.println("division: " + C.div(4,4));
        System.out.println("Modulus: " + C.mod(7,4));

    }
} 