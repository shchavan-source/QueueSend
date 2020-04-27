import org.apache.activemq.artemis.api.core.client.FailoverEventListener;
import org.apache.activemq.artemis.api.core.client.FailoverEventType;

public class FailOverEventListenerImpl implements FailoverEventListener {
    @Override
    public void failoverEvent(FailoverEventType failoverEventType) {
        System.out.println("Failover implementation called at Sender : " + failoverEventType.toString());
    }
}
