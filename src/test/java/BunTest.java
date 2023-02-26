import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Bun {index} -> Name: {0}, Price: {1} ")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"black bun", 100},
                {"white bun", 200},
                {"red bun", 300},
                {"", 300},
                {"veryveryveryverylooooooooonggggggggggstriiiiiiing", 200},
                {null, 100},
                //   {"bun", null}, // тест падает на пустом поле цены
                {"$%#^@&$$(%^^)special@symbols", 200},
                {"white bun", -100},
                {"white bun", 0},
                {"white bun", 0.01f},
                {"white bun", 999999999},
                {"red 1234", 300},

        };
    }

    @Test
    public void getNameReturnValidName() {
        Bun bun = new Bun(name, price);
        assertEquals(name, bun.getName());
    }

    @Test
    public void getPriceReturnValidPrice() {
        Bun bun = new Bun(name, price);
        assertEquals("Цена возвращается с ошибкой", price, bun.getPrice(), 0.0f);
    }
}