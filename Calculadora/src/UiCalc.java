import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class UiCalc {
//////////////////////////////// OPERADORES GLOBAIS
    Double Valor1, Valor2;
    String sinal;

//////////////////////////////// NUMEROS
    @FXML
    private Button botao0;
    int N0botao0 = 0;

    @FXML
    private Button botao1;
    int N1botao1 = 1;

    @FXML
    private Button botao2;
    int N2botao2 = 2;

    @FXML
    private Button botao3;
    int N3botao3 = 3;

    @FXML
    private Button botao4;
    int N4botao4 = 4;

    @FXML
    private Button botao5;
    int N5botao5 = 5;

    @FXML
    private Button botao6;
    int N6botao6 = 6;

    @FXML
    private Button botao7;
    int N7botao7 = 7;

    @FXML
    private Button botao8;
    int N8botao8 = 8;

    @FXML
    private Button botao9;
    int N9botao9 = 9;

    @FXML
    private Button botaoPonto;
    String Ponto = ".";

    @FXML
    private Button botaoVirgula;
    String Virgula = ",";

    @FXML
    private TextArea tela;

//////////////////////////////// NUMEROS APARECENDO NA TELA
    @FXML
    void digitar0(ActionEvent event) {
        tela.setText(tela.getText() + N0botao0);
    }

    @FXML
    void digitar1(ActionEvent event) {
        tela.setText(tela.getText() + N1botao1);
    }

    @FXML
    void digitar2(ActionEvent event) {
        tela.setText(tela.getText() + N2botao2);
    }

    @FXML
    void digitar3(ActionEvent event) {
        tela.setText(tela.getText() + N3botao3);
    }

    @FXML
    void digitar4(ActionEvent event) {
        tela.setText(tela.getText() + N4botao4);
    }

    @FXML
    void digitar5(ActionEvent event) {
        tela.setText(tela.getText() + N5botao5);
    }

    @FXML
    void digitar6(ActionEvent event) {
        tela.setText(tela.getText() + N6botao6);
    }

    @FXML
    void digitar7(ActionEvent event) {
        tela.setText(tela.getText() + N7botao7);
    }

    @FXML
    void digitar8(ActionEvent event) {
        tela.setText(tela.getText() + N8botao8);
    }

    @FXML
    void digitar9(ActionEvent event) {
        tela.setText(tela.getText() + N9botao9);
    }

    @FXML
    void digitarPonto(ActionEvent event) {
        tela.setText(tela.getText() + Ponto);
    }

    @FXML
    void digitarVirgula(ActionEvent event) {
        tela.setText(tela.getText() + Virgula);
    }
//////////////////////////////// FUNÇOES DOS SINAIS

    @FXML
    void apagar(ActionEvent event) {
        Valor1 = null;
        Valor2 = null;
        tela.setText("");
    }

    @FXML
    void Porcentagem(ActionEvent event) {
        Valor1 = Double.parseDouble(tela.getText());
        tela.setText("");
        sinal = "Porcen";
    }

    @FXML
    void divisor(ActionEvent event) {
        Valor1 = Double.parseDouble(tela.getText());
        tela.setText("");
        sinal = "Divi";
    }

    @FXML
    void multiplicador(ActionEvent event) {
        Valor1 = Double.parseDouble(tela.getText());
        tela.setText("");
        sinal = "Mult";
    }

    @FXML
    void somar(ActionEvent event) {
        Valor1 = Double.parseDouble(tela.getText());
        tela.setText("");
        sinal = "Soma";
    }

    @FXML
    void subitrair(ActionEvent event) {
        Valor1 = Double.parseDouble(tela.getText());
        tela.setText("");
        sinal = "Subi";
    }

    @FXML
    void limpar(ActionEvent event) {
        tela.setText("");
    }
//////////////////////////////// IGUAL

    @FXML
    void igual(ActionEvent event) {
        Valor2 = Double.parseDouble(tela.getText());
        if (sinal == "Subi"){
            tela.setText(String.valueOf(Valor1 - Valor2));
        }

        if (sinal == "Soma"){
            tela.setText(String.valueOf(Valor1 + Valor2));
        }

        if (sinal == "Mult"){
            tela.setText(String.valueOf(Valor1 * Valor2));
        }

        if (sinal == "Divi"){
            tela.setText(String.valueOf(Valor1 / Valor2));
        }

        if (sinal == "Porcen"){
            tela.setText(String.valueOf(Valor1 % Valor2));
        }
    }
}



//     //   ) )
//    //___/ /      ___           ( )      ___       //     ( )      _   __
//    / ___ (      //   ) )       / /     //   ) )   //     / /     // ) )  ) )
//   //   | |     //   / /       / /     //   / /   //     / /     // / /  / /
//  //    | |    ((___( (   ((  / /     ((___/ /   //     / /     // / /  / /