package lt.viltiesZiedas.receptai.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Vartotojas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String username;
    private String password;
    private String vardas;
    private String pavarde;
    private boolean enabled;
    private boolean expiredToken;

    @OneToMany(mappedBy = "vartotojas")
    private Set<Komentaras> komentarai;

    @ManyToMany
    @JoinTable (
            name = "vartotoju_roles",
            joinColumns = @JoinColumn (name = "vartotojo_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn (name = "roles_id", referencedColumnName = "id")
    )
    private Set<Role> roles;

    public Vartotojas() {
    }

    public Vartotojas(long id, String username, String password, String vardas, String pavarde, boolean enabled, boolean expiredToken, Set<Komentaras> komentarai, Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.enabled = enabled;
        this.expiredToken = expiredToken;
        this.komentarai = komentarai;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Komentaras> getKomentarai() {
        return komentarai;
    }

    public void setKomentarai(Set<Komentaras> komentarai) {
        this.komentarai = komentarai;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isExpiredToken() {
        return expiredToken;
    }

    public void setExpiredToken(boolean expiredToken) {
        this.expiredToken = expiredToken;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Vartotojas{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", enabled=" + enabled +
                ", expiredToken=" + expiredToken +
                '}';
    }
}