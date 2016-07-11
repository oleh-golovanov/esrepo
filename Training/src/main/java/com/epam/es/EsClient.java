package com.epam.es;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Oleh_Golovanov
 */
public class EsClient implements AutoCloseable{
    private String host;

    private int port;
    private Client client;

    public EsClient(final String host, final int port) {
        this.host = host;
        this.port = port;
    }

    void init() throws UnknownHostException {
        client = TransportClient.builder().build()
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(host), port));
    }

    public Client getClient() {
        if (client == null) {
            try {
                init();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return client;
    }

    @Override
    public void close() throws IOException {
        client.close();
    }
}
