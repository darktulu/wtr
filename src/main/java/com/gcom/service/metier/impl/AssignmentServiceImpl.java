package com.gcom.service.metier.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dozer.DozerBeanMapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcom.beans.Assignment;
import com.gcom.beans.EGeneralData;
import com.gcom.beans.Project;
import com.gcom.repos.AssignmentRepos;
import com.gcom.service.exceptions.CannotAssignException;
import com.gcom.service.metier.AssignmentService;
import com.gcom.service.utils.ObjectToVOListConverter;
import com.gcom.view.vo.AssignmentVO;
import com.gcom.view.vo.EGeneralDataVO;
import com.gcom.view.vo.ProjectVO;


@Service("assignmentService")
@Transactional
public class AssignmentServiceImpl implements AssignmentService {
	
	@Inject
	private AssignmentRepos assignmentRepos;
	
	@Inject
    private DozerBeanMapper mapper;
	
	@Inject
	private ObjectToVOListConverter<Assignment, AssignmentVO> assgnConverter;
	

	@Override
	public void assignOrUpdate(String username, List<ProjectVO> listProjects, DateTime startDate, DateTime endDate) throws CannotAssignException {
		// TODO Auto-generated method stub
	}

	@Override
	@Transactional(readOnly = true)
	public List<AssignmentVO> loadAssignmentHistory(String username) {
		
		return assgnConverter.convert(assignmentRepos.findByUserUsername(username), AssignmentVO.class);
	}

	@Override
	public void deleteAssignment(AssignmentVO assignToken) {
		
		assignmentRepos.delete(assignToken.getId());
	
	}

	@Override
	@Transactional(readOnly = true)
	public List<AssignmentVO> loadCurrentAssignment(String username, DateTime currentDate) {
		
		return null;
	}
}
