package com.demo.cassandra;

import com.demo.cassandra.config.CassandraConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.nio.file.Path;

@SpringBootApplication
@EnableConfigurationProperties(CassandraConfig.class)
public class CassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraApplication.class, args);
	}

	@Bean
	public CqlSessionBuilderCustomizer sessionBuilderCustomizer(CassandraConfig astraProperties){
		Path bundle = astraProperties.getSecureConnectBundle().toPath();
//		return builder -> builder.withCloudSecureConnectBundle(bundle);
		return builder -> builder.withCloudSecureConnectBundle(bundle).withAuthCredentials("dLfeIbaEXGynFZJlIUNiqtoz","JJDZwbdCkgTemikYBZM3yO4kdsBxQPt2po_Rwz83.tEopJKir7oQKiUepw5I4QBiKkZmoZch,jElv6+4M4,a5hZ1UN7ikBacY6v57nc5YxbXl0x6z5ZNQ86ZSwCTID.z")
				.withKeyspace("main")
				.build();
	}

}
