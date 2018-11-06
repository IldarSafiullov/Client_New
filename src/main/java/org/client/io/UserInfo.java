package org.client.io;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.Socket;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private Socket socket;
    private String userName;

    public static class UserInfoHolder {
        public static final UserInfo USER_INFO = new UserInfo();

    }
    public static UserInfo getInstance() {
        return UserInfoHolder.USER_INFO;
    }

}
