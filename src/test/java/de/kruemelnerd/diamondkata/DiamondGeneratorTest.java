package de.kruemelnerd.diamondkata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DiamondGeneratorTest {

    // A
    @Test
    void generate_letter_a() {
        DiamondGenerator generator = new DiamondGenerator();
        char[][] diamondMap = generator.generateDiamond('A');
        assertThat(diamondMap[0][0], is('A'));
    }

    // _A_ 3-2 = 1 =  Breite - Höhe + 1
    // B_B 3-3 = 0
    // _A_ 3-2 = 1
    @Test
    void generate_letter_b() {
        DiamondGenerator generator = new DiamondGenerator();
        char[][] diamondMap = generator.generateDiamond('B');

        assertThat(diamondMap[0][0], is(' '));
        assertThat(diamondMap[0][1], is('A'));
        assertThat(diamondMap[0][2], is(' '));

        assertThat(diamondMap[1][0], is('B'));
        assertThat(diamondMap[1][1], is(' '));
        assertThat(diamondMap[1][2], is('B'));

        assertThat(diamondMap[2][0], is(' '));
        assertThat(diamondMap[2][1], is('A'));
        assertThat(diamondMap[2][2], is(' '));

    }

    //   01234 = 2*Position-1 = 2*3-1 = 5
    // 0 __A__ 5-3 = 2    | A = 0 = 5 - 2 - 3 = Breite - postitionLetter - höhe / 2 +1
    // 1 _B_B_ 5-4 = 1    | B = 1 = 5 - 1 - 3
    // 2 C___C 5-5 = 0    | C = 2 = 5 - 0 - 3
    // 3 _B_B_ 5-6 = -1   | B = 1 = 5 - 1 - 3
    // 4 __A__ 5-7 = -2   | A = 0 = 5 - 2 - 3
    //

    @Test
    void generate_letter_c() {
        DiamondGenerator generator = new DiamondGenerator();
        char[][] diamondMap = generator.generateDiamond('C');

        assertThat(diamondMap[0][0], is(' '));
        assertThat(diamondMap[0][1], is(' '));
        assertThat(diamondMap[0][2], is('A'));
        assertThat(diamondMap[0][3], is(' '));
        assertThat(diamondMap[0][4], is(' '));

        assertThat(diamondMap[1][0], is(' '));
        assertThat(diamondMap[1][1], is('B'));
        assertThat(diamondMap[1][2], is(' '));
        assertThat(diamondMap[1][3], is('B'));
        assertThat(diamondMap[1][4], is(' '));

        assertThat(diamondMap[2][0], is('C'));
        assertThat(diamondMap[2][1], is(' '));
        assertThat(diamondMap[2][2], is(' '));
        assertThat(diamondMap[2][3], is(' '));
        assertThat(diamondMap[2][4], is('C'));

        assertThat(diamondMap[3][0], is(' '));
        assertThat(diamondMap[3][1], is('B'));
        assertThat(diamondMap[3][2], is(' '));
        assertThat(diamondMap[3][3], is('B'));
        assertThat(diamondMap[3][4], is(' '));

        assertThat(diamondMap[4][0], is(' '));
        assertThat(diamondMap[4][1], is(' '));
        assertThat(diamondMap[4][2], is('A'));
        assertThat(diamondMap[4][3], is(' '));
        assertThat(diamondMap[4][4], is(' '));
    }

    // Höhe: 4
    //   0123456 = 2*Position-1 = 7
    // 0 ___A___ 7-4 = 3 = Breite - (Höhe / 2) + 1)  + 0
    // 1 __B_B__ 7-5 = 2 = Breite - (Höhe / 2) + 1)  + 1
    // 2 _C___C_ 7-6 = 1 = Breite - (Höhe / 2) + 1)  + 2
    // 3 D_____D 7-7 = 0 = Breite - (Höhe / 2) + 1)  + 3

    // 4 _C___C_
    // 5 __B_B__
    // 6 ___A___

    @Test
    void generate_letter_d() {
        DiamondGenerator generator = new DiamondGenerator();
        char[][] diamondMap = generator.generateDiamond('D');

        assertThat(diamondMap[0][0], is(' '));
        assertThat(diamondMap[0][1], is(' '));
        assertThat(diamondMap[0][2], is(' '));
        assertThat(diamondMap[0][3], is('A'));
        assertThat(diamondMap[0][4], is(' '));
        assertThat(diamondMap[0][5], is(' '));
        assertThat(diamondMap[0][6], is(' '));


        assertThat(diamondMap[1][0], is(' '));
        assertThat(diamondMap[1][1], is(' '));
        assertThat(diamondMap[1][2], is('B'));
        assertThat(diamondMap[1][3], is(' '));
        assertThat(diamondMap[1][4], is('B'));
        assertThat(diamondMap[1][5], is(' '));
        assertThat(diamondMap[1][6], is(' '));


        assertThat(diamondMap[2][0], is(' '));
        assertThat(diamondMap[2][1], is('C'));
        assertThat(diamondMap[2][2], is(' '));
        assertThat(diamondMap[2][3], is(' '));
        assertThat(diamondMap[2][4], is(' '));
        assertThat(diamondMap[2][5], is('C'));
        assertThat(diamondMap[2][6], is(' '));

        assertThat(diamondMap[3][0], is('D'));
        assertThat(diamondMap[3][1], is(' '));
        assertThat(diamondMap[3][2], is(' '));
        assertThat(diamondMap[3][3], is(' '));
        assertThat(diamondMap[3][4], is(' '));
        assertThat(diamondMap[3][5], is(' '));
        assertThat(diamondMap[3][6], is('D'));

        assertThat(diamondMap[4][0], is(' '));
        assertThat(diamondMap[4][1], is('C'));
        assertThat(diamondMap[4][2], is(' '));
        assertThat(diamondMap[4][3], is(' '));
        assertThat(diamondMap[4][4], is(' '));
        assertThat(diamondMap[4][5], is('C'));
        assertThat(diamondMap[4][6], is(' '));

        assertThat(diamondMap[5][0], is(' '));
        assertThat(diamondMap[5][1], is(' '));
        assertThat(diamondMap[5][2], is('B'));
        assertThat(diamondMap[5][3], is(' '));
        assertThat(diamondMap[5][4], is('B'));
        assertThat(diamondMap[5][5], is(' '));
        assertThat(diamondMap[5][6], is(' '));

        assertThat(diamondMap[6][0], is(' '));
        assertThat(diamondMap[6][1], is(' '));
        assertThat(diamondMap[6][2], is(' '));
        assertThat(diamondMap[6][3], is('A'));
        assertThat(diamondMap[6][4], is(' '));
        assertThat(diamondMap[6][5], is(' '));
        assertThat(diamondMap[6][6], is(' '));

    }


}
