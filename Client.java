@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    public Client() {}

    public Client(FinancialAdvisor advisor,
                  String firstName,
                  String lastName,
                  String email,
                  String phone,
                  Portfolio portfolio) {
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.portfolio = portfolio;
    }

    // Getters and Setters
}