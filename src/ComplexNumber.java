
// Действие на числом.

public record ComplexNumber(double real, double imaginary) {

    //Cумма.
    public ComplexNumber theAmount(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real(), this.imaginary + other.imaginary());
    }

    //Вычитание.
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real(), this.imaginary - other.imaginary());
    }

    //Умножение.
    public ComplexNumber multiplication(ComplexNumber other) {
        double newReal = this.real * other.real() - this.imaginary * other.imaginary();
        double newImaginary = this.real * other.imaginary() + this.imaginary * other.real();
        return new ComplexNumber(newReal, newImaginary);
    }

    //Деление.
    public ComplexNumber division(ComplexNumber other) {
        double denominator = other.real() * other.real() + other.imaginary() * other.imaginary();
        double newReal = (this.real * other.real() + this.imaginary * other.imaginary()) / denominator;
        double newImaginary = (this.imaginary * other.real() - this.real * other.imaginary()) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
}