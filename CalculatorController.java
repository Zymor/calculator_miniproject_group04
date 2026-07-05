import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Clear_BS;
import model.Memory;
import model.Result_V2;
import model.User_Input;
import model.Validation;

public class CalculatorController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Label label_screen;

  Memory memory = new Memory();
  Validation validation = new Validation();
  User_Input user_input = new User_Input();
  Clear_BS clear_bs = new Clear_BS();
  boolean resetOnNextEntry = false;

  @FXML
  void on_back(ActionEvent event) {
    clear_bs.set_variable(user_input.get_variable());
    clear_bs.set_backspace();
    user_input.set_variable(clear_bs.get_variable());
    updateScreen();
  }

  @FXML
  void on_clear(ActionEvent event) {
    user_input.set_variable("");
    memory.set_first_variable("");
    memory.set_operator("");
    memory.set_second_variable("");
    resetOnNextEntry = false;
    updateScreen();
  }

  @FXML
  void on_divide(ActionEvent event) {
    setOperator("/");
  }

  @FXML
  void on_dot(ActionEvent event) {
    appendInput(user_input::set_dot);
  }

  @FXML
  void on_eight(ActionEvent event) {
    appendInput(user_input::set_eight);
  }

  @FXML
  void on_equal(ActionEvent event) {
    computeResult();
  }

  @FXML
  void on_five(ActionEvent event) {
    appendInput(user_input::set_five);
  }

  @FXML
  void on_four(ActionEvent event) {
    appendInput(user_input::set_four);
  }

  @FXML
  void on_minus(ActionEvent event) {
    setOperator("-");
  }

  @FXML
  void on_mulitply(ActionEvent event) {
    setOperator("*");
  }

  @FXML
  void on_nine(ActionEvent event) {
    appendInput(user_input::set_nine);
  }

  @FXML
  void on_one(ActionEvent event) {
    appendInput(user_input::set_one);
  }

  @FXML
  void on_plus(ActionEvent event) {
    setOperator("+");
  }

  @FXML
  void on_seven(ActionEvent event) {
    appendInput(user_input::set_seven);
  }

  @FXML
  void on_six(ActionEvent event) {
    appendInput(user_input::set_six);
  }

  @FXML
  void on_three(ActionEvent event) {
    appendInput(user_input::set_three);
  }

  @FXML
  void on_two(ActionEvent event) {
    appendInput(user_input::set_two);
  }

  @FXML
  void on_zero(ActionEvent event) {
    appendInput(user_input::set_zero);
  }

  @FXML
  void initialize() {
    updateScreen();
  }

  private void appendInput(Runnable action) {
    if (resetOnNextEntry) {
      user_input.set_variable("");
      resetOnNextEntry = false;
    }
    action.run();
    updateScreen();
  }

  private void setOperator(String operator) {
    String current = validation.format_variable(user_input.get_variable());
    if (current == null || current.isEmpty()) {
      return;
    }
    memory.set_first_variable(current);
    memory.set_operator(operator);
    user_input.set_variable("");
    updateScreen();
  }

  private void computeResult() {
    String first = memory.get_first_variable();
    String operator = memory.get_operator();
    String second = validation.format_variable(user_input.get_variable());
    if (first == null || first.isEmpty() || operator == null || operator.isEmpty() || second == null || second.isEmpty()) {
      return;
    }
    memory.set_second_variable(second);
    Result_V2 result = new Result_V2();
    String resultText = result.compute(first, second, operator);
    user_input.set_variable(resultText);
    updateScreen();
    memory.set_first_variable("");
    memory.set_operator("");
    memory.set_second_variable("");
    resetOnNextEntry = true;
  }

  private void updateScreen() {
    String value = user_input.get_variable();
    label_screen.setText(value == null || value.isEmpty() ? "0" : value);
  }

}
