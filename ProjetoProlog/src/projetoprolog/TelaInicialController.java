package projetoprolog;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author pc
 */
public class TelaInicialController implements Initializable {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnScoreX;
    @FXML
    private Button btnScoreY;
   
    @FXML
    private Label label;
       
    Partida jogo;
    ArrayList<Partida> partidas = new ArrayList<>();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        limparBtn();
        jogo = new Partida();
        jogo.setVez('X');
       
    }    

    void preencheBtn(Button btn){
        if(btn.getText().equals("")){
            if(jogo.getVez() == 'X'){
                btn.setText("X");
                verifica();
                jogo.setVez('O');
                label.setText("É a vez de O");
            }else{
                btn.setText("O");
                verifica();
                jogo.setVez('X');
                label.setText("É a vez de X");
            }
        }
    }
    
    void limparBtn(){
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }
    
    void verifica(){
        if((btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) && ("X".equals(btn1.getText()) || "O".equals(btn1.getText())))
                || (btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && ("X".equals(btn4.getText()) || "O".equals(btn4.getText())))
                || (btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) && ("X".equals(btn7.getText()) || "O".equals(btn7.getText())))
                || (btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText()) && ("X".equals(btn1.getText()) || "O".equals(btn1.getText())))
                || (btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()) && ("X".equals(btn2.getText()) || "O".equals(btn2.getText())))
                || (btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText()) && ("X".equals(btn3.getText()) || "O".equals(btn3.getText())))
                || (btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) && ("X".equals(btn1.getText()) || "O".equals(btn1.getText())))
                || (btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText())) && ("X".equals(btn3.getText()) || "O".equals(btn3.getText()))){
            
            if(jogo.getVez()=='X'){
                int pontos = jogo.getPontJog();
                pontos++;
                btnScoreX.setText("X               " + pontos);
                jogo.setPontJog(pontos);
                
                if(pontos == 10){
                    String mensagem = "X é o vencedor";
                    Alert alerta = new Alert(AlertType.INFORMATION, mensagem, ButtonType.YES, ButtonType.NEXT);
                    alerta.setHeaderText("Ganhou!");
                    alerta.setContentText(mensagem);
                    alerta.showAndWait();
                    jogo.setData(new Date().toString());
                    partidas.add(jogo);
                    jogo.setPontComp(0);
                    jogo.setPontJog(0);
                    limparBtn();
                }else{
                    String mensagem = "X " + jogo.getPontJog() + "x" + jogo.getPontComp() + " O";
                    Alert alerta = new Alert(AlertType.INFORMATION, mensagem, ButtonType.YES, ButtonType.NEXT);
                    alerta.setHeaderText("Resultado:");
                    alerta.setContentText(mensagem);
                    alerta.showAndWait();
                    limparBtn();
                }
            }else{
                int pontos = jogo.getPontComp();
                pontos++;
                btnScoreY.setText("O               " + pontos);
                jogo.setPontComp(pontos);
                
                if(pontos == 10){
                    String mensagem = "O é o vencedor";
                    Alert alerta = new Alert(AlertType.INFORMATION, mensagem, ButtonType.YES, ButtonType.NEXT);
                    alerta.setHeaderText("Ganhou!");
                    alerta.setContentText(mensagem);
                    alerta.showAndWait();
                    jogo.setData(new Date().toString());
                    partidas.add(jogo);
                    jogo.setPontComp(0);
                    jogo.setPontJog(0);
                    limparBtn();
                }else{
                    String mensagem = "X " + jogo.getPontJog() + "x" + jogo.getPontComp() + " O";
                    Alert alerta = new Alert(AlertType.INFORMATION, mensagem, ButtonType.YES, ButtonType.NEXT);
                    alerta.setHeaderText("Resultado:");
                    alerta.setContentText(mensagem);
                    alerta.showAndWait();
                    limparBtn();
                }
            }          
        }
        
         }
    
    @FXML
    private void Btn1OnClick(MouseEvent event) {
        preencheBtn(btn1);
    }

    @FXML
    private void Btn2OnClick(MouseEvent event) {
        preencheBtn(btn2);
    }

    @FXML
    private void Btn3OnClick(MouseEvent event) {
        preencheBtn(btn3);
    }

    @FXML
    private void Btn4OnClick(MouseEvent event) {
        preencheBtn(btn4);
    }

    @FXML
    private void Btn5OnClick(MouseEvent event) {
        preencheBtn(btn5);
    }

    @FXML
    private void Btn6OnClick(MouseEvent event) {
        preencheBtn(btn6);
    }

    @FXML
    private void Btn7OnClick(MouseEvent event) {
        preencheBtn(btn7);
    }

    @FXML
    private void Btn8OnClick(MouseEvent event) {
        preencheBtn(btn8);
    }

    @FXML
    private void Btn9OnClick(MouseEvent event) {
        preencheBtn(btn9);
    }

    @FXML
    private void OnActionReiniciarJogo(ActionEvent event) {
        
       limparBtn();
    }
}

