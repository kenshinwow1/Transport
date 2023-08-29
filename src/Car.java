public class Car extends Transport implements ILights{

    boolean isOn;
    public Engine engine = new Engine();
    public Car(float _speed, int _weight, String _color,byte[] _coordinate){
        super(_speed, _weight,_color, _coordinate);

    }

    public Car() {}
    @Override
    public void moveObject(float speed) {
        System.out.println("Object move speed :" + speed);
    }
    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;

    }

    @Override
    public void blinLight() {

        System.out.println("We blink Light");

    }
}
