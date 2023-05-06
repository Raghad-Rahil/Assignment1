package com.example.assignment1.model;

public class Operation {

    private String oper;
    private String type;
    private String level;

    public Operation(String oper, String type, String level) {
        this.oper = oper;
        this.type = type;
        this.level = level;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
