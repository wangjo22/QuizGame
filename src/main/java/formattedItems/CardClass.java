package formattedItems;

import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CardClass {

    private VBox card = new VBox();
    private Text title = new Text();
    private Text content = new Text();
    private String borderStyle = new String("-fx-padding: 10;" +
                                    "-fx-border-style: solid inside;" +
                                    "-fx-border-width: 5;" +
                                    "-fx-border-insets: 10;" +
                                    "-fx-border-radius: 10;" +
                                    "-fx-border-color: black;");

    public CardClass(String title, String content){
        formatTitle(title);
        formatContent(content);
        card.getChildren().add(this.title);
        card.getChildren().add(this.content);
        card.setStyle(borderStyle);
    }

    private void formatTitle(String str){
        this.title.setText(str);
        this.title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
    }

    private void formatContent(String str){
        this.content.setText(str);
        this.content.setFont(Font.font("Verdana", FontWeight.NORMAL, 10));
    }

    public VBox getCard(){
        return this.card;
    }
}

