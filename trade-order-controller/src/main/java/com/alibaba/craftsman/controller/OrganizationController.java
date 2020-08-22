package com.alibaba.craftsman.controller;

import com.alibaba.craftsman.domain.user.Department;
import com.alibaba.craftsman.domain.user.OrgnizationQry;
import com.alibaba.craftsman.service.OrganizationServiceI;
import com.funny.combo.core.extension.BizScenario;
import com.funny.combo.core.result.MultiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrganizationController {

    @Resource
    private OrganizationServiceI organizationServiceI;



    @GetMapping(value = "/organization/getDepartmentsByCorpId/{corpId}/{scenario}")
    public MultiResponse<Department> listCustomerByName(@PathVariable("corpId") String corpId, @PathVariable("scenario") String scenario){

        OrgnizationQry qry = new OrgnizationQry();
        qry.setCorpId(corpId);
        qry.setBizScenario(BizScenario.valueOf("organize","getByCorpId",scenario));

        return organizationServiceI.getDepartmentsByCorpId(qry);
    }


}