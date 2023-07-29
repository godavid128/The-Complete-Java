package L4_car_dealership;
// Write a Program to simulat a car dealership sales process.
// We'il have employees, working selling vehicles to  customers(clients)
public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress("123 Anything St. ");
        cust1.setCashOnHand(25000);

        Vehicle vehicle = new Vehicle("BMW", "M3", 20000);

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);

        Vehicle car = new Vehicle("BMW", "M3", 20000);

        boolean value = car.equals(vehicle);
        System.out.println(value);


        /*
         * hande1Customer(Customer cust, boolean finance, Vihicle vehicle
         *      if (finance == true)
         *          runCreditHistory(Customer cust, double doubleAmount)
         *      else if (vehicle.getPrince() <= cust cashOrHand):
         *          processTransaction(Customer cust, Vehicle vehicle)
         *      esle:
         *            tell customer to bring more money
         * */
    }
}
