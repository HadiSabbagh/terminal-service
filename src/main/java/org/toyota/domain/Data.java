package org.toyota.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Data
{
    private String type;

    @JsonProperty("data")
    @OneToMany
    private Set<Terminal> terminals = new HashSet<>();

}
