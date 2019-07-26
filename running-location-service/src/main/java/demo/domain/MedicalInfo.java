package demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@Data
@RequiredArgsConstructor
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInfo {
    private long bfr;
    private long fmi;

    public MedicalInfo(long bfr, long fmi) {
        this.bfr = bfr;
        this.fmi = fmi;
    }
}
