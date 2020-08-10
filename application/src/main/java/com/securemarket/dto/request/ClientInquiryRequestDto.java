package com.securemarket.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ClientInquiryRequestDto {
    @ApiModelProperty(notes = "Request number of DNI", example = "73241085", required = true)
    private String dni;
}
