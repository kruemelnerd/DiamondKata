package de.kruemelnerd.diamondkata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class DiamondGeneratorTest {

    @Test
    void generate_letter_a(){
        DiamondGenerator generator = new DiamondGenerator();
        char[][] diamondMap = generator.generateDiamond();
        assertThat(diamondMap[0][0], is('A'));
    }

}
