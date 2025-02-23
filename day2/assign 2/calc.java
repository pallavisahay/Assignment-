class calc{
  public static void main(String[] args) {

    double num1 = 10;
double num2= 2;
double result;
char op = '/';
  
      switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
            default:
                System.out.println("Invalid operator");
                break;
        }
  }
}