package model;

public class validation {
    String format_variable(String variable){

        //condition 1
        int cout = 0;
        String new_variable = "";
        for (int i = 0; i < variable.length(); i++){
            if (variable.charAt(i) == '.'){
                cout++;
            }
            if(cout > 1){

            }
            return variable;
        }
    }
    boolean is_operator_valid(String operator){
        //condition 1
        if(operator.length() > 1){
            return false;
        }
        // 
        return true;
    }
   

    String format_operator(String operator){
        if (is_operator_valid(operator))
    }

    public static void main(String[] args) {
        validation v = new validation();

        String variable = "123.456.768";

        System.out.println(format_variable(variable));
    }
}
