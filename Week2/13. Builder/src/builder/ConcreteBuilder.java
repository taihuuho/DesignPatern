package builder;

import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author 984571
 */
public class ConcreteBuilder implements IBuilder {

    Request request;
    HashMap customers = new HashMap<>();

    public ConcreteBuilder() {
        request = new Request();
    }

    @Override
    public void BuildReqIdAndAgentInfo() {
        this.request.setReqId(UUID.randomUUID().toString());
        this.request.setAgent(new Person("Agent 1"));

    }

    @Override
    public void BuildCallerInfo(String phoneNumber) {
		// The agent will ask for the caller's phone number to retrieve the
        // caller's information from the database
        // (or if it is a new customer, agent will create user profile)

        Person customer;
        // Check customer existed ?
        if (customers.containsKey(phoneNumber)) {
            customer = (Person) customers.get(phoneNumber);
        } else { // create new
            customer = new Person("Customer 1", phoneNumber);
            customers.put(phoneNumber, customer);
        }
        // set request info
        this.request.setRequester(customer);
    }

    @Override
    public void BuildRequestContent(String content) {
        this.request.setReqContent(content);

    }

    @Override
    public void BuildResponseContent(String response) {
        this.request.setRespContent(response);

    }

    @Override
    public void BuildSaveCallInfo() {
        this.request.setAnswered(false);
        this.request.setSaleLead(false);
        this.request.setNeedCallBack(false);

    }

    public Request getRequest() {
        return request;
    }

}
