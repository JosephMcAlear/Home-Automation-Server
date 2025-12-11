package com.joseph.homeautomation.server.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Plugin {
    String name;
    List<Action> actions;
    List<Property> properties;
    String comment;
}
