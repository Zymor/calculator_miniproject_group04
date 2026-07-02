import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Clear_BS;
import model.Memory;
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

  @FXML
  void on_back(ActionEvent event) {
    clear_bs.set_variable(user_input.get_variable());
    clear_bs.set_backspace();
    user_input.set_variable(clear_bs.get_variable());
    label_screen.setText(clear_bs.get_variable());
  }

  @FXML
  void on_clear(ActionEvent event) {
    clear_bs.set_variable(user_input.get_variable());
    clear_bs.set_clear();
    user_input.set_variable(clear_bs.get_variable());
    label_screen.setText(clear_bs.get_variable());
  }

  @FXML
  void on_divide(ActionEvent event) {

  }

  @FXML
  void on_dot(ActionEvent event) {
    user_input.set_dot();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_eight(ActionEvent event) {
    user_input.set_eight();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_equal(ActionEvent event) {

  }

  @FXML
  void on_five(ActionEvent event) {
    user_input.set_five();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_four(ActionEvent event) {
    user_input.set_four();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_minus(ActionEvent event) {

  }

  @FXML
  void on_mulitply(ActionEvent event) {

  }

  @FXML
  void on_nine(ActionEvent event) {
    user_input.set_nine();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_one(ActionEvent event) {
    user_input.set_one();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_plus(ActionEvent event) {

  }

  @FXML
  void on_seven(ActionEvent event) {
    user_input.set_seven();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_six(ActionEvent event) {
    user_input.set_six();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_three(ActionEvent event) {
    user_input.set_three();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_two(ActionEvent event) {
    user_input.set_two();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void on_zero(ActionEvent event) {
    user_input.set_zero();
    label_screen.setText(user_input.get_variable());
  }

  @FXML
  void initialize() {

  }

}
