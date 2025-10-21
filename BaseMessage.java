/**
 * Конкретний компонент (Concrete Component)
 * Це базовий клас, що містить початковий текст повідомлення.
 */
public class BaseMessage implements Message {
    
    private String text;

    public BaseMessage(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return this.text;
    }
}