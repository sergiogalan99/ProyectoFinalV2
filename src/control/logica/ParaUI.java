package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import facade.Facade;
import vista.comunes.PanelDatosPersonales;
import vista.comunes.PanelMensaje;
import vistaUI.UI;
import vistas.controlador.ControladorPanelDatosPersonales;

public class ParaUI extends UI {

	private Facade facade = new Facade();
	private ControladorPanelDatosPersonales controladorPanelDatosPersonales = new ControladorPanelDatosPersonales();
	
	
	public ParaUI() {
		
		altaPaciente.panelMensaje.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.guardarPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesAltaPaciente()));
			}
		});
		ActionComboPaciente actionComboPacienteConsulta=new ActionComboPaciente(getComboBoxIdConsultaPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesConsultaPaciente());
		getComboBoxIdConsultaPaciente().addFocusListener(actionComboPacienteConsulta);
		getComboBoxIdConsultaPaciente().addItemListener(actionComboPacienteConsulta);
		
		bajaPaciente.panelMensaje.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.darBajaPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesBajaPaciente()));
			}
		});
		ActionComboPaciente actionComboPacienteBaja=new ActionComboPaciente(getComboBoxIdBajaPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesBajaPaciente());
		getComboBoxIdBajaPaciente().addFocusListener(actionComboPacienteBaja);
		getComboBoxIdBajaPaciente().addItemListener(actionComboPacienteBaja);
		
		modificacionPaciente.panelMensaje.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.modificarPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesModificacionPaciente()));
			}
		});
		ActionComboPaciente actionComboPacienteModificacion=new ActionComboPaciente(getComboBoxIdModificacionPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesModificacionPaciente());
		getComboBoxIdModificacionPaciente().addFocusListener(actionComboPacienteModificacion);
		getComboBoxIdModificacionPaciente().addItemListener(actionComboPacienteModificacion);
	
		
	}

}
