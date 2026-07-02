package model;

public class Clear_BS {

  String variable;

  public Clear_BS() {
    this.variable = "";
  }

  public Clear_BS(String variable) {
    this.variable = variable;
  }

  public void set_clear() {
    variable = "";
  }

  public void set_backspace() {
    if (variable.length() > 0) {
      variable = variable.substring(0, variable.length() - 1);
    }
  }

  public void set_variable(String variable) {
    this.variable = variable;
  }

  public String get_variable() {
    return variable;
  }

  public static void main(String[] args) {

    Clear_BS cb = new Clear_BS("12345.6789");
    System.out.println(cb.get_variable());

    cb.set_backspace();
    System.out.println(cb.get_variable());

    cb.set_backspace();
    System.out.println(cb.get_variable());

    cb.set_clear();
    System.out.println(cb.get_variable());

  }

}
