module com.stackoverflow.q3732109.aesarcipherjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.crazyfrogfan.caesarcipherjavafx to javafx.fxml;
    exports com.crazyfrogfan.caesarcipherjavafx;
}