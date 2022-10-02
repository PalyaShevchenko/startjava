public class Calculator {

    private int num1;
    private int num2;
    private long result;
    private String sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setSign(String sign) {
        this.sign =sign;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public long getResult() {
        //return result;
        switch (sign) {
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                result = num1 / num2;
                break;
            case "^" :
                result = num1;
                for (int i = 2; i <= num2; i++) {
                    result *= result;
                }
                break;
            case "%" :
                result = num1 % num2;
                break;
            default:
                System.out.println("неизвестный оператор");
        }
        return result;
    }
}