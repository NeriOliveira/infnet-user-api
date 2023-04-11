package br.dev.techstack.userapi;

import br.dev.techstack.userapi.models.Generation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerationTest {
    @Test
    public void shouldBeAbleToShowUserGenerationAlpha(){
        // Arrange
        int ageTest = 11;
        String expectedResult = "Geração Alpha";

        // Act
        String result = Generation.calc(ageTest);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldBeAbleToShowUserGenerationZ(){
        // Arrange
        int ageTest = 21;
        String expectedResult = "Geração Z";

        // Act
        String result = Generation.calc(ageTest);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldBeAbleToShowUserGenerationY(){
        // Arrange
        int ageTest = 28;
        String expectedResult = "Geração Y";

        // Act
        String result = Generation.calc(ageTest);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldBeAbleToShowUserGenerationX(){
        // Arrange
        int ageTest = 51;
        String expectedResult = "Geração X";

        // Act
        String result = Generation.calc(ageTest);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldBeAbleToShowUserGenerationBB(){
        // Arrange
        int ageTest = 65;
        String expectedResult = "Geração Baby Boomers";

        // Act
        String result = Generation.calc(ageTest);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldBeAbleToShowUserGenerationGold(){
        // Arrange
        int ageTest = 90;
        String expectedResult = "Geração Gold";

        // Act
        String result = Generation.calc(ageTest);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }
}
