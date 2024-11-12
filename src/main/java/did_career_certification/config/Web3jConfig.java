package did_career_certification.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
public class Web3jConfig {

    public static final String CONTRACT_ADDRESS = "0x422341f1a0a85e6b2259fe93c3e0c8c2c6abd001";

    @Bean
    public Web3j web3j() {
        // Ganache 로컬 이더리움 노드에 연결
        return Web3j.build(new HttpService("http://localhost:7545"));
    }

    @Bean
    public Credentials credentials(@Value("${blockchain.issuerPrivateKey}") String privateKey) {
        // 개인 키로부터 Credentials 객체 생성
        return Credentials.create(privateKey);
    }

}
