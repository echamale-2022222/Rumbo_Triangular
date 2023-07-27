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

public class LadoBController implements Initializable {
    private Principal escenarioPrincipal;
    
    @FXML private Button btnCalcular;
    @FXML private Button btnCalcularOtro;
    @FXML private TextField txtC;
    @FXML private TextField txtA;
    @FXML private Label lblRespuesta;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    public void calcular(){
        if (txtC.getText().isEmpty() || txtA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
            limpiarControles();
        } else {
            double c = Double.parseDouble(txtC.getText().trim());
            double a = Double.parseDouble(txtA.getText().trim());
            if (c < a) {
                JOptionPane.showMessageDialog(null, "Lado 'c' no puede ser menor que lado 'b'");
                limpiarControles();
            } else {
                c = 0;
                a = 0;
                c = Double.parseDouble(txtC.getText().trim());
                a = Double.parseDouble(txtA.getText().trim());
                double resultado = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
                lblRespuesta.setVisible(true);
                lblRespuesta.setText("El valor de a es: " + resultado);
                desactivarControles();
                btnCalcular.setDisable(true);
            }
        }
    }
    
    
    public void calcularOtro() {
        btnCalcular.setDisable(false);
        lblRespuesta.setVisible(false);
        limpiarControles();
        activarControles();
    }
    
    public void limpiarControles() {
        txtC.clear();
        txtA.clear();
    }
    public void desactivarControles() {
        txtC.setEditable(false);
        txtA.setEditable(false);
    }
    public void activarControles() {
        txtC.setEditable(true);
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
