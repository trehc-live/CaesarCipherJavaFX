package com.stackoverflow.q3732109.aesarcipherjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.File;

import com.stackoverflow.q3732109.aesarcipherjavafx.services.FileGetter;
import com.stackoverflow.q3732109.aesarcipherjavafx.services.FileSaver;
import com.stackoverflow.q3732109.aesarcipherjavafx.services.Validation;
import com.stackoverflow.q3732109.aesarcipherjavafx.services.CaesarCipher;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    private Label progressStateText;

    @FXML
    private TextField key;

    private String fileIn = null;
    private String fileOut = null;

    @FXML
    protected void onChooseInButtonClick() {
        File selectedFile = FileGetter.getFile();
        if (selectedFile != null){
            fileIn = selectedFile.toString();
            progressStateText.setText("Выбран входной файл");
        }
    }

    @FXML
    protected void onChooseOutButtonClick() {
        File selectedFile = FileGetter.getFile();
        if (selectedFile != null){
            fileOut = selectedFile.toString();
            progressStateText.setText("Выбран выходной файл");
        }
    }

    @FXML
    protected void onEncodeButtonClick() {
        if(fileIn == null || fileOut == null)
            return;

        if(!Validation.valid(key.getText())) {
            progressStateText.setText("not encoded, enter the key");
            return;
        }

        FileSaver.saveFile(fileOut, CaesarCipher.encrypt(FileGetter.readFile(fileIn), Integer.parseInt(key.getText())));
        progressStateText.setText("Encoded!");
    }
}