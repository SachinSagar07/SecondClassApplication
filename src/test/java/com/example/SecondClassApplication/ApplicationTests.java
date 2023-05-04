//package com.example.SecondClassApplication;
//
//import org.junit.Rule;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties.Application;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Description;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.client.RestTemplate;
//import static org.springframework.test.util.AssertionErrors.assertTrue;
//@ContextConfiguration
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class,
//		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class ApplicationTests {
//
//	private int port=8080;
//	private String realServer="http://localhost:8089";
//	@Rule
//	public WireMockRule wireMockRule = new WireMockRule();
//	@Test
//	@Description("Test for a service")
//	public void exampleTest() {
//		//Stub the endpoint
//		stubFor(get(urlPathMatching("/FirstClass.*"))
//				.willReturn(aResponse()
//						.withStatus(200)
//						.withHeader("Content-Type", "application/json")
//						.withBody("SUCCESS")
//				)
//		);
//		//Make a Request
//		RestTemplate restTemplate = new RestTemplate();
//		String resourceURL = realServer;
//		ResponseEntity<String> response = restTemplate
//				.getForEntity(resourceURL + "/FirstClass",String.class);
//		//Verify
//		assertNotNull(response);
//		assertTrue("status code not equal to 200",response.getStatusCode().equals(HttpStatus.OK));
//	}
//
//}
