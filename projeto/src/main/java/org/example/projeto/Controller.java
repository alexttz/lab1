import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button id_botao_acelerar;

    @FXML
    private Button id_botao_desligar;

    @FXML
    private Button id_botao_frear;

    @FXML
    private Button id_botao_ligar;

    @FXML
    private Button id_botao_registrar;

    @FXML
    private TextField id_campo_ano;

    @FXML
    private TextField id_campo_marca;

    @FXML
    private TextField id_campo_modelo;

    @FXML
    private TableColumn<?, ?> id_coluna_ano;

    @FXML
    private TableColumn<?, ?> id_coluna_marca;

    @FXML
    private TableColumn<?, ?> id_coluna_modelo;

    @FXML
    private TableView<?> id_tabela_carro;

}
