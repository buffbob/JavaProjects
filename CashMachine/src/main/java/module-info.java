module CashMachine {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.xml;

    opens com.almasb.atm;
    opens com.almasb.atm.bank;
}