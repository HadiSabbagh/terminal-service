package org.toyota.resources;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.toyota.dao.TerminalRepository;
import org.toyota.domain.Data;

import java.io.File;
import java.io.IOException;


@RestController
public class TerminalServiceController
{
    @Autowired
    private TerminalRepository terminalRepository;

    @GetMapping("/getTerminal")
    public ResponseEntity<Object> getTerminal()
    {
      String json = "src/main/resources/terminals.json";
      ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try
        {
            Data data = objectMapper.readValue(new File("G:\\NewStart\\Projects\\terminal-service\\src\\main\\resources\\terminals.json"), Data.class);
            terminalRepository.saveAll(data.getTerminals());
            return ResponseEntity.ok().body(terminalRepository.findAll());
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
