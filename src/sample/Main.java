package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Image ico = new Image("file:/home/andrew/IdeaProjects/untitled15/src/sample/plug_extension.png");
//        stage.getIcons().add(ico);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // добавление иконки на заголовок окна
        primaryStage.getIcons().add(ico); //(new Image("file:/home/andrew/Загрузки/plug_extension.png"));



        primaryStage.setTitle("Window ");
        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.getIcons().isIconified().;

//        primaryStage.getIcons().add(new Image("/home/andrew/Загрузки/plug_extension.png"));


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
