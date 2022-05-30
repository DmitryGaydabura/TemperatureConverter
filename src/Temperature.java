public class Temperature implements Converter {
    // A variable that stores the value of the temperature that the user wants to convert.
    public double originValue;
    public double convertedValue;
    // A variable that stores the type of the temperature that the user wants to convert.
    public String originType;
    public String convertedType;

    public Temperature(double originValue, String originType, String converedType) {
        this.originValue = originValue;
        this.originType = originType;
        this.convertedType = converedType;
    }

    @Override
    // Converting the temperature from one type to another.
    public void convert() {
        celciusConvert();
        fahrenheitConvert();
        kelvinConvert();
    }

    private void kelvinConvert() {
        if (originType.equalsIgnoreCase("K") && convertedType.equalsIgnoreCase("C")) {
            convertedValue = Logic.convertKToC(originValue);
            System.out.println(originValue + " " + originType + " is " + convertedValue + " " + convertedType);
        } else if (originType.equalsIgnoreCase("K") && convertedType.equalsIgnoreCase("F")) {
            convertedValue = Logic.convertKToF(originValue);
            System.out.println(originValue + " " + originType + " is " + convertedValue + " " + convertedType);
        } else if (originType.equalsIgnoreCase("K") && convertedType.equalsIgnoreCase("K")) {
            convertedValue = Logic.convertKToK(originValue);
            System.out.println(originValue + " " + originType + " is " + convertedValue + " " + convertedType);
        }
    }

    private void fahrenheitConvert() {
        if (originType.equalsIgnoreCase("F") && convertedType.equalsIgnoreCase("C")) {
            convertedValue = Logic.convertFToC(originValue);
            System.out.println(originValue + " " + originType + " is " + convertedValue + " " + convertedType);
        } else if (originType.equalsIgnoreCase("F") && convertedType.equalsIgnoreCase("K")) {
            convertedValue = Logic.convertFToK(originValue);
            System.out.println(originValue + " " + originType + " is " + convertedValue + " " + convertedType);
        } else if (originType.equalsIgnoreCase("F") && convertedType.equalsIgnoreCase("F")) {
            convertedValue = Logic.convertFToF(originValue);
            System.out.println(originValue + " " + originType + " is " + convertedValue + " " + convertedType);
        }
    }

    private void celciusConvert() {
        if (originType.equalsIgnoreCase("C") && convertedType.equalsIgnoreCase("F")) {
            convertedValue = Logic.convertCToF(originValue);
            System.out.println(originValue + " " + originType + " is " + convertedValue + " " + convertedType);
        } else if (originType.equalsIgnoreCase("C") && convertedType.equalsIgnoreCase("K")) {
            convertedValue = Logic.convertCToK(originValue);
            System.out.println(originValue + " " + originType + " is " + convertedValue + " " + convertedType);
        } else if (originType.equalsIgnoreCase("C") && convertedType.equalsIgnoreCase("C")) {
            convertedValue = Logic.convertCToC(originValue);
            System.out.println(originValue + " " + originType + " is " + convertedValue + " " + convertedType);
        }
    }
}
