package com.manan.transaction.transactiondemo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.manan.transaction.transactiondemo.dto.FlightBookingAcknowledgement;
import com.manan.transaction.transactiondemo.dto.FlightBookingRequest;
import com.manan.transaction.transactiondemo.model.PassengerInfo;
import com.manan.transaction.transactiondemo.model.PaymentInfo;
import com.manan.transaction.transactiondemo.service.FlightBookingService;

@SpringBootTest
@AutoConfigureMockMvc
class TransactionDemoApplicationTests {

	@Test
	void contextLoads() {
		final Logger log = LoggerFactory.getLogger(TransactionDemoApplicationTests.class);
		log.info("\nTest Class Runs");
	}

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private MockMvc mockMvc;

	//
	/*
	 * @Autowired private WebApplicationContext webApplicationContext;
	 */

	// Mock bean is used mock data in service layer
	/*
	 * @MockBean private FlightBookingService flightBookingService;
	 */
//	@org.junit.Before
//	  public void setUp() {
//	    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//	  }

	@Disabled
	@Test
	public void testBookFlightTicket() throws JsonProcessingException, Exception {

		PassengerInfo passengerInfo = new PassengerInfo(0L, "Manan", null, null, null, null, null, null, 500.0);

		PaymentInfo paymentInfo = new PaymentInfo(null, "acc2", 0.0d, "Credit", null);

		List<FlightBookingRequest> requestList = Arrays.asList(new FlightBookingRequest(passengerInfo, paymentInfo));

		// mocking data into service method and returning mock response
		/*
		 * when(flightBookingService.bookFlightTicket(requestList.get(0)))
		 * .thenReturn(new FlightBookingAcknowledgement("Success", 9999.0, "ddd",
		 * passengerInfo));
		 */

//		  mockMvc.perform(post("/bookFlightTicket").contentType(MediaType. APPLICATION_JSON)
//		  .content(objectMapper.writeValueAsString(requestList.get(0))).accept(MediaType.APPLICATION_JSON))
//		  .andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON))
//		  .andExpect(jsonPath("$.status").value("SUCCESS")).andExpect(jsonPath(
//		  "$.totalFare").value(500.0));

		MvcResult mvcResult = mockMvc.perform(post("/bookFlightTicket").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(requestList.get(0))).accept(MediaType.APPLICATION_JSON))
				.andReturn();

		assertEquals(200, mvcResult.getResponse().getStatus());
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println("Response : \n" + content);

	}

	@Test
	public void testBookResponseCheckOfController() throws JsonProcessingException, Exception {
		MvcResult mvcResult = mockMvc.perform(
				get("/bookFlightTicket").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andReturn();

		assertEquals(404, mvcResult.getResponse().getStatus());
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println("Response : \n" + content);
	}

}
