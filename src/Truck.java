public class Truck extends Transport {

    private boolean isLoaded;
    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
    }
    public Truck(int weight, byte[] coordinate,boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;


    }

    public  void setValues(float _speed, int _weight, String _color,byte[] _coordinate,boolean isLoaded){
        super.setValues(_speed, _weight, _color, _coordinate);
        this.isLoaded = isLoaded;

    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }

    public String getLoaded(){
        if(isLoaded)
            return "Truck its loaded";
        else
            return "Trusk its empty";
    }
}

