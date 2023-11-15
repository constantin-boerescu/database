import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Inițializarea managerilor
        CustomerManager customerManager = new CustomerManager();
        ProductManager productManager = new ProductManager();
        OrderManager orderManager = new OrderManager();
        InventoryManager inventoryManager = new InventoryManager();
        WarehouseManager warehouseManager = new WarehouseManager();
        LocationManager locationManager = new LocationManager();

        // Create and add customers
        Customer leia = new Customer(1, "Leia Organa", "Alderaan Royal Palace", "www.rebellion.com", 100000.0f);
        Customer luke = new Customer(2, "Luke Skywalker", "Lars Homestead, Tatooine", "www.jediorder.com", 75000.0f);
        Customer han = new Customer(3, "Han Solo", "Corellia", "www.millenniumfalcon.com", 50000.0f);

        customerManager.addCustomer(leia);
        customerManager.addCustomer(luke);
        customerManager.addCustomer(han);

        // Create and add products
        Product lightsaber = new Product(1, "Lightsaber", "Elegant weapon for a more civilized age", 15000.0f, 20000.0f, "wepon");
        Product xWing = new Product(2, "X-Wing Starfighter", "Versatile ship that balances speed with firepower", 150000.0f, 250000.0f, "ship");
        Product blasterRifle = new Product(3, "Blaster Rifle", "Standard issue for stormtroopers", 5000.0f, 8000.0f, "wepon");

        productManager.addProduct(lightsaber);
        productManager.addProduct(xWing);
        productManager.addProduct(blasterRifle);

        // Create and add locations
        Location tatooine = new Location(1, "Lars Homestead, Outer Rim Territories", "85022", "Tatooine", "Anchorhead", "Galactic Empire", "Arkanis sector");
        Location coruscant = new Location(2, "Jedi Temple, Galactic City", "00001", "Coruscant", "Federal District", "Galactic Republic", "Core Worlds");
        Location hoth = new Location(3, "Echo Base, Hoth system", "00002", "Hoth", "N/A", "Galactic Empire", "Outer Rim Territories");
        
        locationManager.addLocation(hoth);
        locationManager.addLocation(coruscant);
        locationManager.addLocation(tatooine);

        // Create and add warehouses
        Warehouse yavin4 = new Warehouse(1, "Yavin 4 Hangar", tatooine);
        Warehouse hothWarehouse = new Warehouse(2, "Hoth Echo Base", hoth);
        Warehouse endor = new Warehouse(3, "Endor Shield Generator", tatooine);

        warehouseManager.addWarehouse(yavin4);
        warehouseManager.addWarehouse(hothWarehouse);
        warehouseManager.addWarehouse(endor);
    

        // Create and add inventories
        Inventory inv1 = new Inventory(1, lightsaber, yavin4, 100);
        Inventory inv2 = new Inventory(2, xWing, hothWarehouse,  10);
        Inventory inv3 = new Inventory(3, blasterRifle, endor, 1000);
        Inventory inv4 = new Inventory(4, lightsaber, yavin4,50);

        inventoryManager.addInventory(inv1);
        inventoryManager.addInventory(inv2);
        inventoryManager.addInventory(inv3);
        inventoryManager.addInventory(inv4);

        // Create emplyees and add them to the list
        Employee darthVader = new Employee(1,"Darth Vader","vader@empire.gov","+123456789",new Date(),null, "Sith Lord");
        Employee emperorPalpatine = new Employee(2,"Emperor Palpatine","palpatine@empire.gov","+987654321",new Date(),null, "Emperor" );
        
        // Setăm managerul manager of Vader as Palpatin
        darthVader.setManager(emperorPalpatine);
        
        Employee grandMoffTarkin = new Employee(3,"Grand Moff Tarkin","tarkin@empire.gov","+123098456",new Date(), darthVader, "Grand Moff");


        // Create and add orders

        Order order1 = new Order(1, leia, "Processed", darthVader, new Date());
        Order order2 = new Order(2, luke, "Shipped", darthVader, new Date());
        Order order3 = new Order(3, han, "Delivered", emperorPalpatine, new Date());

        orderManager.addOrder(order1);
        orderManager.addOrder(order2);
        orderManager.addOrder(order3);

        // Create and add order items
        OrderItem orderItem1 = new OrderItem(1, order1, lightsaber, 2, 20000.0f );
        OrderItem orderItem2 = new OrderItem(2, order2, xWing, 1, 250000.0f );
        OrderItem orderItem3 = new OrderItem(3, order3, blasterRifle, 5, 8000.0f);

        order1.addOrderItem(orderItem1);
        order1.addOrderItem(orderItem2);
        order3.addOrderItem(orderItem3);

        System.out.println("Customers: ");
        customerManager.printCustomers();
        System.out.println("\n");
        System.out.println("Products: ");
        productManager.printProducts();
        System.out.println("\n");
        System.out.println("Orders: ");
        orderManager.printOrders();
        System.out.println("\n");
        System.out.println("Inventories: ");
        inventoryManager.printInventories();
        System.out.println("\n");
        System.out.println("Warehouses: ");
        warehouseManager.printWarehouses();
        System.out.println("\n");
        System.out.println("Locations: ");
        locationManager.printLocations();



    }
}