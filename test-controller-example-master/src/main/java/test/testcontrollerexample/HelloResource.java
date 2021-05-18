package test.testcontrollerexample;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloResource {

    private HelloService helloService;

    public HelloResource(HelloService helloService) {
        this.helloService = helloService;
    }


    @GetMapping
    public String helloWorld() {
        return helloService.hello();
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello json() {
        return new Hello("Greetings", "Hello World");
    }

    @PostMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello post(@RequestBody Hello hello) {
        return hello;
    }
    @PutMapping(value= "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Hello> update(@RequestBody Hello hello){
    	HttpHeaders responseHeaders = new HttpHeaders();
    	return new ResponseEntity<Hello>(hello,responseHeaders,HttpStatus.OK);
    }
}
