package com.funny.trade.domain;

import com.funny.trade.domain.user.Department;
import com.funny.trade.domain.user.OrganizationExtPt;
import com.funny.trade.domain.user.OrgnizationQry;
import com.funny.combo.core.annotion.Command;
import com.funny.combo.core.command.CommandExecutorI;
import com.funny.combo.core.extension.ExtensionExecutor;
import com.funny.combo.core.result.MultiResponse;

import java.util.List;


/**
 * @author carter
 * create_date  2020/5/25 15:09
 * description     查询组织机构的指令执行
 */
@Command
public class OrgazationQueryExe implements CommandExecutorI<MultiResponse, OrgnizationQry> {

    private ExtensionExecutor extensionExecutor;


    @Override
    public MultiResponse execute(OrgnizationQry cmd) {

        String corpId = cmd.getCorpId();


        List<Department> departmentList = extensionExecutor.execute(OrganizationExtPt.class, cmd.getBizScenario(),
                ex -> ex.getDepartmentsByCorpId(corpId, false));


        return MultiResponse.ofWithoutTotal(departmentList);
    }
}