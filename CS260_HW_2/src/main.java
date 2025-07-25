//This is also referred to as the client code

public class main {

    public static void main(String[] args) {
        // Get two connection objects which can be used as bridges
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // Compare the two connection objects
        if (connection1 == connection2) {
            System.out.println("Both connection instances are the same.");
        } else {
            System.out.println("Connection instances are different.");
        }

        // Create two threads to simulate concurrent access
        //This is the general format that you just have to follow
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //main class instance . function calls
                connection1.connect("thread1");
                connection1.disconnect();
            }
        });  //Thread syntax that just has to be followed

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                connection1.connect("thread2");
                connection1.disconnect();
            }
        });     //Thread syntax that just has to be followed

        // Start both threads calling statements
        //this is a built-in item when you are coding with threads
        thread1.start();
        thread2.start();
    }
}
