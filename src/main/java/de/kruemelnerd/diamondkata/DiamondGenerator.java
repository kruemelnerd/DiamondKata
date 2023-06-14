package de.kruemelnerd.diamondkata;

public class DiamondGenerator {

    //String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphabet = "ABCD";
    final public char BLANK = ' ';

    public char[][] generateDiamond(char goalLetter) {
        if (goalLetter == 'A') {
            return getSimpleMapForA();
        }

        int positionGoalLetter = alphabet.indexOf(goalLetter) + 1;
        int heightDiamondMap, widthDiamondMap;
        widthDiamondMap = heightDiamondMap = positionGoalLetter * 2 - 1;

        char[][] diamondMap = new char[heightDiamondMap][widthDiamondMap];


        makeEverythingBlank(heightDiamondMap, widthDiamondMap, diamondMap);


        for (int height = 0; height < heightDiamondMap; height++) {
            int positionOfLetter = widthDiamondMap - (((heightDiamondMap / 2) +1) + height);
            char letterFromHeight;
            if(positionOfLetter <0){
                positionOfLetter = positionOfLetter * -1;
                //letterFromHeight = alphabet.charAt(height - (positionOfLetter +1));
            }
            int indexLetterInAlphabet = (widthDiamondMap) - positionOfLetter - ((heightDiamondMap / 2) +1);
            letterFromHeight = alphabet.charAt(indexLetterInAlphabet);
            //positionOfLetter = positionOfLetter < 0 ? positionOfLetter * -1 : positionOfLetter;


            diamondMap[height][positionOfLetter] = letterFromHeight;
            diamondMap[height][(widthDiamondMap - 1) - positionOfLetter] = letterFromHeight;
        }

        return diamondMap;
    }

    private static char[][] getSimpleMapForA() {
        char[][] diamondMap = new char[1][1];
        diamondMap[0][0] = 'A';
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
