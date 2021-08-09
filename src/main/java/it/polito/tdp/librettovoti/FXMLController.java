package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Libretto model;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtNomeEsame;

	@FXML
	private TextField txtVoto;

	@FXML
	private TextField txtData;

	@FXML
	private TextArea txtResult;

	@FXML
	void DoBtn(ActionEvent event) {
		String nomeEsame = txtNomeEsame.getText();
		int votoEsame = Integer.parseInt(txtVoto.getText());
		String data = txtData.getText();
		LocalDate date = LocalDate.parse(data);
		voto v = new voto(nomeEsame, votoEsame,date);
		
		model.add(v);
		
		txtResult.setText(model.toString());
		

	}

	public void setModel(Libretto model) {
		this.model = model;
	}

	@FXML
	void initialize() {
		assert txtNomeEsame != null : "fx:id=\"txtNomeEsame\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
	}

}
