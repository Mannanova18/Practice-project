public class Triangle {

    //Конструктор класса треугольник с параметрами
    public Triangle(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    //Стороны треугольника
    public double A;

    public double B;

    public double C;

    //Метод который проверяет является ли данный объект треугольником
    public boolean isTriangle() {

        return (A + B > C && B + C > A && C + A > B && A > 0 && B > 0 && C > 0);
    }

}
