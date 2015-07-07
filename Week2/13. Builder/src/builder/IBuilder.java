package builder;
/**
 *
 * @author 984571
 */
public interface IBuilder {

	// When a call is connected, the request id and agent information becomes
	// available
	public void BuildReqIdAndAgentInfo();

	// The agent will ask for the caller's phone number to retrieve the caller's
	// information from the database
	// (or if it is a new customer, agent will create user profile)
	public void BuildCallerInfo(String phoneNumber);

	// Agent will get what the caller is requesting during the call (as request
	// content)
	public void BuildRequestContent(String content);

	// Agent will try his/her best to answer the questions in the request (as
	// response content)
	public void BuildResponseContent(String response);

	// Agent will set 'isAnswered' and 'needCallback' accordingly and close the
	// call
	// (saving all information in the database)
	public void BuildSaveCallInfo();

	public Request getRequest();
}
