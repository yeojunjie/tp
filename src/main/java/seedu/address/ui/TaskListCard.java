package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import seedu.address.model.student.Student;
import seedu.address.model.task.Task;

import java.util.Set;

/**
 * An UI component that displays information of a {@code Task}.
 */
public class TaskListCard extends UiPart<Region> {

    private static final String FXML = "TaskListCard.fxml";

    public final Task task;

    @FXML
    private VBox cardPane; // Think of this as the entire TaskListCard.
    @FXML
    private Label id;
    @FXML
    private Label name;
    @FXML
    private Label description;
    @FXML
    private Label deadline;
    @FXML
    private Label completion;
    private boolean isExpanded;
    @FXML
    private VBox optionalInfo; // This is the optional information to be displayed.
    @FXML
    private Label studentsHeading;
    @FXML
    private Label studentsBodyText;

    /**
     * Creates a {@code TaskListCard} with the given {@code Task} and index to display.
     */
    public TaskListCard(Task task, int displayedIndex, boolean isExpanded) {
        super(FXML);
        this.task = task;
        id.setText(displayedIndex + ".");
        name.setText(String.valueOf(task.getTaskName()));
        description.setText(String.valueOf(task.getTaskDescription()));
        deadline.setText(String.format("Due by %s", task.getTaskDeadline()));

        Set<Student> setOfStudents = task.getStudents();

        if (setOfStudents.size() == 0) {
            completion.setText("No students are assigned to this task.");
            studentsHeading.setVisible(false);
            studentsBodyText.setVisible(false);
        } else {
            completion.setText(String.format("??%% completed (??/%d) students", setOfStudents.size()));
            studentsHeading.setText("List of Students:");
            StringBuilder studentsBodyTextString = new StringBuilder();
            for (Student student : setOfStudents) {
                studentsBodyTextString.append(String.format("[?] %s\n", student.getName()));
            }
            studentsBodyText.setText(studentsBodyTextString.toString());
        }

        // Populate optionalInfo with relevant information.
        studentsHeading.setText("List of Students:");


        this.isExpanded = isExpanded;
        // Use the isExpanded parameter to determine whether to (immediately) show the optional information.
        onCardClicked();
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof TaskListCard)) {
            return false;
        }

        // state check
        TaskListCard card = (TaskListCard) other;
        return id.getText().equals(card.id.getText())
                && task.equals(card.task);
    }

    /**
     * When the <code>TaskListCard</code> is clicked, it toggles between showing optional information and not showing
     * optional information.
     */
    @FXML
    public void onCardClicked() {
        isExpanded = !isExpanded;

        if (isExpanded) {
            optionalInfo.setVisible(true);
            optionalInfo.setManaged(true);
        } else {
            optionalInfo.setVisible(false);
            optionalInfo.setManaged(false);
        }
    }
}
