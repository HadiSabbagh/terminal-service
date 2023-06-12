package org.toyota.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "filter_based")
public class FilterBased
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer filter_id;
    @JsonProperty("filterCode")
    private String filterCode;

    @JsonProperty("linkCount")
    private int linkCount;

    @JsonProperty("userDesc")
    private String userDesc;

    @JsonProperty("termName")
    private String termName;
}
