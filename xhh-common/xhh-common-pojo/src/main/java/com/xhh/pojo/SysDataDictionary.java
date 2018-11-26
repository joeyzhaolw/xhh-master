package com.xhh.pojo;

public class SysDataDictionary {
    private Integer dictionaryId;

    private String dictionaryCatalog;

    private Integer dictionaryLevel;

    private String dictionaryName;

    private Integer dictionaryKey;

    private String dictionaryValue;

    private String dictionaryMemo;

    private Integer dictionaryIsUse;

    private Integer parentDictionaryId;

    private String dictionaryIdPath;

    private Integer allowEdit;

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(Integer dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getDictionaryCatalog() {
        return dictionaryCatalog;
    }

    public void setDictionaryCatalog(String dictionaryCatalog) {
        this.dictionaryCatalog = dictionaryCatalog == null ? null : dictionaryCatalog.trim();
    }

    public Integer getDictionaryLevel() {
        return dictionaryLevel;
    }

    public void setDictionaryLevel(Integer dictionaryLevel) {
        this.dictionaryLevel = dictionaryLevel;
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName == null ? null : dictionaryName.trim();
    }

    public Integer getDictionaryKey() {
        return dictionaryKey;
    }

    public void setDictionaryKey(Integer dictionaryKey) {
        this.dictionaryKey = dictionaryKey;
    }

    public String getDictionaryValue() {
        return dictionaryValue;
    }

    public void setDictionaryValue(String dictionaryValue) {
        this.dictionaryValue = dictionaryValue == null ? null : dictionaryValue.trim();
    }

    public String getDictionaryMemo() {
        return dictionaryMemo;
    }

    public void setDictionaryMemo(String dictionaryMemo) {
        this.dictionaryMemo = dictionaryMemo == null ? null : dictionaryMemo.trim();
    }

    public Integer getDictionaryIsUse() {
        return dictionaryIsUse;
    }

    public void setDictionaryIsUse(Integer dictionaryIsUse) {
        this.dictionaryIsUse = dictionaryIsUse;
    }

    public Integer getParentDictionaryId() {
        return parentDictionaryId;
    }

    public void setParentDictionaryId(Integer parentDictionaryId) {
        this.parentDictionaryId = parentDictionaryId;
    }

    public String getDictionaryIdPath() {
        return dictionaryIdPath;
    }

    public void setDictionaryIdPath(String dictionaryIdPath) {
        this.dictionaryIdPath = dictionaryIdPath == null ? null : dictionaryIdPath.trim();
    }

    public Integer getAllowEdit() {
        return allowEdit;
    }

    public void setAllowEdit(Integer allowEdit) {
        this.allowEdit = allowEdit;
    }
}