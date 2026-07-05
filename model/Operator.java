package model;

public class Operator {

  public boolean isValid(String operator) {
    return operator != null && (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"));
  }

}
