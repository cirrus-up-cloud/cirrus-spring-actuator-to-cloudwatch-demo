package cloud.cirrusup;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Service entry point.
 */
@SpringBootApplication
public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOG.info("Starting application... ");
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ClientConfiguration clientConfiguration() {

        return new ClientConfiguration();
    }

    @Bean
    public AWSCredentialsProvider credentialsProvider() {

        return new SystemPropertiesCredentialsProvider();
    }
}
