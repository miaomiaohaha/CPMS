package org.dengying.sys.model;

import java.util.List;

public class Department {  
    
    private String id;          //����id   
    private String pid;         //��id  
    private String rank;
    private String text;        //��������  
    private List<Department> children;   //���ڴ洢�ӽڵ�  
    
    public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getId() {  
        return id;  
    }  
    public void setId(String id) {  
        this.id = id;  
    }  
    public String getPid() {  
        return pid;  
    }  
    public void setPid(String pid) {  
        this.pid = pid;  
    }  
      
    public String getText() {  
        return text;  
    }  
    public void setText(String text) {  
        this.text = text;  
    }  
    public List<Department> getChildren() {  
        return children;  
    }  
    public void setChildren(List<Department> children) {  
        this.children = children;  
    }      
      
}  
