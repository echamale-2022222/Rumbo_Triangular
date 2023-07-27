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

public class LongitudACController implements Initializable {
    private Principal escenarioPrincipal;

    @FXML private TextField txtAngulo;
    @FXML private TextField txtABC;
    @FXML private Label lblRespuesta;
    @FXML private Button btnCalcular;
    @FXML private Button btnCalcularOtro;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        limpiarControles();
        lblRespuesta.setVisible(false);
    }

    public void calcular() {
        if (txtAngulo.getText().isEmpty() || txtABC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
            limpiarControles();
        } else {
            double angulo = Double.parseDouble(txtAngulo.getText().trim());
            double ABC = Integer.parseInt(txtABC.getText().trim());
            double res = angulo * 2;
            double resultado = ABC - res;
            lblRespuesta.setVisible(true);
            lblRespuesta.setText("La longitud del arco AC mide: " + resultado);
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
        txtAngulo.clear();
        txtABC.clear();
    }
    
    public void desactivarControles() {
        txtAngulo.setEditable(false);
        txtABC.setEditable(false);
    }
    
    public void activarControles() {
        txtAngulo.setEditable(true);
        txtABC.setEditable(true);
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
