/*
  * This is going to be our class called DatabaseConnection that implements that Singleton Pattern
 */



public class DatabaseConnection {

    // Private static variable to hold the single instance of the class
    private static DatabaseConnection instance;
                    //className       //ClassVariable
    //Delaying the making of this object, needing to do some checks with it

    // Private constructor to prevent instantiation from any outside classes
    private DatabaseConnection() {
        //This type of coding is referred to as Lazy initialization
        System.out.println("Initializing database connection...");
    }



    // Public static method to provide access to the single instance with thread safety
    //
    public static synchronized DatabaseConnection getInstance() {
        //synchronized is a key word that ensures that multiple threads cannot create multiple instances
        //This method will only be created only when it is called for the first time
        //instance is our class variable
        //This is also a prime example of what lazy initialization is
        if (instance == null) {
            instance = new DatabaseConnection();
            //making a local copy of the instance private variable
        }
        return instance; //otherwise we are going to reuse this variable
    }


    // Synchronized method to simulate establishing a connection
    public synchronized void connect(String threadName) {
        System.out.println(threadName + " is running...");
        System.out.println("Connected to the database");
    }

    // Synchronized method to simulate closing the connection
    public synchronized void disconnect() {
        System.out.println("Disconnected from the database");
    }

}
