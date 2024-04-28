//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import service.ServiceStation;
import service.Serviceable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Serviceable[] transport = new Transport[3];
        transport[0] = new Truck("Камаз", 8);
        transport[1] = new Bicycle("Stels", 2);
        transport[2] = new Car("Volvo xc 60", 4);
        for (Serviceable serviceable : transport) {
            serviceStation.check(serviceable);
        }

    }
}