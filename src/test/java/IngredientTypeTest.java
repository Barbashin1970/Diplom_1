import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertNotNull;

public class IngredientTypeTest {
    @Test
    public void fillingIsNotNull() {
        assertNotNull("Начинки не указаны в ингредиентах", IngredientType.valueOf("FILLING"));
    }

    @Test
    public void sauceIsNotNull() {
        assertNotNull("Соусы не указаны в ингредиентах", IngredientType.valueOf("SAUCE"));
    }
}
