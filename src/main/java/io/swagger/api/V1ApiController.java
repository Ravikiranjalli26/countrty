package io.swagger.api;

import io.swagger.model.Countries;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-22T09:48:47.521790573Z[GMT]")
@RestController
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteCountriesId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Countries> getCountriesCountriesId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Countries>(objectMapper.readValue("{\n  \"subRegion\" : \"subRegion\",\n  \"latitude\" : 6.027456183070403,\n  \"name\" : \"name\",\n  \"phoneCode\" : 0,\n  \"timeZone\" : \"timeZone\",\n  \"currency\" : \"currency\",\n  \"region\" : \"region\",\n  \"longitude\" : 1.4658129805029452\n}", Countries.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Countries>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Countries>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Countries> getV1Countries() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Countries>(objectMapper.readValue("{\n  \"subRegion\" : \"subRegion\",\n  \"latitude\" : 6.027456183070403,\n  \"name\" : \"name\",\n  \"phoneCode\" : 0,\n  \"timeZone\" : \"timeZone\",\n  \"currency\" : \"currency\",\n  \"region\" : \"region\",\n  \"longitude\" : 1.4658129805029452\n}", Countries.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Countries>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Countries>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Countries> patchUsersUserId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Patch country properties to update.", schema=@Schema()) @Valid @RequestBody Countries body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Countries>(objectMapper.readValue("{\n  \"subRegion\" : \"subRegion\",\n  \"latitude\" : 6.027456183070403,\n  \"name\" : \"name\",\n  \"phoneCode\" : 0,\n  \"timeZone\" : \"timeZone\",\n  \"currency\" : \"currency\",\n  \"region\" : \"region\",\n  \"longitude\" : 1.4658129805029452\n}", Countries.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Countries>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Countries>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Countries> postUser(@Parameter(in = ParameterIn.DEFAULT, description = "Post the necessary fields for the API to create a new country.", schema=@Schema()) @Valid @RequestBody Countries body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Countries>(objectMapper.readValue("{\n  \"subRegion\" : \"subRegion\",\n  \"latitude\" : 6.027456183070403,\n  \"name\" : \"name\",\n  \"phoneCode\" : 0,\n  \"timeZone\" : \"timeZone\",\n  \"currency\" : \"currency\",\n  \"region\" : \"region\",\n  \"longitude\" : 1.4658129805029452\n}", Countries.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Countries>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Countries>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Countries> putCountriesId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Countries body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Countries>(objectMapper.readValue("{\n  \"subRegion\" : \"subRegion\",\n  \"latitude\" : 6.027456183070403,\n  \"name\" : \"name\",\n  \"phoneCode\" : 0,\n  \"timeZone\" : \"timeZone\",\n  \"currency\" : \"currency\",\n  \"region\" : \"region\",\n  \"longitude\" : 1.4658129805029452\n}", Countries.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Countries>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Countries>(HttpStatus.NOT_IMPLEMENTED);
    }

}
