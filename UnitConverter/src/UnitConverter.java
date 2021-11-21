public class UnitConverter {
    // 필요한 상수 정의
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double POUNDS_PER_KILOGRAM = 2.20462262;
    public static final double CENTIMETERS_PER_INCH = 2.54;
    public static final double INCHES_PER_CENTIMETER = 0.393700;

    public static double toPounds(double kilograms) {
        return kilograms*POUNDS_PER_KILOGRAM;
    }
    public static double toKilograms(double pounds) {
        return pounds*KILOGRAMS_PER_POUND;
    }
    public static double toCentimeters(double inches) {
        return inches*CENTIMETERS_PER_INCH;
    }
    public static double toInches(double centimeters) {
        return centimeters*INCHES_PER_CENTIMETER;
    }
    public static double toFahrenheit(double celsius) {
        return celsius*9/5+32;
    }
    public static double toCelsius(double fahrenheit) {
        double x =fahrenheit-32;
        return x*5/9;
    }
}