package com.yiang.ssm.yrn.model;

public class BasDict {
    private Long dict_id;

    private String dict_type;

    private String dict_item;

    private String dict_value;

    private Boolean dict_is_editable;

    private Long label_id;

    private Long label_name;

    private Long type_id;

    private Long type_name;

    public BasDict(Long dict_id, String dict_type, String dict_item, String dict_value, Boolean dict_is_editable, Long label_id, Long label_name, Long type_id, Long type_name) {
        this.dict_id = dict_id;
        this.dict_type = dict_type;
        this.dict_item = dict_item;
        this.dict_value = dict_value;
        this.dict_is_editable = dict_is_editable;
        this.label_id = label_id;
        this.label_name = label_name;
        this.type_id = type_id;
        this.type_name = type_name;
    }

    public BasDict() {
        super();
    }

    public Long getDict_id() {
        return dict_id;
    }

    public void setDict_id(Long dict_id) {
        this.dict_id = dict_id;
    }

    public String getDict_type() {
        return dict_type;
    }

    public void setDict_type(String dict_type) {
        this.dict_type = dict_type;
    }

    public String getDict_item() {
        return dict_item;
    }

    public void setDict_item(String dict_item) {
        this.dict_item = dict_item;
    }

    public String getDict_value() {
        return dict_value;
    }

    public void setDict_value(String dict_value) {
        this.dict_value = dict_value;
    }

    public Boolean getDict_is_editable() {
        return dict_is_editable;
    }

    public void setDict_is_editable(Boolean dict_is_editable) {
        this.dict_is_editable = dict_is_editable;
    }

    public Long getLabel_id() {
        return label_id;
    }

    public void setLabel_id(Long label_id) {
        this.label_id = label_id;
    }

    public Long getLabel_name() {
        return label_name;
    }

    public void setLabel_name(Long label_name) {
        this.label_name = label_name;
    }

    public Long getType_id() {
        return type_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    public Long getType_name() {
        return type_name;
    }

    public void setType_name(Long type_name) {
        this.type_name = type_name;
    }
}