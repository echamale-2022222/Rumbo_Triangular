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

public class LeyCosenoController implements Initializable {
    private Principal escenarioPrincipal;

    @FXML private TextField txtX;
    @FXML private TextField txtY;
    @FXML private Label lblRespuesta;
    @FXML private Button btnCalcular;
    @FXML private Button btnCalcularOtro;
    @FXML private TextField txtA;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    limpiarControles();
    }
    
    public void calcular(){
        if (txtX.getText().isEmpty() || txtY.getText().isEmpty() || txtA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
            limpiarControles();
        } else {
            double x = Double.parseDouble(txtX.getText().trim());
            double y = Double.parseDouble(txtY.getText().trim());
            double a = Double.parseDouble(txtA.getText().trim());
            double alfa = Math.toRadians(a);
            double resultado = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) - 2*x*y * Math.cos(alfa));
            lblRespuesta.setVisible(true);
            lblRespuesta.setText("El valor de z es: " + resultado);
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
        txtX.clear();
        txtY.clear();
        txtA.clear();
    }
    public void desactivarControles() {
        txtX.setEditable(false);
        txtY.setEditable(false);
        txtA.setEditable(false);
    }
    public void activarControles() {
        txtX.setEditable(true);
        txtY.setEditable(true);
        txtA.setEditable(true);
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
