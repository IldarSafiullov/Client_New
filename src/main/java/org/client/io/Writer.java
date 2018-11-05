package org.client.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.client.Client;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;

public class Writer{

    public void writeMessage(String to, Map<String, Object> payload) throws IOException {
        Message message = new Message();
        message.setFrom(UserInfo.getInstance().getUserName());
        message.setTo(to);
        message.setPayload(payload);

        String messageJson = new ObjectMapper().writeValueAsString(message);

        Socket socket = UserInfo.getInstance().getSocket();
        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        dout.writeUTF(messageJson);
    }

}
