package MainProgram;
import Plants.Plant;

import javax.swing.*;

public class Prompts {
    public String startPrompt(){
        return JOptionPane.showInputDialog("Ange namnet på plantan för att får reda på matmängd? \nSkriv 'q' för att avsluta programmet.");
    }

    public void resultPrompt(Plant plant){
        String output = "En " + plant.getPlantTypeName() + " med höjden " + plant.getHeight() +
                "m. behöver matas med " + plant.consumption() + "l " + plant.getFoodType() + ".";
        JOptionPane.showMessageDialog(null, output);
    }

    public void errorPrompt(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
