package com.alibaba.craftsman.domain.user;


import com.funny.combo.core.dto.AbstractCommand;
import com.funny.combo.core.extension.BizScenario;

public class OrgnizationQry extends AbstractCommand {

    private String corpId;

    private BizScenario bizScenario;


    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public BizScenario getBizScenario() {
        return bizScenario;
    }

    public void setBizScenario(BizScenario bizScenario) {
        this.bizScenario = bizScenario;
    }
}
