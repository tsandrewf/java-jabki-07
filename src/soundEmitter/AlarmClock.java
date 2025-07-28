package soundEmitter;

public class AlarmClock implements SoundEmitter {
    @Override
    public void makeSound() {
        System.out.println("Дзинь!");
    }
}
