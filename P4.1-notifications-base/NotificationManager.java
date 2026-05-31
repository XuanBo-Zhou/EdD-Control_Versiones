// NotificationManager.java - Código a refactorizar
class EmailService implements NotificationService{
    @Override
    public void send(String message, String recipient) {
        // Código para enviar email
        System.out.println("Enviando email a " + recipient + ": " + message);
        // Lógica compleja de email aquí...
    }
}

class SMSService implements NotificationService{
    @Override
    public void send(String message, String recipient) {
        // Código para enviar SMS
        System.out.println("Enviando SMS a " + recipient + ": " + message);
        // Lógica compleja de SMS aquí...
    }
}

class PushService implements NotificationService{
    @Override
    public void send(String message, String recipient) {
        // Código para notificación push
        System.out.println("Enviando push a " + recipient + ": " + message);
        // Lógica compleja de push aquí...
    }
}

public class NotificationManager {
    EmailService EService = new EmailService();
    SMSService SService = new SMSService();
    PushService PService = new PushService();
    
    public void send(String type, String message, String recipient) throws InvalidNotificationException{
        if (message.isEmpty())
            throw new InvalidNotificationException("No hay mensaje que enviar");

        if (recipient.isEmpty())
            throw new InvalidNotificationException("No hay remitente al que enviar");

        if (type.isEmpty())
            throw new InvalidNotificationException("No hay tipo de notificación");

        System.out.println("[LOG]: Se va a enviar una notificacion de tipo " + type + " a " + recipient + " con el mensaje: ");
        System.out.println("[LOG]: " + message );
        if(type.equals("email")){
            EService.send(message, recipient);
        } else if (type.equals("sms")) {
            SService.send(message, recipient);
        } else if (type.equals("push")) {
            PService.send(message, recipient);
        } else throw new InvalidNotificationException("El tipo " + type + " no es valido");
        System.out.println("[LOG]: Se ha enviado correctamente el mensaje.");
    }
}

class InvalidNotificationException extends Exception {
    public InvalidNotificationException(String mensaje) {
        super(mensaje);
    }
}
