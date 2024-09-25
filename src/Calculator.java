/**
 * Калькулятор для выполнения операций.
 */
class Calculator {
    private ComplexOperation operation;

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }
    public void executeOperation(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = operation.operate(number1, number2);
        Logg.log("Результат: " + result.real() + " + " + result.imaginary() + "i");
    }

}
