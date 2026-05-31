// Main.java - Programa principal
public class Main {
    public static void main(String[] args) {
        // Creamos un nuevo manager
        NotificationManager manager = new NotificationManager();
        
        // Probamos todas las funcionalidades
        try {
            manager.send("email", "Bienvenido al sistema", "usuario@email.com");
        } catch (InvalidNotificationException e) {
            System.out.println("ERROR: " + e);
        }

        try {
            manager.send("sms", "Tu código es 1234", "+34123456789");
        } catch (InvalidNotificationException e) {
            System.out.println("ERROR: " + e);
        }

        try {
            manager.send("push", "Tienes un nuevo mensaje", "user_device_001");
        } catch (InvalidNotificationException e) {
            System.out.println("ERROR: " + e);
        }
    }
}
