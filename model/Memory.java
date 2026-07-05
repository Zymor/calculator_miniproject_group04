package model;

public class Memory {

  static String first_variable;
  static String operator;
  static String second_variable;

  public void set_first_variable(String first_variable) {
    Memory.first_variable = first_variable;
  }

  public String get_first_variable() {
    return first_variable;
  }

  public void set_operator(String operator) {
    Memory.operator = operator;
  }

  public String get_operator() {
    return operator;
  }

  public void set_second_variable(String second_variable) {
    Memory.second_variable = second_variable;
  }

  public String get_second_variable() {
    return second_variable;
  }

}
