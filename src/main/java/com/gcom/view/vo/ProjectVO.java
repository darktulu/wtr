package com.gcom.view.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.gcom.beans.Task;


public class ProjectVO implements Serializable {
	

	   private static final long serialVersionUID = 1L;
		
	
	    private Integer idproject;
	    private String name;
	    private String manager;
	    private Set<TaskVO> listTaskVO = new HashSet<TaskVO>(0);
		
	    
	    public Integer getIdproject() {
			return idproject;
		}
		public void setIdproject(Integer idproject) {
			this.idproject = idproject;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getManager() {
			return manager;
		}
		public void setManager(String manager) {
			this.manager = manager;
		}
		public Set<TaskVO> getListTaskVO() {
			return listTaskVO;
		}
		public void setListTaskVO(Set<TaskVO> listTaskVO) {
			this.listTaskVO = listTaskVO;
		}


}
