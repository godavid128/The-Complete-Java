package L4_car_dealership;

public class Employee {
    public void handelCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if (finance == true){
            double loonAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loonAmount);
        } else if (vehicle.getPrice() <= cust.getCashOnHand()){
            // customer pays in cash
            processTransaction(cust, vehicle);
        }else {
            System.out.println(" Customer will need more maney to purchase vehicle: " + vehicle);
        }
    }
    public void runCreditHistory(Customer cust, double loonAmount){
        System.out.println("Ran credit history for Customer...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }
    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle: "
                + vehicle + " for the prince " + vehicle.getPrice());
    }
}
