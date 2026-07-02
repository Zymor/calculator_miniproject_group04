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
    // condition 1: operator length is greater than 1
    if (operator.length() > 1) {
      return false;
    }

    // condition 2: operator is one of the following: +, -, *, /
    if (operator != "+" && operator != "-" && operator != "*" && operator != "/") {
      return false;
    }

    return true;
  }

  String format_variable(String variable) {

    if (is_variable_valid(variable)) {
      return variable;
    }

    int cout = 0;
    String new_variable = "";
    for (int i = 0; i < variable.length(); i++) {
      if (variable.charAt(i) == '.') {
        cout++;
      }
      if (cout <= 1) {
        new_variable = new_variable + variable.charAt(i);
      }
    }

    return new_variable;
  }

  String format_operator(String operator) {

    if (is_operator_valid(operator)) {
      return operator;
    }

    return "";
  }

  public static void main(String[] args) {
    Validation v = new Validation();

    String variable = "123.4569999";

    System.out.println(v.format_variable(variable));

  }

}
