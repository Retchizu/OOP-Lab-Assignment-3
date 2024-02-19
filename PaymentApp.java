

public class PaymentApp {



    public static void main (String[] args){

        Order keyboard = new Order("Keyboard", 10, 300.0, "Gcash", new Gcash());
        System.out.println("Order item is "+ keyboard.getItem());
        System.out.println("Unit price is "+ keyboard.getUnitPrice());
        System.out.println("Quantity is " + keyboard.getQuantity());
        System.out.println("Payment order details if "+keyboard.getPaymentMethod());
        System.out.println("Discount rate is 0.0");
        System.out.println("Payment amount is "+ keyboard.getTotalAmount() +"\n");

        Order keyboard2 = new Order();
        keyboard2.setItem("Keyboard");
        keyboard2.setPaymentMethod("Maya");
        keyboard2.setUnitPrice(300.0);
        keyboard2.setQuantity(10);

        keyboard2.setPaymentMode( new Maya());
        keyboard2.setTotalAmount();
        System.out.println("Order item is "+ keyboard2.getItem());
        System.out.println("Unit price is "+ keyboard2.getUnitPrice());
        System.out.println("Quantity is " + keyboard2.getQuantity());
        System.out.println("Payment order details if "+keyboard2.getPaymentMethod());
        System.out.println("Discount rate is 0.05");
        System.out.println("Payment amount is "+ keyboard2.getTotalAmount()+"\n");

        Order keyboard3 = new Order("Keyboard", 10, 300.0, "ShopeePay", new ShopeePay());
        System.out.println("Order item is "+ keyboard3.getItem());
        System.out.println("Unit price is "+ keyboard3.getUnitPrice());
        System.out.println("Quantity is " + keyboard3.getQuantity());
        System.out.println("Payment order details if "+keyboard3.getPaymentMethod());
        System.out.println("Discount rate is 0.10");
        System.out.println("Payment amount is "+ keyboard3.getTotalAmount()+"\n");
    }
}
