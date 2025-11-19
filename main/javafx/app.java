package javafx;
//still need to add the bootstrap, core, and the other things in the module-info.java
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class app extends Application{
    private Stage primaryStage;


    public void start(Stage stage){

        this.primaryStage = stage;
        showHome();
    }
    public void show(String fxmlFile, String title){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/javafx/views/"+fxmlFile));//needs the fxml files we're add on whenever javafx scenebuilder we make is done
            Scene scene = new Scene(loader.load());
            HomeController controller = loader.getController();
            controller.setApp(this);//this is for the app launch for the controllers
            controller.setUser(username);//same for this as well
            primaryStage.setScene(scene);
            primaryStage.setTitle(title);
            primaryStage.show();


        }
        catch (Exception e){e.printStackTrace();}



    }
    public void showHome(){
        show("Home.fmxl","Home");
    }


    private void showLogin(){
        show("Login.fxml","Login");

    }
    public static void main(String[] args){
        launch(args);
    }


}