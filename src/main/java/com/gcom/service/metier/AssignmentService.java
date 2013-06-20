package com.gcom.service.metier;

import java.util.List;

import org.joda.time.DateTime;

import com.gcom.service.exceptions.CannotAssignException;
import com.gcom.view.vo.AssignmentVO;
import com.gcom.view.vo.ProjectVO;

public interface AssignmentService {
         
         void assignOrUpdate(String username, List<ProjectVO> listProjects, DateTime startDate, DateTime endDate) throws CannotAssignException;	      
         
         List<AssignmentVO> loadAssignmentHistory(String username);
        
         void deleteAssignment(AssignmentVO assignToken);
         
         List<AssignmentVO> loadCurrentAssignment(String username, DateTime currentDate);
}
