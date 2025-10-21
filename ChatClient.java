/**
 * Головний клас для демонстрації роботи декораторів
 */
public class ChatClient {

    public static void main(String[] args) {
        
        // 1. Створюємо базове повідомлення з зайвими пробілами
        Message myMessage = new BaseMessage("  Йоууууу хеллоуу  ");
        System.out.println("1. Базове повідомлення:\n'" + myMessage.getContent() + "'");
        System.out.println("-------------------------------------------------");

        // 2. Демонструємо стискання
        // (використаємо окремо, щоб показати його роботу)
        Message compressedMessage = new CompressingDecorator(myMessage);
        System.out.println("2. Повідомлення після стискання:\n'" + compressedMessage.getContent() + "'");
        System.out.println("-------------------------------------------------");


        // 3. Демонструємо ланцюжок із завдання:
        // (Стиснутий текст) -> Шифрування -> Дата -> Автор
        System.out.println("3. Демонстрація ланцюжка обгорток:\n");

        // Почнемо зі стиснутого повідомлення
        Message processingMessage = compressedMessage;
        System.out.println("   Початковий (вже стиснутий) текст:\n   '" + processingMessage.getContent() + "'\n");

        // Крок 1: Зашифрувати
        processingMessage = new EncryptingDecorator(processingMessage);
        System.out.println("   Крок 1: Після шифрування:\n   '" + processingMessage.getContent() + "'\n");

        // Крок 2: Додати дату та час
        processingMessage = new TimestampDecorator(processingMessage);
        System.out.println("   Крок 2: Після додавання дати/часу:\n   '" + processingMessage.getContent() + "'\n");

        // Крок 3: Додати ім'я автора
        // (Замініть "Ваше Прізвище Ваше Ім'я" на реальні)
        processingMessage = new AuthorDecorator(processingMessage, "Аббасли Алі");
        System.out.println("   Крок 3: Фінальний результат (з автором):\n   '" + processingMessage.getContent() + "'");
    }

}
