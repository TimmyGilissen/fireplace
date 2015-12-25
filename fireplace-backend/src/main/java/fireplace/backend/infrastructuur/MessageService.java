package fireplace.backend.infrastructuur;

import org.springframework.stereotype.Service;

@Service
public interface MessageService {

    void sendMessage(String message);
}
