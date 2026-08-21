package pe.edu.upeu.algoritmosgui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Spinner;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MatrizTriangular extends Application {
    GridPane grid;
    Label lblInfo;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label titulo = new Label("MATRIZ DE LA FORMA 5");

        Label lblTam = new Label("Tamaño (n):");
        Spinner<Integer> spInicio = new Spinner<>(2, 30, 5);

        Label lblNumI = new Label("Numero de Inicio");
        Spinner<Integer> spNumI = new Spinner<>(0, 30, 0);

        Button gMatriz = new Button("Generar");

        HBox controles = new HBox(10, lblTam, spInicio, lblNumI, spNumI, gMatriz);
        grid = new GridPane();
        grid.setHgap(3);
        grid.setVgap(3);
        gMatriz.setOnAction(event -> {
            matrizf5(spInicio.getValue(), spNumI.getValue());
        });
        matrizf5(spInicio.getValue(), spNumI.getValue());

        lblInfo=new Label("Mostrar Informacion");

        VBox root = new VBox(15, titulo, controles, grid,lblInfo);
        root.setPadding(new Insets(15));
        ScrollPane scroll = new ScrollPane(root);

        primaryStage.setScene(new Scene(scroll));
        primaryStage.setTitle("Ejemplos de Matriz GUI");
        primaryStage.show();


    }

    public void matrizf5(int tam, int numI) {
        grid.getChildren().clear();
        for (int f = 0; f < tam; f++) {
            for (int c=tam-1; c>=tam-1-f; c--) {
                Button cuadrito = new Button(String.valueOf(numI));
                cuadrito.setMinSize(48, 42);
                cuadrito.setPrefSize(48, 42);
                grid.add(cuadrito, c, f);
                int ff=f;
                int cc=c;
                cuadrito.setOnAction(event -> {
                    lblInfo.setText("Su valor es: "+cuadrito.getText()+"ubicado en la fila: "+(ff)+" y columna: "+(cc));
                });
                numI++;
            }
        }
    }
}
