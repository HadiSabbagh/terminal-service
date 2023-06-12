package org.toyota.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"depName", "depCode", "shopCode", "filterBaseds" })
public class Terminal
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer terminal_id;

    @JsonProperty("depName")
    private String depName;

    @JsonProperty("depCode")
    private String depCode;

    @JsonProperty("shopCode")
    private String shopCode;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<FilterBased> filterBaseds = new HashSet<>();

}
