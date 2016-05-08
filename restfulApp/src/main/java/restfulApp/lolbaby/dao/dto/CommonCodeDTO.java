package restfulApp.lolbaby.dao.dto;

public class CommonCodeDTO {
	
	int codeId;
	
	String codeTypeId;
	
	String codeName;
	
	public int getCodeId(){
		return codeId;
	}
	
	public void setCodeId(int codeId){
		this.codeId = codeId;
	}
	
	public String getCodeTypeId(){
		return codeTypeId;
	}
	
	public void setCodeTypeId(String codeTypeId){
		this.codeTypeId = codeTypeId;
	}
	
	public String getCodeName(){
		return codeName;		
	}
	
	public void setCodeName(String codeName){
		this.codeName = codeName; 
	}

}
