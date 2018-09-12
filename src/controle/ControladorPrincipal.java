package controle;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

//import com.jfoenix.controls.JFXTextArea;
import java.awt.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class ControladorPrincipal implements Initializable {
  @FXML
    private Label labelPrincipal;

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnClientes;

    @FXML
    private Button btnVendas;

    @FXML
    private Button btnOrcamentos;

    @FXML
    private Button btnMateriais;

    @FXML
    private Button btnRelatorios;

    @FXML
    private Button btnSair;

    @FXML
    private AnchorPane anchorPaneInicial;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button Apagar;

    @FXML
    void apagarAlteracoes(ActionEvent event) {

    }

    @FXML
    void gerenciaClientes(ActionEvent event) {

    }

    @FXML
    void gerenciarMateriais(ActionEvent event) {

    }

    @FXML
    void gerenciarOrcamentos(ActionEvent event) {

    }

    @FXML
    void gerenciarRelatórios(ActionEvent event) {

    }

    @FXML
    void gerenciarVendas(ActionEvent event) {

    }

    @FXML
    void inicio(ActionEvent event) {

    }

    @FXML
    void sair(ActionEvent event) {

    }

    @FXML
    void salvarAnotacao(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * FXML Controller class
     *
     * @author Aluno
     */
    public static class ControladorTelaLogin implements Initializable {

        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
            // TODO
        }
    }

}
