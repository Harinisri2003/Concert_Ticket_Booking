package com.skcet.liveConcert.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
				contact = @Contact(
						name = "Harini",
						email = "harini@skcet.com",
						url = "https://some-url.com"
				),
				description = "This is open api documentation for ticket booking",
				title = "Tivket bookingW",
				version = "1.0",
				license = @License(
						name = "MIT",
						url = "https://some-url.com"
				),
				termsOfService = "Terms of service"
		),
		servers = @Server(
				description = "nothing",
				url = "http://localhost:8010"
		)
)

public class OpenApiConfig {

}
