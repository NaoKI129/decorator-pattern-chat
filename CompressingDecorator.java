/**
 * Конкретний декоратор 2: Стискання
 * Видаляє зайві пробіли.
 */
public class CompressingDecorator extends MessageDecorator {

    public CompressingDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        String originalContent = super.getContent();
        return compress(originalContent);
    }

    private String compress(String text) {
        // "Стискання" шляхом заміни 2+ пробілів на один та видалення з країв
        return text.trim().replaceAll("\\s+", " ");
    }
}