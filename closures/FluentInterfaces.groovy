

// Java 8 
public class Mailer {

    public void to(String address) {
        System.out.println('to')
    }

    public void from(String address) {
        System.out.println('from')
    }
    
    public void subject(String subject) {
        System.out.println('subject')
    }
    
    public void body(String msg) {
        System.out.println('body')
    }
    
    public void send(){
        System.out.println('sending...')
    }
}

// noisy
// should we reuse the object? 
Mailer mailer = new Mailer();
mailer.to("umair6622@gmail.com");
mailer.from("umair6622@gmail.com");
mailer.subject("Hello Umair");
mailer.body("Message Body");
mailer.send();

