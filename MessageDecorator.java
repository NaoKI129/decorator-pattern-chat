/**
 * Базовий абстрактний декоратор (Base Decorator)
 * Зберігає посилання на "обгорнутий" об'єкт Message.
 */
public abstract class MessageDecorator implements Message {
    
    protected Message wrappedMessage; // Об'єкт, який "обгортаємо"

    public MessageDecorator(Message message) {
        this.wrappedMessage = message;
    }

    // За замовчуванням просто делегує виклик "обгорнутому" об'єкту
    @Override
    public String getContent() {
        return wrappedMessage.getContent();
    }
}