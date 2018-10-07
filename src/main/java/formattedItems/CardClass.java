package formattedItems;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CardClass {

    private VBox card = new VBox();
    private Text title = new Text();
    private Text content = new Text();
    private final CheckBox checkBox = new CheckBox("Select to play card");
    private final Text selected = new Text("Not selected");
    private String borderStyle = new String("-fx-padding: 10;" +
                                    "-fx-border-style: solid inside;" +
                                    "-fx-border-width: 5;" +
                                    "-fx-border-insets: 10;" +
                                    "-fx-border-radius: 10;" +
                                    "-fx-border-color: black;");

    public CardClass(Text title, Text content){
        formatTitle(title);
        formatContent(content);
        addCheckBoxListener(checkBox);
        card.getChildren().add(this.title);
        card.getChildren().add(this.content);
        card.getChildren().add(this.checkBox);
        card.getChildren().add(this.selected);
        card.setStyle(borderStyle);
    }

    private void formatTitle(Text title){
        this.title = title;
        this.title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
    }

    private void formatContent(Text content){
        this.content = content;
        this.content.setFont(Font.font("Verdana", FontWeight.NORMAL, 10));
    }

    private void addCheckBoxListener(final CheckBox checkBox){
        checkBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (checkBox.isSelected()) {
                    selected.setText("Selected");
                } else {
                    selected.setText("Not Selected");
                }
            }
        });
    }

    public VBox getCard(){
        return this.card;
    }
}

