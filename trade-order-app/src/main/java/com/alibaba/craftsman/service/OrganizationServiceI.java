package com.alibaba.craftsman.service;

import com.alibaba.craftsman.domain.user.Department;
import com.alibaba.craftsman.domain.user.OrgnizationQry;
import com.funny.combo.core.result.MultiResponse;
import org.springframework.stereotype.Component;

@Component
public class OrganizationServiceI {

    public MultiResponse<Department>  getDepartmentsByCorpId(OrgnizationQry qry){
        return null;
    }
}
