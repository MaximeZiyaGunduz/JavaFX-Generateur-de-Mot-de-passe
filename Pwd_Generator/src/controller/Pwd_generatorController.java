package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javax.swing.*;
import java.util.Random;
public class Pwd_generatorController {

    @FXML
    private TextField TextField;

    // Méthode qui génére le mdp
    @FXML
    public String Generate_pwd(int j){

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{};':,./<>?";

        // Création d'un objet Random pour générer des nombres aléatoires
        Random random = new Random();

        // Initialisation du mot de passe à vide
        String password = "";

        // Génération du mot de passe en sélectionnant aléatoirement 10 caractères dans la chaîne de caractères disponibles
        for (int i = 0; i < j; i++) {
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);
        }

        // Retour du mot de passe généré
        JOptionPane.showMessageDialog(null, password, "Votre Mot de passe", JOptionPane.INFORMATION_MESSAGE);

        return password;
    }

    //Méthode qui appel la méthode Generate_pwd avec le bon parametre.
    @FXML
    public void submit(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER){
            String textFieldValue = TextField.getText();
            try {
                int j = Integer.parseInt(textFieldValue);
                Generate_pwd(j);
            } catch (NumberFormatException e) {
                System.out.println("Probléme");
            }
        }
    }

}

