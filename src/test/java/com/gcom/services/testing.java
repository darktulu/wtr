package com.gcom.services;

import java.util.Date;

import javax.inject.Inject;

import org.dozer.DozerBeanMapper;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.gcom.beans.Assignment;
import com.gcom.repos.AssignmentRepos;
import com.gcom.repos.AuthoritiesRepos;
import com.gcom.service.metier.AssignmentService;
import com.gcom.service.metier.EGeneralDataService;
import com.gcom.service.metier.UserService;
import com.gcom.view.vo.AssignmentVO;
import com.gcom.view.vo.EGeneralDataVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:META-INF/spring/applicationContext-data.xml",
	"classpath:META-INF/spring/applicationContext-security.xml",
	"classpath:META-INF/spring/applicationContext.xml" })
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
    	
            
            
            
            for(AssignmentVO assVO : assignmentService.loadAssignmentHistory("o.gamrane")){
            	
            	
            	System.out.println("Project Name"+assVO.getProjectVO().getName()+" List Tasks "+assVO.getProjectVO().getListTaskVO().size());
            	
            }
   }
}
