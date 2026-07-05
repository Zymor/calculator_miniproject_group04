package model;

public class Result_V2 {

  public String compute(String first, String second, String operator) {
    if (first == null || first.isEmpty() || second == null || second.isEmpty() || operator == null || operator.isEmpty()) {
      return "";
    }
    try {
      double a = Double.parseDouble(first);
      double b = Double.parseDouble(second);
      Result_V1 engine = new Result_V1();
      double rawResult = engine.calculate(a, b, operator);
      return formatResult(rawResult);
    } catch (NumberFormatException | ArithmeticException e) {
      return "ERROR";
    }
  }

  public String formatResult(double value) {
    if (value == (long) value) {
      return String.valueOf((long) value);
    }
    String text = String.valueOf(value);
    if (text.contains("E")) {
      return text;
    }
    if (text.indexOf('.') >= 0) {
      while (text.endsWith("0")) {
        text = text.substring(0, text.length() - 1);
      }
      if (text.endsWith(".")) {
        text = text.substring(0, text.length() - 1);
      }
    }
    return text;
  }

}
