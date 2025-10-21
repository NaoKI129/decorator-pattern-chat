/**
 * Конкретний декоратор 4: Додавання ПІБ автора
 */
public class AuthorDecorator extends MessageDecorator {

    private String authorName;

    public AuthorDecorator(Message message, String authorName) {
        super(message);
        this.authorName = authorName;
    }

    @Override
    public String getContent() {
        String originalContent = super.getContent();
        // Додаємо ім'я автора перед повідомленням
        return "<" + this.authorName + ">: " + originalContent;
    }
}