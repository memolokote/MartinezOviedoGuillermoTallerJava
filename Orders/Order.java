package Orders;

class Order {
    private static int contadorId = 1; 
    private int id;
    private String customer;
    private OrderStatus status;
    private OrderPriority priority;
    private PaymentMethod paymentMethod;

    public Order(String customer, OrderStatus status, OrderPriority priority, PaymentMethod paymentMethod) {
        this.id = contadorId++; 
        this.customer = customer;
        this.status = status;
        this.priority = priority;
        this.paymentMethod = paymentMethod;
    }

    public void showDetails() {
        System.out.println("Pedido #" + id);
        System.out.println("Cliente: " + customer);
        System.out.println("Estado: " + status + " -> " + status.getMensaje());
        System.out.println("Prioridad: " + priority + " (Nivel " + priority.getNivel() + ")");
        System.out.println("Método de pago: " + paymentMethod + " -> " + paymentMethod.getDescripcion());
        System.out.println();
    }
}




