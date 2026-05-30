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
    // TODO: Aplicar patrón Strategy para los tipos de notificación
    // TODO: Añadir sistema de logs
    
    public void send(String type, String message, String recipient) {
    }
    
    // TODO: Añadir método para enviar a múltiples destinatarios
    // TODO: Añadir sistema de reintentos
    // TODO: Añadir validación de parámetros
}
