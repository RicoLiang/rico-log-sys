package rico.log.sys.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LOGGER.info("INFO日志，时间是：{}", start);
		LOGGER.debug("DEBUG日志，时间是：{}", start);
		LOGGER.trace("TRACE日志，时间是：{}", start);
		LOGGER.error("ERROR日志，时间是：{}", start);
	}
}
