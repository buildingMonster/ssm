package com.yiang.ssm.rms.rmm.model;

import java.util.List;

public class SysRight {
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SysRight> getChildren() {
        return children;
    }

    public void setChildren(List<SysRight> children) {
        this.children = children;
    }

    public SysRight getAttributes() {
        return attributes;
    }

    public void setAttributes(SysRight attributes) {
        this.attributes = attributes;
    }

    private List<SysRight> children;

    private SysRight attributes;

    private String rightCode;

    private String rightParentCode;

    private String rightType;

    private String rightText;

    private String rightUrl;

    private String rightTip;

    public SysRight( String rightCode, String rightParentCode, String rightType, String rightText, String rightUrl, String rightTip) {
        this.rightCode = rightCode;
        this.rightParentCode = rightParentCode;
        this.rightType = rightType;
        this.rightText = rightText;
        this.rightUrl = rightUrl;
        this.rightTip = rightTip;
    }

    public SysRight() {
        super();
    }

    public String getRightCode() {
        return rightCode;
    }

    public void setRightCode(String rightCode) {
        this.rightCode = rightCode;
    }

    public String getRightParentCode() {
        return rightParentCode;
    }

    public void setRightParentCode(String rightParentCode) {
        this.rightParentCode = rightParentCode;
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl;
    }

    public String getRightTip() {
        return rightTip;
    }

    public void setRightTip(String rightTip) {
        this.rightTip = rightTip;
    }
}