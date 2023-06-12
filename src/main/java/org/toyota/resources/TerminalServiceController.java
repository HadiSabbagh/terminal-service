package org.toyota.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.toyota.dao.TerminalRepository;


@RestController
public class TerminalServiceController
{
    @Autowired
    private TerminalRepository terminalRepository;

    @GetMapping("/getTerminal")
    public ResponseEntity<Object> getTerminal()
    {
        if(!terminalRepository.findAll().isEmpty())
        {
            return ResponseEntity.ok().body(terminalRepository.findAll());
        }
        else
        {
            return ResponseEntity.badRequest().body("No terminals found!");
        }
    }
}
