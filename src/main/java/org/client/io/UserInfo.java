package org.client.io;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singleton;

import java.net.Socket;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Singleton(style = Singleton.Style.HOLDER)
public class UserInfo {

    private Socket socket;
    private String userName;
}
