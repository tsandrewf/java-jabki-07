import shape.Shape;
import shape.Circle;
import shape.Rectangle;

import soundemitter.SoundEmitter;
import soundemitter.Dog;
import soundemitter.AlarmClock;
import soundemitter.CarHorn;

import file.File;
import file.TextFile;
import file.ImageFile;

import transport.Transport;
import transport.Bicycle;
import transport.Airplane;

public class Main {
    public static void main(String[] args)
    {
        // 1. Фигуры
        Shape[] shapes = new Shape[]{new Circle(2.0), new Rectangle(3.0, 4.0)};
        for (Shape shape: shapes) {
            shape.displayArea();
        }

        // 2. Звуки
        playAllSounds(new SoundEmitter[]{new Dog(), new AlarmClock(), new CarHorn()});

        // 3. Файловая система
        displayFilesSize(new File[]{new TextFile("Текст.txt", "12345"), new ImageFile("Изображение.png", 10, 20, 2)});

        // 4. Транспорт
        startRace(new Transport[]{new Bicycle(), new Airplane()});
    }

    public static void playAllSounds(SoundEmitter[] devices) {
        for (SoundEmitter device: devices) {
            device.makeSound();
        }
    }

    public static void displayFilesSize(File[] files) {
        long filesSize = 0;

        for (File file: files) {
            filesSize += file.getSize();
        }

        System.out.printf("Общий размер всех файлов: %s\n", filesSize);
    }

    public static void startRace(Transport[] vehicles) {
        for (Transport vehicle: vehicles) {
            vehicle.move();
        }
    }
}