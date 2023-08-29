public class Main {

    //9.29
    public static void main(String[] args) {
        //Transport
        /*Car bmw = new Car (50.5f, 2500,"White", new byte[] {0, 0, 0});
        bmw.engine.seValues(false,2000000);
        bmw.engine.info();


        //Transport transport = new Car(50.5f, 2500,"White", new byte[] {0, 0, 0});


      Truck  truck = new Truck(5600, new byte[] {100,0,100},false);
        truck.engine.seValues(true,200000);
      truck.engine.info();*/
      //truck.setValues(50.5f, 2500,"White", new byte[] {0, 0, 0},true);
      //System.out.println(truck.getValues());

        Car flyCar = new Car(50.5f, 2500,"White", new byte[] {0, 0, 0}){
                @Override
                        public void moveObject (float speed){
            super.moveObject(speed);

            this.engine.isReady(true);
                    System.out.println("Car its fly");
        }
        };
        flyCar.moveObject(450);
    }
}