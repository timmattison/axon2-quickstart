import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by timmattison on 12/1/14.
 */
public class MarkCompletedCommand {
    @TargetAggregateIdentifier
    private final String todoId;

    public MarkCompletedCommand(String todoId) {
        this.todoId = todoId;
    }

    public String getTodoId() {
        return todoId;
    }
}
