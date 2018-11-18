package brkim.pract.spbootPract.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "party")
@Data
@NoArgsConstructor
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idx;

    private String partyName;
    private Boolean active;
    private String accountName;

    @Nullable
    private String memberName;

    @CreatedDate
    private LocalDateTime createdDate;

}
