package com.securemarket.client.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ClientInquiryResponseDto {
    @ApiModelProperty(notes = "Number of DNI", example = "73241085", required = true)
    private String dni;
    @ApiModelProperty(notes = "Client´s names", example = "Hard Garcia, Rocha Ez", required = true)
    private String names;
    @ApiModelProperty(notes = "Client´s age", example = "52", required = true)
    private int age;
    @ApiModelProperty(notes = "Past date when enter", example = "09/08/2020 15:13:02", required = true)
    private LocalDateTime pastTime;
    @ApiModelProperty(notes = "Next date for enter", example = "11/08/2020 11:22:43", required = true)
    private LocalDateTime nextTime;
    @ApiModelProperty(notes = "Client passed to the market", example = "true", required = true)
    private Boolean passed;
    @ApiModelProperty(notes = "Message", example = "Cliente puede pasar", required = true)
    private String message;
}
