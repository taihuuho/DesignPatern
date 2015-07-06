package builder;
/**
 *
 * @author 984571
 */
public class Request {
	private String reqId;
	private Person requester;
	private Person agent;
	private String reqContent;
	private String respContent;
	private boolean isAnswered;
	private boolean isSaleLead;
	private boolean needCallBack;

	public void setAgent(Person person) {
		this.agent = person;

	}

	public void setReqId(String string) {
		this.reqId = string;

	}

	public Person getRequester() {
		return requester;
	}

	public void setRequester(Person requester) {
		this.requester = requester;
	}

	public String getReqContent() {
		return reqContent;
	}

	public void setReqContent(String reqContent) {
		this.reqContent = reqContent;
	}

	public String getRespContent() {
		return respContent;
	}

	public void setRespContent(String respContent) {
		this.respContent = respContent;
	}

	public boolean isAnswered() {
		return isAnswered;
	}

	public void setAnswered(boolean isAnswered) {
		this.isAnswered = isAnswered;
	}

	public boolean isSaleLead() {
		return isSaleLead;
	}

	public void setSaleLead(boolean isSaleLead) {
		this.isSaleLead = isSaleLead;
	}

	public boolean isNeedCallBack() {
		return needCallBack;
	}

	public void setNeedCallBack(boolean needCallBack) {
		this.needCallBack = needCallBack;
	}

	@Override
	public String toString() {
		return "Request [reqId=" + reqId + ", requester=" + requester
				+ ", agent=" + agent + ", reqContent=" + reqContent
				+ ", respContent=" + respContent + ", isAnswered=" + isAnswered
				+ ", isSaleLead=" + isSaleLead + ", needCallBack="
				+ needCallBack + "]";
	}
}
