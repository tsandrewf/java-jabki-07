import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;

import shape.Circle;
import shape.Rectangle;

import soundemitter.Dog;
import soundemitter.AlarmClock;
import soundemitter.CarHorn;

import file.TextFile;
import file.ImageFile;

import transport.Airplane;
import transport.Bicycle;

class MainTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shapeTest() {
        Rectangle rectangle = new Rectangle(5.0, 6.0);
        Assertions.assertEquals(30.0, rectangle.area());
        rectangle.displayArea();
        Assertions.assertEquals("Площадь фигуры: 30.0", outputStreamCaptor.toString().trim());

        Circle circle = new Circle(3.0);
        Assertions.assertEquals(28.274333882308138, circle.area());
        outputStreamCaptor.reset();
        circle.displayArea();
        Assertions.assertEquals("Площадь фигуры: 28.274333882308138", outputStreamCaptor.toString().trim());
    }

    @Test
    void soundEmitterTest() {
        outputStreamCaptor.reset();
        (new Dog()).makeSound();
        Assertions.assertEquals("Гав!", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();
        (new AlarmClock()).makeSound();
        Assertions.assertEquals("Дзинь!", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();
        (new CarHorn()).makeSound();
        Assertions.assertEquals("Би-би!", outputStreamCaptor.toString().trim());
    }

    @Test
    void fileTest() {
        Assertions.assertEquals(10, new TextFile("Text.txt", "1234567890").getSize());
        Assertions.assertEquals(2400, new ImageFile("Image.jpg", 20, 30, 4).getSize());
    }

    @Test
    void transportTest() {
        outputStreamCaptor.reset();
        (new Bicycle()).move();
        Assertions.assertEquals("Еду пропорционально усилиям велосипедиста", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();
        (new Airplane()).move();
        Assertions.assertEquals("Лечу, опираясь на подъемную силу", outputStreamCaptor.toString().trim());
    }
}