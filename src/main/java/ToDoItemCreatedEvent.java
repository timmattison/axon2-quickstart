import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by timmattison on 12/1/14.
 */
public class ToDoItemCreatedEvent {
    private final String todoId;
    private final String description;

    public ToDoItemCreatedEvent(String todoId, String description) {
        this.todoId = todoId;
        this.description = description;
    }

    public String getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }
}
