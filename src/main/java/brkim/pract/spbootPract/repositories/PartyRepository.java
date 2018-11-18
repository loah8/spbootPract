package brkim.pract.spbootPract.repositories;

import brkim.pract.spbootPract.domain.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {

    int countByPartyNameAndActiveTrueAndAccountNameAndMemberName(String partyName,String accountName, String memberName);
    List<Party> findByPartyName(String partyName);
}
