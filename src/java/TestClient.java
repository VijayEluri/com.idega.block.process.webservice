import java.net.URL;

import com.idega.block.process.webservice.server.CaseEntry;
import com.idega.block.process.webservice.server.CaseResult;
import com.idega.block.process.webservice.server.CaseService;
import com.idega.block.process.webservice.server.CaseServiceServiceLocator;
import com.idega.block.process.webservice.server.Contact;
import com.idega.block.process.webservice.server.Handler;
import com.idega.block.process.webservice.server.Item;
import com.idega.block.process.webservice.server.Owner;
import com.idega.block.process.wsclient.WSCaseConstants;
import com.idega.util.IWTimestamp;

public class TestClient {
	public static void main(String[] args) {
		//testDummy();
		testVUF();
	}

	/**
	 * <p>
	 * TODO tryggvil describe method testDummy
	 * </p>
	 */
	private static void testVUF() {
		try {
//			String endpoint = "http://azskjalfandi.skjalfandi.is/services/CreateNewCaseHttp";
//			String endpoint = "http://213.167.155.187:6580/GoProHusavik.nsf/webservicenewcase?OpenAgent";
			//String endpoint = "http://localhost:9696/rvk/services/CaseService";
			String endpoint = "http://localhost:8090/rvk/services/CaseService";
//			String endpoint = "http://157.157.136.149:8080/axis/services/CreateNewCaseHttp";
/*			Service service = new Service();
			Call call = (Call) service.createCall();

			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			call.setOperationName(new QName("", "createNewCase"));*/

			Owner owner = new Owner();
			owner.setAddress("H�vallag�tu 13");
			//owner.setCase_role("Jolasveinn");
			owner.setCity("Reykjav�k");
			//owner.setDepartment("Department of ws");
			owner.setEmail("tryggvi@idega.is");
			owner.setGsm("6954451");
			owner.setName("Tryggvi Larusson");
			//owner.setPhone("6954451");
			owner.setPostalcode("101");
			owner.setSocialsecurity("1011783159");
			//owner.setTitle("Mr.");
			
			CaseEntry wsCase = new CaseEntry();
			//wsCase.setId("-1");
			//wsCase.setBody("Thetta er body");
			wsCase.setStatus(WSCaseConstants.STATUS_CLOSED);
			wsCase.setCode("JOBA");
			wsCase.setCreated(IWTimestamp.RightNow().toSQLDateString());
			wsCase.setModified(IWTimestamp.RightNow().toSQLDateString());
			wsCase.setExternalCase_id("AG-UHE-0000201");
			wsCase.setSubject("G�� starfsums�kn");
			//wsCase.setBody("Test body");
			wsCase.setStatus("CONFIRMED");
			
			wsCase.setOwner(owner);
			
			Item [] items = new Item[1];
			items[0] = new Item();
			items[0].setKey("CASE_URL");
			items[0].setValue("http://vuf.rvk.is/umsokn?id=AG-UHE-0000201&kt=2004522249");
			
			wsCase.setMetadata(items);
			
			
//			String ret = (String) call.invoke(new Object[] { wsCase });
	        // Make a service
	        CaseServiceServiceLocator service = new CaseServiceServiceLocator();
	 
	        // Now use the service to get a stub which implements the SDI.
	        CaseService port = service.getCaseService(new URL(endpoint));
//	        NewCasePort port = service.getCreateNewCaseHttp();
	        
	        CaseResult ret = port.createOrUpdateCase(wsCase);
	 

			System.out.println("Sent 'Hello!', got operation='" + ret.getOperation() + "' and id="+ret.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <p>
	 * TODO tryggvil describe method testDummy
	 * </p>
	 */
	private static void testDummy() {
		try {
//			String endpoint = "http://azskjalfandi.skjalfandi.is/services/CreateNewCaseHttp";
//			String endpoint = "http://213.167.155.187:6580/GoProHusavik.nsf/webservicenewcase?OpenAgent";
			String endpoint = "http://localhost:9696/rvk/services/CaseService";
//			String endpoint = "http://157.157.136.149:8080/axis/services/CreateNewCaseHttp";
/*			Service service = new Service();
			Call call = (Call) service.createCall();

			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			call.setOperationName(new QName("", "createNewCase"));*/

			Owner owner = new Owner();
			owner.setAddress("Galtalind 13");
			owner.setCase_role("Jolasveinn");
			owner.setCity("Kopavogur");
			owner.setDepartment("Department of ws");
			owner.setEmail("palli@idega.is");
			owner.setGsm("8671374");
			owner.setName("Pall Helgason");
			owner.setPhone("5541374");
			owner.setPostalcode("201");
			owner.setSocialsecurity("0610703899");
			owner.setTitle("Mr.");
			
			Handler handler = new Handler();
			handler.setAddress("Hraunbaer 110");
			handler.setCase_role("Jolasveinn 2");
			handler.setCity("Reykjavik");
			handler.setDepartment("Department of ws2");
			handler.setEmail("gimmi@idega.is");
			handler.setGsm("6993096");
			handler.setName("Grimmur Jonsson");
			handler.setPhone("1234567");
			handler.setPostalcode("110");
			handler.setSocialsecurity("2311771234");
			handler.setTitle("Mrs.");
			
			Contact contact = new Contact();
			contact.setAddress("Stafnasel 5");
			contact.setCase_role("Jolasveinn 3");
			contact.setCity("Reykjavik");
			contact.setDepartment("Department of ws3");
			contact.setEmail("laddi@idega.is");
			contact.setGsm("8670004");
			contact.setName("Thorhallur Helgason");
			contact.setPhone("5577541");
			contact.setPostalcode("109");
			contact.setSocialsecurity("0202774919");
			contact.setTitle("Ms.");
			
			owner.setContact(contact);
			handler.setContact(contact);
			
			CaseEntry wsCase = new CaseEntry();
			wsCase.setId("-1");
			wsCase.setBody("Thetta er body");
			wsCase.setStatus(WSCaseConstants.STATUS_CLOSED);
			wsCase.setCode("MBARN");
			wsCase.setCreated(IWTimestamp.RightNow().toSQLDateString());
			wsCase.setModified(IWTimestamp.RightNow().toSQLDateString());
			wsCase.setExternalCase_id("12345");
			wsCase.setSubject("Test subject");
			wsCase.setBody("Test body");
			
			wsCase.setOwner(owner);
			wsCase.setHandler(handler);
			
			Item [] items = new Item[1];
			items[0] = new Item();
			items[0].setKey("gimmi");
			items[0].setValue("sokkar");
			
			wsCase.setMetadata(items);
			
			
//			String ret = (String) call.invoke(new Object[] { wsCase });
	        // Make a service
	        CaseServiceServiceLocator service = new CaseServiceServiceLocator();
	 
	        // Now use the service to get a stub which implements the SDI.
	        CaseService port = service.getCaseService(new URL(endpoint));
//	        NewCasePort port = service.getCreateNewCaseHttp();
	        
	        CaseResult ret = port.createOrUpdateCase(wsCase);
	 

			System.out.println("Sent 'Hello!', got operation='" + ret.getOperation() + "' and id="+ret.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}