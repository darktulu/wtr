package com.gcom.services;

import com.gcom.service.metier.AssignmentService;
import com.gcom.service.metier.EGeneralDataService;
import org.dozer.DozerBeanMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:META-INF/spring/applicationContext-data.xml",
        "classpath:META-INF/spring/applicationContext-security.xml",
        "classpath:META-INF/spring/applicationContext.xml"})
public class testing {
    @Inject
    private EGeneralDataService eGeneralDataService;
    @Inject
    private DozerBeanMapper mapper;
    @Inject
    private AssignmentService assignmentService;

    @Test
    @Transactional
    public void test() throws Exception {
        System.out.println(eGeneralDataService.loadActiveEmployees().size());
    }
}
