package de.kruemelnerd.diamondkata;

public class DiamondGenerator {

    //String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphabet = "AB";
    final public char BLANK = ' ';

    public char[][] generateDiamond(char goalLetter) {
        int positionGoalLetter = alphabet.indexOf(goalLetter) + 1;
        int widthDiamondMap = positionGoalLetter * 2 - 1;
        int heightDiamondMap = positionGoalLetter;

        char[][] diamondMap = new char[heightDiamondMap][widthDiamondMap];


        makeEverythingBlank(heightDiamondMap, widthDiamondMap, diamondMap);


        for (int height = 0; height < heightDiamondMap; height++) {
            char letterFromHeight = alphabet.charAt(height);
            int positionOfLetter = widthDiamondMap - (heightDiamondMap + height);
            if(heightDiamondMap == 1){
                positionOfLetter = 0;
            }
            diamondMap[height][positionOfLetter] = letterFromHeight;
            diamondMap[height][(widthDiamondMap - 1) - positionOfLetter] = letterFromHeight;
            // Breite: 3
            // Höhe: 1
            // Länge: 2
            // gewünschte Position: 2
            // =3 / 2 = 1,5
            // = 5 / 2 = 2,5


            //for (int width = 0; width < widthDiamondMap; width++) {
            //    diamondMap[height][width] = letterFromHeight;
            //}
        }

        //diamondMap[heightDiamondMap - 1][widthDiamondMap - 1] = goalLetter;
        return diamondMap;
    }

    private void makeEverythingBlank(int heightDiamondMap, int widthDiamondMap, char[][] diamondMap) {
        for (int height = 0; height < heightDiamondMap; height++) {
            for (int width = 0; width < widthDiamondMap; width++) {
                diamondMap[height][width] = BLANK;
            }
        }
    }
}


// Jede Linie
// 1 Linie
