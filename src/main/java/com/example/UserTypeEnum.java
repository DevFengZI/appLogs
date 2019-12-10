package com.example;

public enum UserTypeEnum {
    sexnan(0, "nan", "男"), sexnv(1, "nv", "女"), sexother(2, "other", "未知");
    private String sextype;
    private String sexvalue;
    private int sexint;

    UserTypeEnum(int index, String sextype, String sexvalue) {
        this.sextype = sextype;
        this.sexvalue = sexvalue;
        this.sexint = index;
    }

}
