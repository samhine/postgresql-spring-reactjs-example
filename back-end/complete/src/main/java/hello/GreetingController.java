package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    private TestStringRepository testStringRepository;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public @ResponseBody Iterable<TestString> testget() {
        // Return all the records we find within the database (probably not ideal for production)
        return testStringRepository.findAll();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/test", method = RequestMethod.POST)
    public void testpost(@RequestBody TestString tStr) {
        // Save our tStr to the database
        TestString s = new TestString(tStr.getStr());
        testStringRepository.save(s);
    }
}
