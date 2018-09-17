package ws.service.io.entity;

import lombok.Getter;
import lombok.Setter;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
*/import java.io.Serializable;


@Setter
@Getter


//@Entity(name="user")
public class UserEntity implements Serializable {




    private static final long serialVersionUID = 6835192601898364289L;



   /* @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false)
    private String userId;

    @Column(nullable=false, length = 50)
    private String firstName;

    @Column(nullable=false, length = 50)
    private String lastName;

    @Column(nullable=false, length = 50)
    private String email;

    @Column(nullable=false)
    private String encryptedPassword;
    private String emailVerificationToken;

    @Column(nullable=false, columnDefinition = "boolean default false")
    private Boolean emailVerificationStatus;

*/

}
