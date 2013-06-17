package com.gcom.services;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gcom.repos.AuthoritiesRepos;
import com.gcom.service.metier.EGeneralDataService;
import com.gcom.service.metier.UserService;
import com.gcom.view.vo.EGeneralDataVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:META-INF/spring/applicationContext-data.xml",
	"classpath:META-INF/spring/applicationContext-security.xml",
	"classpath:META-INF/spring/applicationContext.xml" })
public class testing {
	@Inject
    private EGeneralDataService eGeneralDataService;

    @Test 
    public void test() throws Exception {
    	
            // NO tests are implemented for now 
   }
}
