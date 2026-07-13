import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafka {

	@KafkaListener(topics = "trader-updates")
	public void processMessage(String content) {
		// ...
	}

}