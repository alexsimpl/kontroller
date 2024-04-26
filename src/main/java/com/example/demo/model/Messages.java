package com.example.demo.model;

import java.util.List;

// import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;

@Entity
@Table(name = "messages")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "operation")
    private String operation;

    @Column(name = "fw")
    private String fw;

    @Column(name = "isActive")
    private int isActive;
    
    @Column(name = "mode")
    private int mode;

    @Column(name = "controllerIP")
    private String controllerIp;

    @Column(name = "readerProtocol")
    private String readerProtocol;


    public Messages() {

    }

    public Messages(String operation, String fw, int isActive, int mode, String controllerIp, String readerProtocol) {
        super();
        this.operation = operation;
        this.fw = fw;
        this.isActive = isActive;
        this.mode = mode;
        this.controllerIp = controllerIp;
        this.readerProtocol = readerProtocol;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getFw() {
        return fw;
    }

    public void setFw(String fw) {
        this.fw = fw;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String getControllerIp() {
        return controllerIp;
    }

    public void setControllerIp(String controllerIp) {
        this.controllerIp = controllerIp;
    }

    public String getReaderProtocol() {
        return readerProtocol;
    }

    public void setReaderProtocol(String readerProtocol) {
        this.readerProtocol = readerProtocol;
    }

    
}
