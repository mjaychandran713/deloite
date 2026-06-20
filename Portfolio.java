@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(Client client,
                     List<Security> securities) {
        this.client = client;
        this.securities = securities;
    }

    // Getters and Setters
}