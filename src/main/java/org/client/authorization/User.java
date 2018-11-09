package org.client.authorization;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.Socket;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Socket socket;

}
