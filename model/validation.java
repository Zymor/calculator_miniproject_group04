package model;

public class Validation {

  boolean is_variable_valid(String variable) {

    // condition 1: two dots in the variable
    // 123.456.789 -> 123.456
    int count = 0;
    for (int i = 0; i < variable.length(); i++) {
      if (variable.charAt(i) == '.') {
        count++;
      }
    }
    if (count > 1) {
      System.out.println("Invalid variable");
      return false;
    }

    // condition 2: variable leads by zero without dot
    // 001
    // 01
    // 0.1 OK

    System.out.println("Valid variable");
    return true;
  }

  boolean is_operator_valid(String operator) {
    if (operator == null) {
      return false;
    }

    // condition 1: operator length is greater than 1
    if (operator.length() > 1) {
      return false;
    }

    // condition 2: operator is one of the following: +, -, *, /
    if (!"+".equals(operator) && !"-".equals(operator) && !"*".equals(operator) && !"/".equals(operator)) {
      return false;
    }

    return true;
  }

  public String format_variable(String variable) {
    if (variable == null || variable.isEmpty()) {
      return "";
    }

    if (is_variable_valid(variable)) {
      return variable;
    }

    int count = 0;
    StringBuilder cleaned = new StringBuilder();
    for (int i = 0; i < variable.length(); i++) {
      char ch = variable.charAt(i);
      if (ch == '.') {
        count++;
      }
      if (count <= 1) {
        cleaned.append(ch);
      }
    }

    return cleaned.toString();
  }
}
