package two;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> info = new ArrayList<>();
    public void send() throws MailjetSocketTimeoutException, MailjetException {
        for (int i = 0; i < info.size(); i++) {
//            MailSender.send(info.get(i));
        }
    }
    public void addInfo(MailInfo mailInfo) {
        info.add(mailInfo);
    }
}