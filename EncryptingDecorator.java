/**
 * Конкретний декоратор 1: Шифрування
 * Для демонстрації просто реверсує текст.
 */
public class EncryptingDecorator extends MessageDecorator {

    public EncryptingDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        String originalContent = super.getContent();
        return encrypt(originalContent);
    }

    private String encrypt(String text) {
        // Проста "шифрація" шляхом реверсування рядка
        return new StringBuilder(text).reverse().toString();
    }
}