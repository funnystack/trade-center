package com.funny.trade.service;

import com.funny.trade.domain.user.Department;
import com.funny.trade.domain.user.OrgnizationQry;
import com.funny.combo.core.result.MultiResponse;
import org.springframework.stereotype.Component;

@Component
public class OrganizationServiceI {

    public MultiResponse<Department>  getDepartmentsByCorpId(OrgnizationQry qry){
        return null;
    }
}
