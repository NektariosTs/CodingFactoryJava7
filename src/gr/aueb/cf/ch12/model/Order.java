package gr.aueb.cf.ch12.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Order {

    private int id;
    private String uuid;
    private double amount;
    private String description;
    private String state;
    private LocalDateTime timestamp;
    private String formattedTimestamp;


    public Order() {

    }

    public Order(int id, String state, String description, double amount) {
        this.id = id;
        this.formattedTimestamp = this.timestamp.format(DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss"));
        this.timestamp = LocalDateTime.now();
        this.state = state;
        this.description = description;
        this.amount = amount;
        this.uuid = UUID.randomUUID().toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormattedTimestamp() {
        return formattedTimestamp;
    }

    public void setFormattedTimestamp(String formattedTimestamp) {
        this.formattedTimestamp = formattedTimestamp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
