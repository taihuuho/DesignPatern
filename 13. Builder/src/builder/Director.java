package builder;

public class Director {
	IBuilder builder = null;
	
	public Director(IBuilder b){
		this.builder = b;
	}
	
	public void ConstructRequest(){
		
		builder.BuildReqIdAndAgentInfo();
		
		// get phoneNumber from User
		String phoneNumber = "515-779-0956";
		builder.BuildCallerInfo(phoneNumber);
		
		// get question from user
		String content = "What are design patterns ?";
		builder.BuildRequestContent(content);
		
		// set response
		String response = "It's awesome stuff in Software Engineering";
		builder.BuildResponseContent(response);
		
		builder.BuildSaveCallInfo();
	}
	
	public Request getRequest(){
		return builder.getRequest();
	}

}
