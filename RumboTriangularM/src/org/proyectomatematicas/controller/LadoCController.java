package org.proyectomatematicas.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import org.proyectomatematicas.main.Principal;

public class LadoCController implements Initializable {
    private Principal escenarioPrincipal;
    
    @FXML private Button btnCalcular;
    @FXML private Button btnCalcularOtro;
    @FXML private TextField txtA;
    @FXML private TextField txtB;
    @FXML private Label lblRespuesta;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    public void calcular(){
        if (txtA.getText().isEmpty() || txtB.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
            limpiarControles();
        } else {
            double a = Double.parseDouble(txtA.getText().trim());
            double b = Double.parseDouble(txtB.getText().trim());
            double resultado = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            lblRespuesta.setVisible(true);
            lblRespuesta.setText("El valor de c es: " + resultado);
            desactivarControles();
            btnCalcular.setDisable(true);
        }
    }
    
    public void calcularOtro() {
        btnCalcular.setDisable(false);
        lblRespuesta.setVisible(false);
        limpiarControles();
        activarControles();
    }
    
    public void limpiarControles() {
        txtA.clear();
        txtB.clear();
    }
    public void desactivarControles() {
        txtA.setEditable(false);
        txtB.setEditable(false);
    }
    public void activarControles() {
        txtA.setEditable(true);
        txtB.setEditable(true);
    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    public void menuPrincipal() {
        escenarioPrincipal.menuPrincipal();
    }
}
