package workshop.sb.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class CalculatorApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    // TODO 2 wstrzyknij MockMvc

    @Test
    public void shouldSum() throws Exception {
        this.mockMvc.perform(get("/sum/2/4"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("6.0")));
        //fail();
    }

    @Test
    public void shouldSubstract() throws Exception {
        //fail();
    }

    @Test
    public void shouldMultiply() throws Exception {
       // fail();
    }

    @Test
    public void shouldDivide() throws Exception {
       // fail();
    }
}
