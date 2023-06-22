/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Countries;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-22T09:48:47.521790573Z[GMT]")
@Validated
public interface V1Api {

    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Deleted successfully.") })
    @RequestMapping(value = "/v1/countries/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCountriesId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get User Info by User ID", description = "Retrieve the information of the country with the matching country ID.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Countries.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found") })
    @RequestMapping(value = "/v1/countries/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Countries> getCountriesCountriesId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Countries.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found") })
    @RequestMapping(value = "/v1/countries",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Countries> getV1Countries();


    @Operation(summary = "Update User Information", description = "Update the information of an existing user.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "202", description = "Updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Countries.class))) })
    @RequestMapping(value = "/v1/countries/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Countries> patchUsersUserId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Patch country properties to update.", schema=@Schema()) @Valid @RequestBody Countries body);


    @Operation(summary = "Create New User", description = "Create a new user.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "User Created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Countries.class))) })
    @RequestMapping(value = "/v1/countries",
        produces = { "application/json" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Countries> postUser(@Parameter(in = ParameterIn.DEFAULT, description = "Post the necessary fields for the API to create a new country.", schema=@Schema()) @Valid @RequestBody Countries body);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "202", description = "Updated ", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Countries.class))) })
    @RequestMapping(value = "/v1/countries/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Countries> putCountriesId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Countries body);

}

