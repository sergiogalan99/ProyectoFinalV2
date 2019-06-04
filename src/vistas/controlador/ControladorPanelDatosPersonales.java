package vistas.controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import modelo.vista.PersonaMV;
import vista.comunes.PanelDatosPersonales;

public class ControladorPanelDatosPersonales {

	public void rellenarDatos(PanelDatosPersonales panel, PersonaMV persona) {
		panel.txtID.setText(String.valueOf(persona.getID()));
		panel.txtNombre.setText(persona.getNombre());
		panel.txtaApellido.setText(persona.getApellidos());
		panel.txtDireccion.setText(persona.getDireccion());
		panel.textTelefono.setText(persona.getTelefono());
		panel.textNacimiento.setText(formateDateToString(persona.getFechaNacimiento()));
	}

	public PersonaMV obtenerDatos(PanelDatosPersonales panel) {
		PersonaMV modelo = new PersonaMV();
		modelo.setID(new Long(panel.txtID.getText()));
		modelo.setNombre(panel.txtNombre.getText());
		modelo.setApellidos(panel.txtaApellido.getText());
		modelo.setDireccion(panel.txtDireccion.getText());
		modelo.setTelefono(panel.textTelefono.getText());
		modelo.setFechaNacimiento(formateStringToDate(panel.textNacimiento.getText()));
		return modelo;
	}

	private Date formateStringToDate(String stringDate) {
		Date date = null;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = format.parse(stringDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;

	}

	private String formateDateToString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return format.format(date);

	}

}
