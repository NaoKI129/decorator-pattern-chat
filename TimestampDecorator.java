import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Конкретний декоратор 3: Додавання дати та часу
 */
public class TimestampDecorator extends MessageDecorator {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public TimestampDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        String originalContent = super.getContent();
        String timestamp = LocalDateTime.now().format(FORMATTER);
        // Додаємо позначку часу перед повідомленням
        return "[" + timestamp + "] " + originalContent;
    }
}