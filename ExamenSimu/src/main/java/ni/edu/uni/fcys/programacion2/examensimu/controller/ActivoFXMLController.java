/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.examensimu.controller;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import ni.edu.uni.fcys.programacion2.examensimu.controller.pojo.Activo;

/**
 * FXML Controller class
 *
 * @author Sistemas-09
 */
public class ActivoFXMLController implements Initializable {
    
    ObservableList<String> items = FXCollections.observableArrayList("Edificio","Vehiculo","Maquinaria","Mobiliario","Equipo Oficina");
    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtSalvamento;
    @FXML
    public TextField txtActivo;
    @FXML
    public ComboBox<String> cbTActivo;
    @FXML
    public TableView<Activo> tblActivo;
    @FXML
    public Button btnCalcular;
    
    private ObservableList <Activo> Activo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       cbTActivo.setItems(items);
    }    

    @FXML
    public void btnCalcularAction(ActionEvent event) {
        String nombre = txtNombre.getText();
        String tActivo = cbTActivo.getValue().toString();
        Float vSalvametno = Float.parseFloat(txtSalvamento.getText());
       int vActivo = Integer.parseInt(txtActivo.getText());
    }
    
}
