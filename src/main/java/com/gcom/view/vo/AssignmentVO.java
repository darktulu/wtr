package com.gcom.view.vo;

import java.io.Serializable;
import java.util.Date;

import org.joda.time.DateTime;


public class AssignmentVO implements Serializable {
	

	   private static final long serialVersionUID = 1L;
		
	
	    private Integer id;
	    private DateTime startDay;
	    private DateTime endDay;
	    private ProjectVO projectVO = new ProjectVO();
		
	    
	    public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		
		
		public DateTime getStartDay() {
			return startDay;
		}
		public void setStartDay(DateTime startDay) {
			this.startDay = startDay;
		}
		public DateTime getEndDay() {
			return endDay;
		}
		public void setEndDay(DateTime endDay) {
			this.endDay = endDay;
		}
		public ProjectVO getProjectVO() {
			return projectVO;
		}
		public void setProjectVO(ProjectVO projectVO) {
			this.projectVO = projectVO;
		}

}
