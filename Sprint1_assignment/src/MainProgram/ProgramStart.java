package MainProgram;

import Enums.ErrorMessage;
import Enums.PlantType;
import Plants.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramStart {
    List<Plant> plants = new ArrayList<>();
    Prompts prompts;
    public ProgramStart() {
        initPlantsList();
        prompts = new Prompts();
        run();
    }

    private void initPlantsList() {
        // Här har vi lite polymorfism där vi sparar olika klasser i listan med plantor.
        // Det här fungerar eftersom alla olika klasser ärver från Plants.
        // Lägger dessutom till enum iform av PlantType
        plants.add(new Palm(PlantType.PALM.plant, "Olof", 1));
        plants.add(new Cactus(PlantType.CACTUS.plant, "Igge", 0.2));
        plants.add(new MeatEatingPlant(PlantType.MEAT_EATING_PLANT.plant, "MeatLoaf", 0.7));
        plants.add(new Palm(PlantType.PALM.plant, "Laura", 5));
    }

    // Ytterligare enums används nedan. Denna gång som felmeddelanden.
    private void run() {
        while (true){
            String inputName = prompts.startPrompt();
            if (doesPlantExist(inputName)){
                Plant currentPlant = getPlant(inputName);
                assert currentPlant != null;
                prompts.resultPrompt(currentPlant);
            } else if (inputName == null){
                prompts.errorPrompt(ErrorMessage.ERROR_NULL_INPUT.message);
            } else if (inputName.equals("q")){
                break;
            } else {
                prompts.errorPrompt(ErrorMessage.ERROR_NOT_KNOWN.message);
            }
        }
    }

    private Plant getPlant(String inputName) {
        for (Plant plant: plants){
            if (plant.getNAME().equalsIgnoreCase(inputName)){
                return plant;
            }
        }
        return null;
    }

    // Testar så att efterfrågad växt existerar.
    private boolean doesPlantExist(String userInput) {
        for (Plant plant : plants) {
            if (plant.getNAME().equalsIgnoreCase(userInput)){
                return true;
            }
        }
        return false;
    }
}
