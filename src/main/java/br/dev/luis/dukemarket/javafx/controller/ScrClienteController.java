/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.dev.luis.dukemarket.javafx.controller;

import br.dev.luis.dukemarket.javafx.DAO.ProdutoDAO;
import br.dev.luis.dukemarket.javafx.model.Produto;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sesi2dib
 */
public class ScrClienteController implements Initializable {
    
    @FXML
    TableView<Produto> tblProduto;

    @FXML
    TableColumn<Produto, Integer> tcoId;

    @FXML
    TableColumn<Produto, String> tcoNome;

    @FXML
    TableColumn<Produto, String> tcoEndereco;

    @FXML
    TableColumn<Produto, String> tcoCpf;

    @FXML
    TableColumn<Produto, String> tcoCidade;

    @FXML
    TableColumn<Produto, String> tcoUf;

    @FXML
    TableColumn<Produto, Calendar> tcoDataCadastro;

    @FXML
    TextField txtId;

    @FXML
    TextField txtNome;

    @FXML
    TextField txtEndereco;

    @FXML
    TextField txtCpf;

    @FXML
    TextField txtCidade;

    @FXML
    TextField txtUf;

    @FXML
    DatePicker dtpDataCadastro;

    ProdutoDAO pDAO;
    Produto pClicked;

    boolean flagNovo = false;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
