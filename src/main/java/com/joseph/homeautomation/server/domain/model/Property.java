package com.joseph.homeautomation.server.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Property {
    String propertyName;
    String type;
    String protocol;
    String endpoint;
}
