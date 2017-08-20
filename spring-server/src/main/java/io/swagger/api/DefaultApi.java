/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;


import io.swagger.annotations.*;
import io.swagger.custom.Greeting;
import io.swagger.models.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-17T20:46:57.785Z")

@Api(value = "default", description = "the default API")
public interface DefaultApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class) })
    
    
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    @CrossOrigin(origins="*")
    ResponseEntity<Greeting> greetingGet(@RequestParam(value="name", defaultValue="World") String name);
    
    @RequestMapping(value = "/greetings", method = RequestMethod.POST)
    @CrossOrigin(origins="*")
    @ResponseBody
    ResponseEntity<String> greetingPost(@RequestBody String a);
    

    @RequestMapping(value = "/greetings/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins="*")
    @ResponseBody
    ResponseEntity<Greeting> greetingGetID(@PathVariable("id") int id);
   
}
