package com.daniel.commons.model;

import io.swagger.annotations.ApiModelProperty;

public class SimpleDto {

    @ApiModelProperty(
            value = "The version of the Meta Data schema definition.",
            example = "1.0.0",
            required = true)
    public static String name = "my simple dto test";

    @ApiModelProperty(
            value = "The Device's type.",
            example = "type",
            required = true)
    protected String deviceType;

    @ApiModelProperty(
            value = "The Device's serial number, as printed on the physical device.",
            example = "AAA21324",
            required = true)
    protected String deviceSerialNumber;
}
