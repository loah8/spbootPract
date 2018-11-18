package brkim.pract.spbootPract;

import brkim.pract.spbootPract.domain.Party;
import brkim.pract.spbootPract.repositories.PartyRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(properties = "classpath:classpath:application.properties")
public class GeneralTest {

    @Autowired
    private PartyRepository partyRepository;

    @Test
    public void RepositoryTest(){
        String partyName = "testparty2";
        String accountName = "test_ac2";
        String memberName = null;

        int a = partyRepository.countByPartyNameAndActiveTrueAndAccountNameAndMemberName(partyName,accountName,memberName);

//        List<Party> partyList = partyRepository.findByPartyName(partyName);
        log.info("test number : {}", a);


    }

}
