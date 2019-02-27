package com.yiang.ssm.yrn.model;

public class UserMessage {
    private Long mes_id;

    private Integer mes_type;

    private String mes_receiver;

    private String mes_sender;

    public UserMessage(Long mes_id, Integer mes_type, String mes_receiver, String mes_sender) {
        this.mes_id = mes_id;
        this.mes_type = mes_type;
        this.mes_receiver = mes_receiver;
        this.mes_sender = mes_sender;
    }

    public UserMessage() {
        super();
    }

    public Long getMes_id() {
        return mes_id;
    }

    public void setMes_id(Long mes_id) {
        this.mes_id = mes_id;
    }

    public Integer getMes_type() {
        return mes_type;
    }

    public void setMes_type(Integer mes_type) {
        this.mes_type = mes_type;
    }

    public String getMes_receiver() {
        return mes_receiver;
    }

    public void setMes_receiver(String mes_receiver) {
        this.mes_receiver = mes_receiver;
    }

    public String getMes_sender() {
        return mes_sender;
    }

    public void setMes_sender(String mes_sender) {
        this.mes_sender = mes_sender;
    }
}