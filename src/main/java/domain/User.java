package domain;

import java.util.List;
import java.util.Set;

public class User extends BaseEntity {
    private Email email;
    private Password hashedPassword;
    private Profile profile;
    private Socials socials;
    private boolean verified;
    private List<Chat> chats;
    private Set<Medicalcase> partOfMedicalcase; // Diese Variable vllt noch ändern weil man ja owner oder member sein kann. Also eventuell eine Map + der name der Variable ist auch nicht schön
}