package com.securemarket.rest;

import com.securemarket.dto.request.ClientInquiryRequestDto;
import com.securemarket.dto.response.ClientInquiryResponseDto;
import com.securemarket.service.ClientApplicationService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
@RequiredArgsConstructor
@Api(value = "Client")
public class ClientRestService {
    private final ClientApplicationService clientApplicationService;

    @PostMapping(value = "/inquiry", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(httpMethod = "POST", value = "Return client by dni number")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successful return client"),
                    @ApiResponse(code = 500, message = "Internal system error"),
                    @ApiResponse(code = 400, message = "Bad Request")
            }
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Content-Type", value = "application/json", required = true, dataType = "string", paramType = "header")
    })
    public ClientInquiryResponseDto clientInquiry(final @RequestBody ClientInquiryRequestDto clientInquiryRequestDto) {
        return clientApplicationService.getClient(clientInquiryRequestDto);
    }
}
