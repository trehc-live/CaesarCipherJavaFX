module com.stackoverflow.q3732109.aesarcipherjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.stackoverflow.q3732109.aesarcipherjavafx to javafx.fxml;
    exports com.stackoverflow.q3732109.aesarcipherjavafx;
}