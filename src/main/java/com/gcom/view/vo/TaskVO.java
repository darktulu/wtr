package com.gcom.view.vo;

import java.io.Serializable;


public class TaskVO implements Serializable {
	

	   
	    private static final long serialVersionUID = 1L;
	
	    
	    private Integer idtask;
	    private String name;
		
	    
	    public Integer getIdtask() {
			return idtask;
		}
		public void setIdtask(Integer idtask) {
			this.idtask = idtask;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

}
