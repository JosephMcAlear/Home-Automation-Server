package com.joseph.homeautomation.server;

import com.joseph.homeautomation.server.domain.model.*;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

class DataMappingTests {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Test
    void DeviceMappingToJSONTest()
    {
        Device device = Device.builder()
                .name("Testing Device")
                .plugin(Plugin.builder()
                        .name("Testing Device Plugin")
                        .actions(List.of(
                                Action.builder()
                                        .name("Action Name")
                                        .build()
                        ))
                        .properties(List.of(
                                Property.builder()
                                        .build()
                        ))
                        .comment("NA")
                        .build())
                .build();

        System.out.println("Device -> " + mapper.writeValueAsString(device));
    }
   @Test
   void DeviceMappingFromJSON()
    {
        Device device = Device.builder()
                .name("Testing Device")
                .plugin(Plugin.builder()
                        .name("Testing Device Plugin")
                        .actions(List.of(
                                Action.builder()
                                        .name("Action Name")
                                        .protocol(Protocol.HTTP1)
                                        .build()
                        ))
                        .properties(List.of(
                                Property.builder()
                                        .build()
                        ))
                        .comment("NA")
                        .build())
                .build();

            String json = mapper.writeValueAsString(device);

            Device deviceFromJSON = mapper.readValue(json,Device.class);
            assert(device.equals(deviceFromJSON));

            System.out.println("Device -> " + json + " -> Device" );

    }
}
