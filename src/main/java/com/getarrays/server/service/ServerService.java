package com.getarrays.server.service;

import com.getarrays.server.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server); // create server and save it in the database

    Server ping(String ipAddress) throws IOException; // ping the server and return server
    Collection<Server> list(int limit); // return collection of servers with limit ex: 10 servers

    Server get(Long id); // return a server by id

    Server update(Server server); // update the information of a server

    Boolean delete(Long id); // delete a server by id
}
