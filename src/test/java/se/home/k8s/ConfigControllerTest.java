package se.home.k8s;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = ConfigController.class)
public class ConfigControllerTest {
	
	@Autowired
	MockMvc mockmvc;

	@Test
	public void test200() throws Exception {
		mockmvc.perform(get("/")).andExpect(status().isOk());
	}
	
	@Test
	public void test2001() throws Exception {
		mockmvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string("Some value"));
	}

}
