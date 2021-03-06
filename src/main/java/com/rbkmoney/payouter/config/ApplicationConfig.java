package com.rbkmoney.payouter.config;

import com.rbkmoney.damsel.shumpune.AccounterSrv;
import com.rbkmoney.damsel.domain_config.RepositoryClientSrv;
import com.rbkmoney.damsel.message_sender.MessageSenderSrv;
import com.rbkmoney.damsel.payment_processing.PartyManagementSrv;
import com.rbkmoney.fistful.admin.FistfulAdminSrv;
import com.rbkmoney.woody.thrift.impl.http.THSpawnClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
public class ApplicationConfig {

    @Bean
    public RepositoryClientSrv.Iface dominantClient(@Value("${service.dominant.url}") Resource resource, @Value("${service.dominant.networkTimeout}") int networkTimeout) throws IOException {
        return new THSpawnClientBuilder()
                .withNetworkTimeout(networkTimeout)
                .withAddress(resource.getURI()).build(RepositoryClientSrv.Iface.class);
    }

    @Bean
    public PartyManagementSrv.Iface partyManagementClient(@Value("${service.partyManagement.url}") Resource resource, @Value("${service.partyManagement.networkTimeout}") int networkTimeout) throws IOException {
        return new THSpawnClientBuilder()
                .withNetworkTimeout(networkTimeout)
                .withAddress(resource.getURI()).build(PartyManagementSrv.Iface.class);
    }

    @Bean
    public AccounterSrv.Iface shumwayClient(@Value("${service.shumway.url}") Resource resource, @Value("${service.shumway.networkTimeout}") int networkTimeout) throws IOException {
        return new THSpawnClientBuilder()
                .withAddress(resource.getURI())
                .withNetworkTimeout(networkTimeout)
                .build(AccounterSrv.Iface.class);
    }

    @Bean
    public MessageSenderSrv.Iface dudoserClient(@Value("${service.dudoser.url}") Resource resource, @Value("${service.dudoser.networkTimeout}") int networkTimeout) throws IOException {
        return new THSpawnClientBuilder()
                .withNetworkTimeout(networkTimeout)
                .withAddress(resource.getURI()).build(MessageSenderSrv.Iface.class);
    }

    @Bean
    public FistfulAdminSrv.Iface fistfulClient(@Value("${service.fistful.url}") Resource resource, @Value("${service.fistful.networkTimeout}") int networkTimeout) throws IOException {
        return new THSpawnClientBuilder()
                .withNetworkTimeout(networkTimeout)
                .withAddress(resource.getURI()).build(FistfulAdminSrv.Iface.class);
    }

}
