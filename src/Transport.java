import java.awt.*;

public abstract class Transport {

    protected float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public  Transport(){

    }

    public Transport(float _speed, int _weight, String _color,byte[] _coordinate){
        System.out.println("Object : ");
        setValues(_speed, _weight,_color, _coordinate);
        //System.out.println(getValues());
    }

    public Transport(int weight,byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
        //System.out.println(this.getValues());
    }

    public abstract void moveObject(float speed);
    public abstract boolean stopObject();


    protected void setValues(float speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    public String getValues(){
        String info =  "Object speed: " + this.speed + ".Weight: " + this.weight + ".Color: " + this.color+".\n";
        String infoCoordinates = "Coordinates:\n";
        for(int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";


        return info + infoCoordinates;

    }
}
