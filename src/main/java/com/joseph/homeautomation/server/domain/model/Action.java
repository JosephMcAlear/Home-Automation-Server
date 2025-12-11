package com.joseph.homeautomation.server.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Action {
    String name;
    Map<String,DataType> args;
    Map<String,DataType> ret;
    Protocol protocol;
    String endpoint;
}
