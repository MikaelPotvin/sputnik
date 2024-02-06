package pl.touk.sputnik.engine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewFunctionalityTest {

    private final NewFunctionality newFunctionality = new NewFunctionality();

    @Test
    public void shouldGetClassName() {
        assertEquals("NewFunctionality", newFunctionality.getClassName());
    }
}
